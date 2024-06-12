package com.example.todolist;

import lombok.*;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item {
    @Id
    @GeneratedValue
    long id;
    //
    //    public Item() {
    //
    //    }
    //
    //    public int getId() { return id;}
    @Getter
    @Column(nullable = false)
    String name;
    @Getter
    @Setter
    @Column(nullable = false)
    String status;
    @Getter
    @Column(nullable = false)
    int list_id;
}


//    public String getStatus() {
//        return status;
//    }
//
//    public int getList_id() {return list_id;}
//    public void changeName(String newName) {
//        this.name = newName;
//    }
//    public void changeStatus(String newStatus) { this.status = newStatus;}

