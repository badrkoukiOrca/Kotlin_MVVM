package com.example.kotlin_mvvm.ViewModel


import android.view.View
import com.example.kotlin_mvvm.databinding.ActivityMainBinding

object ViewModel {

    fun addNickname(view: View, binding:ActivityMainBinding) {
        binding. apply {
            myName?.lastname = nicknameEdit.text.toString()
            invalidateAll()
            nicknameText.visibility = View.VISIBLE
        }
        // Hide the keyboard.
        /*val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)*/
    }
}