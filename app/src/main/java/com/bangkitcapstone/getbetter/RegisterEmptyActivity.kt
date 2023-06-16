package com.bangkitcapstone.getbetter

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class RegisterEmptyActivity : Activity() {
    private var _bg__register_empty: View? = null
    private var rectangle_5: View? = null
    private var wifi: ImageView? = null
    private var fill: ImageView? = null
    private var outline: ImageView? = null
    private var reception: ImageView? = null
    private var time: TextView? = null
    private var already_have_an_account__login: TextView? = null
    private var sign_up_new_account: TextView? = null
    private var rectangle_29: View? = null
    private var button: TextView? = null
    private var rectangle: View? = null
    private var name: TextView? = null
    private var vector: ImageView? = null
    private var rectangle_ek1: View? = null
    private var username: TextView? = null
    private var vector_ek1: ImageView? = null
    private var vector_ek2: ImageView? = null
    private var rectangle_ek2: View? = null
    private var email: TextView? = null
    private var shape: ImageView? = null
    private var rectangle_ek3: View? = null
    private var password: TextView? = null
    private var shape_ek1: ImageView? = null
    private var shape_ek2: ImageView? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_empty)
        _bg__register_empty = findViewById<View>(R.id._bg__register_empty) as View
        rectangle_5 = findViewById<View>(R.id.rectangle_5) as View
        wifi = findViewById<View>(R.id.wifi) as ImageView
        fill = findViewById<View>(R.id.fill) as ImageView
        outline = findViewById<View>(R.id.outline) as ImageView
        reception = findViewById<View>(R.id.reception) as ImageView
        time = findViewById<View>(R.id.time) as TextView
        already_have_an_account__login =
            findViewById<View>(R.id.already_have_an_account__login) as TextView
        sign_up_new_account = findViewById<View>(R.id.sign_up_new_account) as TextView
        rectangle_29 = findViewById<View>(R.id.rectangle_29) as View
        button = findViewById<View>(R.id.button) as TextView
        rectangle = findViewById<View>(R.id.rectangle) as View
        name = findViewById<View>(R.id.name) as TextView
        vector = findViewById<View>(R.id.vector) as ImageView
        rectangle_ek1 = findViewById<View>(R.id.rectangle_ek1) as View
        username = findViewById<View>(R.id.username) as TextView
        vector_ek1 = findViewById<View>(R.id.vector_ek1) as ImageView
        vector_ek2 = findViewById<View>(R.id.vector_ek2) as ImageView
        rectangle_ek2 = findViewById<View>(R.id.rectangle_ek2) as View
        email = findViewById<View>(R.id.email) as TextView
        shape = findViewById<View>(R.id.shape) as ImageView
        rectangle_ek3 = findViewById<View>(R.id.rectangle_ek3) as View
        password = findViewById<View>(R.id.password) as TextView
        shape_ek1 = findViewById<View>(R.id.shape_ek1) as ImageView
        shape_ek2 = findViewById<View>(R.id.shape_ek2) as ImageView


        //custom code goes here
    }
}