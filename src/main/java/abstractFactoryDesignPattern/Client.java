package abstractFactoryDesignPattern;

import abstractFactoryDesignPattern.factory.abstractFactory.UIFactory;
import abstractFactoryDesignPattern.factory.concreteFactory.MacOSFactory;
import abstractFactoryDesignPattern.product.abstractProducts.Button;
import abstractFactoryDesignPattern.product.abstractProducts.ScrollBar;

public class Client {
    private Button button;
    private ScrollBar scrollBar;
    private UIComponentsConfig config;

    Client(UIFactory factory, UIComponentsConfig config){
        this.button = factory.createButton();
        this.scrollBar = factory.createScrollBar();
        this.config = config;
    }

    public void renderUI(){
        button.render(config);
        scrollBar.scroll(config);
    }

    public static void main(String[] args) {
        UIComponentsConfig macConfig = new UIComponentsConfig("Submit", "Dark", 8, 3);
        UIFactory macFactory = new MacOSFactory();
        Client macApp = new Client(macFactory, macConfig);
        macApp.renderUI();

        System.out.println();

        UIComponentsConfig windowsConfig = new UIComponentsConfig("Submit", "Light", 5, 10);
        UIFactory windowsFactory = new MacOSFactory();
        Client windowsApp = new Client(windowsFactory, macConfig);
        windowsApp.renderUI();
    }
}
