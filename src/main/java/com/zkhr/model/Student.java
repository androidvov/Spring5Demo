package com.zkhr.model;

import javax.persistence.*;

/**
 * Created by zhaoshuai on 2017/1/19.
 */
@Entity
@Table(name = "t_ma_student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "NAME")
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
