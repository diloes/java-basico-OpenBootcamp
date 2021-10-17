package sesion4;

//* CREAMOS LA CLASE HIJA SmartWatch *//
public class SmartWatch extends SmartDevice {

    /* ATRIBUTOS */
    String micro;

    /* CONSTRUCTORES */
    public SmartWatch() {}
    public SmartWatch( String brand, String model, double sizeScreen, int battery, String micro){
        super(brand, model, sizeScreen, battery);
        this.micro = micro;
    }
}
