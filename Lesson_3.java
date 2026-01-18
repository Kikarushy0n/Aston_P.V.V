public class Lesson_3 {
    public static void main(String[] args) {
            Dog dog = new Dog("Носферату");
            dog.run(1000);
            dog.swim(5);
            Cat cat = new Cat("Гатс");
            Cat cat2 = new Cat("Гриффит");
            Cat cat3 = new Cat("Каска");
            Cat cat4 = new Cat("Ширке");
            cat.run(150);
            cat.swim();

            Cat[] catlist = new Cat[4];

            catlist[0] = cat;
            catlist[1] = cat2;
            catlist[2] = cat3;
            catlist[3] = cat4;

            System.out.printf("Создано животных:%d \n", Animal.GetAnimalCount());
            System.out.printf("Создано котов:%d \n", Cat.GetCatCount());
            System.out.printf("Создано собак:%d \n", Dog.GetDogCount());
            Bowl bowl = new Bowl(10);
            for (Cat cata : catlist) {
                if (bowl.cats_eat(cata.GetMealNeed())) {
                    cata.SetFull(true);
                }
                boolean full = cata.GetFull();
                if (full != true) {
                    System.out.printf("%s голоден\n", cata.name);
                } else {
                    System.out.printf("%s сыт\n", cata.name);
                }
            }
            bowl.add_meal(200);
            for (Cat cata : catlist) {
                if (bowl.cats_eat(cata.GetMealNeed())) {
                    cata.SetFull(true);
                }
                boolean full = cata.GetFull();
                if (full != true) {
                    System.out.printf("%s голоден\n", cata.name);
                } else {
                    System.out.printf("%s сыт\n", cata.name);
                }
            }

        }
    }

    class Animal {
        String name;
        private static int animal_count = 0;

        public Animal(String name) {
            this.name = name;
            animal_count++;
        }

        public static int GetAnimalCount() {
            return animal_count;
        }
    }

    class Dog extends Animal {
        private static int dog_count = 0;

        public Dog(String name) {
            super(name);
            dog_count++;
        }


        public void run(Integer distance) {
            if (distance <= 500) {
                System.out.printf("%s пробежал %d м\n", name, distance);
            } else {
                System.out.println("Не пробежал");
            }
        }

        public void swim(Integer distance) {
            if (distance <= 10) {
                System.out.printf("%s проплыл %d м\n", name, distance);
            } else {
                System.out.println("Не проплыл");
            }
        }

        public static int GetDogCount() {
            return dog_count;
        }
    }

    class Cat extends Animal {
        private static int cat_count = 0;
        private boolean full = false;
        private static int meal_need = 20;

        public Cat(String name) {
            super(name);
            cat_count++;
        }

        public void run(Integer distance) {
            if (distance <= 200) {
                System.out.printf("%s пробежал %d м\n", name, distance);
            } else {
                System.out.println("Не пробежал");
            }
        }

        public void swim() {
            System.out.printf("%s Не проплыл\n", name);
        }

        public static int GetCatCount() {
            return cat_count;
        }

        public void SetFull(boolean full) {
            this.full = full;
        }

        public boolean GetFull() {
            return full;
        }

        public int GetMealNeed() {
            return meal_need;
        }
    }

    class Bowl {
        static int meal_count;

        public Bowl(int meal_count) {
            this.meal_count = meal_count;
        }

        public void add_meal(int Meal_add) {
            meal_count = meal_count + Meal_add;
        }

        public boolean cats_eat(int meal_need) {
            if (meal_count >= meal_need) {
                meal_count = meal_count - meal_need;
                return true;
            } else {
                return false;
            }
        }
    }

