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
public class Movimiento {
    private int id;
    private Date fechaMov;
    private Documento documento;
    private Area area;

    public Movimiento(int id, Date fechaMov, Documento documento, Area area) {
        this.id = id;
        this.fechaMov = fechaMov;
        this.documento = documento;
        this.area = area;
    }

    public Documento getDocumento() {
        return documento;
    }

    public Area getArea() {
        return area;
    }
    
    
    public int getId() {
        return id;
    }

    public Date getFechaMov() {
        return fechaMov;
    }
    public void setFechaPropia(){
        
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setFechaMov(Date fechaMov) {
        this.fechaMov = fechaMov;
    }
    
}
