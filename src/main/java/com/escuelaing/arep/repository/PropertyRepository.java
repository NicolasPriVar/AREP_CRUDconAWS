package com.escuelaing.arep.repository;

import com.escuelaing.arep.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepository extends JpaRepository<Property, Long> {
}