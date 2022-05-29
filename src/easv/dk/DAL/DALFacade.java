package easv.dk.DAL;
import easv.dk.BE.*;
import java.util.List;


public class DALFacade implements IDataAccess {

    private static IDataAccess instance; //Singleton instance
    AdminDAO adminDAO = new AdminDAO();
    CitizenDAO citizenDAO = new CitizenDAO();
    StudentDAO studentDAO = new StudentDAO();
    TeacherDAO teacherDAO = new TeacherDAO();
    CitizenStudentDAO citizenStudentDAO = new CitizenStudentDAO();
    CaseDAO caseDAO = new CaseDAO();
    CitizenGeneralInfoDAO citizenGeneralInfoDAO = new CitizenGeneralInfoDAO();
    FunctionalDiagnoseDAO functionalDiagnoseDAO = new FunctionalDiagnoseDAO();
    HealthConditionDAO healthConditionDAO = new HealthConditionDAO();
    TemplatesDAO templatesDAO = new TemplatesDAO();


    public DALFacade() throws Exception {
    }

    public static IDataAccess getInstance() throws Exception {
        if (instance == null) {
            instance = new DALFacade();
        }
        return instance;
    }

    @Override
    public void createCitizen(Citizen citizen) throws Exception {
        citizenDAO.createCitizen(citizen);
    }

    @Override
    public Student createStudent(String firstName, String lastName, String email, String password) throws Exception {
        studentDAO.CreateStudent(firstName, lastName, email, password);
        return null;
    }

    @Override
    public Teacher createTeacher(Teacher teacher) throws Exception {
        teacherDAO.createTeacher(teacher);
        return teacher;
    }

    @Override
    public void createCitizenStudent(CitizenStudent citizenStudent) throws Exception {
        citizenStudentDAO.createCitizenStudent(citizenStudent);
    }

    @Override
    public Case createCase(String caseText, int citizen) throws Exception {
        caseDAO.createCase(caseText, citizen);
        return null;
    }

    @Override
    public GeneralInfo createGeneralInfo(String coping, String motivation, String resources, String roles, String habits, String education, String lifestory, String healthinfo, String aid, String furnishing, String network, int citizen) throws Exception {
        citizenGeneralInfoDAO.createGeneralInfo(coping, motivation, resources, roles, habits, education, lifestory, healthinfo, aid, furnishing, network, citizen);
        return null;
    }

    @Override
    public FunctionalDiagnose createFunctionalDiagnose(String profnote, String currentass, String anticipatedlvl, String followupdate, String observenote, int currlvl, int expectedlvl, String wishes, int citizen, int functionaltype) throws Exception {
        functionalDiagnoseDAO.createFunctionalDiagnose(profnote, currentass, anticipatedlvl, followupdate, observenote, currlvl, expectedlvl, wishes, citizen, functionaltype);
        return null;
    }

    @Override
    public void createHealthCondition(String profnote, String currentass, String anticipatedlvl, String followupdate, String observenote, int citizen, int healthtype) throws Exception {
        healthConditionDAO.createHealthCondition(profnote, currentass, anticipatedlvl, followupdate, observenote, citizen, healthtype);
    }

    @Override
    public void createTemplate(Template template) throws Exception {
        templatesDAO.createTemplate(template);
    }


    @Override
    public void deleteCitizen(Citizen citizen) throws Exception {
        citizenDAO.deleteCitizen(citizen);
    }

    @Override
    public void deleteStudent(Student student) throws Exception {
        studentDAO.deleteStudent(student);
    }

    @Override
    public void deleteTeacher(Teacher teacher) throws Exception {
        teacherDAO.deleteTeacher(teacher);
    }

    @Override
    public void removeCitizenFromStudent(Citizen citizen, Student student) throws Exception {
        citizenStudentDAO.removeCitizenFromStudent(citizen, student);
    }


    @Override
    public List<Admin> getAllAdmin() throws Exception {
        return adminDAO.getAllAdmin();
    }

    @Override
    public List<Citizen> getAllCitizens() throws Exception {
        return citizenDAO.getAllCitizens();
    }

