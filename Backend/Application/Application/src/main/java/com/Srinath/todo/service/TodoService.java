package com.Srinath.todo.service;

import com.Srinath.todo.model.Todo;
import com.Srinath.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo updateTodo(int id, Todo updatedTodo) {
        Todo todo = todoRepository.findById(id).orElseThrow();
        todo.setTask(updatedTodo.getTask());
        todo.setCompleted(updatedTodo.isCompleted());
        return todoRepository.save(todo);
    }

    public void deleteTodo(int id) {
        todoRepository.deleteById(id);
    }
}
