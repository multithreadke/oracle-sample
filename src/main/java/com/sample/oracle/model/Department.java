package com.sample.oracle.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "tbl_department", schema = "multithreadke", indexes = @Index(name = "DEPARTMENT_INDEX", columnList = "id", unique = true))
public class Department implements Serializable {

    @Id
    @GeneratedValue
    private String id;

    @Column(name = "name", length = 60, nullable = false)
    private String name;

    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }

    public String getId() {
        return UUID.randomUUID().toString();
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
