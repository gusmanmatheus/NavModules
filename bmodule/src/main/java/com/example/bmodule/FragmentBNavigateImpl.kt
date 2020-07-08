package com.example.bmodule

import androidx.navigation.NavController
import com.example.navigate.FragmentBNavigate

class FragmentBNavigateImpl(val id: Int) : FragmentBNavigate {
    private var navController: NavController? = null

    override fun goToFramgentB(string: String) {
        this.navController?.navigate(id, BFragment.createBundle(string))

    }

    override fun setNav(navController: NavController) {
        this.navController = navController
    }

}