package sesion4;

//* CREAMOS LA CLASE PADRE SmartDevice *//
public class SmartDevice {

    /* ATRIBUTOS */
    String brand;
    String model;
    double sizeScreen;
    int battery;

    /* CONSTRUCTORES */
    public SmartDevice(){}
    public SmartDevice(String brand, String model, double sizeScreen, int battery){
        this.brand = brand;
        this.model = model;
        this.sizeScreen = sizeScreen;
        this.battery = battery;
    }

    /* METODOS */
    @Override
    public String toString() {
        return "SmartDevice{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", sizeScreen=" + sizeScreen +
                ", battery=" + battery +
                '}';
    }
}
