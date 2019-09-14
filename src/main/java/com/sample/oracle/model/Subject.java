package com.sample.oracle.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "tbl_subject", schema = "multithreadke", indexes = @Index(name = "SUBJECT_INDEX", columnList = "id", unique = true))
public class Subject implements Serializable {

    @Id
    @GeneratedValue
    private String id;

    @Column(name = "name", length = 40, nullable = false)
    private String name;

    public Subject() {
    }

    public Subject(String name) {
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
        return "Subject{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
