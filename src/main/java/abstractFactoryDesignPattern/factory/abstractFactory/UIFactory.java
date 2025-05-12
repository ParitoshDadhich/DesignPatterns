package abstractFactoryDesignPattern.factory.abstractFactory;

import abstractFactoryDesignPattern.product.abstractProducts.Button;
import abstractFactoryDesignPattern.product.abstractProducts.ScrollBar;

public interface UIFactory {
    Button createButton();
    ScrollBar createScrollBar();
}
