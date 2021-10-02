package com.example.todoktxapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.todoktxapplication.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private var mBinding:ActivityMainBinding?=null;
    //private var mBottomNavigationView:BottomNavigationView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        val navHostFragment=supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController=navHostFragment.navController

        mBinding?.bottomNavigatinView?.setOnItemSelectedListener { menuItem->

            when(menuItem.itemId) {
                R.id.work_list_menu ->{
                    navController.navigate(R.id.dutiesFragment)
                return@setOnItemSelectedListener true}

                R.id.calculate_menu -> {
                    navController.navigate(R.id.calculateFragment)
                return@setOnItemSelectedListener true}

                R.id.date_menu -> {
                    navController.navigate(R.id.dateFragment)
                return@setOnItemSelectedListener true}


                R.id.profile_menu -> {
                    navController.navigate(R.id.profileFragment)
                return@setOnItemSelectedListener true}



                else->false

        }
        }

    }
}