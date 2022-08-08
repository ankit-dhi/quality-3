package com.ankitsapplication.app.modules.dashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ankitsapplication.app.R
import com.ankitsapplication.app.databinding.RowMegasaleBinding
import com.ankitsapplication.app.modules.dashboard.`data`.model.MegasaleRowModel
import kotlin.Int
import kotlin.collections.List

class MegaSaleAdapter(
  var list: List<MegasaleRowModel>
) : RecyclerView.Adapter<MegaSaleAdapter.RowMegasaleVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMegasaleVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_megasale,parent,false)
    return RowMegasaleVH(view)
  }

  override fun onBindViewHolder(holder: RowMegasaleVH, position: Int) {
    val megasaleRowModel = MegasaleRowModel()
    // TODO uncomment following line after integration with data source
    // val megasaleRowModel = list[position]
    holder.binding.megasaleRowModel = megasaleRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MegasaleRowModel>) {
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
      item: MegasaleRowModel
    ) {
    }
  }

  inner class RowMegasaleVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMegasaleBinding = RowMegasaleBinding.bind(itemView)
  }
}
