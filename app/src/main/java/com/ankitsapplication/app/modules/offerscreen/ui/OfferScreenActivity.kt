package com.ankitsapplication.app.modules.offerscreen.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.base.BaseActivity
import com.ankitsapplication.app.databinding.ActivityOfferScreenBinding
import com.ankitsapplication.app.modules.offerscreen.`data`.model.OfferScreenRowModel
import com.ankitsapplication.app.modules.offerscreen.`data`.viewmodel.OfferScreenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class OfferScreenActivity : BaseActivity<ActivityOfferScreenBinding>(R.layout.activity_offer_screen)
    {
  private val viewModel: OfferScreenVM by viewModels<OfferScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val offerScreenAdapter =
    OfferScreenAdapter(viewModel.offerScreenList.value?:mutableListOf())
    binding.recyclerOfferScreen.adapter = offerScreenAdapter
    offerScreenAdapter.setOnItemClickListener(
    object : OfferScreenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : OfferScreenRowModel) {
        onClickRecyclerOfferScreen(view, position, item)
      }
    }
    )
    viewModel.offerScreenList.observe(this) {
      offerScreenAdapter.updateData(it)
    }
    binding.offerScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerOfferScreen(
    view: View,
    position: Int,
    item: OfferScreenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "OFFER_SCREEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OfferScreenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
