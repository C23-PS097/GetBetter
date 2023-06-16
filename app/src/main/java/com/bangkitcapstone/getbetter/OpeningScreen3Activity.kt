package com.bangkitcapstone.getbetter

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class OpeningScreen3Activity : Activity() {
    private var _bg__opening_screen_3: View? = null
    private var referensi_ui__1__1_os3: ImageView? = null
    private var referensi_ui__1__2_0s3: ImageView? = null
    private var rectangle_os3: View? = null
    private var get_personalized_recommendations_for_your_food_and_medicine_needs_: TextView? = null
    private var ellipse_111: View? = null
    private var ellipse_112: View? = null
    private var rectangle_4215: ImageView? = null
    private var referensi_ui_os3: ImageView? = null
    private var rectangle_4216: View? = null
    private var let_s_get_started__: TextView? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.opening_screen_3)
        _bg__opening_screen_3 = findViewById(R.id._bg__opening_screen_3) as View
        referensi_ui__1__1_os3 = findViewById<View>(R.id.referensi_ui__1__1_os3) as ImageView
        referensi_ui__1__2_0s3 = findViewById<View>(R.id.referensi_ui__1__2_0s3) as ImageView
        rectangle_os3 = findViewById(R.id.rectangle_os3) as View
        get_personalized_recommendations_for_your_food_and_medicine_needs_ =
            findViewById<View>(R.id.get_personalized_recommendations_for_your_food_and_medicine_needs_) as TextView
        ellipse_111 = findViewById(R.id.ellipse_111) as View
        ellipse_112 = findViewById(R.id.ellipse_112) as View
        rectangle_4215 = findViewById<View>(R.id.rectangle_4215) as ImageView
        referensi_ui_os3 = findViewById<View>(R.id.referensi_ui_os3) as ImageView
        rectangle_4216 = findViewById(R.id.rectangle_4216) as View
        let_s_get_started__ = findViewById<View>(R.id.let_s_get_started__) as TextView


        //custom code goes here
    }
}