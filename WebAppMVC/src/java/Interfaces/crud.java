/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Modelo.usuario;
import java.util.List;

/**
 *
 * @author monse
 */
public interface crud {
    public boolean buscaUsuario(String nom, String pass);
    public void AgregarUsuario(String nom, String pass);
    public List listar();
}
