package com.kchmurowicz.tasklist.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    private Long id;
    @NotNull
    private String name;

    @OneToMany(mappedBy = "user")
    private List<TaskList> taskLists;

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

    public User(Long id, @NotNull String name, List<TaskList> taskLists) {
        this.id = id;
        this.name = name;
        this.taskLists = taskLists;
    }
}
