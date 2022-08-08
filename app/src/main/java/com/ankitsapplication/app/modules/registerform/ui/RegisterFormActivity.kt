package com.ankitsapplication.app.modules.registerform.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.ankitsapplication.app.R
import com.ankitsapplication.app.appcomponents.base.BaseActivity
import com.ankitsapplication.app.databinding.ActivityRegisterFormBinding
import com.ankitsapplication.app.modules.dashboard.ui.DashboardActivity
import com.ankitsapplication.app.modules.registerform.`data`.viewmodel.RegisterFormVM
import kotlin.String
import kotlin.Unit

class RegisterFormActivity :
    BaseActivity<ActivityRegisterFormBinding>(R.layout.activity_register_form) {
  private val viewModel: RegisterFormVM by viewModels<RegisterFormVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.registerFormVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSignUp.setOnClickListener {
      val destIntent = DashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "REGISTER_FORM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RegisterFormActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
