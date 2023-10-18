/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patrondecorator.modelo;

/**
 *
 * @author ledya
 */
public class planPearlHarbor extends decoradorViaje {

    public planPearlHarbor(Iviaje viaje) {
        super(viaje);
    }

    @Override
    public double obtenerPrecio() {
        return super.obtenerPrecio() + 653.0;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + "\n Pearl Harbor (visita a museo, palacio, museo Bishop, USS Arizona Memorial)\n";
    }

    @Override
    public int obtenerDuracion() {
        return super.obtenerDuracion() + 2;
    }

}
