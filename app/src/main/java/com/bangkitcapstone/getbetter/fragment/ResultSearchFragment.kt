package com.bangkitcapstone.getbetter.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.ViewFlipper
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.bangkitcapstone.getbetter.R
import com.bangkitcapstone.getbetter.adapter.RecomFoodAdapter
import com.bangkitcapstone.getbetter.adapter.RecomMedicineAdapter
import com.bangkitcapstone.getbetter.data.api.ApiClient
import com.bangkitcapstone.getbetter.data.api.ApiInterface
import com.bangkitcapstone.getbetter.data.viewModel.BaseViewModel
import com.bangkitcapstone.getbetter.data.viewModel.ViewModelFactory
import com.bangkitcapstone.getbetter.helper.AutoFitGridRecyclerView
import com.bangkitcapstone.getbetter.helper.GlobalVar
import com.bangkitcapstone.getbetter.model.Status

class ResultSearchFragment : Fragment(), RecomMedicineAdapter.CellClickListener,
    RecomFoodAdapter.CellClickListener {

    private var rvRecomMedicine : AutoFitGridRecyclerView?= null
    private var rvRecomFood : AutoFitGridRecyclerView?= null

    private var edtSearch : EditText?= null
    private var tvResult: TextView?= null
    private var viewFlipper: ViewFlipper?= null

    private var valueSearch = ""

    private lateinit var baseViewModel: BaseViewModel
    lateinit var apiInterface: ApiInterface

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_result_search, container, false)
        // Inflate the layout for this fragment

        apiInterface = ApiClient.client.create(ApiInterface::class.java)

        valueSearch = arguments?.getString("valueSearch")?: ""

        rvRecomMedicine = view.findViewById(R.id.rvRecomMedicine)
        rvRecomFood = view.findViewById(R.id.rvRecomFood)

        edtSearch = view.findViewById(R.id.edtSearch)
        tvResult = view.findViewById(R.id.tvResult)

        viewFlipper = view.findViewById(R.id.viewFlipper)

        baseViewModel = ViewModelProviders.of(
            this, ViewModelFactory(apiInterface)
        )[BaseViewModel::class.java]

        setView()

        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    private fun setView(){
        edtSearch?.setText(valueSearch)

        loadSearch()
    }

    private fun loadSearch(){
        val listMedicine = mutableListOf<String>()
        val listFood = mutableListOf<String>()

        baseViewModel.search(
            GlobalVar.TOKEN_KEY,
            valueSearch.toLowerCase()
        ).observe(viewLifecycleOwner){
            it?.let { resource ->
                when(resource.status){
                    Status.SUCCESS -> {
                        val data = resource.data

                        tvResult?.text = data?.disease?.disease.toString()

                        val medicine = resource.data?.medicine
                        if (medicine?.isNotEmpty() == true){
                            for (i in medicine){
                                listMedicine.add(i.drug_name)
                            }
                        }
                        rvRecomMedicine!!.adapter = RecomMedicineAdapter(requireContext(), listMedicine, this)

                        val food = resource.data?.food
                        if (food?.isNotEmpty() == true){
                            for (i in food){
                                listFood.add(i.food_name)
                            }
                        }

//                        Toast.makeText(requireContext(), listFood.size.toString(), Toast.LENGTH_SHORT).show()

                        rvRecomFood!!.adapter = RecomFoodAdapter(requireContext(), listFood, this)

//                        if (data != null){
                        viewFlipper?.displayedChild = 1
//                        }
                    }
                    Status.ERROR -> {
                    }
                    Status.LOADING -> {
                    }
                }
            }
        }
    }

    private fun listRecomMedicine(): List<String>{
        var data = mutableListOf<String>()
        data.add("Azelaic Acid Topical")
        data.add("Cephalexin")
        data.add("Panadol")

        return data
    }

    private fun listRecomFood(): List<String>{
        var data = mutableListOf<String>()
        data.add("Soup")
        data.add("Vegetable")
        data.add("Mush")

        return data
    }

    override fun selectRecomMedicine(data: String?) {

    }

    override fun selectRecomFood(data: String?) {

    }

}