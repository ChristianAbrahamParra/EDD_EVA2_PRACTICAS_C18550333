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
       
        MiQueue msCola = new MiQueue(); //Se crea un objjeto y se reserva memoria
        msCola.add(new Nodo(100)); //Se agrega el nodo 100
        msCola.add(new Nodo(200)); //Se agrega el nodo 200
        msCola.add(new Nodo(300)); //Se agrega el nodo 300
        msCola.add(new Nodo(400)); //Se agrega el nodo 400
        msCola.add(new Nodo(500)); //Se agrega el nodo 500
        System.out.println("Hay " + msCola.longitud() + " nodos"); //Se imprime la cantidad de nodos que hay en la lista
        msCola.imprimir(); //Se imprimen todos los valores existentes
        System.out.println("Valor en la cima " + msCola.get()); //Valor en la cima con método get
        msCola.imprimir(); //Imprimir los elementos de nuevo
        System.out.println("Valor en la cima " + msCola.getRemove()); //Imprimir el valor en la cima con método getRemove
        msCola.imprimir(); //Se imprimeen nuevamente los valores de la lisra con el nodo eliminado
        System.out.println("Valor en la cima " + msCola.get()); //Se lee el valor en la cima con el método get
        msCola.add(new Nodo(600)); //Se agrega el nodo leído
        msCola.imprimir(); //Se imprimen los valores ya con el nodo leído 
        
    }
    
}
