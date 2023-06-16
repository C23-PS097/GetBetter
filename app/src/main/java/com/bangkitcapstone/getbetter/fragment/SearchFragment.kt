package com.bangkitcapstone.getbetter.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.bangkitcapstone.getbetter.MainActivity
import com.bangkitcapstone.getbetter.R
import com.bangkitcapstone.getbetter.adapter.SymptomAdapter
import com.bangkitcapstone.getbetter.helper.AutoFitGridRecyclerView

class SearchFragment : Fragment(), SymptomAdapter.CellClickListener {

    private var rvSymptom : AutoFitGridRecyclerView?= null
    private var edtSearch : EditText?= null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_search, container, false)
        // Inflate the layout for this fragment

        rvSymptom = view.findViewById(R.id.rvSymptom)
        edtSearch = view.findViewById(R.id.edtSearch)

        setView()

        return view
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    private fun setView(){
        rvSymptom!!.layoutManager = GridLayoutManager(requireContext(), 4)
        rvSymptom!!.adapter = SymptomAdapter(requireContext(), listSymptom(), this)
    }

    private fun listSymptom(): List<String>{
        var data = mutableListOf<String>()
        data.add("Cough")
        data.add("Headache")
        data.add("Blackhead")
        data.add("Stomach Pain")
        data.add("Itching")
        data.add("Skin Rash")
        data.add("Blown")
        data.add("Con. Sneezing")

        return data
    }

    override fun selectSymptom(data: String?) {
        edtSearch?.setText(data)
        (activity as MainActivity).changeFragmentTo(ResultSearchFragment(), bundleOf("valueSearch" to data.toString()))
    }
}