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
public class MiStack {
    //Necesitamos un nodo inicio, final y contador

    private Nodo inicio; //de tipo nodo para apuntar a nodos. Va a marcar el inicio de la lista
    private Nodo fin; //fin de tipo nodo para marcar el final de la lista
    private int iContNodos; //Tipo entero para contar el número de nodos

    public MiStack() { //Constructor
        inicio = null; //Inicio se inicializa a nulo
        fin = null; //Fin se inicializa a nulo
        iContNodos = 0; //Contador se inicializa a cero
    }
public void agregarNodo(Nodo nNuevo){
    //Consideración: que la lista esté vacia
    
    if(inicio == null){ //Si la lista está vacía
        inicio = nNuevo; //Inicio apuntará al nuevo nodo
        fin = nNuevo; //Modificado, mayor eficiencia
        iContNodos++; //Contador aumenta
    } else{ //Hay elementos
        fin.setSiguiente(nNuevo); //El nodo apuntará a fin
        nNuevo.setPrevio(fin); //El fin apuntará al nodo nuevo
        fin = nNuevo; //Fin apunta al nodo nuevo
        iContNodos++; //Aumenta el contador
    }
}
//Eficiencia: O(N)
public void imprimir() {
        //lLEVAR AL FINAL DE LA LISTA
        Nodo nTemp = inicio; //El nodo apuntará a inicio
        while (nTemp != null) { //Nos interesa recorrerlos todos
            System.out.print("[" + nTemp.getValor() + "]"); //Se imprimen los valores de la lista
            nTemp = nTemp.getSiguiente(); //El nodo apunta al siguiente nodo
        } //lo esencial para recorrer las listas
        System.out.println(""); //Se imprime un salto
    }
//Eficiencia: O(N)
public void imprimirOrdenInverso() {
        //lLEVAR AL FINAL DE LA LISTA
        Nodo nTemp = fin; //Ahora iniciamos desde el fin
        while (nTemp != null) { //Se va a detener hasta que lleguemos a null
            System.out.print("[" + nTemp.getValor() + "]"); //Se imprimen los valores de forma inversa
            nTemp = nTemp.getPrevio(); //Ahora lo recorremos hacia atrás
        } //lo esencial para recorrer las listas
        System.out.println(""); //Se imprime un salto
    }

public int longitud(){ //Método para saber la cantidad de nodos
    return iContNodos++; //Regresa la cantidad de nodos
}

public void vaciar(){ //También funciona en listas dobles sin problema
    inicio = null; //Inicio se inicializa a nulo
    fin = null; //Fin se inicializa a nulo
}

public boolean estaVacia(){ //Método para saber si una lista está vacía
    if(inicio == null) //Si inicio es igual a nulo
        return true; //Entonces la lista está vacía
    else  //Si no
        return false;  //La lista no está vacía
}

public int buscar(int iVal){
    int iPos = -1; //Si no lo encuentra, se regresa al anterior
    //Recorrer elemento por elemento
    //Detener la búsqueda cuando lo encontremos
    //Se puede llegar al final de la lista sin encontrarlo    
    //Cómo buscamos el valor
    Nodo nTemp = inicio; //Ahora iniciamos desde el fin
    int iCont = 0; //para saber la posición en donde lo encontramos
        while (nTemp != null) { //Ciclo, mientras el nodo sea diferente de nuli
            //Detener el ciclo cuando lo encontremos
            if(iVal == nTemp.getValor()){//Lo vamos a buscar con nTemp
            iPos = iCont; //Hay que igualar
                break; //Se detiene el ciclo
            
        }
            
            iCont++; //Aumenta el contador
            nTemp = nTemp.getSiguiente(); //El nodo apuntará a nodo siguiente
            
        }
            return iPos; //Regresa la posición
        
}

public void agregarInicio(Nodo nNuevo) { //Método para agregar al inicio
        if (inicio == null) { //Lista vacía
            inicio = nNuevo; //Inicio apuntará al nodo nuevo
            fin = nNuevo; //Modificado, mayor eficiencia
            iContNodos++; //Aumenta contador
        } else { //Lista con N nodos
            
            nNuevo.setSiguiente(inicio); //Lo ponemos al principio
            inicio.setPrevio(nNuevo); //El nodo nuevo apuntará previamente al inicio
            inicio = nNuevo; //Inicio apuntará al nodo nuevo
            iContNodos++; //Aumenta contador
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
        if(iPos == 0){ //Si la posición es igual a cero
            agregarInicio(nNuevo); //ya tenemos un método para agregar al inicio
            
        } else { //Insertar en cualquier posición
            //Validar si la lista está vacía
            Nodo nTemp = inicio; //Inicio apuntará al nuevo nodo
            int iCont = 0; //Se inicializa el contador a cero
            while(iCont != (iPos - 1)){ //Ciclo while, mientras el contador sea diferente de la posición menos uno
                
                nTemp = nTemp.getSiguiente(); //nTemp apunta a nTemp siguiente
            }
            Nodo nSig = nTemp.getSiguiente(); //El nodo siguiente apunta a siguiente
            
            iContNodos++; //Contador aumenta
            
            
            
        }
    }

public void borrarNodo(int iPos){ //Pendiente
    
    if(inicio != null){ //Si el inicio es diferente a nulo
        if(iPos == 0){ //Si la posición es igual a cero
            inicio = inicio.getSiguiente(); //Inicio apuntará al siguiente
            
            if(inicio.getSiguiente() == null) //Si inicio siguiente es nulo
                fin = null; //El fin también es nulo
            
        }
    }
}

public int getValor(int iPos) { //Posición a la que queremos llegar
        int iVal = 0; //Se inicializa la variable a cero
        int iCont = 0; //Necesitamos un contador
        Nodo nTemp = inicio; //Inicio apuntará al nuevo nodo
        while (nTemp != null) { //Nos interesa recorrerlos todos
            if (iCont == iPos) { //Si el contador es igual a la posición
                iVal = nTemp.getValor(); //iVal es igual a nTemp
                break; //Detenemos el ciclo, si no va a recorrer todo el ciclo
            }
            nTemp = nTemp.getSiguiente(); //nTemp es igual a nTemp siguiente
            iCont++; //incrementamos el contador
        }
        return iVal;  //Regresa el valor
    } 

public MiStack copiaLista(){ //Es un duplicado exacto de la lista, es decir, con los mismos valores
    MiStack lsCopia = new MiStack();
    //Hay que recorrer toda la lista, leer cadaa nodo
    //Crear un nodo nuevo para ese valor
    //Insertarlo en la nueva lista
    Nodo nTemp = inicio; //Inicio apuntará al nuevo nodo
        while (nTemp != null) { //Nos interesa recorrerlos todos
            lsCopia.agregarNodo(new Nodo(nTemp.getValor())); //Obtenemos el valor entero para ponerlo en nuevo nodo, tenemos dos copias totalmente separadas
            nTemp = nTemp.getSiguiente(); //nTemp apunta a nTemp siguiente
        }
            return lsCopia;  //Se regresa la copia de la lista
}

//
public void push(Nodo nNuevo){ //Necesitamos recibir un nuevo nodo
    agregarInicio(nNuevo); //Peek agrega al inicio, y como ya tenemos un método para eso, lo usamos
    
    
}
public int peek(){ //Leer un valor. nada màs lee el primer nodo. Consideraciòn: que haya nodos en la lista
    int iResu = 0; //Se inicializa la variable a cero
    if(inicio != null){ //Si inicio es diferente a nulo
        iResu = inicio.getValor(); //Variable iResu apuntará a inicio get valor
    } else{
        //Notificar que no hay nodos
    }
    return iResu; //Regresa el resultado
    
}

public int pop(){ //Una vez que lo lee, hay que eliminarlo
    int iResu = 0; //Se inicializa la variable a cero
    if(inicio != null){ //Si inicio es diferente de nulo
        iResu = inicio.getValor(); //Variable iResy apuntará a inicio que obtiene el valor
        //remover el nodo inicial
        borrarNodo(0); //Primero recuperamos su valor
    } else{
        //Notificar que no hay nodos
    }
    return iResu; //Regresa el resultado
    
    
    
    
}


}

