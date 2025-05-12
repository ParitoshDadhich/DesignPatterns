package abstractFactoryDesignPattern.factory.concreteFactory;

import abstractFactoryDesignPattern.factory.abstractFactory.UIFactory;
import abstractFactoryDesignPattern.product.abstractProducts.Button;
import abstractFactoryDesignPattern.product.abstractProducts.ScrollBar;
import abstractFactoryDesignPattern.product.concreteProducts.MacOSButton;
import abstractFactoryDesignPattern.product.concreteProducts.MacOSScrollBar;

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
