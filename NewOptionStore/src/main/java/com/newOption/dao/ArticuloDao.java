
package com.newOption.dao;

import com.newOption.domain.Articulo;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface ArticuloDao extends CrudRepository<Articulo, Long>{
    
   
    public List<Articulo> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
    
    
    @Query(value="SELECT a FROM Articulo a where a.precio BETWEEN :precioInf AND :precioSup ORDER BY a.descripcion ASC")
    public List<Articulo> metodoJPQL(@Param("precioInf") double precioInf, @Param("precioSup") double precioSup);
    

    @Query(nativeQuery=true,
            value="SELECT * FROM articulo where articulo.precio BETWEEN :precioInf AND :precioSup ORDER BY articulo.descripcion ASC")
    public List<Articulo> metodoNativo(@Param("precioInf") double precioInf, @Param("precioSup") double precioSup);
}