package com.example.amodule


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.navigate.FragmentBNavigate
import kotlinx.android.synthetic.main.fragment_a.*
import org.koin.android.ext.android.inject

/**
 * A simple [Fragment] subclass.
 */
class AFragment : Fragment() {
    private val navigateToB:FragmentBNavigate by inject()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        navigateToB.setNav((NavHostFragment.findNavController(this)))
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener {
            navigateToB.goToFramgentB(edit_text.text.toString())
        }
    }
}
