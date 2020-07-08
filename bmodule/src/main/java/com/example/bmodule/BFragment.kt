package com.example.bmodule


import android.content.Intent.getIntent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_b.view.*

/**
 * A simple [Fragment] subclass.
 */
class BFragment : Fragment() {
    companion object {
        private const val EXTRA_STRING = "b.module.string"

        fun createBundle(string: String) =
            Bundle().apply { putString(EXTRA_STRING, string) }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.tv_message.text  =arguments?.getString(EXTRA_STRING)?:"AFF"
        super.onViewCreated(view, savedInstanceState)
    }
}
