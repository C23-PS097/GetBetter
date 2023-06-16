package com.bangkitcapstone.getbetter

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class SplashScreenActivity : Activity() {
    private var _bg__splash_screen: View? = null
    private var union: ImageView? = null
    private var getbetter: TextView? = null
    private var wifi: ImageView? = null
    private var fill: ImageView? = null
    private var outline: ImageView? = null
    private var reception: ImageView? = null
    private var time: TextView? = null
    private var rectangle: View? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)
        _bg__splash_screen = findViewById(R.id._bg__splash_screen) as View
        union = findViewById<View>(R.id.union) as ImageView
        getbetter = findViewById<View>(R.id.getbetter) as TextView
        wifi = findViewById<View>(R.id.wifi) as ImageView
        fill = findViewById<View>(R.id.fill) as ImageView
        outline = findViewById<View>(R.id.outline) as ImageView
        reception = findViewById<View>(R.id.reception) as ImageView
        time = findViewById<View>(R.id.time) as TextView
        rectangle = findViewById(R.id.rectangle) as View


        //custom code goes here
    }
}