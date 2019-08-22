package com.androidstudio.bug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val testVar = BR.test_var // studio sees test_var id from layout
        val observable = TestObservable()
        observable.someVar = "Test" // inside someVar property studio doesn't see BR.someVar
    }
}
