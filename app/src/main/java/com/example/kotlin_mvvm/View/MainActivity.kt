package com.example.kotlin_mvvm.View

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin_mvvm.Model.MyName
import com.example.kotlin_mvvm.R

class MainActivity : AppCompatActivity() {
    private lateinit var binding: com.example.kotlin_mvvm.databinding.ActivityMainBinding
    private val myName: MyName = MyName("Kouki", "Badr")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.myName = myName
        binding.doneButton.setOnClickListener {
            com.example.kotlin_mvvm.ViewModel.addNickname(it, binding)
        }
    }
    /*private fun addNickname(view: View) {
        binding. apply {
            myName?.lastname = nicknameEdit.text.toString()
            invalidateAll()
            nicknameText.visibility = View.VISIBLE
        }
        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }*/
}
