package com.kchmurowicz.tasklist.repository;

import com.kchmurowicz.tasklist.model.TaskList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskListRepository extends JpaRepository<TaskList,Long> {
}
