package com.bangkitcapstone.getbetter

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.bangkitcapstone.getbetter.fragment.HomeFragment
import com.bangkitcapstone.getbetter.fragment.ProfileFragment
import com.bangkitcapstone.getbetter.fragment.SearchFragment
import me.ibrahimsn.lib.NiceBottomBar

class MainActivity : AppCompatActivity() {
//    private val binding by viewBinding(ActivityMainBinding::inflate)

    private var last_opened_tab = 0

    private var bottomBar : NiceBottomBar?= null

    private var imgHome: ImageView?= null
    private var imgProfile: ImageView?= null

    private var clSearch: ConstraintLayout?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomBar = findViewById(R.id.bottomBar)
        imgHome = findViewById(R.id.imgHome)
        imgProfile = findViewById(R.id.imgProfile)
        clSearch = findViewById(R.id.clSearch)

        setListener()
    }

    override fun onResume() {
        super.onResume()
        if (intent.hasExtra("tab")) {
            setTabActive(intent.getIntExtra("tab", 0))
            bottomBar?.setActiveItem(1)
        } else
            setTabActive(last_opened_tab)
    }

    private fun setListener() {
        bottomBar?.setActiveItem(0)
        bottomBar?.onItemSelected = {
            last_opened_tab = it
            setTabActive(last_opened_tab)
        }

        selectTabHome()
        selectTabSearch()
        selectTabProfile()
    }

    fun selectTabHome(){
        imgHome?.setOnClickListener {
            changeFragmentTo(HomeFragment())
        }
    }

    fun selectTabProfile(){
        imgProfile?.setOnClickListener {
            changeFragmentTo(ProfileFragment())
        }
    }

    fun selectTabSearch(){
        clSearch?.setOnClickListener {
            changeFragmentTo(SearchFragment())
        }
    }

    private fun setTabActive(position: Int) {
        when (position) {
            0 -> changeFragmentTo(HomeFragment())
            1 -> changeFragmentTo(SearchFragment())
            2 -> changeFragmentTo(ProfileFragment())
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onBackPressed() {
        changeFragmentTo(HomeFragment())
    }

    fun changeFragmentTo(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.container_body, fragment).commit()
    }

    fun changeFragmentTo(fragment: Fragment, bundle: Bundle) {
        val fragmentManager = supportFragmentManager
        fragment.arguments = bundle
        fragmentManager.beginTransaction().replace(R.id.container_body, fragment).commit()
    }

}