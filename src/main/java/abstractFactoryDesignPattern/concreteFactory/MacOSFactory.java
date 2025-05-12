package abstractFactoryDesignPattern.concreteFactory;

import abstractFactoryDesignPattern.abstractFactory.UIFactory;
import abstractFactoryDesignPattern.products.abstractProducts.Button;
import abstractFactoryDesignPattern.products.abstractProducts.ScrollBar;
import abstractFactoryDesignPattern.products.concreteProducts.MacOSButton;
import abstractFactoryDesignPattern.products.concreteProducts.MacOSScrollBar;

public class MacOSFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new MacOSScrollBar();
    }
}
