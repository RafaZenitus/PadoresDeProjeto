package components;

import cars.Car;

/**
 * Apenas mais uma caracter�stica de um carro.
 */

public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("N�vel de Combust�vel: " + car.getFuel());
    }

    public String showStatus() {
        if (this.car.getEngine().isStarted()) {
            return "Carro est� ligado";
        } else {
            return "Carro est� desligado";
        }
    }
}