package com.example.Spring_transactional.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class TransactionalTask {

    @Id @GeneratedValue
    private Long id;

    private String title;

}
