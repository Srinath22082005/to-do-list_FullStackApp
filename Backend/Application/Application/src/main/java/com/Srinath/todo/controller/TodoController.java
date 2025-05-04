package com.Srinath.todo.controller;

import com.Srinath.todo.model.Todo;
import com.Srinath.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<Todo> getAll() {
        return todoService.getAllTodos();
    }

    @PostMapping
    public Todo create(@RequestBody Todo todo) {
        return todoService.createTodo(todo);
    }

    @PutMapping("/{id}")
    public Todo update(@PathVariable int id, @RequestBody Todo todo) {
        return todoService.updateTodo(id, todo);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        todoService.deleteTodo(id);
        return "Todo Deleted";
    }
}
