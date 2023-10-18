/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patrondecorator.modelo;

/**
 *
 * @author ledya
 */
public class planAmazingHawaii extends decoradorViaje {
    
    public planAmazingHawaii(Iviaje viaje) {
        super(viaje);
    }

    @Override
    public double obtenerPrecio() {
        return super.obtenerPrecio() + 931.0;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + "\n Amazing Hawaii (Escalada, surf, buceo)\n";
    }

    @Override
    public int obtenerDuracion() {
        return super.obtenerDuracion() + 3;
    }
}

