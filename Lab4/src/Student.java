public class Student {
    private final String name;
    private final String surname;
    private final int gradeBookNumber;
    private final Faculty faculty;
    private final Status status;

    public Student(String name, String surname, int gradeBookNumber, Faculty faculty, Status status) {
        this.name = name;
        this.surname = surname;
        this.gradeBookNumber = gradeBookNumber;
        this.faculty = faculty;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getGradeBookNumber() {
        return gradeBookNumber;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public Status getStatus() {
        return status;
    }
}
