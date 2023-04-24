package com.newOption.service;

import com.newOption.domain.Articulo;
import java.util.List;

public interface ArticuloService {

    public List<Articulo> getArticulos(boolean activos);

    public Articulo getArticulo(Articulo articulo);

    public void deleteArticulo(Articulo articulo);

    public void saveArticulo(Articulo articulo);

    public List<Articulo> getArticulosMetodoQuery(double precioInf, double precioSup);

    public List<Articulo> getArticulosMetodoJPQA(double precioInf, double precioSup);

    public List<Articulo> getArticulosMetodoNativo(double precioInf, double precioSup);

}
