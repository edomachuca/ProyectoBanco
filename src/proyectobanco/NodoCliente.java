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
public class NodoCliente {
    private Cliente dato;
    private NodoCliente next;
    
    public NodoCliente(Cliente c,NodoCliente n){
        dato=c;
        next=n;
    }
    
    public NodoCliente getNext(){
        return next;
    }
    
    public Cliente getDato(){
        return dato;
    }
    
    public void setNext(NodoCliente sn){
        next=sn;
    }
}
