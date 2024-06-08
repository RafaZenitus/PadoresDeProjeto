package factory;

import buttons.Button;

/**
 * Classe base de f�brica. Observe que "factory" � apenas uma fun��o para a classe. 
 * Ele deve ter alguma l�gica de neg�cio principal que precisa de produtos diferentes 
 * para serem criados.
 */
public abstract class Dialog {

    public void renderWindow() {
        // ... outros c�digos ...

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * As subclasses substituir�o esse m�todo para criar objetos de bot�o espec�ficos.
     */
    public abstract Button createButton();
}