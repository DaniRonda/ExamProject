package easv.dk.BLL;

import easv.dk.BE.Citizen;
import easv.dk.BE.Student;

public interface IManager {
    void addCitizenToStudent(Citizen selectedItem, Student selectedStudent) throws Exception;
}
