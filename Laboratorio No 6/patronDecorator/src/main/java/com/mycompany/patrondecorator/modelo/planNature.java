/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patrondecorator.modelo;

/**
 *
 * @author ledya
 */
public class planNature extends decoradorViaje {

    public planNature(Iviaje viaje) {
        super(viaje);
    }

    @Override
    public double obtenerPrecio() {
        return super.obtenerPrecio() + 720.0;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + "\n Nature (Visita a Kualoa Ranch, Maui Ocean Center, Akaka Falls State Park)\n";
    }

    @Override
    public int obtenerDuracion() {
        return super.obtenerDuracion() + 5;
    }
}
