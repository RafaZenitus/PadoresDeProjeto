package cars;

import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

/**
 * Manual é outro produto. Observe que ele não possui o mesmo ancestral
 * que um Carro. Eles não estão relacionados.
 */

public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Tipo de Carro: " + carType + "\n";
        info += "Número de assentos: " + seats + "\n";
        info += "Motor: volume - " + engine.getVolume() + "; Km - " + engine.getMileage() + "\n";
        info += "Transmissão: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Computador de Bordo: Funcional" + "\n";
        } else {
            info += "Computador de Bordo: Não disponível" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "Navegador de GPS: Funcional" + "\n";
        } else {
            info += "Navegador de GPS: Não disponível" + "\n";
        }
        return info;
    }
}