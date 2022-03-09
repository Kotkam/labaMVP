package com.example.labamvp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity :MainInterface.View, AppCompatActivity() {

    private lateinit var mPresenter: MainInterface.Presenter

    private lateinit var myTextView :TextView
    private lateinit var myButton: Button
    private lateinit var myEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPresenter = Presenter(this)

        myTextView = findViewById(R.id.textView)
        myButton = findViewById(R.id.button)
        myEditText = findViewById(R.id.editText)


        myButton.setOnClickListener { mPresenter.onButtonWasClicked(myEditText.text.toString()) }
    }

    override fun showText(message: String){
        myTextView.text = message
        myEditText.text.clear()
    }
}