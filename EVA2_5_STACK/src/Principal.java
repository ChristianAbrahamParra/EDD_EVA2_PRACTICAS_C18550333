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
        
        MiStack msPila = new MiStack(); //Se crea un objeto y se reserva memoria
        msPila.push(new Nodo(100)); //Se agrega un nuevo nodo 100
        msPila.push(new Nodo(200)); //Se agrega un nuevo nodo 200
        msPila.push(new Nodo(300)); //Se agrega un nuevo nodo 300
        msPila.push(new Nodo(400)); //Se agrega un nuevo nodo 400
        msPila.push(new Nodo(500)); //Se agrega un nuevo nodo 500
        System.out.println("Hay " + msPila.longitud() + " nodos"); //Se imprime la cantidad de nodos que hay en la lista
        msPila.imprimir(); //Se imprimen los valores de la lista
        System.out.println("Valor en la cima " + msPila.peek()); //Muestra el valor que está arriba de la lista
        System.out.println("Valor en la cima " + msPila.pop()); //Muestra el valor que está arriba de la lista pero con pop
        msPila.imprimir(); //Se vuelven a imprimir los valores
        System.out.println("Valor en la cima " + msPila.peek()); //Muestra el valor en la cima pero ahora en peek
    }
    
}

 //Push -- Agrega un nodo en la cima de la pila
//Peek -- Lee el valor del nodo en la cima
//Pop -- Lee y elimina el nodo en la cima

//queue --> lista enlazada EVA2_6_QUEUE_SIMPLE
//queue, stack --> lista doblemente enlazada EVA2_7_QUEUE_STACK_DOUBLE

//por herencia

//agregar stack
     //push, peek, pop

//agregar queue
    //add --> agregar nodo al final
    //get --> leer nodo al inicio
    //getRemove --> leer nodo al inicio y eliminarlo 