public class Main {
    public static void main(String[] args) {
        // Создайте обобщенный класс, который содержит метод chekTheClass().
        // Суть этого метода - получить имя класса объекта, который вы передаёте в качестве параметра.
        // Метод, соответственно, тоже обобщенный.

        Generics<String> generics = new Generics<>("generics");
        generics.chekTheClass(generics.getName());
    }
}