package com.platzi.CursoJavaSpring.persistence;

import com.platzi.CursoJavaSpring.domain.repository.ProductoCrudRepository;
import com.platzi.CursoJavaSpring.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
