package com.example.labamvp

interface MainInterface {
    interface View {
        fun showText(message:String)
    }

    interface Presenter {
        fun onButtonWasClicked(newMessage:String)
    }

    interface Repository {
        fun loadMessage(newMessage:String): String?
    }
}