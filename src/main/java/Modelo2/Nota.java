/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo2;

import java.util.Date;

/**
 *
 * @author marta
 */
public class Nota extends Documento {
    int nro;
    int anio;
    String asunto;

    public Nota(int nro, int anio, String asunto, int idDocumento, Date fechaCreacion) {
        super(idDocumento, fechaCreacion);
        this.nro = nro;
        this.anio = anio;
        this.asunto = asunto;
    }
       
}
