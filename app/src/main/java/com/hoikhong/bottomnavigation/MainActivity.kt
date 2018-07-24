package com.hoikhong.bottomnavigation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolbar))

        bindView()

        navigationButtom()

    }

    private fun navigationButtom() {
        navigation.setOnNavigationItemSelectedListener { item ->

            when (item.itemId) {

                R.id.navigation_shop -> {
                    toolbar.title = "shop"
                    openFragment(StoreFragment.newInstance())
                    true
                }
                R.id.navigation_gifts -> {
                    toolbar.title = "Gifts"
                    openFragment(GiftsFragment.newInstance())
                    true
                }
                R.id.navigation_cart -> {
                    toolbar.title = "Cart"
                    openFragment(CardFragment.newInstance())
                    true
                }
                R.id.navigation_profile -> {
                    toolbar.title = "profile"
                    openFragment(PersonFragment.newInstance())
                    true
                }
                else -> false
            }
        }


    }

    private fun bindView() {
        navigation.selectedItemId = R.id.navigation_profile
        openFragment(PersonFragment.newInstance())


    }

    fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.content_container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }



}
