package com.ankitsapplication.app.modules.offerscreen.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ankitsapplication.app.R
import com.ankitsapplication.app.databinding.RowOfferScreenBinding
import com.ankitsapplication.app.modules.offerscreen.`data`.model.OfferScreenRowModel
import kotlin.Int
import kotlin.collections.List

class OfferScreenAdapter(
  var list: List<OfferScreenRowModel>
) : RecyclerView.Adapter<OfferScreenAdapter.RowOfferScreenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowOfferScreenVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_offer_screen,parent,false)
    return RowOfferScreenVH(view)
  }

  override fun onBindViewHolder(holder: RowOfferScreenVH, position: Int) {
    val offerScreenRowModel = OfferScreenRowModel()
    // TODO uncomment following line after integration with data source
    // val offerScreenRowModel = list[position]
    holder.binding.offerScreenRowModel = offerScreenRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<OfferScreenRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: OfferScreenRowModel
    ) {
    }
  }

  inner class RowOfferScreenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowOfferScreenBinding = RowOfferScreenBinding.bind(itemView)
  }
}
