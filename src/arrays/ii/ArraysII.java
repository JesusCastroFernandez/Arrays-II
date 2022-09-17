/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.ii;

import java.util.Arrays;

/**
*
* @author JESUS (indica el autor de la clase o método)
* {@code}: incluye en el comentario un trozo de código que se formatea de forma especial.
* {@docRoot}: incluye una ruta relativa al directorio raíz donde se genera la documentación.
* @deprecated: indica que un método ha quedado obsoleto, se desaconseja su uso y puede que en futuras versiones desaparezca.
* @exception: es sinónima de throws.
* {@inheritDoc}: hereda el comentario Javadoc de la clase o método superior en la jerarquía de clases.
* {@link}: incluye un enlace a otra sección de la documentación, método o clase.
* {@linkplain}: es idéntica a @link pero el enlace es un texto plano.
* {@literal}: muestra un texto sin interpretar el texto como HTML.
* @return: documenta el valor de retorno de un método.
* @see: incluye un enlace con documentación adicional en la sección final de la documentación.
* @serial
* @serialData
* @serialField
* @since: indica a partir de que versión de la API fue incluida la clase o método.
* @throws: documenta una posible excepción que puede ser lanzada por el método.
* {@value}: muestra el valor de un campo estático.
* @version: para documentar la versión de cuando se hizo checkout del sistema de control de versiones.
 */
