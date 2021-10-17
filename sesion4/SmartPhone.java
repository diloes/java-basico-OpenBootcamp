package sesion4;

//* CREAMOS LA CLASE HIJA SmartPhone *//
public class SmartPhone extends SmartDevice {

    /* ATRIBUTOS */
    double cameraPixels;

    /* CONSTRUCTORES */
    public SmartPhone(){}
    public SmartPhone(String brand, String model, double sizeScreen, int battery, double cameraPixels){
        super(brand, model, sizeScreen, battery);
        this.cameraPixels = cameraPixels;
    }

    /* METODOS */

    public String toString() {
        return "SmartPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", sizeScreen=" + sizeScreen +
                ", battery=" + battery +
                ", cameraPixels=" + cameraPixels +
                '}';
    }
}
