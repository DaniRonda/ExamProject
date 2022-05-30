package easv.dk.DAL;

import easv.dk.BE.*;

import java.util.List;

public interface IDataAccess {
    void createCitizen(Citizen citizen) throws Exception;


    Student createStudent(String firstName,String lastName, String email, String password) throws Exception;

    Teacher createTeacher(Teacher teacher) throws Exception;

    void createCitizenStudent(CitizenStudent citizenStudent) throws Exception;

    Case createCase(String caseText, int citizen) throws Exception;

    GeneralInfo createGeneralInfo(String coping, String motivation, String resources, String roles, String habits, String education, String lifestory, String healthinfo, String aid, String furnishing, String network, int citizen) throws Exception;

    FunctionalDiagnose createFunctionalDiagnose(String profnote, String currentass, String anticipatedlvl, String followupdate, String observenote, int currlvl, int expectedlvl, String wishes, int citizen, int functionaltype) throws Exception;

    void createHealthCondition(String profnote, String currentass, String anticipatedlvl, String followupdate, String observenote, int citizen, int healthtype) throws Exception;

    void createTemplate(Template template) throws Exception;

    void deleteCitizen(Citizen citizen) throws Exception;

    void deleteStudent(Student student) throws Exception;

    void deleteTeacher(Teacher teacher) throws Exception;

    void removeCitizenFromStudent(Citizen citizen, Student student) throws Exception;

    List<Admin> getAllAdmin() throws Exception;

    List<Citizen> getAllCitizens() throws Exception;

    List<Student> getAllStudents() throws Exception;

    List<Teacher> getAllTeachers() throws Exception;

    List<CitizenStudent> getAllCitizenStudents() throws Exception;

    List<Student> getStudentFromCitizen(Citizen citizen) throws Exception;

    List<Citizen> getCitizenFromStudent(Student student) throws Exception;

    List<Case> getAllCases() throws Exception;

    List<GeneralInfo> getAllGeneralInfo() throws Exception;

    Case getCase(int idCase) throws Exception;

    GeneralInfo getGeneralInfo(int idGeneralInfo) throws Exception;

    List<FunctionalDiagnose> getAllFunctionalDiagnose() throws Exception;

    FunctionalDiagnose getFunctionalDiagnose(int idFunctionalDiagnose) throws Exception;

    List<HealthDiagnose> getAllHealthDiagnose() throws Exception;

    HealthDiagnose getHealthDiagnose(int idHealthDiagnose) throws Exception;

    List<Template> getAllTemplates() throws Exception;

    void saveUpdateCitizen(Citizen citizen) throws Exception;

    void saveUpdateStudent(Student student) throws Exception;

    void saveUpdateTeacher(Teacher teacher) throws Exception;

    void updateCase(Case case1) throws Exception;

    void updateGeneralInfo1(GeneralInfo generalInfo) throws Exception;

    void updateFunctionalDiagnose(FunctionalDiagnose functionalDiagnose) throws Exception;

    void updateHealthDiagnose(HealthDiagnose healthDiagnose) throws Exception;

    void updateTemplate(Template template) throws Exception;

    Admin getAdminLogin(String email, String password) throws Exception;

    Teacher getTeacherLogin(String email, String password) throws Exception;

    Student getStudentLogin(String email, String password) throws Exception;

    void AddCitizenToStudent(Citizen citizen, Student student) throws Exception;
}
