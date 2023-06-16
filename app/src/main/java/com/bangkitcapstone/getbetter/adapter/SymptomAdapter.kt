package com.bangkitcapstone.getbetter.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bangkitcapstone.getbetter.R
import java.util.Locale

class SymptomAdapter(
    context: Context,
    dataMenus: List<String>,
    listener: CellClickListener
) :
    RecyclerView.Adapter<SymptomAdapter.MenuViewHolder>(), Filterable {
    private val data: List<String>
    private val mContext: Context
    private val size = 0
    private var filterData : List<String>?= mutableListOf()

    private var clickListener: CellClickListener? = null

    private var posSelect = 999

    init {
        data = dataMenus
        mContext = context
        filterData = data

        clickListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        return MenuViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_symptom, parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.setOnBoardingData(filterData?.get(position)!!, position)
//        holder.itemView.setOnClickListener {
//            posSelect = position
//            clickListener?.selectSymptom(data[position])
//        }

    }

    override fun getItemCount(): Int {
        return filterData!!.size
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(charSequence: CharSequence): FilterResults {
                val charSearch = charSequence.toString()
                filterData = if (charSearch.isEmpty()) {
                    data
                } else {
                    val resultList: MutableList<String> = ArrayList<String>()
                    for (row in data) {
                        //                        if (row.getFullTitle().toLowerCase(Locale.ROOT).contains(charSearch.toLowerCase(Locale.ROOT))) {
                        //                            resultList.add(row);
                        //                        }
                        if (row.toLowerCase(Locale.ROOT)
                                .contains(charSearch.lowercase())
                        ) {
                            resultList.add(row)
                        }
                    }
                    resultList
                }
                val filterResults = FilterResults()
                filterResults.values = filterData
                return filterResults
            }

            override fun publishResults(
                charSequence: CharSequence?,
                filterResults: FilterResults
            ) {
                filterData = filterResults.values as List<String>?
                notifyDataSetChanged()
            }
        }
    }

    inner class MenuViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        private val title: TextView

        init {
            title = itemView.findViewById(R.id.tvTitle)
        }

        fun setOnBoardingData(data: String, pos: Int) {
            title.text = data

            title.setOnClickListener {
                posSelect = pos
                clickListener?.selectSymptom(data)

//                Toast.makeText(mContext, "$posSelect == $pos", Toast.LENGTH_SHORT).show()

                if (posSelect == pos){
                    title.backgroundTintList = ContextCompat.getColorStateList(mContext,R.color.selected)
                } else {
                    title.backgroundTintList = ContextCompat.getColorStateList(mContext,R.color.nonselected)
                }
            }

        }
    }

    interface CellClickListener {
        fun selectSymptom(data: String?)
    }

}

