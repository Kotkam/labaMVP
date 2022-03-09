package com.example.labamvp

import android.view.Display

class Presenter(mView: MainInterface.View?): MainInterface.Presenter {

    private var mView: MainInterface.View? = null
    private var mModel: MainInterface.Repository? = null

    //Сообщение
    private var message: String? = null

    init{
        this.mView = mView
        mModel = Model()
    }


    override fun onButtonWasClicked(newMessage:String){
        message = mModel!!.loadMessage(newMessage)
        mView!!.showText(message!!)
    }

}