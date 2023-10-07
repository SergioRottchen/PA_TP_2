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
public class Correspondencia extends Documento {
String remitente;
String direccion;

    public Correspondencia(String remitente, String direccion, int idDocumento, Date fechaCreacion) {
        super(idDocumento, fechaCreacion);
        this.remitente = remitente;
        this.direccion = direccion;
    }


}
