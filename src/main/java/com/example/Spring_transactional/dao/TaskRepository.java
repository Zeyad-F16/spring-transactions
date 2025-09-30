package com.example.Spring_transactional.dao;

import com.example.Spring_transactional.entity.TransactionalTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TransactionalTask, Long > {
}
