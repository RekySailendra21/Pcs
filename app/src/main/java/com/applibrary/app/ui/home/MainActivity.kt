package com.applibrary.app.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.applibrary.app.R
import com.applibrary.app.databinding.ActivityAuthBinding
import com.applibrary.app.databinding.ActivityMainBinding
import com.applibrary.app.ui.auth.ApplibraryAuth
import com.applibrary.app.ui.auth.AuthActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.buttonLogout.setOnClickListener{
            ApplibraryAuth.logout(this) {
                startActivity(Intent(this,AuthActivity :: class.java))
                finish()
            }
        }
    }
}