
import java.awt.Point;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
// No entiendo nada :))))
public class Lista {
    
    private Nodo inicio;
    private Nodo fin;
    private Point iContNodos;

    public Lista() {
        inicio = null;
        fin = null;
        iContNodos = 0;
        
    }
public void agregarNodo(Nodo nNuevo){
    //Consideración: que la lista esté vacia
    
    if(inicio == null){ //Si la lista está vacía
        inicio = nNuevo;
        fin = nNuevo;
        iContNodos++;
    } else{ //Hay elementos
        fin.setSiguiente(nNuevo);
        nNuevo.setPrevio(fin);
        fin = nNuevo;
        iContNodos++; 
    }
}
//Eficiencia: O(N)
public void imprimir() {
        //Llevar al final de la lista
        Nodo nTemp = inicio;
        while (nTemp != null) { //Nos interesa recorrerlos todos
            System.out.print("[" + nTemp.getValor() + "]");
            nTemp = nTemp.getSiguiente();
        } //lo esencial para recorrer las listas
        System.out.println("");
        
    }
//Eficiencia: O(N)
public void imprimirOrdenInverso() {
        //lLEVAR AL FINAL DE LA LISTA
        Nodo nTemp = fin; //Ahora iniciamos desde el fin
        while (nTemp != null) { //Se va a detener hasta que lleguemos a null
            System.out.print("[" + nTemp.getValor() + "]");
            nTemp = nTemp.getPrevio(); //Ahora lo recorremos hacia atrás
        } //lo esencial para recorrer las listas
        System.out.println("");
    }

public int longitud(){
    return iContNodos++;
}

public void vaciar(){ //También funciona en listas dobles sin problema
    inicio = null;
    fin = null;
}

public boolean estaVacia(){
    if(inicio == null)
        return true;
    else 
        return false;
}

public int buscar(Point iVal){
    int iPos = -1; //Si no lo encuentra, se regresa al anterior
    //Recorrer elemento por elemento
    //Detener la búsqueda cuando lo encontremos
    //Se puede llegar al final de la lista sin encontrarlo    
    //Cómo buscamos el valor
    Nodo nTemp = inicio;
    int iCont = 0; //para saber la posición en donde lo encontramos
        while (nTemp != null) {
            //Detener el ciclo cuando lo encontremos
            if(iVal == nTemp.getValor()){//Lo vamos a buscar con nTemp
            iPos = iCont; //Hay que igualar
                break;
            
        }
            
            iCont++;
            nTemp = nTemp.getSiguiente();
            
        }
            return iPos;
        
}

public void agregarInicio(Nodo nNuevo) {
        if (inicio == null) { //Lista vacía
            inicio = nNuevo;
            fin = nNuevo; //Modificado, mayor eficiencia
        } else { //Lista con N nodos
            
            nNuevo.setSiguiente(inicio); //Lo ponemos al principio
            inicio.setPrevio(nNuevo);
            inicio = nNuevo;
            iContNodos++;
        }
    }

//Eficiencia: O(N)
public void agregarEn(int iPos, Nodo nNuevo){
        //Posición válida (dentro del índice de la lista)
        //Insertar al inicio (pos = 0)
        //Insertar en cualquier posición
    
         //Validar:
    //1.- Debe haber nodos, por tanto, iPos debe estar en el rango de 0 --> N-1
    //2.- Si interto en cero, es agregar al inicio
    //3.- En todos los demás casos, hay que reconectar
        if(iPos == 0){
            agregarInicio(nNuevo); //ya tenemos un método para agregar al inicio
            
        } else { //Insertar en cualquier posición
            //Validar si la lista está vacía
            Nodo nTemp = inicio;
            int iCont = 0;
            while(iCont != (iPos - 1)){
                
                nTemp = nTemp.getSiguiente();
            }
            Nodo nSig = nTemp.getSiguiente();
            
            iContNodos++;
            
            
            
        }
    }

public void borrarNodo(int iPos){ //Pendiente
    
    if(inicio != null){
        if(iPos == 0){
            inicio = inicio.getSiguiente();
            
            if(inicio.getSiguiente() == null)
                fin = null;
        }
    }
}

public int getValor(int iPos) { //Posición a la que queremos llegar
        int iVal = 0;
        int iCont = 0; //Necesitamos un contador
        Nodo nTemp = inicio;
        while (nTemp != null) { //Nos interesa recorrerlos todos
            if (iCont == iPos) {
                iVal = nTemp.getValor(); //iVal es igual a nTemp
                break; //Detenemos el ciclo, si no va a recorrer todo el ciclo
            }
            nTemp = nTemp.getSiguiente();
            iCont++; //incrementamos el contador
        }
        return iVal;
    }


}


