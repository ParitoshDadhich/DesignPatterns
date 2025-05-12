package abstractFactoryDesignPattern.product.concreteProducts;

import abstractFactoryDesignPattern.UIComponentsConfig;
import abstractFactoryDesignPattern.product.abstractProducts.ScrollBar;

public class WindowsScrollBar implements ScrollBar {
    @Override
    public void scroll(UIComponentsConfig config) {
        System.out.println("Scrolling Windows scrollbar with sensitivity: " + config.scrollSensitivity + " and speed: " + config.scrollSpeed);
    }
}
