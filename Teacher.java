package school.management.system;

/**
 * Created by Sankar on 12/16/24.
 * This class is responsible for keeping track
 * of teacher's id, name and salary.
 */

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new Teacher object.
     * @param id id for the teacher.
     * @param name name of the teacher
     * @param salary salary of the teacher.
     */

    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    /**
     *
     * @return To return the id of the teacher.
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return To return the name of the teacher.
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return To return the salary of the Teacher.
     */

    public int getSalary(){
        return salary;
    }

    /**
     * To set the salary
     * @param salary
     */
    public void setSalary(int salary){
        this.salary=salary;
    }

    /**
     * Adds to the salaryEarned
     * Removes from the total money earned by the school.
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);

    }

    @Override
    public String toString() {
        return "Name of the Teacher: "+ name+ " Total salary earned so far $"+ salaryEarned;
    }
}
