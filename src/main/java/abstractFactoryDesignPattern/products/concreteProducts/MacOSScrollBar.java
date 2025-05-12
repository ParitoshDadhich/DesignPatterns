package abstractFactoryDesignPattern.products.concreteProducts;

import abstractFactoryDesignPattern.UIComponentsConfig;
import abstractFactoryDesignPattern.products.abstractProducts.ScrollBar;

public class MacOSScrollBar implements ScrollBar {
    @Override
    public void scroll(UIComponentsConfig config) {
        System.out.println("Scrolling MacOS scrollbar with sensitivity: " + config.scrollSensitivity + " and speed: " + config.scrollSpeed);
    }
}
