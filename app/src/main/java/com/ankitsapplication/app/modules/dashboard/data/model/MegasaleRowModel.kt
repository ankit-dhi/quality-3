package com.ankitsapplication.app.modules.dashboard.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MegasaleRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMSNikeAirM: String? = MyApp.getInstance().resources.getString(R.string.msg_ms_nike_air_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_299_43)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOldPriceThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_534_33)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOfferFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_24_off)

)
