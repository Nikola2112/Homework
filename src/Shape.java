// Базовый класс для фигуры Shape
public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Метод для вывода имени фигуры
    public void printName() {
        System.out.println("This shape is called " + getName());
    }
}

