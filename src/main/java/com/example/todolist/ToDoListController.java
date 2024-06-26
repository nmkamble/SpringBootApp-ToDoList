package com.example.todolist;

import java.util.List;
import java.util.Optional;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/to-do-list")
public class ToDoListController {
    @Autowired
    private ToDoList list;
    //checking status of api
    @GetMapping("/")
    ResponseEntity<String> index() {
        return ResponseEntity.ok("Working");
    }
    //get item from list
    @GetMapping("/item")
    ResponseEntity<Item> item(@RequestParam("id") int id) {
        return ResponseEntity.ok(list.getItemById(id));
    }
    //remove item from list
    @PutMapping("/item/remove")
    ResponseEntity<Item> removeItem(@RequestParam("id") int id) {
        return ResponseEntity.ok(list.removeItem(id));
    }
    //remove item by name
    @PutMapping("/item/remove/name")
    ResponseEntity<List<Item>> removeName(@RequestParam("name") String name) {
        list.deleteByName(name);
        return ResponseEntity.ok(list.getItems());
    }
    //Add item to a list
    @PostMapping("/list")
    ResponseEntity<Item> addItem(@RequestBody Item item) {
        return ResponseEntity.ok(list.addItem(item));
    }
    //Get current list
    @GetMapping("/list/display")
    ResponseEntity<List<Item>> getList() {
        return ResponseEntity.ok(list.getItems());
    }

}
