/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patrondecorator.modelo;

/**
 *
 * @author ledya
 */
public class planViajeBasico implements Iviaje {

    @Override
    public double obtenerPrecio() {
        return 7000.0;
    }

    @Override
    public String getDescripcion() {
        return "\n Paquete Base (tiquetes aéreos, hotel en habitación estándar, alimentación, vuelta a la isla, recepción con lei hawaiano y camiseta de Millonarios)\n";
    }

    @Override
    public int obtenerDuracion() {
        return 5;
    }
}