    @Override
    public List<Student> getAllStudents() throws Exception {
        return studentDAO.getAllStudent();
    }

    @Override
    public List<Teacher> getAllTeachers() throws Exception {
        return teacherDAO.getAllTeacher();
    }

    @Override
    public List<CitizenStudent> getAllCitizenStudents() throws Exception {
        return citizenStudentDAO.getAllCitizenStudent();
    }

    @Override
    public List<Student> getStudentFromCitizen(Citizen citizen) throws Exception {
        return citizenStudentDAO.getStudentFromCitizen(citizen);
    }

    @Override
    public List<Citizen> getCitizenFromStudent(Student student) throws Exception {
        return citizenStudentDAO.getAllCitizensForGivenStudent(student);
    }

    @Override
    public List<Case> getAllCases() throws Exception {
        return caseDAO.getAllCases();
    }

    @Override
    public List<GeneralInfo> getAllGeneralInfo() throws Exception {
        return citizenGeneralInfoDAO.getAllGeneralInfo();
    }

    @Override
    public Case getCase(int idCase) throws Exception {
        return caseDAO.getCase(idCase);
    }

    @Override
    public GeneralInfo getGeneralInfo(int idGeneralInfo) throws Exception {
        return citizenGeneralInfoDAO.getGeneralInfo(idGeneralInfo);
    }

    @Override
    public List<FunctionalDiagnose> getAllFunctionalDiagnose() throws Exception {
        return functionalDiagnoseDAO.getAllFunctionalDiagnose();
    }

    @Override
    public FunctionalDiagnose getFunctionalDiagnose(int idFunctionalDiagnose) throws Exception {
        return functionalDiagnoseDAO.getFunctionalDiagnose(idFunctionalDiagnose);
    }

    @Override
    public List<HealthDiagnose> getAllHealthDiagnose() throws Exception {
        return healthConditionDAO.getAllHealthDiagnose();
    }

    @Override
    public HealthDiagnose getHealthDiagnose(int idHealthDiagnose) throws Exception {
        return healthConditionDAO.getHealthDiagnose(idHealthDiagnose);
    }

    @Override
    public List<Template> getAllTemplates() throws Exception {
        return templatesDAO.getAllTemplates();
    }


    @Override
    public void saveUpdateCitizen(Citizen citizen) throws Exception {
        citizenDAO.updateCitizen(citizen);
    }

    @Override
    public void saveUpdateStudent(Student student) throws Exception {
        studentDAO.saveUpdateStudent(student);
    }

    @Override
    public void saveUpdateTeacher(Teacher teacher) throws Exception {
        teacherDAO.saveUpdateTeacher(teacher);
    }

    @Override
    public void updateCase(Case case1) throws Exception {
        caseDAO.updateCase(case1);
    }

    @Override
    public void updateGeneralInfo1(GeneralInfo generalInfo) throws Exception {
        citizenGeneralInfoDAO.updateGeneralInfo1(generalInfo);
    }

    @Override
    public void updateFunctionalDiagnose(FunctionalDiagnose functionalDiagnose) throws Exception {
        functionalDiagnoseDAO.updateFunctionalDiagnose(functionalDiagnose);
    }

    @Override
    public void updateHealthDiagnose(HealthDiagnose healthDiagnose) throws Exception {
        healthConditionDAO.updateHealthDiagnose(healthDiagnose);
    }

    @Override
    public void updateTemplate(Template template) throws Exception {
        templatesDAO.updateTemplate(template);
    }

    @Override
    public Admin getAdminLogin(String email, String password) throws Exception {
        return adminDAO.getAdminLogin(email, password);
    }

    @Override
    public Teacher getTeacherLogin(String email, String password) throws Exception {
        return teacherDAO.getTeacherLogin(email, password);
    }

    @Override
    public Student getStudentLogin(String email, String password) throws Exception {
        return studentDAO.getStudentLogin(email, password);
    }


    @Override
    public void AddCitizenToStudent(Citizen citizen, Student student) throws Exception {
        citizenStudentDAO.AddCitizenToStudent(citizen, student);
    }


}