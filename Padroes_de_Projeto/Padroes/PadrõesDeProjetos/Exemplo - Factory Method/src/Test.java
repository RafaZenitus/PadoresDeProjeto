
import factory.Dialog;
import factory.HtmlDialog;
import factory.WindowsDialog;

/**
 * Classe para testar a aplica��o do padr�o
 */
public class Test {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * A f�brica concreta geralmente � escolhida dependendo da configura��o
     * ou op��es do ambiente
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * Todo o c�digo do cliente deve funcionar com f�bricas e produtos por meio de 
     * interfaces abstratas. Dessa forma, n�o importa com qual f�brica trabalha 
     * e com que tipo de produto devolve.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}