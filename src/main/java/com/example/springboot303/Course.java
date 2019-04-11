package com.example.springboot303;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min = 4)
    private String title;

    @NotNull
    @Size(min=3)
    private String instructor;

    @NotNull
    @Size(min=0)
    private String description;

    @NotNull
    @Min(3)
    private int credit;

    public Course(@NotNull @Size(min = 4) String title, @NotNull @Size(min = 3) String instructor, @NotNull @Size(min = 0) String description, @NotNull @Min(3) int credit) {
        this.title = title;
        this.instructor = instructor;
        this.description = description;
        this.credit = credit;
    }

    public Course() {
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getInstructor() {
        return instructor;
    }

    public String getDescription() {
        return description;
    }

    public int getCredit() {
        return credit;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}
