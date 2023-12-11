public class Generics <T> {
    private T name;

    public Generics(T name) {
        this. name = name;
    }

    public T getName() {
        return name;
    }

    public void chekTheClass(T name) {
        System.out.println("Имя класса: " + (T) name.getClass().getName());
    }
}
