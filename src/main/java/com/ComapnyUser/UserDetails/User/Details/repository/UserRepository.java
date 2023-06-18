package com.ComapnyUser.UserDetails.User.Details.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ComapnyUser.UserDetails.User.Details.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query methods can be added here
}
