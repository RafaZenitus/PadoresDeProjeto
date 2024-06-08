/**
 * Código adaptado do site https://refactoring.guru/pt-br/design-patterns/builder/java/example
 */

import builders.CarBuilder;
import builders.CarManualBuilder;
import cars.Car;
import cars.Manual;
import director.Director;

/**
 * Classe de demonstração. Tudo se junta aqui.
 */

public class Teste {

    public static void main(String[] args) {
        Director director = new Director();

        // Director obtém o objeto construtor concreto do cliente. 
        // Isso porque o aplicativo sabe melhor 
        // qual construtor usar para obter um produto específico.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // O produto final geralmente é recuperado de um objeto construtor, pois 
        // o Diretor não está ciente e não depende de construtores e 
        // produtos concretos.
        Car car = builder.getResult();
        System.out.println("Carro construído: " + car.getCarType());        

        CarManualBuilder manualBuilder = new CarManualBuilder();

        // O diretor pode conhecer vários tipos de construção.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nManual do carro construído:\n" + carManual.print());
    }

}
