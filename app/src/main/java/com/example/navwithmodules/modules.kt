package com.example.navwithmodules

import android.text.Layout
import com.example.amodule.AFragmentDirections
import com.example.bmodule.BFragment
import com.example.bmodule.FragmentBNavigateImpl
 import com.example.navigate.FragmentBNavigate
import org.koin.dsl.module

val modulesB = module{
    factory <FragmentBNavigate>{
        FragmentBNavigateImpl( R.id.action_AFragment_to_BFragment)
    }
}

//val modulesB = module{
//val a= AFragmentDirections::class
//    factory <FragmentBNavigate>{
//        FragmentBNavigateImpl( a)
//    }
//}