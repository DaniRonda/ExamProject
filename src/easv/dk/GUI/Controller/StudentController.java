package easv.dk.GUI.Controller;

import easv.dk.BE.Citizen;
import easv.dk.BE.GeneralInfo;
import easv.dk.BLL.GeneralInfoManager;
import easv.dk.GUI.Model.CitizenModel;
import easv.dk.GUI.Model.StudentModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.TextField;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class StudentController {
    private final ObservableList<Citizen> dataList = FXCollections.observableArrayList();
    @FXML
    private javafx.scene.control.TextField textFieldSearch2;
    @FXML
    private Button ButtonToCase;
    @FXML
    private Button sendToCaseScreen;
    @FXML
    private Button btnStudentLogOut;
    @FXML
    private Button btnHealthConditions;
    @FXML
    private Button btnFunctionalAbilities;
    @FXML
    private TextField textFieldSearch1;
    @FXML
    private TableView tableViewCitizens;
    @FXML
    private TextArea textAreaGeneralCoping;
    @FXML
    private TextArea textAreaGeneralMotevation;
    @FXML
    private TextArea textAreaGeneralRessources;
    @FXML
    private TextArea textAreaGeneralRoles;
    @FXML
    private TextArea textAreaGeneralHabits;
    @FXML
    private TextArea textAreaGeneralEdu;
    @FXML
    private TextArea textAreaGeneralLifeStory;
    @FXML
    private TextArea textAreaGeneralHealthInfo;
    @FXML
    private TextArea textAreaGeneralAid;
    @FXML
    private TextArea textAreaGeneralFurnice;
    @FXML
    private TextArea textAreaGeneralNetwork;
    @FXML
    private Text textGeneralCoping;
    @FXML
    private Text textGeneralMotevation;
    @FXML
    private Text textGeneralRessources;
    @FXML
    private Text textGeneralRoles;
    @FXML
    private Text textGeneralHabits;
    @FXML
    private Text textGeneralEducation;
    @FXML
    private Text textGeneralLifeStory;
    @FXML
    private Text textGeneralHealth;
    @FXML
    private Text textGeneralAid;
    @FXML
    private Text textGeneralFurnice;
    @FXML
    private Text textGeneralNetwork;
    @FXML
    private Pane infoPane;
    @FXML
    private TextArea textAreaInfo;
    @FXML
    private  TextArea textAreaCase;

    private boolean infoisCreated = false;
    private boolean caseisCreated = false;
    private GeneralInfo generalInfo;
    private Citizen citizen;


    StudentModel studentModel = new StudentModel();




    private final static int CitizenSelected = 0;   //constant
    private int mode = CitizenSelected;

    CitizenModel citizenmodel = new CitizenModel();

    public StudentController() throws Exception {
    }

    public void showCitizenInfo(Citizen citizen1) throws Exception {
        clearLists();
        mode = CitizenSelected;
        Citizen selectedCitizen = (Citizen) tableViewCitizens.getSelectionModel().getSelectedItem();

        citizenmodel.getAllGeneralInfo().forEach(generalInfo1 -> {
            if (generalInfo1.getCitizen() == selectedCitizen.getID()) {
                infoisCreated = true;
                generalInfo = generalInfo1;
            }
        });
        if (!infoisCreated) {
            String placeholder = "empty";
            generalInfo = citizenmodel.createGeneralInfo(placeholder, placeholder, placeholder, placeholder, placeholder, placeholder, placeholder, placeholder, placeholder, placeholder, placeholder, citizen.getID());
        }
        this.citizen = selectedCitizen;


          //get selected movie in movie table
        try {
            GeneralInfoManager bll = new GeneralInfoManager();  //get bll interface to use data from database
                  //load movies for selected category
            textAreaGeneralCoping.setText(String.valueOf(generalInfo.getCoping()));
            textAreaGeneralMotevation.setText(String.valueOf(generalInfo.getMotevation()));
            textAreaGeneralRessources.setText(String.valueOf(generalInfo.getResources()));
            textAreaGeneralRoles.setText(String.valueOf(generalInfo.getRoles()));
            textAreaGeneralHabits.setText(String.valueOf(generalInfo.getHabits()));
            textAreaGeneralEdu.setText(String.valueOf(generalInfo.getEducation()));
            textAreaGeneralLifeStory.setText(String.valueOf(generalInfo.getLifestory()));
            textAreaGeneralHealthInfo.setText(String.valueOf(generalInfo.getHealthinfo()));
            textAreaGeneralAid.setText(String.valueOf(generalInfo.getAid()));
            textAreaGeneralFurnice.setText(String.valueOf(generalInfo.getFurnishing()));
            textAreaGeneralNetwork.setText(String.valueOf(generalInfo.getNetwork()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updatePressed(ActionEvent actionEvent) throws Exception {
        Citizen selectedCitizen = (Citizen) tableViewCitizens.getSelectionModel().getSelectedItem();
        String coping = textAreaGeneralCoping.getText();
        String motivation = textAreaGeneralMotevation.getText();
        String resources = textAreaGeneralRessources.getText();
        String roles = textAreaGeneralRoles.getText();
        String habits = textAreaGeneralHabits.getText();
        String education = textAreaGeneralEdu.getText();
        String lifestory = textAreaGeneralLifeStory.getText();
        String healthinfo = textAreaGeneralHealthInfo.getText();
        String aid = textAreaGeneralAid.getText();
        String furnishing = textAreaGeneralFurnice.getText();
        String network = textAreaGeneralNetwork.getText();
        int citizen = generalInfo.getCitizen();

        GeneralInfo infoToBeUpdated = new GeneralInfo(selectedCitizen.getID(), coping, motivation, resources, roles, habits, education, lifestory, healthinfo, aid, furnishing, network,citizen );
        citizenmodel.updateGeneralInfo(infoToBeUpdated);
    }

    /*public void showCase(Citizen citizen2){
        textAreaCase.clear();
        mode = CitizenSelected;
        Citizen selectedCitizen = (Citizen) tableViewCitizens.getSelectionModel().getSelectedItem();

        citizenmodel.getAllGeneralInfo().forEach(generalInfo1 -> {
            if (generalInfo1.getCitizen() == selectedCitizen.getID()) {
                infoisCreated = true;
                generalInfo = generalInfo1;
            }
        });

    }*/

    public void initialize() throws Exception {
        search();
        setUpTableView();
        tableViewCitizens.setOnMouseClicked(event -> {
            try {
                showCitizenInfo(citizen);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public void sendToCaseScreen(ActionEvent actionEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/CaseView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("New Cases");
        stage.centerOnScreen();
        stage.show();
    }


    public void studentLogOut(ActionEvent actionEvent) throws Exception{

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to log out?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {

            Stage stage = (Stage) btnStudentLogOut.getScene().getWindow();
            stage.close();
        }
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/LogInView.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.setTitle("Log In");
            stage.centerOnScreen();
            stage.show();
        }


    public void openHealthConditionsView(ActionEvent actionEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/HealthConditionsView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Diagnose");
        stage.centerOnScreen();
        stage.show();
        Stage stageThis = (Stage) btnStudentLogOut.getScene().getWindow();
        stageThis.close();
        StudentModel.diagnose = 1;
    }

    public void openFunctionalAbilitiesView(ActionEvent actionEvent) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/HealthConditionsView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Functional Abilities");
        stage.centerOnScreen();
        stage.show();
        StudentModel.diagnose = 2;
    }



    public void search() throws Exception {
        new Thread(() ->{
        textFieldSearch2.textProperty().addListener((observable, oldValue, newValue) -> {

                try {
                    dataList.addAll(citizenmodel.getAllCitizen()); //<-- depending on what name the method gets
                } catch (Exception e) {
                    e.printStackTrace();
                }
                FilteredList<Citizen> filteredData = new FilteredList<>(dataList, b -> true);
                filteredData.setPredicate(citizen -> {
                    if (newValue == null || newValue.isEmpty()) {
                        return true;
                    }
                    String lowerCaseFilter = newValue.toLowerCase();

                    //List<Integer> result = (List<Integer>) filteredData.stream().filter(val -> val.intValue()
                    // > searchBar.textProperty()).collect(Collectors.toList());
                    if (citizen.getFirstName().toLowerCase().contains(lowerCaseFilter))
                        return true; // Filter title.

                    else
                        return String.valueOf(citizen.getLastName()).contains(lowerCaseFilter); //getcase might be changed
                });
                SortedList<Citizen> sortedData = new SortedList<>(filteredData);
                sortedData.comparatorProperty().bind(tableViewCitizens.comparatorProperty());
                tableViewCitizens.setItems(sortedData);
            });
        }).start();

    }


    public void setUpTableView() throws Exception {
        TableColumn<Citizen, String> column1 = new TableColumn<>("First Name");
        column1.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        TableColumn<Citizen, String> column2 = new TableColumn<>("Last Name");
        column2.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        TableColumn<Citizen, String> column3 = new TableColumn<>("Address");
        column3.setCellValueFactory(new PropertyValueFactory<>("address"));
        TableColumn<Citizen, String> column4 = new TableColumn<>("Birthdate");
        column4.setCellValueFactory(new PropertyValueFactory<>("birthDate"));
        TableColumn<Citizen, String> column5 = new TableColumn<>("Phone Number");
        column5.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));

        tableViewCitizens.getColumns().add(column1);
        tableViewCitizens.getColumns().add(column2);
        tableViewCitizens.getColumns().add(column3);
        tableViewCitizens.getColumns().add(column4);
        tableViewCitizens.getColumns().add(column5);

        tableViewCitizens.getItems().clear();
        tableViewCitizens.getItems().addAll(citizenmodel.getAllCitizen());


    }

    private void clearLists(){
    textAreaGeneralCoping.clear();
    textAreaGeneralMotevation.clear();
    textAreaGeneralRessources.clear();
    textAreaGeneralRoles.clear();
    textAreaGeneralHabits.clear();
    textAreaGeneralEdu.clear();
    textAreaGeneralLifeStory.clear();
    textAreaGeneralHealthInfo.clear();
    textAreaGeneralAid.clear();
    textAreaGeneralFurnice.clear();
    textAreaGeneralNetwork.clear();
    }

    public void copingClikced(MouseEvent mouseEvent) {
        if(mouseEvent.getClickCount() == 2){
            textAreaInfo.setText("Citizen's conscious or unconscious\n" +
                    " handling of life/disease - both\n" +
                    " challenges and opportunities");
            infoPane.setDisable(false); infoPane.setVisible(true);
        }
        textGeneralCoping.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                infoPane.setDisable(true); infoPane.setVisible(false);
            }
        });
    }

    public void copingEnter(MouseEvent mouseEvent) {
        textGeneralCoping.setUnderline(true); textGeneralCoping.setUnderline(true);
        textGeneralCoping.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> {
                    textGeneralCoping.setUnderline(false);
                    textGeneralCoping.setUnderline(false);
                });
    }

    public void motivationClicked(MouseEvent mouseEvent) {
        if(mouseEvent.getClickCount() == 2){
            textAreaInfo.setText("The driving force behind that the citizen is acting in\n" +
                    " a certain way or starts in motion\n" +
                    " with/maintains a task/effort.\n");
            infoPane.setDisable(false); infoPane.setVisible(true);
        }
        textGeneralCoping.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                infoPane.setDisable(true); infoPane.setVisible(false);
            }
        });
    }

    public void motivationEnter(MouseEvent mouseEvent) {
        textGeneralMotevation.setUnderline(true); textGeneralMotevation.setUnderline(true);
        textGeneralMotevation.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> {
                    textGeneralMotevation.setUnderline(false);
                    textGeneralMotevation.setUnderline(false);
                });
    }

    public void resourcesClicked(MouseEvent mouseEvent) {
        if(mouseEvent.getClickCount() == 2){
            textAreaInfo.setText("The physical or mental forces that the citizen\n" +
                    "has to a certain extent available and can exploit.\n" +
                    "Physical powers, for example, can be in the form of\n"  +
                    "physical health and strength. Mental powers can, for example, \n" +
                    "be in form of mental health and strength,including thoughts \n" +
                    "and ways of relating to situations and other people.");
            infoPane.setDisable(false); infoPane.setVisible(true);
        }
        textGeneralCoping.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                infoPane.setDisable(true); infoPane.setVisible(false);
            }
        });
    }

    public void resourcesEnter(MouseEvent mouseEvent) {
        textGeneralRessources.setUnderline(true); textGeneralRessources.setUnderline(true);
        textGeneralRessources.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> {
                    textGeneralRessources.setUnderline(false);
                    textGeneralRessources.setUnderline(false);
                });
    }

    public void rolesClicked(MouseEvent mouseEvent) {
        if(mouseEvent.getClickCount() == 2){
            textAreaInfo.setText("The roles that are particularly important to\n" +
                    " the citizen in relation to family, work and\n" +
                    " Society.");
            infoPane.setDisable(false); infoPane.setVisible(true);
        }
        textGeneralCoping.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                infoPane.setDisable(true); infoPane.setVisible(false);
            }
        });
    }

    public void rolesEnter(MouseEvent mouseEvent) {
        textGeneralRoles.setUnderline(true); textGeneralRoles.setUnderline(true);
        textGeneralRoles.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> {
                    textGeneralRoles.setUnderline(false);
                    textGeneralRoles.setUnderline(false);
                });
    }

    public void habitsClicked(MouseEvent mouseEvent) {
        if(mouseEvent.getClickCount() == 2){
            textAreaInfo.setText("Regular behavior as the citizen has\n" +
                    " learned through still repetition and\n" +
                    " execution in whole or in part unconscious.\n" +
                    "Habits are, for example, the circadian rhythm, \n" +
                    "the way to be accused, contact with fellow human beings and\n" +
                    "relationships, way of looking at the world.");
            infoPane.setDisable(false); infoPane.setVisible(true);
        }
        textGeneralCoping.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                infoPane.setDisable(true); infoPane.setVisible(false);
            }
        });
    }

    public void habitsEnter(MouseEvent mouseEvent) {
        textGeneralHabits.setUnderline(true); textGeneralHabits.setUnderline(true);
        textGeneralHabits.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> {
                    textGeneralHabits.setUnderline(false);
                    textGeneralHabits.setUnderline(false);
                });
    }

    public void jobsClicked(MouseEvent mouseEvent) {
        if(mouseEvent.getClickCount() == 2){
            textAreaInfo.setText("Current or previous educational and/or business background.\n" +
                    "eg primary school, vocational education and\n" +
                    "Higher education");
            infoPane.setDisable(false); infoPane.setVisible(true);
        }
        textGeneralCoping.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                infoPane.setDisable(true); infoPane.setVisible(false);
            }
        });
    }

    public void jobsEnter(MouseEvent mouseEvent) {
        textGeneralEducation.setUnderline(true); textGeneralEducation.setUnderline(true);
        textGeneralEducation.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> {
                    textGeneralEducation.setUnderline(false);
                    textGeneralEducation.setUnderline(false);
                });
    }

    public void lifestoryClicked(MouseEvent mouseEvent) {
        if(mouseEvent.getClickCount() == 2){
            textAreaInfo.setText("A description of the citizen's experience of essential events,\n" +
                    "interests and tasks throughout life.");
            infoPane.setDisable(false); infoPane.setVisible(true);
        }
        textGeneralCoping.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                infoPane.setDisable(true); infoPane.setVisible(false);
            }
        });
    }

    public void lifestoryEnter(MouseEvent mouseEvent) {
        textGeneralLifeStory.setUnderline(true); textGeneralLifeStory.setUnderline(true);
        textGeneralLifeStory.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> {
                    textGeneralLifeStory.setUnderline(false);
                    textGeneralLifeStory.setUnderline(false);
                });
    }

    public void healthClicked(MouseEvent mouseEvent) {
        if(mouseEvent.getClickCount() == 2){
            textAreaInfo.setText("Health Information:\n" +
                    " Current or previous illnesses and\n" +
                    " Disability that affect\n" +
                    " Citizen's situation.\n" +
                    " Healthcare contacts\n" +
                    " Employee or entities within\n" +
                    " the Healthcare the Citizen is affiliated to,\n" +
                    " eg ophthalmologist, dentist, foot therapist or\n" +
                    " department/ Ambulatory.");
            infoPane.setDisable(false); infoPane.setVisible(true);
        }
        textGeneralCoping.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                infoPane.setDisable(true); infoPane.setVisible(false);
            }
        });
    }

    public void healthEnter(MouseEvent mouseEvent) {
        textGeneralHealth.setUnderline(true); textGeneralHealth.setUnderline(true);
        textGeneralHealth.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> {
                    textGeneralHealth.setUnderline(false);
                    textGeneralHealth.setUnderline(false);
                });
    }

    public void aidClicked(MouseEvent mouseEvent) {
        if(mouseEvent.getClickCount() == 2){
            textAreaInfo.setText("Equipment, products and technology such as\n" +
                    " used by the citizen in daily\n" +
                    " activities, incl. Such as adapted\n" +
                    " or specially made to, implanted in,\n" +
                    " located on or near the person which\n" +
                    " uses them. (Including ordinary\n" +
                    " objects and aids and technology\n" +
                    " for personal use).");
            infoPane.setDisable(false); infoPane.setVisible(true);
        }
        textGeneralCoping.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                infoPane.setDisable(true); infoPane.setVisible(false);
            }
        });
    }

    public void aidEnter(MouseEvent mouseEvent) {
        textGeneralAid.setUnderline(true); textGeneralAid.setUnderline(true);
        textGeneralAid.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> {
                    textGeneralAid.setUnderline(false);
                    textGeneralAid.setUnderline(false);
                });
    }

    public void furniceClicked(MouseEvent mouseEvent) {
        if(mouseEvent.getClickCount() == 2){
            textAreaInfo.setText("A description of the physical framework of the home\n" +
                    " and surroundings that have an impact on\n" +
                    " the Citizen's everyday life and functioning.");
            infoPane.setDisable(false); infoPane.setVisible(true);
        }
        textGeneralCoping.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                infoPane.setDisable(true); infoPane.setVisible(false);
            }
        });
    }

    public void furniceEnter(MouseEvent mouseEvent) {
        textGeneralFurnice.setUnderline(true); textGeneralFurnice.setUnderline(true);
        textGeneralFurnice.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> {
                    textGeneralFurnice.setUnderline(false);
                    textGeneralFurnice.setUnderline(false);
                });
    }

    public void networkClicked(MouseEvent mouseEvent) {
        if(mouseEvent.getClickCount() == 2){
            textAreaInfo.setText("A description of the physical framework of the home\n" +
                    " and surroundings that have an impact on\n" +
                    " the Citizen's everyday life and functioning.\n" +
                    "A public network consists of personal\n" +
                    " helpers, healthcare professionals and other\n" +
                    " Professionals Primarily Care providers.\n" +
                    " Private network is family, relative,\n" +
                    " friends and acquaintances.");
            infoPane.setDisable(false); infoPane.setVisible(true);
        }
        textGeneralCoping.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                infoPane.setDisable(true); infoPane.setVisible(false);
            }
        });
    }

    public void networkEnter(MouseEvent mouseEvent) {
        textGeneralNetwork.setUnderline(true); textGeneralNetwork.setUnderline(true);
        textGeneralNetwork.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> {
                    textGeneralNetwork.setUnderline(false);
                    textGeneralNetwork.setUnderline(false);
                });
    }



}




