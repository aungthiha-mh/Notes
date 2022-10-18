package com.flexath.notes.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.flexath.notes.R
import com.flexath.notes.data.NoteViewModel
import com.flexath.notes.ui.MainActivity
import com.flexath.notes.ui.NoteHomeAdapter
import com.flexath.notes.utils.toast
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment(), MenuProvider {

    private lateinit var viewModelHome:NoteViewModel
    private var adapter: NoteHomeAdapter? = null
    private lateinit var linearLayout:LinearLayoutManager

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val menuHost = requireActivity()
        menuHost.addMenuProvider(this,viewLifecycleOwner, Lifecycle.State.RESUMED)
        viewModelHome = (activity as MainActivity).viewModel
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity?)!!.supportActionBar!!.show()

        linearLayout = LinearLayoutManager(requireActivity())
        recyclerHome.layoutManager = linearLayout
        recyclerHome.setHasFixedSize(true)

        viewModelHome.noteList?.observe(viewLifecycleOwner) {
            Log.d("HomeFragment",it.toString())
            adapter = NoteHomeAdapter(it)
            recyclerHome.adapter = adapter
            adapter?.notifyDataSetChanged()
        }

        fabAdd.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeToNote()
            Navigation.findNavController(it).navigate(action)
        }
    }

    override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
        menuInflater.inflate(R.menu.home_menu,menu)
    }

    override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
        when(menuItem.itemId) {
            R.id.menuLayout -> {
                context?.toast("Menu clicked")
            }
            R.id.menuSetting -> {
                context?.toast("Setting clicked")
            }
        }
        return true
    }

}