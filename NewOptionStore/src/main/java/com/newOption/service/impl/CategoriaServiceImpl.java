/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.newOption.service.impl;

import com.newOption.dao.CategoriaDao;
import com.newOption.domain.Categoria;
import com.newOption.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    private CategoriaDao categoriaDao;
    
    @Override
    public List<Categoria> getCategorias(boolean activos){
        var lista = (List<Categoria>)categoriaDao.findAll();
        if(activos) {
            lista.removeIf( e->!e.isActivo());
        }
        return lista;
    }
    
    @Override
    public void save(Categoria categoria){
        categoriaDao.save(categoria);
    }
    
    @Override
    public void delete(Categoria categoria){
        categoriaDao.delete(categoria);
    }
    @Override
    public Categoria getCategoria(Categoria categoria){
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
  }            
  
}
