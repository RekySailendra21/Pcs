package com.applibrary.app.ui.auth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.applibrary.app.R
import com.applibrary.app.data.model.AuthUser
import com.applibrary.app.databinding.ActivityAuthBinding
import com.applibrary.app.ui.home.MainActivity

class AuthActivity : AppCompatActivity() {
    lateinit var binding: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_auth)
    }

    fun onSuccess(authUser : AuthUser?) {
        val intent = Intent (this,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}