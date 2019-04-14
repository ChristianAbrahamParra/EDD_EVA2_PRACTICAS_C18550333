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
        
        Lista msDouble = new Lista(); //Se crea un objeto lista y se reserva memoria
        msDouble.add(new Nodo(100)); //Se agrega un nuevo nodo 100
        msDouble.add(new Nodo(200)); //Se agrega un nuevo nodo 200
        msDouble.add(new Nodo(300)); //Se agrega un nuevo nodo 300
        msDouble.add(new Nodo(400)); //Se agrega un nuevo nodo 400
        msDouble.add(new Nodo(500)); //Se agrega un nuevo nodo 500
        System.out.println("Hay " + msDouble.longitud() + " nodos "); //Se imprime la cantidad de nodos que hay en la lista
        msDouble.imprimir(); //Se imprimen los valores de la lista
        System.out.println("Valor en la cima " + msDouble.get()); //Se imprime el valor en la cima con get
        msDouble.imprimir(); //Se imprimen los valores nuevamente
       
        System.out.println("Valor en la cima " + msDouble.peek()); //Se imprime el valor en la cima con peek
        System.out.println("Eliminando: " + msDouble.pop()); //Se elimina con método pop
        msDouble.imprimir(); //Se imprimen nuevamente los valores de la lista
        System.out.println("Valor en la cima " + msDouble.peek()); //Se imprime el valor en la cima con peek
                
    }
    
}
