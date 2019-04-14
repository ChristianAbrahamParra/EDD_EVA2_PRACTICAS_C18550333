/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian Abraham Parra Pérez
 * # Control: C18550333
 */
public class Nodo {
    
    private int dato; //atributo de tipo entero para almacenar el dato
    
    private Nodo sig; //enlace
    
    public Nodo(){ //Constructor vacío
        this.sig = null; //la referencia debe ser inicializada a nulo
    }

    public Nodo(int dato) { //constructor que reciba el dato
        this.dato = dato; //Referencia de dato
    }
    
    

    public int getDato() { //Método que obtenga el dato
        return dato; //Regresa el dato
    }

    public void setDato(int dato) { //Método que regrese el dato
        this.dato = dato; //Referencia al dato 
    }

    public Nodo getSig() { //Método que obtenga la referencia siguiente
        return sig; //Regresa la referencia siguiente 
    }

    public void setSig(Nodo sig) { //Método que regrese la referencia siguiente
        this.sig = sig; //Referencia a siguiente
    }
    
    
}
