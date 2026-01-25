import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lesson_5 {

    static class Student {
        String name;
        String group;
        int course;
        Map<String, Integer> grades;

        public Student(String name, String group, int course, Map<String, Integer> grades) {
            this.name = name;
            this.group = group;
            this.course = course;
            this.grades = grades;
        }

        public double getAverageGrade() {
            if (grades.isEmpty()) return 0;
            double sum = 0;
            for (int grade : grades.values()) {
                sum += grade;
            }
            return sum / grades.size();
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        Map<String, Integer> g1 = new HashMap<>();
        g1.put("Math", 4);
        g1.put("IT", 5);
        students.add(new Student("Гатс", "A-1", 1, g1));

        Map<String, Integer> g2 = new HashMap<>();
        g2.put("Math", 2);
        g2.put("IT", 2);
        students.add(new Student("Гриффит", "B-2", 2, g2));

        Map<String, Integer> g3 = new HashMap<>();
        g3.put("Math", 3);
        g3.put("IT", 4);
        students.add(new Student("Каска", "C-3", 3, g3));

        processStudents(students);

        System.out.println("Студенты на курсе 2:");
        printStudents(students, 2);

        System.out.println("Студенты на курсе 4:");
        printStudents(students, 4);
    }

    public static void processStudents(List<Student> students) {
        for (int i = students.size() - 1; i >= 0; i--) {
            Student s = students.get(i);
            if (s.getAverageGrade() < 3) {
                students.remove(i);
            } else {
                s.course++;
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (Student s : students) {
            if (s.course == course) {
                System.out.println(s.name);
            }
        }
    }
}