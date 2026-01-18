public class Lesson_3_1 {
    interface Shape {
        double perimeter();
        double area();
        String fillColor = "белый";
        String borderColor = "чёрный";

        default void printInfo() {
            System.out.println("Периметр: " + perimeter());
            System.out.println("Площадь: " + area());
            System.out.println("Цвет заливки: " + fillColor);
            System.out.println("Цвет границы: " + borderColor);
            System.out.println("------------------------");
        }
    }

    static class Circle implements Shape {
        double radius;
        String fillColor = "голубой";
        String borderColor = "красный";

        public Circle(double radius) {
            this.radius = radius;
        }

        public double perimeter() {
            return 2 * Math.PI * radius;
        }

        public double area() {
            return Math.PI * radius * radius;
        }
    }

    static class Rectangle implements Shape {
        double width;
        double height;
        String fillColor = "зелёный";
        String borderColor = "жёлтый";

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double perimeter() {
            return 2 * (width + height);
        }

        public double area() {
            return width * height;
        }
    }

    static class Triangle implements Shape {
        double a, b, c;
        String fillColor = "оранжевый";
        String borderColor = "фиолетовый";

        public Triangle(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public double perimeter() {
            return a + b + c;
        }

        public double area() {
            double p = perimeter() / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
    }

        public static void main(String[] args) {
            Circle circle = new Circle(5);
            Rectangle rectangle = new Rectangle(4, 6);
            Triangle triangle = new Triangle(3, 4, 5);

            System.out.println("Круг");
            circle.printInfo();

            System.out.println("Прямоугольник");
            rectangle.printInfo();

            System.out.println("Треугольник");
            triangle.printInfo();
        }
    }
