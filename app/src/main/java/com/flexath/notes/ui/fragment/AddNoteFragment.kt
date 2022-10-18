package com.flexath.notes.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.flexath.notes.data.NoteViewModel
import com.flexath.notes.data.room.NoteEntity
import com.flexath.notes.databinding.FragmentAddNoteBinding
import com.flexath.notes.ui.MainActivity

class AddNoteFragment : Fragment() {

    private lateinit var noteEntity:NoteEntity
    private lateinit var viewModelAdd: NoteViewModel
    private var _binding:FragmentAddNoteBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentAddNoteBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModelAdd = (activity as MainActivity).viewModel

        binding.fabSave.setOnClickListener {
            val title = binding.edTitle.text.toString()
            val description = binding.etDescription.text.toString()
            noteEntity = NoteEntity(title,description)
            viewModelAdd.insertNote(noteEntity)
            findNavController().popBackStack()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}