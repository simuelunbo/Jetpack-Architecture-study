package com.example.androidappswithjetpackarchitecture.ui.auth

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.example.androidappswithjetpackarchitecture.R
import com.example.androidappswithjetpackarchitecture.util.GenericApiResponse

class RegisterFragment : BaseAuthFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d(TAG, "RegisterFragment: ${viewModel.hashCode()}")

        viewModel.testRegister().observe(viewLifecycleOwner, Observer {
            when (it) {

                is GenericApiResponse.ApiSuccessResponse -> {
                    Log.d(TAG, "Registration Response: ${it.body}")
                }

                is GenericApiResponse.ApiErrorResponse -> {
                    Log.d(TAG, "Registration Response: ${it.errorMessage}")
                }

                is GenericApiResponse.ApiEmptyResponse -> {
                    Log.d(TAG, "Registration Response: Empty Response")
                }
            }
        })
    }
}