/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgSMS;

/**
 *
 * @author simte
 */
public final class Student
{
    private String StudentID;
    private String FullName;
    private String MobileNumber;
    //
    public Student()
    {

    }

    //
    public Student(String StudentID, String FullName, String MobileNumber)
    {
        setStudentID(StudentID);
        setFullName(FullName);
        setMobileNumber(MobileNumber);
    }

    //
    public void setStudentID(String StudentID)
    {
        this.StudentID = StudentID;
    }
    public void setFullName(String FullName)
    {
        this.FullName = FullName;
    }
    public void setMobileNumber(String MobileNumber)
    {
        this.MobileNumber = MobileNumber;
    }

    //
    public String getStudentID()
    {
        return this.StudentID;
    }
    public String getFullName()
    {
        return this.FullName;
    }
    public String getMobileNumber()
    {
        return this.MobileNumber;
    }
}
