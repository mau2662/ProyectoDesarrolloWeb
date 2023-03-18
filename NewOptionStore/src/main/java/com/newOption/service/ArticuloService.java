package com.newOption.service;

import com.newOption.domain.Articulo;
import java.util.List;

public interface ArticuloService {
   
    public List<Articulo> getArticulos(boolean activos);
    
    public void save(Articulo articulo);
    
    public void delete(Articulo articulo);
    
    public Articulo getArticulo(Articulo articulo);
}
