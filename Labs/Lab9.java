/*-------------------------------------------------------------
//AUTHOR: Caleb Ewer
//FILENAME: Lab#9
//SPECIFICATION: Main file for the student info
//FOR: CSE 110 - Lab #9
//TIME SPENT: 1.5 hours
//-----------------------------------------------------------*/

public class Lab9
{
    public static void main(String[] args)
    {
        String sFullName, sAsuID;
        double sGrade;
        int numUpdated = 0, numAccessed = 0;

        /* Read some input data */
        sFullName = "Foo Bar";
        sAsuID = "10291029";
        sGrade = 5.9;

        /* Create a Student object "student1" */
        Student student1 = new Student();

        /* Update the object state */
        student1.setFullName(sFullName);
        student1.setId(sAsuID);
        student1.setGrade(sGrade);

        System.out.println("student1's name is " + student1.getFullName());
        System.out.println("student1's ID is " + student1.getId());
        System.out.println("student1's grade is " + student1.getGrade());
        System.out.println();
        System.out.println("In student1, numUpdated = " + student1.getNumUpdated());
        System.out.println("In student1, numAccessed = " + student1.getNumAccessed());
        System.out.println();
        System.out.println("In main, numUpdated = " + numUpdated);
        System.out.println("In main, numAccessed = " + numAccessed);
        System.out.println();
    }
}
