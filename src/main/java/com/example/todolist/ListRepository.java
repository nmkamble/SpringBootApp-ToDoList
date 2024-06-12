package com.example.todolist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ListRepository extends JpaRepository<Item, Long> {
    @Modifying
    @Query("DELETE from Item i WHERE i.name = :name")
    List<Item> deleteByName(@Param("name") String name);

    @Query("SELECT i from Item i WHERE i.id = :id")
    Item findById(@Param("id") long id);

    @Query("UPDATE Item i set i.status = :status WHERE i.name = :name")
    void updateStatus(@Param("name") String name, @Param("status") String status);

}
