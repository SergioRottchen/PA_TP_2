/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author marta
 */
public class Sistema {
    private List<Documento> documentos;
    private List<Area> areas;
    private List<Movimiento> movimientos;
    private int documentoIdCounter = 1;
    private int areaIdCounter = 1;
    private int movimientoIdCounter = 1;
    
    
    public Sistema(){
        documentos = new ArrayList<>();
        areas = new ArrayList<>();
        movimientos = new ArrayList<>();
        }
    public void agregarDocumento(Documento documento,Area area){
        documento.setIdDocumento(areaIdCounter++);
        documentos.add(documento);
        generarMovimientoEntrada(documento,area);
        }
    public void agregarArea(Area area){
        area.setId(areaIdCounter++);
        areas.add(area);
    }
    public void generarMovimientoEntrada(Documento documento,Area area){
        Movimiento movimiento = new Movimiento(movimientoIdCounter++,new Date(),documento,area);
        movimientos.add(movimiento);
    }
    public void generarMovimientoSalida(Documento documento, Area areaDestino){
        Area areaOrigen = obtenerAreaDocumento(documento);
        Movimiento movimiento = new Movimiento(movimientoIdCounter++,new Date(),documento,areaDestino);
        movimientos.add(movimiento);       
    }
    public Area obtenerAreaDocumento(Documento documento){
        for (Movimiento movimiento : movimientos){
            if(movimiento.getDocumento().equals(documento)){
                return movimiento.getArea();
            }
            }
        return null;
    }

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public List<Area> getAreas() {
        return areas;
    }
    
}
