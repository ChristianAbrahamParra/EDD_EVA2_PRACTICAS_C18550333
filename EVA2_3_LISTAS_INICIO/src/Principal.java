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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lista lstMiLista = new Lista(); //Se crea una nueva lista y se reserva memoria
        int[] aiDatos = new int [1000000]; //Se crea un arreglo con un millón de elementos
        lstMiLista.agregarNodo(new Nodo(100)); //Se agrega un nuevo nodo 100
        lstMiLista.agregarNodo(new Nodo(200)); //Se agrega un nuevo nodo 200
        lstMiLista.agregarNodo(new Nodo(300)); //Se agrega un nuevo nodo 300
        lstMiLista.agregarNodo(new Nodo(400)); //Se agrega un nuevo nodo 400
        lstMiLista.agregarNodo(new Nodo(500)); //Se agrega un nuevo nodo 500
        lstMiLista.agregarNodo(new Nodo(600)); //Se agrega un nuevo nodo 600
        lstMiLista.agregarNodo(new Nodo(700)); //Se agrega un nuevo nodo 700
        lstMiLista.agregarNodo(new Nodo(800)); //Se agrega un nuevo nodo 800
        lstMiLista.agregarNodo(new Nodo(900)); //Se agrega un nuevo nodo 900
        lstMiLista.agregarNodo(new Nodo(1000)); //Se agrega un nuevo nodo 1000
        System.out.println("En la lista hay " + lstMiLista.longitud()); //Se imprime la cantidad de nodos que hay en la lista
        lstMiLista.imprimir(); //Se imprimen todos los nodos de la lista con el método imprimir
    
        for (int i = 0; i< aiDatos.length; i++){ //Ciclo for para recorrer los elementos
            aiDatos[i] = (int)((Math.random() *1000) + 1); //Se generan valores del 1 al 1000
        }
        System.out.println("Eso fue rápido"); //Se imprime mensaje
        for (int i = 0; i< 1000000; i++){ //Ciclo for para recorrer los elementos
            int iVal = (int)((Math.random() *1000) + 1); //Se generan valores del 1 al 1000
            lstMiLista.agregarNodo(new Nodo(iVal)); //Se agrega un nuevo nodo
    }
        System.out.println(""); //Se imprime un salto
}
}
