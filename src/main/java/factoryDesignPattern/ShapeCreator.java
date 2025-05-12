package factoryDesignPattern;

// Single functional interface - Will be used in creating any numbers of parameterized constructors;
@FunctionalInterface
public interface ShapeCreator {
    public Shape create(Object... args);
}

/*
You lose some type safety (casting from Object...), but it’s usually fine if handled carefully.

If they ask about type safety, you can follow up with:
“For better type safety in production, we could use generics or method overloading, but for the sake of clarity and time, this version demonstrates the core pattern effectively.”

 */