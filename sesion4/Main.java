package sesion4;

public class Main {
    public static void main(String[] args) {

        //* CREAMOS OBJETOS e IMPRIMIR ATRIBUTOS *//
        SmartDevice SamsungA70 = new SmartPhone("Samsung", "A70", 5.3, 4500, 15);
        System.out.println( SamsungA70 );

        SmartDevice SamsungWatch = new SmartWatch("Samsung", "Watch 3", 3.3, 150, "Si");
        System.out.println( SamsungWatch );

    }
}
