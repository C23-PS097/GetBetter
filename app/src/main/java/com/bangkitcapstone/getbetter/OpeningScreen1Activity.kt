package com.bangkitcapstone.getbetter

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class OpeningScreen1Activity : Activity() {
    private var _bg__opening_screen_1: View? = null
    private var rectangle: View? = null
    private var referensi_ui_1: ImageView? = null
    private var referensi_ui__1__1: ImageView? = null
    private var referensi_ui__1__2: ImageView? = null
    private var hi__welcome_to_getbetter_application_: TextView? = null
    private var we_build_food_and_medicine_recommendation_application_for_health_living_: TextView? =
        null
    private var ellipse_111: View? = null
    private var ellipse_112: View? = null
    private var rectangle_4215: View? = null
    private var rectangle_4216: View? = null
    private var next: TextView? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.opening_screen_1)
        _bg__opening_screen_1 = findViewById(R.id._bg__opening_screen_1) as View
        rectangle = findViewById(R.id.rectangle) as View
        referensi_ui_1 = findViewById<View>(R.id.referensi_ui_1) as ImageView
        referensi_ui__1__1 = findViewById<View>(R.id.referensi_ui__1__1) as ImageView
        referensi_ui__1__2 = findViewById<View>(R.id.referensi_ui__1__2) as ImageView
        hi__welcome_to_getbetter_application_ =
            findViewById<View>(R.id.hi__welcome_to_getbetter_application_) as TextView
        we_build_food_and_medicine_recommendation_application_for_health_living_ =
            findViewById<View>(R.id.we_build_food_and_medicine_recommendation_application_for_health_living_) as TextView
        ellipse_111 = findViewById(R.id.ellipse_111) as View
        ellipse_112 = findViewById(R.id.ellipse_112) as View
        rectangle_4215 = findViewById(R.id.rectangle_4215) as View
        rectangle_4216 = findViewById(R.id.rectangle_4216) as View
        next = findViewById<View>(R.id.next) as TextView


        //custom code goes here
    }
}