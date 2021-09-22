package com.fundamentos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fundamentos.entities.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
