package abstractFactoryDesignPattern.abstractFactory;

import abstractFactoryDesignPattern.products.abstractProducts.Button;
import abstractFactoryDesignPattern.products.abstractProducts.ScrollBar;

public interface UIFactory {
    Button createButton();
    ScrollBar createScrollBar();
}
