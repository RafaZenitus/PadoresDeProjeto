package factory;

import buttons.Button;
import buttons.WindowsButton;

/**
 * A caixa de di�logo do Windows produzir� bot�es do Windows.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}