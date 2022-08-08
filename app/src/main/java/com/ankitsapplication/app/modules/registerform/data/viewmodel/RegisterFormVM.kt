package com.ankitsapplication.app.modules.registerform.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitsapplication.app.modules.registerform.`data`.model.RegisterFormModel
import org.koin.core.KoinComponent

class RegisterFormVM : ViewModel(), KoinComponent {
  val registerFormModel: MutableLiveData<RegisterFormModel> = MutableLiveData(RegisterFormModel())

  var navArguments: Bundle? = null
}
