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

    public static void main(String[] args) throws ParseException {
        Sistema sistema = new Sistema();
        //Creamos areas y las agregamos al sistema
        Area area1 = new Area("Patrimonio", "123-456-789");
        Area area2 = new Area("Contaduria", "789-456-123");

        sistema.agregarArea(area1);
        sistema.agregarArea(area2);

        //creamos documentos 
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha1 = dateFormat.parse("2023-10-04");
        Expediente expediente1 = new Expediente(6124, "A", 2023, "Anexo C", 0, fecha1);
        Nota nota1 = new Nota(100, 2023, "Asunto 1", 0, fecha1);

        sistema.agregarDocumento(expediente1, area1);
        sistema.agregarDocumento(nota1, area2);

        // Realizar movimientos de entrada y salida de documentos
        sistema.generarMovimientoSalida(expediente1, area2);
        sistema.generarMovimientoEntrada(nota1, area1);

        // Obtener el área en la que se encuentra un documento por su ID
        int idDocumentoBuscado = 1;
        Documento documentoBuscado = null;

        for (Documento documento : sistema.getDocumentos()) {
            if (documento.getIdDocumento() == idDocumentoBuscado) {
                documentoBuscado = documento;
                break;
            }
        }

        if (documentoBuscado != null) {
            Area areaDocumento = sistema.obtenerAreaDocumento(documentoBuscado);
            if (areaDocumento != null) {
                System.out.println("El documento con ID " + idDocumentoBuscado + " se encuentra en el área: " + areaDocumento.getNomArea());
            } else {
                System.out.println("El documento con ID " + idDocumentoBuscado + " no se encuentra en ninguna área.");
            }
        } else {
            System.out.println("Documento con ID " + idDocumentoBuscado + " no encontrado.");
        }
    }
}
