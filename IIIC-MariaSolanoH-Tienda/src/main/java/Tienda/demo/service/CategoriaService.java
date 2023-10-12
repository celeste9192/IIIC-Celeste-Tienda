/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda.demo.service;

import Tienda.demo.domain.Categoria;
import java.util.List;

/**
 *
 * @author MARÍA CELESTE
 */

public interface CategoriaService{
   public List<Categoria> getCategorias(boolean activos);
}

    

