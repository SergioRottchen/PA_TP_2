/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pa_tp_2;

import java.util.Date;

/**
 *
 * @author marta
 */
public class Materia {
int idMat;
String nomMateria;
Date anioCursado;

    public Materia() {
    }

    public int getIdMat() {
        return idMat;
    }

    public String getNomMateria() {
        return nomMateria;
    }

    public Date getAnioCursado() {
        return anioCursado;
    }

    public void setIdMat(int idMat) {
        this.idMat = idMat;
    }

    public void setNomMateria(String nomMateria) {
        this.nomMateria = nomMateria;
    }

    public void setAnioCursado(Date anioCursado) {
        this.anioCursado = anioCursado;
    }


}
