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

import java.util.Date;

public class Fecha {
    public String fec_inv;
    public String fec_fin;
    public String fec_cier;    

    public Fecha(String fechaI,String fechaF,String fechaC){
        fec_inv=fechaI;
        fec_fin=fechaF;
        fec_cier=fechaC;
    }
    
    public Date getCierre(){
        return ConvertirFecha(fec_cier);
    }
    
    
    private Date ConvertirFecha(String fecha){
        if(fecha==null)
            return null;
        String[] nuevaF=fecha.split("-");     
        switch (nuevaF[1]){
            case "ene": nuevaF[1]=0+"";break;
            case "feb": nuevaF[1]=1+"";break;
            case "mar": nuevaF[1]=2+"";break;
            case "apr": nuevaF[1]=3+"";break;
            case "may": nuevaF[1]=4+"";break;    
            case "jun": nuevaF[1]=5+"";break;
            case "jul": nuevaF[1]=6+"";break;
            case "agu": nuevaF[1]=7+"";break;
            case "sep": nuevaF[1]=8+"";break;
            case "oct": nuevaF[1]=9+"";break;
            case "nov": nuevaF[1]=10+"";break;
            case "dic": nuevaF[1]=11+"";break;
        }
        Date nfecha=new Date(Integer.parseInt(nuevaF[2])-1900,Integer.parseInt(nuevaF[1]),Integer.parseInt(nuevaF[0]));
        return nfecha;
    }        
 } 

