package com.lambdaschool.todos.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "todos")
public class Todos extends Auditable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long todoid;

    private String description;

    @Transient
    public boolean completed = false;

//    private long userid;

    @ManyToOne
    @JoinColumn(name = "users",
            nullable = false)
    @JsonIgnoreProperties(value = "todos", allowSetters = true)

    private User user;


    public Todos()
    {
        ///jpa
    }

    public Todos(User user, String description) {
        this.description = description;
        this.user = user;
    }


    public long getTodoid() {
        return todoid;
    }

    public void setTodoid(long todoid) {
        this.todoid = todoid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        completed = true;
        this.completed = completed;
    }

//    public long getUserid() {
//        return userid;
//    }
//
//    public void setUserid(long userid) {
//        this.userid = userid;
//    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
