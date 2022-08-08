package com.ankitsapplication.app.modules.dashboard.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.base.BaseActivity
import com.ankitsapplication.app.databinding.ActivityDashboardBinding
import com.ankitsapplication.app.modules.dashboard.`data`.model.DashboardRowModel
import com.ankitsapplication.app.modules.dashboard.`data`.model.FlashsaleRowModel
import com.ankitsapplication.app.modules.dashboard.`data`.model.ImageSliderSliderofferModel
import com.ankitsapplication.app.modules.dashboard.`data`.model.MegasaleRowModel
import com.ankitsapplication.app.modules.dashboard.`data`.viewmodel.DashboardVM
import com.ankitsapplication.app.modules.offerscreen.ui.OfferScreenActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class DashboardActivity : BaseActivity<ActivityDashboardBinding>(R.layout.activity_dashboard) {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.ankitsapplication.app/drawable/img_promotionimage")


  private val imageSliderSliderofferItems: ArrayList<ImageSliderSliderofferModel> =
      arrayListOf(ImageSliderSliderofferModel(imagePromotionImage =
  imageUri.toString()),ImageSliderSliderofferModel(imagePromotionImage =
  imageUri.toString()))


  private val viewModel: DashboardVM by viewModels<DashboardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val sliderofferAdapter = SliderofferAdapter(imageSliderSliderofferItems,true)
    binding.imageSliderSlideroffer.adapter = sliderofferAdapter
    binding.imageSliderSlideroffer.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorClock.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorClock.updateIndicatorCounts(binding.imageSliderSlideroffer.indicatorCount)
    val flashSaleAdapter = FlashSaleAdapter(viewModel.flashSaleList.value?:mutableListOf())
    binding.recyclerFlashSale.adapter = flashSaleAdapter
    flashSaleAdapter.setOnItemClickListener(
    object : FlashSaleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : FlashsaleRowModel) {
        onClickRecyclerFlashSale(view, position, item)
      }
    }
    )
    viewModel.flashSaleList.observe(this) {
      flashSaleAdapter.updateData(it)
    }
    val megaSaleAdapter = MegaSaleAdapter(viewModel.megaSaleList.value?:mutableListOf())
    binding.recyclerMegaSale.adapter = megaSaleAdapter
    megaSaleAdapter.setOnItemClickListener(
    object : MegaSaleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MegasaleRowModel) {
        onClickRecyclerMegaSale(view, position, item)
      }
    }
    )
    viewModel.megaSaleList.observe(this) {
      megaSaleAdapter.updateData(it)
    }
    val dashboardAdapter = DashboardAdapter(viewModel.dashboardList.value?:mutableListOf())
    binding.recyclerDashboard.adapter = dashboardAdapter
    dashboardAdapter.setOnItemClickListener(
    object : DashboardAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DashboardRowModel) {
        onClickRecyclerDashboard(view, position, item)
      }
    }
    )
    viewModel.dashboardList.observe(this) {
      dashboardAdapter.updateData(it)
    }
    binding.dashboardVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSlideroffer.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSlideroffer.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.linearFlashsalehead.setOnClickListener {
      val destIntent = OfferScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerFlashSale(
    view: View,
    position: Int,
    item: FlashsaleRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerMegaSale(
    view: View,
    position: Int,
    item: MegasaleRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerDashboard(
    view: View,
    position: Int,
    item: DashboardRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "DASHBOARD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DashboardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
