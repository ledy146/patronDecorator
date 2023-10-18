/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patrondecorator.modelo;

/**
 *
 * @author ledya
 */
public abstract class decoradorViaje implements Iviaje{
    protected Iviaje viaje;

      protected Iviaje paquete;

    public decoradorViaje(Iviaje paquete) {
        this.paquete = paquete;
    }

    @Override
    public double obtenerPrecio() {
        return paquete.obtenerPrecio();
    }

    @Override
    public String getDescripcion() {
        return paquete.getDescripcion();
    }
    
    @Override
    public int obtenerDuracion() {
        return paquete.obtenerDuracion();
    }
    
}
    
    
    
   

