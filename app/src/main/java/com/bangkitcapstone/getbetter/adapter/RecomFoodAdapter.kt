package com.bangkitcapstone.getbetter.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bangkitcapstone.getbetter.R

class RecomFoodAdapter(
    context: Context,
    dataMenus: List<String>,
    listener: CellClickListener
) :
    RecyclerView.Adapter<RecomFoodAdapter.MenuViewHolder>(){
    private val data: List<String>
    private val mContext: Context
    private val size = 0
    private var filterData : List<String>?= mutableListOf()

    private var clickListener: CellClickListener? = null

    init {
        data = dataMenus
        mContext = context
        filterData = data

        clickListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        return MenuViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_recom_food, parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.setOnBoardingData(filterData?.get(position)!!, position)
    }

    override fun getItemCount(): Int {
        return filterData!!.size
    }

    inner class MenuViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        private val title: TextView

        init {
            title = itemView.findViewById(R.id.tvTitle)
        }

        fun setOnBoardingData(data: String, position: Int) {
            title.text = data

            title.setOnClickListener {
                clickListener?.selectRecomFood(data)
            }
        }
    }

    interface CellClickListener {
        fun selectRecomFood(data: String?)
    }

}
