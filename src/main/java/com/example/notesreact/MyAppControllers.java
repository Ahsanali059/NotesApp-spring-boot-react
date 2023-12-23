package com.example.notesreact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class MyAppControllers {

    @Autowired
    private NoteRepository noteRepository;

    @GetMapping
    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    @PostMapping  // Use @PostMapping instead of @GetMapping for creating a new note
    public Note createNote(@RequestBody Note note) {
        return noteRepository.save(note);
    }
}
