public class Lesson_2 {
    static class Park {
        static class Attractions {
            String name1;
            String time;
            int cost;

            public Attractions(String name1, String time, int cost) {
                this.name1 = name1;
                this.time = time;
                this.cost = cost;
            }

            public void showInfo() {
                System.out.println("Аттракцион: " + name1);
                System.out.println("Время работы: " + time);
                System.out.println("Стоимость: " + cost + " руб.");
                System.out.println("------------------------");
            }
        }
    }

    static class Product {
        String name;
        String date;
        String manufacturer;
        String country;
        double price;
        boolean booked;

        Product(String name, String date, String manufacturer, String country, double price, boolean booked) {
            this.name = name;
            this.date = date;
            this.manufacturer = manufacturer;
            this.country = country;
            this.price = price;
            this.booked = booked;
        }

        void InfOutput() {
            System.out.println("Товар: " + name);
            System.out.println("Дата производства: " + date);
            System.out.println("Производитель: " + manufacturer);
            System.out.println("Страна: " + country);
            System.out.println("Цена: " + price + "рублей");

            if (booked) {
                System.out.println("Статус: забронировано");
            } else {
                System.out.println("Статус: свободен");
            }
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {
        Product[] shop = new Product[5];

        shop[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Electronics", "Южная Корея", 38000, true);

        shop[1] = new Product("iPhone 16 Pro Max", "15.09.2024",
                "Apple Inc.", "Китай/США", 120000, false);

        shop[2] = new Product("Xiaomi 15 Pro", "10.10.2025",
                "Xiaomi", "Китай", 80000, false);

        shop[3] = new Product("Google Pixel 10", "20.08.2025",
                "Google", "США/Вьетнам", 95000, true);

        shop[4] = new Product("iPhone 17 Pro", "18.09.2025",
                "Apple Inc.", "Китай/США", 108000, false);

        System.out.println("=== ТОВАРЫ В МАГАЗИНЕ ===\n");
        for (int i = 0; i < shop.length; i++) {
            System.out.println("Товар №" + (i + 1));
            shop[i].InfOutput();
        }

        Park.Attractions rollerCoaster = new Park.Attractions("Американские горки", "10:00 - 20:00", 250);
        Park.Attractions carousel = new Park.Attractions("Карусель", "10:00 - 19:00", 100);
        Park.Attractions wheel = new Park.Attractions("Колесо обозрения", "11:00 - 21:00", 150);

        rollerCoaster.showInfo();
        carousel.showInfo();
        wheel.showInfo();
    }
}






