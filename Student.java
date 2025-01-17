/*-------------------------------------------------------------
//AUTHOR: Caleb Ewer
//FILENAME: Student
//SPECIFICATION: Setter and Getter file for the student info
//FOR: CSE 110 - Lab #9
//TIME SPENT: 1.5 hours
//-----------------------------------------------------------*/
public class Student
{
private double sGrade;
    private int numUpdated;
    private int numAccessed;
    private String sFullName;
    private String sAsuID;
    
    // Setting the Full Name
    void setFullName(String FullName)
    {
        sFullName = FullName;
        numUpdated++;  
    }
    
    // Setting the ID
    void setId(String Id)
    {
        sAsuID = Id;  
        numUpdated++;
    }
    
    // Setting the Grade
    void setGrade(double Grade)
    {
        sGrade = Grade;
        numUpdated++;
    }
    
    
    
    // Setting the full name
    String getFullName()
    {
        numAccessed++;
        return sFullName;
    }
    
    // Getting the ID
    String getId()
    {
        numAccessed++;
        return sAsuID;
    }
    
    // Getting the Grade
    double getGrade()
    {
        numAccessed++;
        return sGrade;
    }
    
    // Getting the numUpdated
    int getNumUpdated()
    {
        numAccessed++;
        return numUpdated;
    }
    
    // Getting the numAccessed
    int getNumAccessed()
    {
        numAccessed++;
        return numAccessed;
    }
}
