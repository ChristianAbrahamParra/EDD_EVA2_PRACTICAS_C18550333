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
public class Lista {

    private Nodo inicio; //Inicio de tipo nodo
    private int iCantNodos; //Contador de tipo entero

    public Lista() { //Constructor vacío
        inicio = null; //Inicio apunta a nulo

    }

    public void agregarNodo(Nodo nNuevo) { //Vamos a recibir un Nodo

        if (inicio == null) { //Lista vacía
            inicio = nNuevo; //Inicio se inicializa al nuevo nodo
        } //Lista con un nodo
        else {
            //Llevar nTemp al final de la lista
            nNuevo.setSig(inicio); //inicio apuntará al nuevo nodo
            inicio = nNuevo; //Inicio apunta a nuevo
            iCantNodos++; //Contador aumenta
        }

    }

    public void imprimir() { //Método para imprimir los elementos de la lista
        //lLEVAR AL FINAL DE LA LISTA
        Nodo nTemp = inicio; //El nodo apunta a inicio
        while (nTemp != null) { //Nos interesa recorrerlos todos
            System.out.print("[" + nTemp.getDato() + "]"); //Se imprimen todos los nodos de la lista
            nTemp = nTemp.getSig(); //El nodo apunta a siguiente
        } //lo esencial para recorrer las listas
        System.out.println(""); //Se imprime un salto
    }

    public int longitud() { //Método para saber la cantidad de nodos que hay

        /*int iResu = 0;
         Nodo nTemp = inicio;
         while (nTemp != null) {
         iResu++;
         nTemp = nTemp.getSig();*/
          
        return iCantNodos++; //Regresa la cantidad de nodos
        

    
}
}


