
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
        
        Lista lstMiLista = new Lista(); //Creamos una nueva lista y reservamos memoria
        int[] aiDatos = new int [10]; //Creamos un arreglo de 10 elementos
        int iCont = 0; //Declaramos un contador
        lstMiLista.agregarNodo(new Nodo(100)); //Se agrega el nodo 100 con el método agregar nodo 
        lstMiLista.agregarNodo(new Nodo(200)); //Se agrega el nodo 200 con el método agregar nodo 
        lstMiLista.agregarNodo(new Nodo(300)); //Se agrega el nodo 300 con el método agregar nodo 
        lstMiLista.agregarNodo(new Nodo(400)); //Se agrega el nodo 400 con el método agregar nodo 
        lstMiLista.agregarNodo(new Nodo(500)); //Se agrega el nodo 500 con el método agregar nodo 
        lstMiLista.agregarNodo(new Nodo(600)); //Se agrega el nodo  600con el método agregar nodo 
        lstMiLista.agregarNodo(new Nodo(700)); //Se agrega el nodo 700 con el método agregar nodo 
        lstMiLista.agregarNodo(new Nodo(800)); //Se agrega el nodo 800con el método agregar nodo 
        lstMiLista.agregarNodo(new Nodo(900)); //Se agrega el nodo 900 con el método agregar nodo 
        lstMiLista.agregarNodo(new Nodo(1000)); //Se agrega el nodo 1000 con el método agregar nodo 
        System.out.println("En la lista hay " + lstMiLista.longitud(iCont) + " nodos"); //Se utiliza el método de longitud para determinar la cantidad de nodos que hay
        lstMiLista.imprimir(); //Se utiliza el método imprimir para mostrar
    
        for (int i = 0; i< aiDatos.length; i++){ //Ciclo for para recorrer los elementos
            aiDatos[i] = (int)((Math.random() *1000) + 1); //Creamos elementos aleatorios del 1 al 1000
        }
        for (int i = 0; i<aiDatos.length; i++){ //Ciclo flor para recorrer los elementos
            System.out.println("[" + aiDatos[i] + "]"); //Imprimimos cada valor
        }
        System.out.println(""); //Salto
        System.out.println("Eso fue rápido"); //Mensaje de salida
        for (int i = 0; i< 10; i++){ //Ciclo for para recorrer los 10 elementos
            int iVal = (int)((Math.random() *1000) + 1); //Creamos elementos del 1 al 1000
            lstMiLista.agregarNodo(new Nodo(iVal)); //Agregamos un nuevo nodo con el método
    
            
           
            
        }
        System.out.println("Eso fue rápido también"); //Mensaje de salida
        System.out.println("Valor en posición 500,000 = " + lstMiLista.getValor(500000)); //Posición 500,000
        System.out.println("Orden original"); //Mensaje de salida
        
        
        lstMiLista.imprimir(); //Se utilizq el método imprimir para mostrar
        System.out.println("Orden inverso"); //Mensaje de salida
        lstMiLista.imprimirOrdenInverso(); //Método imprimir para mostrar los elementos en orden inverso
         System.out.println("Cantidad = " + lstMiLista.longitud(iCont)); //Se muestra la cantidad de elementos que hay
        //System.out.println("No tanto");
        lstMiLista.borrarNodo(0); //Método para borrar el nodo
        lstMiLista.imprimir();  //Método para imprimir nuevamente la lista pero con el elemento borrado
        lstMiLista.agregarNodo(new Nodo(999)); //Agregar un nuevo nodo 999
        lstMiLista.imprimir(); //Imprimir la nueva lista con el nuevo elemento 
        lstMiLista.borrarNodo(999); //Si no reconectamos, no podremos eliminar nodos. si no verificamos el nodo final.
        
        Scanner sCaptu = new Scanner(System.in); //Utilizamos scanner para solicitarle datos al usuario
        System.out.println("Valor a buscar: "); //Mensaje de salida para decirle al usuario que coloque el valor
        int iValbus = sCaptu.nextInt(); //Convertimos a entero el dato que el usuario introdujo
        sCaptu.nextLine(); //Para capturar algo que no sea texto
        System.out.println("El valor " + iValbus + " está en la posición " + lstMiLista.buscar(iValbus)); //Se imprime el valor y la posición
        
        System.out.println("Copia Lista"); //Imprimir mensaje para la copia de la lista
        Lista lstCopia = lstMiLista.copiaLista(); //La copia nos regresa la lista
        lstCopia.imprimir(); //Imprimimos la copia de la lista
        lstCopia.agregarNodo(new Nodo(5000)); //Ahora se añade el elemento 5000 a la copia
        lstCopia.imprimir(); //Se imprime nuevamente ya con el nuevo elemento
        lstMiLista.imprimir(); //Se imprime la lista original
        lstMiLista.imprimirOrdenInverso(); //Ahora se imprime la lista pero en orden inverso
}
}
