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
public class Documento {
int idDocumento;
Date fechaCreacion;


    public Documento(int idDocumento, Date fechaCreacion) {
        this.idDocumento = idDocumento;
        this.fechaCreacion = fechaCreacion;
        
    }

    public Date getFechaCreacion(){
        return fechaCreacion;
    }

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
}
