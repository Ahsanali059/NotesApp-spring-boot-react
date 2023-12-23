package com.example.notesreact;

import jakarta.persistence.*;

@Entity
@Table(name = "MyNotesApp")
public class Note {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String Content;
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
