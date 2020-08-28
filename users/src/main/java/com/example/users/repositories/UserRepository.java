package com.example.users.repositories;

import com.example.users.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    @Query("FROM User u WHERE u.username = ?1 and u.password = ?2")
    public User login(String username, String password);
}
