package com.kchmurowicz.tasklist.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Task {

    @Id
    private Long id;
    @NotNull
    private String name;
    private String description;

    @ManyToOne
    private TaskList taskList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Task(Long id, @NotNull String name, String description, TaskList taskList) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.taskList = taskList;
    }

}
