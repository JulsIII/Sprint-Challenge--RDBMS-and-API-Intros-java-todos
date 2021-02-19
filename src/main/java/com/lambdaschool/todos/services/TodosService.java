package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todos;

public interface TodosService
{
//    Todos findOrdersById(long id); //ordernum   <-was this before???

    void markComplete(long todoid);
}
