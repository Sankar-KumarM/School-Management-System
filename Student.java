package school.management.system;

/**
 * Created by Sankar on 12/16/2024.
 * This class is responsible for keep the
 * track of students fees, name, grade & fees
 * paid.
 */

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To Create a new Student by initializing.
     * Fees for every student is going to be $30000.
     * Fees paid initially is 0.
     * @param id is for the student: unique.
     * @param name of the student
     * @param grade grade of the student.
     */

    public Student(int id, String name,
                   int grade){
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;

    }

    //Not going to alter student's name,student's id.

    /**
     * Used to update the student's grade.
     * @param grade new grade of the student.
     */

    public void setGrade(int grade){
        this.grade=grade;
    }

    /**
     * Keep adding the fees to feesPaid field.
     * Add the fees to the fees paid
     * The school is going to receive the funds.
     *
     * @param fees the fees that the student pays
     */
    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     *
     * @return To return id of the student.
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return To return the name of the student.
     */
    public String getName(){
        return name;
    }

    /**
     *
     * @return To return the grade of the student.
     */

    public int getGrade(){
        return grade;
    }

    /**
     *
     * @return To return the fees paid by the student.
     */
    public int getFeesPaid(){
        return feesPaid;
    }

    /**
     *
     * @return To return the total fees of the student.
     */
    public int getFeesTotal(){
        return feesTotal;
    }

    /**
     * @return the remaining fees.
     */
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: "+name+" Total fees paid so far $"+feesPaid;
    }
}
