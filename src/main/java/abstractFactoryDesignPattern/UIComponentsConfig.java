package abstractFactoryDesignPattern;

public class UIComponentsConfig {
    public String label;
    String theme;
    public int scrollSensitivity;
    public int scrollSpeed;

    public UIComponentsConfig(String label, String theme, int scrollSensitivity, int scrollSpeed){
        this.label = label;
        this.theme = theme;
        this.scrollSensitivity = scrollSensitivity;
        this.scrollSpeed = scrollSpeed;
    }
}
