import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Utilizamos la clase Scanner para consultar al usuario.
        Scanner scanner = new Scanner(System.in);

        //Declaraciones y asignaciones.
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;


        //Arreglos:
        char[] letrasAdividanas = new char[palabraSecreta.length()];

        //Estructura de control de tipo iterativa / for
        for (int i = 0; i < letrasAdividanas.length; i++) {
            letrasAdividanas[i] = '_';
        }

        //Estructura de control de tipo iterativa / while
        
        while (!palabraAdivinada && intentos < intentosMaximos) {
                                                        //Esto se usa cuando tenemos una palabra de chars
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdividanas) + " (" + palabraSecreta.length() + " letras)");

            System.out.println("Introduce una letra por favor: ");

            //Usamos la clase Scanner para pedir una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            //Estructura de control de tipo iterativa / for
            for (int i = 0; i < letrasAdividanas.length; i++) {
                //Estructura de control condicional / if
                //Si el caracter ingresado es igual a la letra
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdividanas[i] = letra;
                    //Letra correcta se convertira en true.
                    letraCorrecta = true;
                }
            }
            //Si la letracorrecta no es la misma
            if(!letraCorrecta) {
                //Los intentos iran incrementando, lo que disminuira los intentos
                intentos++;
                //Imprimimos un mensaje advirtiendo que le quedan menos intentos.
                System.out.println("¡Incorrecto! Te quedan " + (intentosMaximos - intentos) + " intentos");
            }
            //Si las letras ingresadas son iguales a las de la palabra secreta
            if(String.valueOf(letrasAdividanas).equals(palabraSecreta)) {
                //la palabra adivinada se volvera true.
                palabraAdivinada = true;
                //Imprimimos un mensaje por consola, mostrando cual fue la palabra secreta.
                System.out.println("¡Felicidades!, Has adivinado la palabra secreta: " + palabraSecreta);
            }
        }
        //Si la palabra no es la correcta, se imprime un mensaje de game over.
        if(!palabraAdivinada) {
            System.out.println("¡Que pena!, te has quedado sin intentos, GAME OVER!");
        }

        scanner.close();


    }
}
