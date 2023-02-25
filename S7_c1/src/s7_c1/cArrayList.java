
package s7_c1;


import java.util.ArrayList;
import java.util.ListIterator;

import java.util.Scanner;


public class cArrayList {
    
    public cArrayList(){

    Scanner in = new Scanner(System.in);
    ArrayList <Integer> num = new ArrayList<>();   
    
    int n = 0;
    int a =0;
    int pos, aux;
    int contador;
    System.out.println("Ingrese la cantidad de numeros que desea usar(max 50)");
    a = in.nextInt();
    for (int i = 1; i <= a; i++) {
    n = (int) (Math.random() * 100 + 1);
    if (num.contains(n)) {
        i--;
    } else {
        num.add(n);
        }
    }

    System.out.println("La lista creada de numeros es:");
    for (Integer nu : num) {
    System.out.println(nu + "");
        }
    
    System.out.println("La lista ordenada ascendentemente:"); 
    
    
    ListIterator<Integer> lst = num.listIterator(num.size());
    
    while(lst.hasNext()){
        Integer miFruta = lst.next();
            System.out.println("" + miFruta);
        }
    
 }
    
    
    
 
    
    
  
}
/*    
public static void burbuja ( int num[]){
int cuentaintercambios = 0 ;

// Usamos un bucle anidado , saldra cuando este ordenado el array
for ( boolean ordenado = false ; ! ordenado ; ) {
    for ( int i = 0 ; i < num.length - 1 ; i ++ ) {
    if ( num [i] > num [ i + 1 ] ) {
    
    // Intercambiamos valores
        int variableauxiliar = num [ i ] ;
    num[i] = num[i+1];
    num [ i + 1 ] = variableauxiliar ;
    // indicamos que hay un cambio .
    cuentaintercambios ++ ;
    }
    }
    // Si no hay intercambios , es que esta ordenado .
    if ( cuentaintercambios == 0 ) {
        ordenado = true ;
    }
    // Inicializamos la variable de nuevo para que empiece a contar de nuevo
    cuentaintercambios = 0 ;
    }
    }
*/

