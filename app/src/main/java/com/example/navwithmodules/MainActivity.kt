package com.example.navwithmodules

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.amodule.AFragment
import com.example.amodule.AFragmentDirections
import com.example.bmodule.BFragment
import com.example.bmodule.BFragmentArgs

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
R.id.action_AFragment_to_BFragment
    }
}
