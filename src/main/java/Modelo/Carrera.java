/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author marta
 */
public class Carrera {
    //Atributos
    private int id_Carrera;
    private String nomCarrera;
    private Plan[] planes;
    //Metodos
    //Constructor
    public Carrera(int id_Carrera, String nomCarrera, Plan[] planes) {
        this.id_Carrera = id_Carrera;
        this.nomCarrera = nomCarrera;
        this.planes =  planes;
    }
    //Constructor vacio
    public Carrera() {
    }
    //Getters
    public int getId_Carrera() {
        return id_Carrera;
    }

    public String getNomCarrera() {
        return nomCarrera;
    }

    public Plan[] getPlanes() {
        return planes;
    }
    //Setters
    public void setId_Carrera(int id_Carrera) {
        this.id_Carrera = id_Carrera;
    }

    public void setNomCarrera(String nomCarrera) {
        this.nomCarrera = nomCarrera;
    }

    public void setPlanes(Plan[] planes) {
        this.planes = planes;
    }
    public void imprimirMateriasDelPlan(){
        for (Plan p: planes){
            p.imprimirMaterias();
            
        }
        
        
        
    }
}
