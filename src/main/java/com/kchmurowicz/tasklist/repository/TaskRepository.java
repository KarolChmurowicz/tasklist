package com.kchmurowicz.tasklist.repository;

import com.kchmurowicz.tasklist.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
