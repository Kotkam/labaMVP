package com.example.labamvp

class Model: MainInterface.Repository {
    private var currentMessage :String = ""
    override fun loadMessage(newMessage:String): String{
        currentMessage += newMessage
        return currentMessage
    }
}