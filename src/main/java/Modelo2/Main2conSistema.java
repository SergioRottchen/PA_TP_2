/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author marta
 */
public class Main2conSistema {
    public static void main(String[] args) throws ParseException{
    Sistema sistema = new Sistema();
     //Creamos areas y las agregamos al sistema
     Area area1 = new Area("Patrimonio","123-456-789");
     Area area2 = new Area("Contaduria","789-456-123");
     
     sistema.agregarArea(area1);
     sistema.agregarArea(area2);

     //creamos documentos 
     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
     Date fecha1 = dateFormat.parse("2023-10-04");
     
     
}}
