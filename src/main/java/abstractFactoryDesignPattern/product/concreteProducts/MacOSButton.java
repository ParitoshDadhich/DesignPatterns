package abstractFactoryDesignPattern.product.concreteProducts;

import abstractFactoryDesignPattern.UIComponentsConfig;
import abstractFactoryDesignPattern.product.abstractProducts.Button;

public class MacOSButton implements Button {
    @Override
    public void render(UIComponentsConfig config) {
        System.out.println("Render MacOS button with label: " + config.label);
    }
}
