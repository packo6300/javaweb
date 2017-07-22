/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

/**
 *
 * @author sistemas10
 */
public class Usuario {
   
   private String usuario;
   private String nombre;
   private String password;
   public String getUsuario(){
       return this.usuario;
   }
   public String getNombre(){
       return this.nombre;
   }
   public String getPassword(){
       return this.password;
   }
   public void setUsusario(String usuario){
       this.usuario=usuario;
   }
   public void setNombre(String nombre){
       this.nombre=nombre;
   }
   public void setPassword(String password){
       this.password=password;
   }
    
}
