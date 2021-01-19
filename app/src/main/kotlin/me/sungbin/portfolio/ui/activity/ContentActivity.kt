package me.sungbin.portfolio.ui.activity

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import me.sungbin.portfolio.R
import me.sungbin.portfolio.databinding.ActivityContentBinding

class ContentActivity : AppCompatActivity() {

    private val binding by lazy { ActivityContentBinding.inflate(layoutInflater) }
    private val navController by lazy {
        (supportFragmentManager.findFragmentById(R.id.fcv_container) as NavHostFragment).navController
    }

    private val listener = NavController.OnDestinationChangedListener { controller, _, _ ->
        binding.tvHello.text = when (controller.currentDestination?.id) {
            R.id.introduce -> getString(R.string.content_profile)
            R.id.skill -> getString(R.string.content_skill)
            R.id.android -> getString(R.string.content_android)
            else -> getString(R.string.content_information) // R.id.info
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_navigation, menu)
        binding.sbbNavigation.setupWithNavController(menu!!, navController)
        return true
    }

    override fun onResume() {
        super.onResume()
        navController.addOnDestinationChangedListener(listener)
    }

    override fun onPause() {
        navController.removeOnDestinationChangedListener(listener)
        super.onPause()
    }

}