package factoryDesignPattern;

import java.util.HashMap;
import java.util.Map;

// Factory using varags + registry
public class ShapeFactory {
    private static final Map<String, ShapeCreator> registry = new HashMap<>();

    static {
        registry.put("circle", (args) -> new Circle((int) args[0]));
        registry.put("rectangle", (args) -> new Rectangle((int) args[0], (int)args[1]));
        registry.put("nodimension", (args)-> new NoDimensionEntity());
    }

    public static Shape create(String type, Object... args){
        ShapeCreator creator = registry.get(type.toLowerCase());
        if(creator == null){
            throw new IllegalArgumentException("Unknown shape!");
        }

        return creator.create(args);
    }
}
