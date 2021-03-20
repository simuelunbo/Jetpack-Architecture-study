package com.example.androidappswithjetpackarchitecture.ui.auth

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.example.androidappswithjetpackarchitecture.R
import com.example.androidappswithjetpackarchitecture.util.GenericApiResponse

class LoginFragment : BaseAuthFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d(TAG, "LoginFragment: ${viewModel.hashCode()}")

        viewModel.testLogin().observe(viewLifecycleOwner, Observer {
            when (it) {

                is GenericApiResponse.ApiSuccessResponse -> {
                    Log.d(TAG, "Login Response: ${it.body}")
                }

                is GenericApiResponse.ApiErrorResponse -> {
                    Log.d(TAG, "Login Response: ${it.errorMessage}")
                }

                is GenericApiResponse.ApiEmptyResponse -> {
                    Log.d(TAG, "Login Response: Empty Response")
                }
            }
        })
    }

}