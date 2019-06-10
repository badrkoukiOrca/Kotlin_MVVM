package com.example.kotlin_mvvm.viewmodel


import android.content.Context
import android.view.View
import android.widget.Toast
import com.example.kotlin_mvvm.databinding.ActivityMainBinding
import  com.example.kotlin_mvvm.model.MyName

object ViewModel {

    fun addNickname(view: View, binding:ActivityMainBinding,context:Context) {
        binding. apply {
            if(nicknameEdit.text.toString().equals("")||nameEdit.text.toString().equals("")){
                //Toast.makeText(Vie)
                Toast.makeText(context,"Fill all fields",Toast.LENGTH_SHORT).show()
            }else{
                myName?.lastname = nicknameEdit.text.toString()
                myName?.name = nameEdit.text.toString()
                invalidateAll()
                nicknameText.visibility = View.VISIBLE
            }

        }
        // Hide the keyboard.
        /*val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)*/
    }
}