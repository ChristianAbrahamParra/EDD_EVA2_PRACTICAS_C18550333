
import java.util.Scanner;

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
    
    
    ListaDoble lstLista = new ListaDoble(); //Se crea una lista doble y se reserva memoria
    for(int i = 0; i<10; i++){ //Ciclo for que recorre los elementos
        int iVal = (int)(Math.random() *100); //Se generan datos aleatorios
        lstLista.agregarNodo(new Nodo(iVal)); //Se agrega un nuevo nodo
    }
    
    lstLista.imprimir(); //Se imprimen los valores de la lista
    lstLista.imprimirOrdenInverso(); //Se imprime la lista pero en orden inverso
    Scanner sInput = new Scanner(System.in); //Se le pide un dato al usuario
        System.out.println("Valor a buscar: "); //Se imprime un mensaje
        int iVal = sInput.nextInt(); //Se convierte el dato introducido a entero
        sInput.nextLine(); //Salto de línea
        System.out.println("La posición es: " + lstLista.buscar(iVal)); //Se imprime la posición del valor buscado
        lstLista.agregarInicio(new Nodo(999)); //Se agrega un nuevo nodo 999
        lstLista.imprimir(); //Se imprimen los valores de la lista
        
        lstLista.copiaLista(); //Se imprime la copia de la lista
        lstLista.imprimir(); //Se imprimen los valores de la lista
        
       
        
        
    }
    
}
