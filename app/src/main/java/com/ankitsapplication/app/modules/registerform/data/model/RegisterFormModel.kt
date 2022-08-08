package com.ankitsapplication.app.modules.registerform.`data`.model

import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RegisterFormModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLetsGetStart: String? =
      MyApp.getInstance().resources.getString(R.string.msg_let_s_get_start)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateannewa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_an_new_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_have_an_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFullNameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordAgainValue: String? = null
)
