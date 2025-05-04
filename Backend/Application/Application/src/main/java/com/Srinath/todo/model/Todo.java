package com.Srinath.todo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data // generates getters, setters, toString, equals, hashCode
@NoArgsConstructor // generates a no-arg constructor
@AllArgsConstructor // generates an all-args constructor
public class Todo {
    // Getter for 'id'
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // Getter for 'task'
    private String task;
    // Getter for 'completed' -- This is where the isCompleted() method should be
    private boolean completed;  // Assuming this is a boolean field

    // Setter for 'id'
    public void setId(Long id) {
        this.id = id;
    }

    // Setter for 'task'
    public void setTask(String task) {
        this.task = task;
    }

    // Setter for 'completed'
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
