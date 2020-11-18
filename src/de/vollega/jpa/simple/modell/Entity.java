package de.vogella.jpa.simple.model;

import de.vollega.jpa.simple.modell.Data;
import de.vollega.jpa.simple.modell.GeneratedValue;
import de.vollega.jpa.simple.modell.GenerationType;
import de.vollega.jpa.simple.modell.Id;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String summary;
    private String description;

    public Todo(Long id) {
        this.id = id;
    }
}