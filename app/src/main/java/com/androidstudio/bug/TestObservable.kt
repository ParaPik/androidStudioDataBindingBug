package com.androidstudio.bug

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class TestObservable : BaseObservable() {

    @get:Bindable
    var someVar: String = "someVar"
        set(value) {
            field = value
            notifyPropertyChanged(BR.someVar) // studio doesn't BR.someVar
        }

}