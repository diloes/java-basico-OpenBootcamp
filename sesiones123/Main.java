package sesiones123;

public class Main {
    public static void main(String[] args) {

        //* SESION 1 *//
        tipos();

        //* SESION 2 *//
        getPriceIva( 100 );

        //* SESION 3 *//
        concatText();
    }

    //* EJERCICIO SESION 1 *//
    static void tipos(){
        String nombre = "Diego";
        int numero = 10;
        long numeroLargo = 1000;
        double decimalGrande = 12.34;
        boolean verdadero = true;

        System.out.println( nombre );
        System.out.println( numero );
        System.out.println( numeroLargo );
        System.out.println( decimalGrande );
        System.out.println( verdadero );
    }

    //* EJERCICIO SESION 2 *//
    static double getPriceIva( double price ){
        double priceIva = ( price * 0.21 ) + price;
        System.out.println( priceIva );
        return priceIva;
    }

    //* EJERCICIO SESION 3 *//
    static void concatText(){
        String[] countries = { "Spain ", "France ", "Portugal ", "Italy" };
        String countriesConcat = "";
        for( String country : countries ){
            countriesConcat = countriesConcat += country ;
        }
        System.out.println( countriesConcat );
    }

}
