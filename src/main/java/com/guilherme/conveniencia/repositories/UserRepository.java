package com.guilherme.conveniencia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.conveniencia.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
