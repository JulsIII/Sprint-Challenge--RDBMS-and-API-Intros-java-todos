package com.lambdaschool.todos.services;

import com.lambdaschool.todos.models.Todos;
import com.lambdaschool.todos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Transactional
@Service(value = "todosService")
public class TodosServiceImpl implements TodosService
{
    @Autowired
    private UserRepository userrepos;


    @Override
    public void markComplete(long todoid)
    {
//        if (userrepos.findById(todoid)
//                .isPresent())
//        {
//            ordersrepos.deleteById(id);
//        } else
//        {
//            throw new EntityNotFoundException("Order " + id + " Not Found");
//        }
//    }
//
//    {
//        userrepos.findById(todoid)
//                .orElseThrow(() -> new EntityNotFoundException("Todo id " + todoid + " not found!"));
    }

}
