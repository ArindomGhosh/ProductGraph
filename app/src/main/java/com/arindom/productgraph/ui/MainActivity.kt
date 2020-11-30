package com.arindom.productgraph.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import com.arindom.productgraph.R
import com.arindom.productgraph.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(mBinding.root)
        setSupportActionBar(mBinding.root.findViewById(R.id.toolbar))
    }

    fun configureToolbar(title: String?, backDrawable: Int? = null) {
        mBinding.root.findViewById<Toolbar>(R.id.toolbar)?.let {
            if (title != null) {
                it.title = title
            }
            setSupportActionBar(it)
        }
        supportActionBar.let {
            if (it != null) {
                if (backDrawable != null) {
                    it.setHomeAsUpIndicator(backDrawable)
                }
                it.setDisplayHomeAsUpEnabled(true)
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        onBackPressed()
        return super.onOptionsItemSelected(item)
    }
}