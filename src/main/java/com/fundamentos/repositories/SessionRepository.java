package com.fundamentos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fundamentos.entities.Session;

@Repository
public interface SessionRepository extends JpaRepository<Session, Integer> {

}
