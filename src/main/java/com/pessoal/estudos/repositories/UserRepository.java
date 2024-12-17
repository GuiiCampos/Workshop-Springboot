package com.pessoal.estudos.repositories;

import com.pessoal.estudos.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
