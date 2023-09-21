/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author marta
 */
public class Materia {

    int idMat;
    String nomMateria;
    int anioCursado;

    //Constructor
    public Materia() {
    }

    public Materia(int idMat, String nomMateria, int anioCursado) {
        this.idMat = idMat;
        this.nomMateria = nomMateria;
        this.anioCursado = anioCursado;
    }

    //Getters
    public int getIdMat() {
        return idMat;
    }

    public String getNomMateria() {
        return nomMateria;
    }

    public int getAnioCursado() {
        return anioCursado;
    }

    //Setters
    public void setIdMat(int idMat) {
        this.idMat = idMat;
    }

    public void setNomMateria(String nomMateria) {
        this.nomMateria = nomMateria;
    }

    public void setAnioCursado(int anioCursado) {
        this.anioCursado = anioCursado;
    }

}
