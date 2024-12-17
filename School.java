package school.management.system;

import java.util.List;

/**
 * The school can have many teacher, many students.
 * Implements teachers and students using
 * an arraylist.
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object is created.
     * @param students List of students in the school.
     * @param teachers List of teachers in the school.
     */

    public School(List<Student> students, List<Teacher> teachers) {
        this.students = students;
        this.teachers = teachers;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    /**
     *
     * @return The list of teachers in the school
     */

    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the school.
     * @param teacher The teacher to be addes
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return The list of students int he school.
     */

    public List<Student> getStudents() {
        return students;
    }

    /**
     * Adds a student to the school
     * @param student the student to be added.
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     *
     * @return The total money earned by the school.
     */

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money by the school.
     * @param MoneyEarned money that is supposed to
     * be added.
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money spent by the school
     */

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * Update the money that is spent by the school
     * Which is the salary give by the school
     * to its teachers.
     * @param moneySpent The money spent by school.
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned-=moneySpent;
    }
}
