package ahorcado;

import java.util.Scanner;

public class ahoracado {
    public static void main(String[] args) throws Exception {
        
        // Clase Scanner = Permite al usuario escribir en la terminal
        Scanner scanner = new Scanner(System.in);

        // Declaraciones y Asignaciones

        String palabraSecreta = "Inteligencia"; // la palabra a adivinar
        int intentosMaximos = 10;
        int intentos = 0; //cuenta empieza desde cero

        boolean palabraAdivinada = false; // Para poder hacer un bucle while

        // Arreglos

        char[] letrasAdivinadas = new char[palabraSecreta.length()]; // necesitamos saber la cantidad de letras que deben ser adivinadas

        // Estructura de control de tipo iterativa

        for(int i = 0; i < letrasAdivinadas.length; i++) {

            letrasAdivinadas[i] = '-'; // para que pinte despues los guiones que representan las letras
            System.out.print(letrasAdivinadas[i]);
            
        } // Bucle for para poder imprimir los guiones
        
        while (!palabraAdivinada && intentos < intentosMaximos){

            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " " + palabraSecreta.length() + " letras ");
            System.out.println("Introduce una letra por favor");
            
            // Usamos calse scanner.next() para pedir una letra
            
            char letra = Character.toLowerCase(scanner.next().charAt(0)); // charAt = Solo toma la primera letra, no importa si escriben muchas letras seguidas
        
            boolean letraCorrecta = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {// for para recorrer una palabra
                // Si la letra que escribo la persona esta dentro de palabra secreta, entonces adivina.
                // Estructura de tipo condicional
                
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }      
            }
        
            if(!letraCorrecta){
                intentos++;
                System.out.println("Letra incorrecta, te quedan " + (intentosMaximos - intentos) + "intentos");

            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("Felicidades has adivinado la palabra secreta: " + palabraSecreta);     
            }
        }

        if(!palabraAdivinada){
            System.out.println("Perdiste!");
        }
        scanner.close();
    }
    
}
