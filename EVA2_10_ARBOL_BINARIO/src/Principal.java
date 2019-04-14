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
        // TODO code application logic here
        
        ArbolBinario abArbol = new ArbolBinario(); //Se crea un objeto de tipo Arbol Binario y se reserva mmemoria
        abArbol.addNodo(new Nodo(13)); //Se agrega un nodo 13
        abArbol.addNodo(new Nodo(10)); //Se agrega un nodo 10
        abArbol.addNodo(new Nodo(18));  //Se agrega un nnodo 18
        abArbol.addNodo(new Nodo(2)); //Se agrega un nodo 2
        abArbol.addNodo(new Nodo(11)); //Se agrega un nodo 11
        abArbol.addNodo(new Nodo(17)); //Se agrega un nodo 17
        abArbol.addNodo(new Nodo(20)); //Se agrega un nodo 20
        abArbol.addNodo(new Nodo(16)); //Se agrega un nodo 16
        // 2 - 10 - 11 - 13 - 16 - 17 - 18 - 20
        abArbol.imprimirInOrder(); //Se imprimen los valores en orden InOrder
        System.out.println(""); //Imprime salto
       abArbol.imprimirPostOrder(); //Se imprimen los valores en orden PostOrder
        System.out.println(""); //Imprime salto
        abArbol.imprimirPreOrder(); //Se imprimen los valores en orden PreOrder
        System.out.println(""); //Se imprime salto
        
    }
    
}
