
public class Teste {
    public static void main(String[] args) {
        System.out.println("Se constar o mesmo valor, então o Singleton foi utilizado" + "\n" +
                "Se os valores forem diferentes, então dois objetos foram criados e o Singleton está incorreto" + "\n\n" +
                "RESULTADO:" + "\n");
        Singleton singleton = Singleton.getInstance("Primeiro objeto");
        Singleton outroSingleton = Singleton.getInstance("Segundo objeto");
        System.out.println(singleton.value);
        System.out.println(outroSingleton.value);
    }
}