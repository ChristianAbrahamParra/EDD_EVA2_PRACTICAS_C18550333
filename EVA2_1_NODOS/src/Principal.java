/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 @author Christian Abraham Parra Pérez
 # Control: C18550333
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Nodo nObj1 = new Nodo(); //Creamos y reservamos memoria para un nodo
       nObj1.iVal = 100; //Se otorga valor de 100 al primer nodo
       nObj1.nSig = null;  //asegurarnos que siempre que creemos un nodo sean nulos.
       
       Nodo nObj2 = new Nodo(); //Crear y reservar memoria para el segundo nodo 
       nObj2.iVal = 200; //Se otorga valor de 200 al segundo nodo
       nObj2.nSig = null; //Asegurar que tenga valor nulo
       
       Nodo nObj3 = new Nodo(); //Crear y reservar memoria para el tercer nodo
       nObj3.iVal = 300; //Se otorga valor de 300 al tercer nodo
       nObj3.nSig = null; //Asegurarnos que tenga valor nulo
    
    //Vincular los nodos y crear una lista
       
       nObj1.nSig = nObj2; //Se vincula el nodo 1 con el 2
       nObj2.nSig = nObj3; //Se vincula el nodo 2 con el 3
       
       Nodo nTemp = nObj1;      //Punto de arranque
       while(nTemp != null){  //siempre usaremos un while. mientras nSig sea diferente a null
           System.out.println("iVal = " + nTemp.iVal); //Mensaje de salida para imprimir los nodos
           nTemp = nTemp.nSig; //Para recorrer la lista
       }
    
    }
    
}
//Este es e eslabón de nuestra cadena
class Nodo{
    //DATOS A ALMACENAR
    
    public int iVal;
    
//REFERENCIA PARA CREAR LA CADENA
    //Puede haber múltiples referencias
    public Nodo nSig; //La referencia tiene que ser de tipo nodo
}

//Collections
//Listas, pilas, colas, arboles, nodos y demas
//A menos que se indique, está PROHIBIDO usar collections.