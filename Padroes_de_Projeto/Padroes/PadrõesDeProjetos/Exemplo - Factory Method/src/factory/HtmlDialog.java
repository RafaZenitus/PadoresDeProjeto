package factory;

import buttons.Button;
import buttons.HtmlButton;

/**
 * A caixa de di�logo HTML produzir� bot�es HTML.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}