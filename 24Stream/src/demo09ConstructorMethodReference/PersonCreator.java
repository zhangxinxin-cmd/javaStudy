package demo09ConstructorMethodReference;
@FunctionalInterface
public interface PersonCreator {
    Person createPerson(String name);
}
