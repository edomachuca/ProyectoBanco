/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobanco;

/**
 *
 * @author Eduardo
 */
import java.io.*;
import java.util.*;

public class ProyectoBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException,NoDato{
        // TODO code application logic here
        //holiM3n
        PeopleBank Lega=new PeopleBank("Legacy.xlsx");
        Lega.LegacyLector();
        
        PeopleBank Legacy=new PeopleBank("Legacy.xlsx");
        ListaC Datos=Legacy.Excel();
        Datos.setFirst();
        System.out.println(Datos.currValue().getCant());
        Datos.next();
        System.out.println(Datos.currValue().getCant());
        ArrayList<InversionCliente> Inva=Datos.currValue().getInv();
        System.out.println(Inva.get(0).getCierre());
        
        Datos.next();
        System.out.println(Datos.currValue().getCant());
        ArrayList<InversionCliente> Inv=Datos.currValue().getInv();
        System.out.println(Inv.get(0).getCierre());
        System.out.println(Inv.get(1).getCierre());
    
    }
    
}
