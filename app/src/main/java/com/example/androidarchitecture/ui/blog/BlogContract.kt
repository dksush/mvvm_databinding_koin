package com.example.androidarchitecture.ui.blog

interface BlogContract {
    interface View<T> {
        fun renderItems(items: List<T>)
        fun errorToast(msg: String?)
        fun blankInputText()
        fun inputKeyword(msg: String?)
        fun isListEmpty(visible: Boolean)

    }

    interface Presenter {
        suspend fun requestSearchHist()
        fun requestList(text: String)


    }
}