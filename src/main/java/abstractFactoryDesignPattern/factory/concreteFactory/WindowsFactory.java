package abstractFactoryDesignPattern.factory.concreteFactory;

import abstractFactoryDesignPattern.factory.abstractFactory.UIFactory;
import abstractFactoryDesignPattern.product.abstractProducts.Button;
import abstractFactoryDesignPattern.product.abstractProducts.ScrollBar;
import abstractFactoryDesignPattern.product.concreteProducts.WindowsButton;
import abstractFactoryDesignPattern.product.concreteProducts.WindowsScrollBar;

public class WindowsFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new WindowsScrollBar();
    }
}
