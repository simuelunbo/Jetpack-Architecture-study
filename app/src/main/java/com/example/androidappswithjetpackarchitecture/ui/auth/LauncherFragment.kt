package com.example.androidappswithjetpackarchitecture.ui.auth

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.androidappswithjetpackarchitecture.R

class LauncherFragment : BaseAuthFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_launcher, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d(TAG, "LauncherFragment: ${viewModel.hashCode()}")

        val register = view.findViewById<TextView>(R.id.register)
        register.setOnClickListener {
            navRegistration()
        }
        val login = view.findViewById<TextView>(R.id.login)
        login.setOnClickListener {
            navLogin()
        }

        val forgotPassword = view.findViewById<TextView>(R.id.forgot_password)
        forgotPassword.setOnClickListener {
            navForgotPassword()
        }

        val focusableView = view.findViewById<View>(R.id.focusable_view)
        focusableView.requestFocus()
    }

    private fun navForgotPassword() {
        findNavController().navigate(R.id.action_launcherFragment_to_forgotPasswordFragment)
    }

    private fun navLogin() {
        findNavController().navigate(R.id.action_launcherFragment_to_loginFragment)

    }

    private fun navRegistration() {
        findNavController().navigate(R.id.action_launcherFragment_to_registerFragment)
    }


}