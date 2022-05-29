package easv.dk.GUI.Controller;
import easv.dk.BE.Citizen;
import easv.dk.BE.Student;
import easv.dk.BLL.Manager;
import easv.dk.GUI.Model.CitizenModel;
import easv.dk.GUI.Model.StudentModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.util.List;

public class TeacherViewController {
    @FXML
    private TableView studentTable;
    @FXML
    private Button btnDeleteStudent;
    @FXML
    private Button btnNewStudent;
    @FXML
    private Button btnEditStudent;
    @FXML
    private Button btnEditCitizen;
    @FXML
    private ListView assignedStudents;
    @FXML
    private Button btnCitizenToStudent;
    @FXML
    private Button btnOpenTemplateView;
    @FXML
    private Button btnOpenCaseView;
    @FXML
    private TableView citizenTable;
    @FXML
    private Button btnDeleteCitizen;
    @FXML
    private Button btnNewCitizen;
    @FXML
    private Button btnTeacherLogOut;

    StudentModel studentModel = new StudentModel();
    CitizenModel citizenModel = new CitizenModel();
    private final static int StudentSelected = 0;
    private final static int CitizenSelected = 1;
    private int mode = StudentSelected;

    public TeacherViewController() throws Exception {
    }

    @FXML
    public void initialize() throws Exception {
        setUpCitizenTable();
        setUpStudentTable();
        studentTable.setOnMouseClicked(event -> showStudentCitizenInList());
        citizenTable.setOnMouseClicked(event -> showCitizenStudentInList());

    }

    public void teacherLogOut(ActionEvent actionEvent) throws Exception {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to log out?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {

            Stage stage = (Stage) btnTeacherLogOut.getScene().getWindow();
            stage.close();
        }

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/LogInView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public void openNewCitizenView(ActionEvent actionEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/NewCitizenView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public void openEditCitizenView(ActionEvent actionEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/EditCitizenView.fxml"));
        Parent root = loader.load();
        EditCitizenViewController control = loader.getController();
        control.setInfo((Citizen) citizenTable.getSelectionModel().getSelectedItem());
        control.setParentController(this);
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public void openNewStudentView(ActionEvent actionEvent) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/NewStudentView.fxml"));
        Parent root = loader.load();
        NewStudentViewController control = loader.getController();
        control.setInfo((Student) studentTable.getSelectionModel().getSelectedItem());
        control.setTeacherController(this);
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public void openEditStudentView(ActionEvent actionEvent)throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/EditStudentView.fxml"));
        Parent root = loader.load();
        EditStudentViewController control = loader.getController();
        control.setInfo((Student) studentTable.getSelectionModel().getSelectedItem());
        control.setTeacherController(this);
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public void openTemplateView(ActionEvent actionEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/TemplateView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();
    }

    public void openCaseView(ActionEvent actionEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/CaseView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.show();

    }

    public void deleteCitizen(ActionEvent actionEvent) throws Exception {
        citizenModel.deleteCitizen((Citizen)citizenTable.getSelectionModel().getSelectedItem());
        citizenTable.getItems().remove(citizenTable.getSelectionModel().getSelectedIndex());
    }

    public void deleteStudent(ActionEvent actionEvent) throws Exception {
        studentModel.deleteStudent((Student)studentTable.getSelectionModel().getSelectedItem());
        studentTable.getItems().remove(studentTable.getSelectionModel().getSelectedIndex());
    }

    public void setUpStudentTable() throws Exception {
        TableColumn<Student, String> column1 = new TableColumn<>("First Name");
        column1.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        TableColumn<Student, String> column2 = new TableColumn<>("Last Name");
        column2.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        TableColumn<Student, String> column3 = new TableColumn<>("Email");
        column3.setCellValueFactory(new PropertyValueFactory<>("email"));
        studentTable.getColumns().clear();
        studentTable.getColumns().add(column1);
        studentTable.getColumns().add(column2);
        studentTable.getColumns().add(column3);
        studentTable.getItems().clear();
        studentTable.getItems().addAll(studentModel.getAllStudents1());
    }

    public void setUpCitizenTable() throws Exception {
        TableColumn<Citizen, String> column1 = new TableColumn<>("First Name");
        column1.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        TableColumn<Citizen, String> column2 = new TableColumn<>("Last Name");
        column2.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        citizenTable.getColumns().clear();
        citizenTable.getColumns().add(column1);
        citizenTable.getColumns().add(column2);
        citizenTable.getItems().clear();
        citizenTable.getItems().addAll(citizenModel.getAllCitizens1());
    }

    public void addCitizenToStudent(ActionEvent actionEvent) {
        if (citizenTable.getSelectionModel().getSelectedIndex() != -1 && studentTable.getSelectionModel().getSelectedIndex() != -1) {
            try {
                citizenModel.addToCitizen((Citizen) citizenTable.getSelectionModel().getSelectedItem(), citizenTable.getSelectionModel().getSelectedIndex(), (Student) studentTable.getSelectionModel().getSelectedItem());
                showStudentCitizenInList();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    public void removeStudents(ActionEvent actionEvent) throws Exception {
        Student selectedStudent;
        Citizen selectedCitizen;
        if (mode == StudentSelected) {
            selectedStudent = (Student) studentTable.getSelectionModel().getSelectedItem();
            selectedCitizen = assignedStudents.getItems().size() > 0 ? (Citizen) assignedStudents.getItems().get(0) : null;
        } else {
            selectedStudent = assignedStudents.getItems().size() > 0 ? (Student) assignedStudents.getItems().get(0) : null;
            selectedCitizen = (Citizen) citizenTable.getSelectionModel().getSelectedItem();
        }
        removeStudentFromCitizen(selectedStudent, selectedCitizen);
        assignedStudents.getItems().clear();
    }
    private void removeStudentFromCitizen (Student selectedStudent, Citizen selectedCitizen) throws Exception {
        if (selectedStudent == null || selectedCitizen == null) return;
        try {
            Manager manager = new Manager();
            manager.removeStudentFromCitizen(selectedStudent.getId(), selectedCitizen.getID());
            initialize();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    public void showStudentCitizenInList() {
        clearListView();
        mode = StudentSelected;
        Student selectedStudent = (Student) studentTable.getSelectionModel().getSelectedItem();
        try {
            Manager manager = new Manager();
            List<Citizen> citizens = manager.getCitizensFromStudent(selectedStudent);
            assignedStudents.getItems().addAll(citizens);
               } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void showCitizenStudentInList()  {
        clearListView();
        mode = CitizenSelected;
        Citizen selectedCitizen = (Citizen) citizenTable.getSelectionModel().getSelectedItem();
        try {
            Manager manager = new Manager();
            List<Student> students = manager.getStudentFromCitizen(selectedCitizen);
            assignedStudents.getItems().addAll(students);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clearListView() {
        assignedStudents.getItems().clear();
    }
}
