package com.dev.userdep.repositories;

import com.dev.userdep.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
