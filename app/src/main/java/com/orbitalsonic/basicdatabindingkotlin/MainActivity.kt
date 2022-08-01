package com.orbitalsonic.basicdatabindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.orbitalsonic.basicdatabindingkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var mName: MyName = MyName("FullName: Muhammad Yaqoob","NickName: Boby")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        onClickMethod()

    }

    private fun onClickMethod(){
        binding.btnData.setOnClickListener {
            binding.myName = mName
        }
    }
}