package com.fundamentos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fundamentos.entities.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {

}
