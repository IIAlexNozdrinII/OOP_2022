import java.util.Arrays;
import java.util.Comparator;

public class Main {
    static void printStudent(Student[] students) {      //Метод для виведення об'єктів класу Student
        System.out.printf("%9s%12s%9s%14s%10s\n", "Name", "Surname", "Faculty", "Grade Book №", "Status");
        for (Student student : students) {
            System.out.printf("%9s%12s%9s%14s%10s\n",
                    student.getName(),
                    student.getSurname(),
                    student.getFaculty(),
                    student.getGradeBookNumber(),
                    student.getStatus());
        }
        System.out.println();
    }


    public static void main(String[] args) {
        /*
        Lab4
        C11 = (10) Визначити клас студент, який складається як мінімум з 5-и полів.
        */

        Student[] students = {                              //Задаємо об'єкти за допомогою конструктора
                new Student("Killian", "Martinez", 1216, Faculty.FBB, Status.BUDGET),
                new Student("Dalton", "Cooper", 1225, Faculty.FCE, Status.BUDGET),
                new Student("Felipe", "Scott", 2414, Faculty.FIOT, Status.BUDGET),
                new Student("Fredrick", "Sanders", 2407, Faculty.FCE, Status.CONTRACT),
                new Student("Xander", "Roberts", 7611, Faculty.FBB, Status.BUDGET),
                new Student("Wells", "Garcia", 7603, Faculty.FSL, Status.CONTRACT),
                new Student("Pippa", "Williams", 4802, Faculty.FCT, Status.BUDGET),
                new Student("Bella", "Stewart", 4809, Faculty.FIOT, Status.CONTRACT),
                new Student("Bonnie", "Richardson", 1130, Faculty.FBB, Status.BUDGET),
                new Student("Ariana", "Rogers", 1124, Faculty.FAM, Status.BUDGET),
        };

//        Сортуємо за першим полем
        Arrays.sort(students, Comparator.comparing(Student::getName));
        System.out.println("Sorted by Name:");
        printStudent(students);

//        Сортуємо (в зворотному порядку) за четвертим полем
        Arrays.sort(students, Comparator.comparingInt(Student::getGradeBookNumber).reversed());
        System.out.println("Sorted by Grade Book № (in reverse):");
        printStudent(students);
    }
}
