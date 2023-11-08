package com.jk.todo.todo.Controller;

import com.jk.todo.todo.Repository.TodoRepository;
import com.jk.todo.todo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/api")
public class TodoController {
    @Autowired
    private TodoRepository todoRepository;

    @GetMapping("/todo/all")
    public List<Todo> getAllTodos(){
        return todoRepository.findAll();
    }
    @GetMapping("/todo/{id}")
    public Todo getTodo(@PathVariable int id){
        return todoRepository.findById(id);
    }

    @PostMapping("/todo")
    public List<Todo> addTodo(@RequestBody Todo todo){
        return todoRepository.insertTodo(todo);
    }

    @PutMapping("/todo")
    public List<Todo> updateTodo(@RequestBody Todo todo){
        return todoRepository.update(todo);
    }

    @DeleteMapping("/todo/{id}")
    public List<Todo> deleteTodo(@PathVariable int id){
        return todoRepository.deleteById(id);
    }

}
