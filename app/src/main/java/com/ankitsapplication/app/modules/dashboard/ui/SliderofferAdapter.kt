package com.ankitsapplication.app.modules.dashboard.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.ankitsapplication.app.databinding.SlideritemDashboard1Binding
import com.ankitsapplication.app.modules.dashboard.`data`.model.ImageSliderSliderofferModel
import com.asksira.loopingviewpager.LoopingPagerAdapter
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SliderofferAdapter(
  val dataList: ArrayList<ImageSliderSliderofferModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSliderofferModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemDashboard1Binding) {
      binding.imageSliderSliderofferModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemDashboard1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
