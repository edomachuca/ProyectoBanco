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
public interface ListaC {
    public void clear();
    public void add(Cliente item);
    public Cliente remove();
    public void setFirst();
    public void next();
    public int length();
    public void setValue(Cliente obj);
    public Cliente currValue();
    public boolean isEmpty();
    public boolean eol();
    public boolean exist(Cliente c);
}
