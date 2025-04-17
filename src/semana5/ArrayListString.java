package semana5;

import java.util.ArrayList;

class ArrayListString {
    
  public static void main(String[] args) {

    ArrayList<String> palabras = new ArrayList<String>();

    palabras.add("Fabiana");
    palabras.add("Diego");
    palabras.add("Daniela");
    
    int largo = palabras.size();
    
    for(int i = 0 ; i < largo ; i++) {

      System.out.println(palabras.get(i));
    }

    //ahora elimino
    palabras.remove("Diego");
    System.out.println("Ahora con elementos quitados");
    largo = palabras.size();
    
    for(int i = 0 ; i < largo ; i++) {

      System.out.println(palabras.get(i));
    }
  }
}