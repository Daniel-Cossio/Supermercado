package com.platzi.CursoJavaSpring.domain.repository;

import com.platzi.CursoJavaSpring.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {



}
