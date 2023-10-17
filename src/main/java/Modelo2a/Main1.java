/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo2a;

import Modelo2.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author marta
 */
public class Main1 {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        //Creamos 2 Areas
        Area a1 = new Area(1, "Patrimonio", "3764-1234");
        Area a2 = new Area(2, "Contaduria", "3764-7894");

        //Creacion de 2 Documentos
        //Con esta funcion le damos el formato que queremos para las fechas
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //Ahora creamos 2 varibles tipo fecha
        Date f1 = dateFormat.parse("2023-05-22");
        Date f2 = dateFormat.parse("2023-09-25");
        Date f3 = dateFormat.parse("2023-09-29");
        Date f4 = dateFormat.parse("2023-07-05");
        Date f5 = dateFormat.parse("2023-12-13");
        Date f6 = dateFormat.parse("2022-06-05");
        Expediente exp1 = new Expediente(6124, "H", 2023, "anexo: A", 1, f1);
        Expediente exp2 = new Expediente(6124, "J", 2023, "anexo: B", 2, f2);

        Nota n1 = new Nota(5123, 2023, "Solicitud compra combustible", 3, f3);
        Nota n2 = new Nota(5130, 2023, "Solicitud pase", 4, f4);

        Correspondencia co1 = new Correspondencia("Sergio R", "Calle falsa 123", 5, f5);
        Correspondencia co2 = new Correspondencia("Marta K", "Calle falsa 789", 6, f6);

        //pseudo BD en ArrayList
        List<Documento> listaDocumentos = new ArrayList<>();
        listaDocumentos.add(exp1);
        listaDocumentos.add(exp2);
        listaDocumentos.add(n1);
        listaDocumentos.add(n2);
        listaDocumentos.add(co1);
        listaDocumentos.add(co2);
        Date varFecha = null;
        boolean fechaValida = false;
        
        while (!fechaValida){
        System.out.print("Ingrese la fecha de busqueda (yyyy-MM-dd): ");
        String fechaInput = scanner.nextLine();
            try {
            varFecha = dateFormat.parse(fechaInput);
            fechaValida=true;
            
        }catch(ParseException e){
            System.out.println("Formato de fecha incorrecto. Intente de nuevo");
        }    
        }
        //Mostramos lo documentos creados
        System.out.println("Documentos creados en la fecha "+dateFormat.format(varFecha)+":");
        for(Documento documento : listaDocumentos){
            if(documento.getFechaCreacion().equals(varFecha)){
                System.out.println("ID: "+documento.getIdDocumento()+", Tipo: "+documento.getClass().getSimpleName());
                
            }
        }
     scanner.close();   
    }           
}
