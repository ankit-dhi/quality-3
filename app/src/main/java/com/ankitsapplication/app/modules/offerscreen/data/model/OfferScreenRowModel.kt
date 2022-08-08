package com.ankitsapplication.app.modules.offerscreen.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class OfferScreenRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNikeAirMaxRe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_nike_air_max_27)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_299_43)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOldPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_534_33)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOfferOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_24_off)

)
