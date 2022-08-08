package com.ankitsapplication.app.modules.dashboard.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ImageSliderSliderofferModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOffer: String? = MyApp.getInstance().resources.getString(R.string.msg_super_flash_sal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHours: String? = MyApp.getInstance().resources.getString(R.string.lbl_08)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMinutes: String? = MyApp.getInstance().resources.getString(R.string.lbl_34)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSecounds: String? = MyApp.getInstance().resources.getString(R.string.lbl_52)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var imagePromotionImage: String? = ""

)
