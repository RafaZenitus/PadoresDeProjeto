package components;

import cars.Car;

/**
 * Apenas mais uma característica de um carro.
 */

public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Nível de Combustível: " + car.getFuel());
    }

    public String showStatus() {
        if (this.car.getEngine().isStarted()) {
            return "Carro está ligado";
        } else {
            return "Carro está desligado";
        }
    }
}