package com.bangkitcapstone.getbetter

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class LoginEmptyActivity : Activity() {
    private var _bg__login___kosong: View? = null
    private var rectangle: View? = null
    private var create_new_account__sign_up: TextView? = null
    private var rectangle_29: View? = null
    private var button: TextView? = null
    private var wifi: ImageView? = null
    private var fill: ImageView? = null
    private var outline: ImageView? = null
    private var reception: ImageView? = null
    private var time: TextView? = null
    private var unsplash_puhxosappfa: View? = null
    private var shape: ImageView? = null
    private var forgot_your_password_: TextView? = null
    private var login_to_your_account: TextView? = null
    private var rectangle_ek1: View? = null
    private var your_email_address: TextView? = null
    private var shape_ek1: ImageView? = null
    private var rectangle_ek2: View? = null
    private var your_password: TextView? = null
    private var shape_ek2: ImageView? = null
    private var shape_ek3: ImageView? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_empty_activity)
        _bg__login___kosong = findViewById(R.id._bg__login___kosong) as View
        rectangle = findViewById(R.id.rectangle) as View
        create_new_account__sign_up =
            findViewById<View>(R.id.create_new_account__sign_up) as TextView
        rectangle_29 = findViewById(R.id.rectangle_29) as View
        button = findViewById<View>(R.id.button) as TextView
        wifi = findViewById<View>(R.id.wifi) as ImageView
        fill = findViewById<View>(R.id.fill) as ImageView
        outline = findViewById<View>(R.id.outline) as ImageView
        reception = findViewById<View>(R.id.reception) as ImageView
        time = findViewById<View>(R.id.time) as TextView
        unsplash_puhxosappfa = findViewById(R.id.unsplash_puhxosappfa) as View
        shape = findViewById<View>(R.id.shape) as ImageView
        forgot_your_password_ = findViewById<View>(R.id.forgot_your_password_) as TextView
        login_to_your_account = findViewById<View>(R.id.login_to_your_account) as TextView
        rectangle_ek1 = findViewById(R.id.rectangle_ek1) as View
        your_email_address = findViewById<View>(R.id.your_email_address) as TextView
        shape_ek1 = findViewById<View>(R.id.shape_ek1) as ImageView
        rectangle_ek2 = findViewById(R.id.rectangle_ek2) as View
        your_password = findViewById<View>(R.id.your_password) as TextView
        shape_ek2 = findViewById<View>(R.id.shape_ek2) as ImageView
        shape_ek3 = findViewById<View>(R.id.shape_ek3) as ImageView


        //custom code goes here
    }
}