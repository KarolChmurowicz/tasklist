package com.kchmurowicz.tasklist.repository;

import com.kchmurowicz.tasklist.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
