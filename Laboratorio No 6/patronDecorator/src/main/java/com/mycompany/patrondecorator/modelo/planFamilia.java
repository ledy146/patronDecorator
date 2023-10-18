/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patrondecorator.modelo;

/**
 *
 * @author ledya
 */
public class planFamilia implements Iviaje{

    private Iviaje paqueteBase;
    private int numIntegrantes;

    public planFamilia(Iviaje paqueteBase, int numIntegrantes) {
        this.paqueteBase = paqueteBase;
        this.numIntegrantes = numIntegrantes;
    }

    @Override
    public double obtenerPrecio() {
        // Multiplica el costo del paquete base por el número de integrantes
        return paqueteBase.obtenerPrecio() * numIntegrantes;
    }

    @Override
    public int obtenerDuracion() {
        return paqueteBase.obtenerDuracion();
    }

    @Override
    public String getDescripcion() {
        return paqueteBase.getDescripcion() + " - Plan Familiar (" + numIntegrantes + " integrantes)";
    }
}