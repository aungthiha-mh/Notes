package com.flexath.notes.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.flexath.notes.R
import com.flexath.notes.data.NoteRepository
import com.flexath.notes.data.NoteViewModel
import com.flexath.notes.data.ViewModelFactory
import com.flexath.notes.data.room.NoteDatabase
import com.flexath.notes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var navController: NavController
    private lateinit var repository:NoteRepository
    lateinit var viewModel:NoteViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHost = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHost.navController
        NavigationUI.setupActionBarWithNavController(this,navController)
        getViewModel()

        navController.addOnDestinationChangedListener { _, destination, _ ->
            if (destination.id == R.id.noteFragment) {
                supportActionBar?.hide()
            } else {
                supportActionBar?.show()
            }
        }
    }

    private fun getViewModel() {
        val dao = NoteDatabase.getInstance(this).noteDao
        repository = NoteRepository(dao)
        val factory = ViewModelFactory(repository)
        viewModel = ViewModelProvider(this,factory).get(NoteViewModel::class.java)
    }
}