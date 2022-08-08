package com.ankitsapplication.app.modules.signup.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.msg_sign_up_and_sta)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupEleven: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBysigningupy: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_signing_up_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlreadyregiste: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_registe)

)
