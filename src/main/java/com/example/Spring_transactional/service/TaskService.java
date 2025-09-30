package com.example.Spring_transactional.service;


import com.example.Spring_transactional.dao.TaskRepository;
import com.example.Spring_transactional.entity.TransactionalTask;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private  TaskRepository taskRepository;

    @Autowired
    private ServiceHelper serviceHelper;

    @Transactional
    public void saveTask(String title){
        TransactionalTask task = new TransactionalTask();
        task.setTitle(title);

        taskRepository.save(task);

        serviceHelper.m1();
    }



}
