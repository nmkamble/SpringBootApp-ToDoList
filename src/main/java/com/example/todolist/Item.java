package com.example.todolist;

import lombok.*;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder
public class Item {
    public enum Status {
        INCOMPLETE,
        IN_PROGRESS,
        COMPLETE
    }
    @Id
    @GeneratedValue
    long id;

    @Getter @Column(nullable = false) String name;
    int status;
    @Getter @Column(nullable = false) int list_id;

    public void updateStatus(int newStatus) {
        if(status == 2){
            status = 0;
        }
        else{
            status++;
        }
    }

    public String getStatus(){
        return Status.values()[status].name();
    }


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

