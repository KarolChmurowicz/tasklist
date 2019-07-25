package com.kchmurowicz.tasklist.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class TaskList {

    @Id
    private Long id;
    @NotNull
    private String name;

    @OneToMany(mappedBy = "taskList")
    private List<Task> tasks;

    @ManyToOne
    private User user;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TaskList(Long id, @NotNull String name, List<Task> tasks, User user) {
        this.id = id;
        this.name = name;
        this.tasks = tasks;
        this.user = user;
    }
}
