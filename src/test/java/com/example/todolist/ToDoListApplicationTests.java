package com.example.todolist;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ToDoListApplicationTests {

    @Resource
    private ListRepository listRepository;
    @Autowired
    ToDoList testRepo;
    @Test
//    public void testInsert(){
//        Item item = new Item(1, "eat", "In progress", 1);
//        listRepository.save(item);
//        assertEquals(item, listRepository.findById(1L));
//    }
    public void testDelete(){
        Item item = new Item(1, "eat", 0, 1);
        testRepo.addItem(item);
        Item item2 = new Item(2, "drink", 0, 2);
        testRepo.deleteByName("drink");
        assertEquals(1, testRepo.getItems().size());

    }

}
