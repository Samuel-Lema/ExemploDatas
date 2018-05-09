package main;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        
        // Trabajador con Date
        
        TrabajadorDate trabajador1 = new TrabajadorDate("Pepe", new Date(115, 02, 02));
        trabajador1.setDataBaixa(new Date());
        
        System.out.println("Fecha Alta: " + trabajador1.getDataAlta());
        System.out.println("Fecha Baixa: " + trabajador1.getDataBaixa());
        System.out.println("Años trabajados: " + trabajador1.añosTrabajados());
        
        // Trabajador con LocalDate
        
        TrabajadorTime trabajador2 = new TrabajadorTime("Pepe", LocalDate.of(2015, 03, 02));
        trabajador2.setDataBaixa(LocalDate.now());
        
        System.out.println("Fecha Alta: " + trabajador2.getDataAlta());
        System.out.println("Fecha Baixa: " + trabajador2.getDataBaixa());
        System.out.println("Años trabajados: " + trabajador2.añosTrabajados());
    }
    
}
