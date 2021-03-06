package com.gcc.app.productos.models.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gcc.app.productos.models.entity.Producto;
import com.gcc.app.productos.models.service.IProductoService;

@RestController
public class ProductoController {

	@Autowired
	private IProductoService productoService;
	
	@GetMapping("/listar")
	public List<Producto> listar(){
		return productoService.findAll();
	}
	
	
	@GetMapping("/ver/{id}")
	public Producto findbyId(@PathVariable long id) throws Exception {
		
		if(id==1) {
			//throw new Exception("Fallo intencionado y controlado");
			Thread.sleep(2000);
		}
		
		return productoService.findById(id);
	}
}
