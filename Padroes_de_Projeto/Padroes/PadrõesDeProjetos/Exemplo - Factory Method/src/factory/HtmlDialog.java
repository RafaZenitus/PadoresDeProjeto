package factory;

import buttons.Button;
import buttons.HtmlButton;

/**
 * A caixa de diálogo HTML produzirá botões HTML.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}