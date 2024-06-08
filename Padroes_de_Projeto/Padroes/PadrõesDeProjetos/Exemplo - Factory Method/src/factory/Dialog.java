package factory;

import buttons.Button;

/**
 * Classe base de fábrica. Observe que "factory" é apenas uma função para a classe. 
 * Ele deve ter alguma lógica de negócio principal que precisa de produtos diferentes 
 * para serem criados.
 */
public abstract class Dialog {

    public void renderWindow() {
        // ... outros códigos ...

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * As subclasses substituirão esse método para criar objetos de botão específicos.
     */
    public abstract Button createButton();
}