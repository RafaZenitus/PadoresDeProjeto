package factory;

import buttons.Button;
import buttons.WindowsButton;

/**
 * A caixa de diálogo do Windows produzirá botões do Windows.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}