
package com.cursojava.java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cursojava.java.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}