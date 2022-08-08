package com.ankitsapplication.app.modules.dashboard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ankitsapplication.app.modules.dashboard.`data`.model.DashboardModel
import com.ankitsapplication.app.modules.dashboard.`data`.model.DashboardRowModel
import com.ankitsapplication.app.modules.dashboard.`data`.model.FlashsaleRowModel
import com.ankitsapplication.app.modules.dashboard.`data`.model.MegasaleRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DashboardVM : ViewModel(), KoinComponent {
  val dashboardModel: MutableLiveData<DashboardModel> = MutableLiveData(DashboardModel())

  var navArguments: Bundle? = null

  val flashSaleList: MutableLiveData<MutableList<FlashsaleRowModel>> =
      MutableLiveData(mutableListOf())

  val megaSaleList: MutableLiveData<MutableList<MegasaleRowModel>> =
      MutableLiveData(mutableListOf())

  val dashboardList: MutableLiveData<MutableList<DashboardRowModel>> =
      MutableLiveData(mutableListOf())
}
