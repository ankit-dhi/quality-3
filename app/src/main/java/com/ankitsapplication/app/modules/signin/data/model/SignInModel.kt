package com.ankitsapplication.app.modules.signin.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignInModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.msg_glad_to_meet_y)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_your_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOr: String? = MyApp.getInstance().resources.getString(R.string.lbl_or)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlreadyregiste: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_registe)

)
