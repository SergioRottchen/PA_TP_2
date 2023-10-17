/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo2a;

import Modelo2.*;
import java.util.Date;

/**
 *
 * @author marta
 */
public class Expediente extends Documento  {
    private int nroExpediente;
    private String letra;
    private int anio;
    private String anexo;

    public Expediente(int nroExpediente, String letra, int anio, String anexo, int idDocumento, Date fechaCreacion) {
        super(idDocumento, fechaCreacion);
        this.nroExpediente = nroExpediente;
        this.letra = letra;
        this.anio = anio;
        this.anexo = anexo;
    }

    
    
    }
    

