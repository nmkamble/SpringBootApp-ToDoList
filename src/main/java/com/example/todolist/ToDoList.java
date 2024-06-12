package com.example.todolist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoList {

    @Autowired
    private ListRepository listRepository;

    final

    public Item getItemById(long itemID){
        return listRepository.findById(itemID);
    }

    public List<Item> getItems(){
        return listRepository.findAll();
    }

    public Item removeItem(int index){
        List<Item> items= listRepository.findAll();
        return items.remove(index);
    }

    public Item addItem(Item item){
        return listRepository.save(item);
    }


//    public String toString(){
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < items.size(); i++){
//            sb.append(i + 1).append(". ").append(items.get(i).getName()).append(" Status: ").append(items.get(i).getStatus());
//        }
//        return sb.toString();
//    }
}
