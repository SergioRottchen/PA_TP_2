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
public class Plan {
 int idPlan;
 String nomPlan;
 int anioInicio;
 Materia[] materias;

    public Plan(int idPlan, String nomPlan, int anioInicio, Materia[] materias) {
        this.idPlan = idPlan;
        this.nomPlan = nomPlan;
        this.anioInicio = anioInicio;
        this.materias = materias;
    }

    public Plan() {
    }
    //Getters
    public int getIdPlan() {
        return idPlan;
    }

    public String getNomPlan() {
        return nomPlan;
    }

    public int getAnioInicio() {
        return anioInicio;
    }

    public Materia[] getMaterias() {
        return materias;
    }
    //Setters
    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public void setNomPlan(String nomPlan) {
        this.nomPlan = nomPlan;
    }

    public void setAnioInicio(int anioInicio) {
        this.anioInicio = anioInicio;
    }

    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }
    public void imprimirMaterias(){
        System.out.println("Plan: "+this.getNomPlan());
        for (int i=0;i<this.materias.length;i++){
        
        System.out.println("Numero de orden: "+materias[i].getIdMat()+ "Materias: "+materias[i].getNomMateria()+"Año de cursado: "+materias[i].getAnioCursado());
        
    }
    }
}
