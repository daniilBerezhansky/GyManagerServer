
package com.example.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "gym")
public class Person {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "name", nullable = false, length = 50)
    private String Name;

    @Column(name = "date_start", nullable = false)
    private Date date_Start;

    public Person() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return Name;
    }

    public void setTitle(String title) {
        this.Name = title;
    }

    public Date getRemindDate() {
        return date_Start;
    }

    public void setRemindDate(Date remindDate) {
        this.date_Start = remindDate;
    }
}
