package abstractFactoryDesignPattern.product.concreteProducts;

import abstractFactoryDesignPattern.UIComponentsConfig;
import abstractFactoryDesignPattern.product.abstractProducts.Button;

public class WindowsButton implements Button {
    @Override
    public void render(UIComponentsConfig config) {
        System.out.println("Rendering windows button with label: " + config.label);
    }
}
