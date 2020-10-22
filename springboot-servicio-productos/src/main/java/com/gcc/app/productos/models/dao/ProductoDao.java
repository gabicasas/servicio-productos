package com.gcc.app.productos.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.gcc.app.productos.models.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long> {

}
