/**
 * C�digo adaptado do site https://refactoring.guru/pt-br/design-patterns/builder/java/example
 */

import builders.CarBuilder;
import builders.CarManualBuilder;
import cars.Car;
import cars.Manual;
import director.Director;

/**
 * Classe de demonstra��o. Tudo se junta aqui.
 */

public class Teste {

    public static void main(String[] args) {
        Director director = new Director();

        // Director obt�m o objeto construtor concreto do cliente. 
        // Isso porque o aplicativo sabe melhor 
        // qual construtor usar para obter um produto espec�fico.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // O produto final geralmente � recuperado de um objeto construtor, pois 
        // o Diretor n�o est� ciente e n�o depende de construtores e 
        // produtos concretos.
        Car car = builder.getResult();
        System.out.println("Carro constru�do: " + car.getCarType());        

        CarManualBuilder manualBuilder = new CarManualBuilder();

        // O diretor pode conhecer v�rios tipos de constru��o.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nManual do carro constru�do:\n" + carManual.print());
    }

}
