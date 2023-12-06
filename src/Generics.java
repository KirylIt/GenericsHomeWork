public class Generics <T> {
    private T name;

    public Generics(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void СhekTheClass() {
        System.out.println(name.getClass().getName().toString());
    }
}
