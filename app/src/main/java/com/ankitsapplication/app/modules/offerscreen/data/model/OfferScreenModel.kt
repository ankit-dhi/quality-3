package com.ankitsapplication.app.modules.offerscreen.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OfferScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSuperFlashSal: String? =
      MyApp.getInstance().resources.getString(R.string.msg_super_flash_sal2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOffer: String? = MyApp.getInstance().resources.getString(R.string.msg_super_flash_sal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClock: String? = MyApp.getInstance().resources.getString(R.string.lbl_08)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMinutes: String? = MyApp.getInstance().resources.getString(R.string.lbl_34)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFour: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSecounds: String? = MyApp.getInstance().resources.getString(R.string.lbl_52)

)
