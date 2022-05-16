package easv.dk.BLL;

import easv.dk.BE.Admin;
import easv.dk.BE.Student;
import easv.dk.BE.Teacher;

public class loginHelper {
    private static Admin admin;
    private static Student student;
    private static  Teacher teacher;

    public static Admin getInstance(Admin theadmin)
    {
        if(admin==null)
        {
            admin = theadmin;
        }
        return admin;
    }

    public static Student getInstanceStudent(Student thestudent)
    {
        if(student==null)
        {
            student = thestudent;
        }
        return student;
    }

    public static Teacher getInstanceTeacher(Teacher theteacher)
    {
        if(teacher==null)
        {
            teacher = theteacher;
        }
        return teacher;
    }



}
