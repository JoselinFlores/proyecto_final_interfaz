/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.vista.Inicio;
import ec.edu.intsuperior.vista.Loggin;
import ec.edu.intsuperior.vista.Usuario;

/**
 *
 * @author Santy
 */
public class Controlador {
    
    Loggin loggin= new Loggin(this);
    Inicio inicio= new Inicio(this);
    Usuario Usuario= new Usuario(this);
    
    public void mostrarInicio(){
        inicio.setVisible(true);
    }
    
    public void mostrarLoggin(){
        loggin.setVisible(true);
   
 }
     }
   
 
        

