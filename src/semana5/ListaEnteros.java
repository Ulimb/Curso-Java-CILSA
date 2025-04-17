package semana5;

import java.util.ArrayList;

public class ListaEnteros {
    
  public static void main(String args[]) {
 
    // ARRAY LIST
    // tipo de dato, nombre = ?
    
    // int vs Integer
    ArrayList<Integer> numeros = new ArrayList<Integer>();
    
    //int [] vs ArrayList<Integer>
    // ArrayList --> metodos para manipular la lista (por ej: add, remove, get(posicion)...)
    
    numeros.add(1);
    numeros.add(2);
    numeros.add(3);
    
    // remove
    numeros.remove(0);
    
    // int longitud = numeros.size();
    
    for(int i=0; i<numeros.size(); i++){
        
        System.out.println(numeros.get(i));
    }
  }
  
}