package com.flexath.notes.ui.fragment

import android.app.AlertDialog
import android.graphics.Color
import android.os.Bundle
import android.view.*
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.flexath.notes.R
import com.flexath.notes.data.NoteViewModel
import com.flexath.notes.data.room.NoteEntity
import com.flexath.notes.databinding.FragmentUpdateNoteBinding
import com.flexath.notes.ui.MainActivity
import com.flexath.notes.utils.toast

class UpdateNoteFragment : Fragment(),MenuProvider {

    private lateinit var currentNote: NoteEntity
    private var _binding: FragmentUpdateNoteBinding? = null
    private lateinit var viewModelUpdate: NoteViewModel
    private val binding get() = _binding!!
    private val args: UpdateNoteFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val menuHost = requireActivity()
        menuHost.addMenuProvider(this,viewLifecycleOwner, Lifecycle.State.RESUMED)
        _binding = FragmentUpdateNoteBinding.inflate(inflater,container,false)
        viewModelUpdate = (activity as MainActivity).viewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        currentNote = args.note!!
        binding.edUpdateTitle.setText(currentNote.title)
        binding.edUpdateDescription.setText(currentNote.description)

        binding.fabUpdate.setOnClickListener {
            currentNote.title = binding.edUpdateTitle.text.toString()
            currentNote.description = binding.edUpdateDescription.text.toString()
            val note = NoteEntity(currentNote.title,currentNote.description)
            note.id = currentNote.id
            viewModelUpdate.updateNote(note)
            findNavController().popBackStack()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        currentNote.title = binding.edUpdateTitle.text.toString()
        currentNote.description = binding.edUpdateDescription.text.toString()
        val note = NoteEntity(currentNote.title,currentNote.description)
        note.id = currentNote.id
        viewModelUpdate.updateNote(note)
        _binding = null
    }

    override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
        return menuInflater.inflate(R.menu.add_menu,menu)
    }

    override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
        when(menuItem.itemId) {
            R.id.deleteMenuButton -> {
                getAlertDialog()
            }
        }
        return true
    }

    private fun getAlertDialog() {
        val dialog = activity?.let {
            AlertDialog.Builder(it)
                .setTitle("DELETE NOTE ?")
                .setMessage("           ")
                .setIcon(R.drawable.ic_note)
                .setPositiveButton("DELETE") { _, _ ->
                    viewModelUpdate.deleteNote(currentNote)
                    context?.toast("Note is deleted")
                    findNavController().popBackStack()
                }.setNegativeButton("No",null)
                .setCancelable(true)
                .create()
        }
        dialog?.show()
        dialog?.getButton(AlertDialog.BUTTON_POSITIVE)?.setTextColor(Color.parseColor("#ef5350"))
        dialog?.getButton(AlertDialog.BUTTON_NEGATIVE)?.setTextColor(Color.parseColor("#ef5350"))
    }
}