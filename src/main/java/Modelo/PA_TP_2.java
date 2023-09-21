/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Modelo;

/**
 *
 * @author marta
 */
public class PA_TP_2 {

    public static void main(String[] args) {
        //Acá comienza la ejecución del programa
//Instaciar 4 materias
        Materia mat1 = new Materia(1, "Progamación Avanzada", 3);
        Materia mat2 = new Materia(2, "Algebra", 1);
        Materia mat3 = new Materia(3, "Física", 2);
        Materia mat4 = new Materia(4, "Tecnologia en Base de Datos", 4);
        Materia materias[] = new Materia[2];
        Materia materias1[] = new Materia[2];
        Materia materias2[] = new Materia[2];
        Materia materias3[] = new Materia[2];
        //Instanciar Plan
        materias[0] = mat1;
        materias[1] = mat2;
        materias1[0] = mat1;
        materias1[1] = mat3;
        materias2[0] = mat1;
        materias2[1] = mat4;
        materias3[0] = mat2;
        materias3[1] = mat3;
        Plan plan1 = new Plan(1, "PLan de estudio 1", 2000, materias);
        Plan plan2 = new Plan(2, "PLan de estudio 2", 2005, materias1);
        Plan plan3 = new Plan(3, "PLan de estudio 3", 2010, materias2);
        Plan plan4 = new Plan(4, "PLan de estudio 4", 2015, materias3);
//Instanciar 2 carreras
        Plan planes1[] = new Plan[3];
        Plan planes2[] = new Plan[3];
        planes1[0]=plan1;
        planes1[1]=plan2;
        planes1[2]=plan3;
        planes2[0]=plan4;
        Carrera carrera1 = new Carrera(1, "Ingenieria en informatica",planes1);
        Carrera carrera2 = new Carrera(2, "Nutrición",planes2);
        
        System.out.println("Carrera: "+carrera1.getNomCarrera());
        carrera1.imprimirMateriasDelPlan();
        System.out.println("Carrera: "+carrera2.getNomCarrera());
        carrera2.imprimirMateriasDelPlan();

    }
}
