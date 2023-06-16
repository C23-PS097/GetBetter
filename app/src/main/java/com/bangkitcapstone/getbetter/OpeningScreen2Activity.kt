package com.bangkitcapstone.getbetter

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class OpeningScreen2Activity : Activity() {
    private var _bg__opening_screen_2: View? = null
    private var rectangle_os2: View? = null
    private var referensi_ui__1__1: ImageView? = null
    private var referensi_ui__1__2: ImageView? = null
    private var let_our_app_guide_you_to_a_healthier_and_tastier_lifestyle_: TextView? = null
    private var ellipse_111: View? = null
    private var ellipse_112: View? = null
    private var rectangle_4215: View? = null
    private var referensi_ui_os2: ImageView? = null
    private var rectangle_4216_os2: View? = null
    private var next: TextView? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.opening_screen_2)
        _bg__opening_screen_2 = findViewById(R.id._bg__opening_screen_2) as View
        rectangle_os2 = findViewById(R.id.rectangle_os2) as View
        referensi_ui__1__1 = findViewById<View>(R.id.referensi_ui__1__1) as ImageView
        referensi_ui__1__2 = findViewById<View>(R.id.referensi_ui__1__2) as ImageView
        let_our_app_guide_you_to_a_healthier_and_tastier_lifestyle_ =
            findViewById<View>(R.id.let_our_app_guide_you_to_a_healthier_and_tastier_lifestyle_) as TextView
        ellipse_111 = findViewById(R.id.ellipse_111) as View
        ellipse_112 = findViewById(R.id.ellipse_112) as View
        rectangle_4215 = findViewById(R.id.rectangle_4215) as View
        referensi_ui_os2 = findViewById<View>(R.id.referensi_ui_os2) as ImageView
        rectangle_4216_os2 = findViewById(R.id.rectangle_4216_os2) as View
        next = findViewById<View>(R.id.next) as TextView


        //custom code goes here
    }
}