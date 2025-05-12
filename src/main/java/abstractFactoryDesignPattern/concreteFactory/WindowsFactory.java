package abstractFactoryDesignPattern.concreteFactory;

import abstractFactoryDesignPattern.abstractFactory.UIFactory;
import abstractFactoryDesignPattern.products.abstractProducts.Button;
import abstractFactoryDesignPattern.products.abstractProducts.ScrollBar;
import abstractFactoryDesignPattern.products.concreteProducts.WindowsButton;
import abstractFactoryDesignPattern.products.concreteProducts.WindowsScrollBar;

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
