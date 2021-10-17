package sesiones789;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Ejercicios {

    public static void main(String[] args) {

        // 1-
        reverse( "arroz" );

        // 2-
        arrayUnidimensional();

        // 3-
        arrayBidimensional();

        // 4-
        vector();

        // 6-
        arraylist();

        // 7-
        listaArreglo();

        // 8-
        try{
            dividePorCero( 4, 0  );
        } catch(Exception e) {
            System.out.println( "Esto no puede hacerse" );
        } finally {
            System.out.println( "Demo de código" );
        }

        // 9-
        ficheros( "/etc/passwd", "copia_passwd.txt" );
    }

    /* 1- Devuelve una cadena de texto al revés. */
    public static String reverse(String texto) {
        String textoReverse = "";
        for( int i = texto.length() - 1; i >= 0; i-- ) {
            textoReverse += texto.charAt(i);
        }
        System.out.println( textoReverse );
        return textoReverse;
    }

    /* 2- Array unidimensional */
    public static void arrayUnidimensional(){
        String[] words = { "Hola", "soy", "Simbad" };
        for( String word : words ) {
            System.out.println( word );
        }
    }

    /* 3- Array bidimensional */
    public static void arrayBidimensional(){
        String[][] excel = { {"A1", "A2", "A3"}, {"B1","B2","B3"} };
        for( int i = 0; i < excel.length; i++){
            System.out.println( "Fila numero " + (i + 1));
            for( int j = 0; j < excel[i].length; j++){
                System.out.println( "Posición " + (j + 1) + " : " + excel[i][j]);
            }
        }
    }

    /* 4- Vector */
    public static void vector(){
        Vector<String> estoEsUnVector = new Vector();
        estoEsUnVector.add("Homer");
        estoEsUnVector.add("Marge");
        estoEsUnVector.add("Bart");
        estoEsUnVector.add("Lisa");
        estoEsUnVector.add("Maggie");

        estoEsUnVector.remove(1);
        estoEsUnVector.remove(1);

        System.out.println(estoEsUnVector.toString());
    }

    /* 5- Problema de utilizar un Vector con la capacidad por defecto si tuviesemos 1000 elementos para añadir */
    // El pronlema es que el vector va a tener que "crecer" muchas veces la capacidad haciendo el programa lento. Ya que lo hace
    // que hace por debajo es una copia del array existente en otro nuevo más grande, y así sucesivamente.

    /* 6- Crea un ArrayList String con 4 elementos y copialo en una LinkedList */
    public static void arraylist(){
        ArrayList<String> animales = new ArrayList<String>();
        animales.add("Lirón Careto");
        animales.add("Lobo");
        animales.add("Nutria");
        animales.add("Lince");

        for( String animal : animales ){
            System.out.println( animal );
        }

        LinkedList<String> animalesLinkados = new LinkedList<String>( animales );
        for( String animal : animalesLinkados){
            System.out.println( animal );
        }
    }

    /* 7- Crea un ArrayList de tipo int ... */
    public static void listaArreglo(){
        // Creamos el array
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        // Añadimos del 1 al 10
        for( int i = 1; i <= 10; i++ ){
            numeros.add( i );
        }

        // Eliminamos los numeros pares
        for( int i = 0; i < numeros.size(); i++ ){
            if( numeros.get( i ) % 2 != 0){
                numeros.remove( i );
            }
        }

        System.out.println( "ArrayList final: " + numeros  );

    }

    /* 8- Crear una función DividePorCero generando una excepción ... */
    public static int dividePorCero( int A, int B ) throws ArithmeticException {
        int resultado = 0;
        try {
            resultado = A / B;
        }catch ( ArithmeticException e ){
            throw new ArithmeticException();
        }
        return resultado;
    }

    /* 9- Utilizando InputStream y PrintStream ... ( copiar el contenido de un fichero en otro ) */
    public static void ficheros ( String fileIn, String fileOut ){

        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();

            PrintStream out = new PrintStream( fileOut );
            out.write(datos);

        } catch ( IOException e) {
            System.out.println( "Error: " + e.getMessage() );
        }
    }
}
