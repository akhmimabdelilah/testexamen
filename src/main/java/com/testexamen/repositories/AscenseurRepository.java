package com.testexamen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testexamen.testexamen.entities.Batiment;

@Repository
public interface AscenseurRepository extends JpaRepository<Batiment, Integer> {

}