public class ArraysII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DECLARACIÓN DE VARIABLES Y ARRAYS UNIDIMENSIONALES (DE TIPO: STRING E INT)
        
        int n;
        int n1;
        
        String [] separador = {"--------------------"};
        String [] filaUna = {"|**|", "|  |"};
        String [] filaDos = {"|**|", "|  |"};        
        
        String [] escaleraUna = {"X"};
        String [] escaleraDos = {"XX"}; 
        String [] escaleraTres = {"XXX"}; 
        
        String [] frase = {"¿Cómo era la casa?"};
        String [] frase1 = {"La casa era "};
        String [] frase2 = {"El campo era "};
        String [] adjetivo1 = {"muy pequeña."};
        String [] adjetivo2 = {"pequeña."};
        String [] adjetivo3 = {"mediana."};
        String [] adjetivo4 = {"grande."};
        String [] adjetivo5 = {"muy grande."};
        
        int [] numero = {1};
        int [] numero1 = {2};
        int numero2 = 1;
        int numero3 = 2;
        int resultado = numero2 + numero3;
        
        // PROCEDIMIENTO Y RESULTADO
        
        System.out.println("EJERCICIOS CON ARRAYS.");  
        System.out.println(); 
        
        System.out.println("1.- Números del 1 al 12 en Columna: ");  
        System.out.println(); 
        
         // Cuenta del 1 al 12
         
         for (n = 1; n < 13; n++){
        System.out.println("El número es: " + n);   
        System.out.println(); 
        }
         
         // Dibuja un Separador de Líneas con Array
         
         System.out.println("2.- Dibuja un Separador de Líneas con Array: ");   
        System.out.println(); 
         
         System.out.println(Arrays.toString(separador));   
         System.out.println(); 
        
         // Cuenta del 12 al 1 incluyendo un subíndice de 3 subapartados
         
         System.out.println("3.- Cuenta del 12 al 1 incluyendo un subíndice de 3 subapartados.");
         System.out.println();
         
         for (n = 12; n >= 1; n--){
        System.out.println("El número es: " + n);   
         for (n1 = 3; n1 >= 1; n1--){
        System.out.println("El subnúmero es: " + n + "." + n1);
         }
        System.out.println();
    }
         // Dibuja una caja de 2 x 2 con asteriscos de los arrays y una caja vacía
         
         System.out.println("4.- Dibuja una caja de 2 x 2 con asteriscos de los arrays y una caja vacía.");
         System.out.println();
         
         System.out.println(Arrays.toString(filaUna));   
         System.out.println(Arrays.toString(filaDos));   
         System.out.println(); 
         
         // Dibuja una tabla numérica con unidades (regular o simétrica)
         
         System.out.println("5.- Dibuja una tabla numérica con unidades (regular o simétrica).");
         System.out.println();
         
         for (n = 1; n <= 5; n++){
        System.out.print(n);   
         }
        System.out.println(); 
         for (n = 5; n <= 9; n++){
        System.out.print(n);   
        }
        System.out.println(); 
        for (n = 1; n <= 5; n++){
        System.out.print(n);   
        }
        System.out.println();  
         for (n = 5; n <= 9; n++){
        System.out.print(n);   
         }
        System.out.println(); 
        System.out.println();
        
         // Dibuja una tabla numérica con decenas (regular o simétrica)
         
         System.out.println("6.- Dibuja una tabla numérica con decenas (regular o simétrica).");
         System.out.println();
         
         for (n = 10; n <= 14; n++){
        System.out.print(n);   
         }
        System.out.println(); 
         for (n = 15; n <= 19; n++){
        System.out.print(n);   
        }
        System.out.println(); 
        for (n = 10; n <= 14; n++){
        System.out.print(n);   
        }
        System.out.println();  
         for (n = 15; n <= 19; n++){
        System.out.print(n);   
         }
        System.out.println(); 
        System.out.println(); 
        
         // Dibuja una escalera de 3 peldaños con la X de los arrays
        
         System.out.println("7.- Dibuja una escalera de 3 peldaños con la X de los arrays.");
         System.out.println();
         
         System.out.println(Arrays.toString(escaleraUna));   
         System.out.println(Arrays.toString(escaleraDos));   
         System.out.println(Arrays.toString(escaleraTres));  
         System.out.println(); 
         
         // Dibuja una escalera inversa de 3 peldaños con la X de los arrays
         
         System.out.println("8.- Dibuja una escalera inversa de 3 peldaños con la X de los arrays.");
         System.out.println();
         
         System.out.println(Arrays.toString(escaleraTres)); 
         System.out.println(Arrays.toString(escaleraDos));  
         System.out.println(Arrays.toString(escaleraUna)); 
         System.out.println(); 
         
         // Escribe una frase con un array
         
         System.out.println("9.- Escribe una frase con un array.");
         System.out.println();
         
         System.out.println(Arrays.toString(frase)); 
         System.out.println();
         
         // Escribe 5 frase diferentes concatenando dos arrays
         
         System.out.println("10.- Escribe 5 frase diferentes concatenando dos arrays.");
         System.out.println();
         
         System.out.println(Arrays.toString(frase1 ) + Arrays.toString(adjetivo1)); 
         System.out.println();
         System.out.println(Arrays.toString(frase1) + Arrays.toString(adjetivo2)); 
         System.out.println();
         System.out.println(Arrays.toString(frase1) + Arrays.toString(adjetivo3)); 
         System.out.println();
         System.out.println(Arrays.toString(frase1) + Arrays.toString(adjetivo4)); 
         System.out.println();
         System.out.println(Arrays.toString(frase1) + Arrays.toString(adjetivo5)); 
         System.out.println();
         
         // Escribe 2 frase distintas concatenando tres arrays
         
         System.out.println("11.- Escribe 2 frase distintas concatenando tres arrays.");
         System.out.println();
         
         System.out.println(Arrays.toString(frase1) + Arrays.toString(adjetivo4)); 
         System.out.println();
         System.out.println(Arrays.toString(frase2) + Arrays.toString(adjetivo4)); 
         System.out.println();
         
          // Representa el cálculo de una Suma con Arrays y Variables
          
         System.out.println("12.- Representa el cálculo de una Suma con Arrays y Variables.");
         System.out.println();
         
         System.out.println(" " + Arrays.toString(numero));
         System.out.println("+");
         System.out.println(" " + Arrays.toString(numero1));
         System.out.println("-----");
         System.out.println("  " + resultado);
         System.out.println();
         
         System.out.println(Arrays.toString(separador));
         System.out.println("   FIN DEL PROGRAMA");
         System.out.println(Arrays.toString(separador));
    }
    
}
