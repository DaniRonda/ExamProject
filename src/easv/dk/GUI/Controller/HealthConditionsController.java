package easv.dk.GUI.Controller;

import easv.dk.GUI.Model.StudentModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;



public class HealthConditionsController {

    @FXML
    private VBox vboxHealth;
    @FXML
    private VBox vboxfunction;
    @FXML
    private VBox VBoxFunctionLevel;
    @FXML
    private VBox vboxMovementapperatus;
    @FXML
    private VBox vboxConsumtion;
    @FXML
    private VBox vboxSkin;
    @FXML
    private VBox vboxCommunication;
    @FXML
    private VBox vboxPshyco;
    @FXML
    private VBox vboxResparation;
    @FXML
    private VBox vboxSexuality;
    @FXML
    private VBox vboxPain;
    @FXML
    private VBox vboxSleep;
    @FXML
    private VBox vboxInsight;
    @FXML
    private VBox vboxWastes;
    @FXML
    private VBox vboxSelfCare;
    @FXML
    private VBox vboxPracticalWork;
    @FXML
    private VBox vboxMobility;
    @FXML
    private VBox vboxMentalFunction;
    @FXML
    private VBox vboxSocialLife;
    @FXML
    private Label labelSelectedCategory;
    @FXML
    private Label labelSelectedSubCategory;
    @FXML
    private Button buttonClientsWishes;
    @FXML
    private RadioButton radiobuttonActive;
    @FXML
    private RadioButton radiobuttonPotential;
    @FXML
    private RadioButton radiobuttonNotRelevant;
    @FXML
    private ComboBox ChoiceBoxAnticLvl;
    @FXML
    private Label labelSelectedCategory1;
    @FXML
    private Label labelSelectedSubCategory1;
    @FXML
    private Pane paneInfo;
    @FXML
    private Text textInfo;
    @FXML
    private RadioButton radiButtonCurrent0;
    @FXML
    private RadioButton radiButtonCurrent1;
    @FXML
    private RadioButton radiButtonCurrent2;
    @FXML
    private RadioButton radiButtonCurrent3;
    @FXML
    private RadioButton radiButtonCurrent4;
    @FXML
    private RadioButton radiButtonExpected0;
    @FXML
    private RadioButton radiButtonExpected1;
    @FXML
    private RadioButton radiButtonExpected2;
    @FXML
    private RadioButton radiButtonExpected3;
    @FXML
    private RadioButton radiButtonExpected4;
    @FXML
    private Button btnLogOut;
    @FXML
    private Button buttonHealth;
    @FXML
    private Button buttonToFunctional;
    @FXML
    private Button buttonReturn2;
    @FXML
    private Button buttonSaveGoals;
    @FXML
    private Button buttonSave;
    @FXML
    private Label labelFunctionLevel;
    @FXML
    private AnchorPane anchorYellow;
    @FXML
    private AnchorPane diagnoseAnchor;
    @FXML
    private AnchorPane anchorGoals;
    @FXML
    private TextArea textAreaGoals;
    @FXML
    private Label labelMovementApperatus;
    @FXML
    private Label labelNutrition;
    @FXML
    private Label labelSkin;
    @FXML
    private Label labelComunication;
    @FXML
    private Label labelPshyco;
    @FXML
    private Label labelCirkulation;
    @FXML
    private Label labelSSexuality;
    @FXML
    private Label labelPains;
    @FXML
    private Label labelSleep;
    @FXML
    private Label labelKnowledge;
    @FXML
    private Label labelWaste;
    @FXML
    private Label labelSelfCare;
    @FXML
    private Label labelPracticalWork;
    @FXML
    private Label labelMobility;
    @FXML
    private Label labelMentalFunctions;
    @FXML
    private Label labelSocialLife;
    @FXML
    private Label labelFunctionLevel1;
    @FXML
    private Label labelFunctionLevel2;
    @FXML
    private Label labelMovementapperatus11;
    @FXML
    private Label labelMovementapperatus12;
    @FXML
    private Label labelConsumtion1;
    @FXML
    private Label labelConsumtion2;
    @FXML
    private Label labelConsumtion3;
    @FXML
    private Label labelConsumtion4;
    @FXML
    private Label labelConsumtion5;
    @FXML
    private Label labelSkin1;
    @FXML
    private Label labelSkin2;
    @FXML
    private Label labelSkin3;
    @FXML
    private Label labelSkin4;
    @FXML
    private Label labelSkin5;
    @FXML
    private Label labelSkin6;
    @FXML
    private Label labelSkin7;
    @FXML
    private Label labelSkin8;
    @FXML
    private Label labelSkin91;
    @FXML
    private Label labelSkin92;
    @FXML
    private Label labelCommunication;
    @FXML
    private Label labelPshyco1;
    @FXML
    private Label labelPshyco2;
    @FXML
    private Label labelPshyco3;
    @FXML
    private Label labelPshyco4;
    @FXML
    private Label labelResparation1;
    @FXML
    private Label labelResparation2;
    @FXML
    private Label labelSexuality;
    @FXML
    private Label labelPain1;
    @FXML
    private Label labelPain2;
    @FXML
    private Label labelPain3;
    @FXML
    private Label labelPain4;
    @FXML
    private Label labelPain5;
    @FXML
    private Label labelPain6;
    @FXML
    private Label labelPain7;
    @FXML
    private Label labelPain8;
    @FXML
    private Label labelSleep1;
    @FXML
    private Label labelSleep2;
    @FXML
    private Label labelInsight1;
    @FXML
    private Label labelInsight21;
    @FXML
    private Label labelInsight22;
    @FXML
    private Label labelInsight3;
    @FXML
    private Label labelInsight4;
    @FXML
    private Label labelWaste1;
    @FXML
    private Label labelWaste2;
    @FXML
    private Label labelWaste3;
    @FXML
    private Label labelWaste41;
    @FXML
    private Label labelWaste42;
    @FXML
    private Label labelWaste5;
    @FXML
    private Label labelselfcare1;
    @FXML
    private Label labelselfcare2;
    @FXML
    private Label labelselfcare3;
    @FXML
    private Label labelselfcare4;
    @FXML
    private Label labelselfcare5;
    @FXML
    private Label labelselfcare6;
    @FXML
    private Label labelselfcare7;
    @FXML
    private Label labelselfcare8;
    @FXML
    private Label labelParcticalWork1;
    @FXML
    private Label labelParcticalWork2;
    @FXML
    private Label labelParcticalWork3;
    @FXML
    private Label labelParcticalWork4;
    @FXML
    private Label labelMobility1;
    @FXML
    private Label labelMobility2;
    @FXML
    private Label labelMobility3;
    @FXML
    private Label labelMobility4;
    @FXML
    private Label labelMobility5;
    @FXML
    private Label labelMobility6;
    @FXML
    private Label labelMobility7;
    @FXML
    private Label labelMobility8;
    @FXML
    private Label labelMentalFunction11;
    @FXML
    private Label labelMobility9;
    @FXML
    private Label labelMentalFunction12;
    @FXML
    private Label labelMentalFunction2;
    @FXML
    private Label labelMentalFunction3;
    @FXML
    private Label labelMentalFunction4;
    @FXML
    private Label labelMentalFunction5;
    @FXML
    private Label labelMentalFunction6;
    @FXML
    private Label labelMentalFunction7;
    @FXML
    private Label labelMentalFunction8;
    @FXML
    private Label labelSocialLife1;

    StudentModel studentModel = new StudentModel();

    String selectedDiagnose;
    ObservableList<String> choiceBoxOptions = FXCollections.observableArrayList("Lessens", "Remains the same", "Disappearing");

    public HealthConditionsController() throws Exception {

    }
    ToggleGroup groupCurrent = new ToggleGroup();
    ToggleGroup groupExpected = new ToggleGroup();
    @FXML
    private void initialize() {
        ToggleGroup group = new ToggleGroup();
        radiobuttonPotential.setToggleGroup(group);
        radiobuttonActive.setToggleGroup(group);
        radiobuttonNotRelevant.setToggleGroup(group);


        radiButtonCurrent0.setToggleGroup(groupCurrent);
        radiButtonCurrent1.setToggleGroup(groupCurrent);
        radiButtonCurrent2.setToggleGroup(groupCurrent);
        radiButtonCurrent3.setToggleGroup(groupCurrent);
        radiButtonCurrent4.setToggleGroup(groupCurrent);


        radiButtonExpected0.setToggleGroup(groupExpected);
        radiButtonExpected1.setToggleGroup(groupExpected);
        radiButtonExpected2.setToggleGroup(groupExpected);
        radiButtonExpected3.setToggleGroup(groupExpected);
        radiButtonExpected4.setToggleGroup(groupExpected);

        ChoiceBoxAnticLvl.setItems(choiceBoxOptions);
        if(StudentModel.diagnose == 1){
            vboxfunction.setVisible(true); vboxfunction.setDisable(false);
            vboxHealth.setVisible(false); vboxHealth.setDisable(true);
            anchorYellow.setVisible(true); anchorYellow.setDisable(false);
            selectedDiagnose = "functionalDiagnose";
            labelSelectedCategory.setText("Category");
            labelSelectedSubCategory.setText("SubCategory");
            buttonClientsWishes.setVisible(true); buttonClientsWishes.setDisable(false);
        diagnoseAnchor.setStyle("-fx-background-color:  #FFF5CA;");}

        else{
        vboxHealth.setVisible(true);
        vboxHealth.setDisable(false);
        vboxfunction.setVisible(false);
        vboxfunction.setDisable(true);
        selectedDiagnose = "healthDiagnose";
        labelSelectedCategory.setText("Category");
        labelSelectedSubCategory.setText("SubCategory");
        buttonClientsWishes.setVisible(false);
        buttonClientsWishes.setDisable(true);
            diagnoseAnchor.setStyle("-fx-background-color:   #E3ECF8;");
    }
        System.out.println(StudentModel.diagnose);
    }

    private void ifIsArmed(){



    }





    public void clearAll(){
    VBoxFunctionLevel.setVisible(false);
    VBoxFunctionLevel.setDisable(true);
    vboxMovementapperatus.setVisible(false);
    vboxMovementapperatus.setDisable(true);
    vboxConsumtion.setVisible(false);
    vboxConsumtion.setDisable(true);
    vboxSkin.setVisible(false);
    vboxSkin.setDisable(true);
    vboxCommunication.setVisible(false);
    vboxCommunication.setDisable(true);
    vboxPshyco.setVisible(false);
    vboxPshyco.setDisable(true);
    vboxResparation.setVisible(false);
    vboxResparation.setDisable(true);
    vboxSexuality.setVisible(false);
    vboxSexuality.setDisable(true);
    vboxPain.setVisible(false);
    vboxPain.setDisable(true);
    vboxSleep.setVisible(false);
    vboxSleep.setDisable(true);
    vboxInsight.setVisible(false);
    vboxInsight.setDisable(true);
    vboxWastes.setVisible(false);
    vboxWastes.setDisable(true);
    vboxSelfCare.setVisible(false);
    vboxSelfCare.setDisable(true);
    vboxPracticalWork.setVisible(false);
    vboxPracticalWork.setDisable(true);
    vboxMobility.setVisible(false);
    vboxMobility.setDisable(true);
    vboxMentalFunction.setVisible(false);
    vboxMentalFunction.setDisable(true);
    vboxSocialLife.setVisible(false);
    vboxSocialLife.setDisable(true);
    }

    private void clearGroup(){
        radiButtonCurrent0.setSelected(false);
        radiButtonCurrent1.setSelected(false);
        radiButtonCurrent2.setSelected(false);
        radiButtonCurrent3.setSelected(false);
        radiButtonCurrent4.setSelected(false);
        radiButtonExpected0.setSelected(false);
        radiButtonExpected1.setSelected(false);
        radiButtonExpected2.setSelected(false);
        radiButtonExpected3.setSelected(false);
        radiButtonExpected4.setSelected(false);
    }

    public void sendToCaseScreen(ActionEvent actionEvent) throws Exception {
    anchorGoals.setVisible(true); anchorGoals.setDisable(false);}

    public void returnFromGoals(ActionEvent actionEvent) {
        clearGroup();
        textAreaGoals.setText("");
    anchorGoals.setVisible(false); anchorGoals.setDisable(true);
    }

    public void logOut(ActionEvent actionEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/LogInView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Log In");
        stage.centerOnScreen();
        stage.show();
        Stage thisStage = (Stage) btnLogOut.getScene().getWindow();
        thisStage.close();
    }

    public void Return(ActionEvent actionEvent) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/StudentView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Student View");
        stage.centerOnScreen();
        stage.show();
        Stage thisStage = (Stage) btnLogOut.getScene().getWindow();
        thisStage.close();
    }
    public void saveClient(ActionEvent actionEvent) {
        System.out.println("save");
    }

    public void saveClientGoals(ActionEvent actionEvent) {
        System.out.println("saveGoal");
    }

    public void toFunctional(ActionEvent actionEvent) {
        clearAll();
        vboxfunction.setVisible(true); vboxfunction.setDisable(false);
        vboxHealth.setVisible(false); vboxHealth.setDisable(true);
        selectedDiagnose = "functionalDiagnose";
        labelSelectedCategory.setText("Category");
        labelSelectedSubCategory.setText("SubCategory");
        buttonClientsWishes.setVisible(true); buttonClientsWishes.setDisable(false);
        anchorYellow.setVisible(true); anchorYellow.setDisable(false);
        diagnoseAnchor.setStyle("-fx-background-color:  #FFF5CA;");
    }

    public void mouseOverToHealthBtn(MouseEvent mouseEvent) {
        buttonHealth.setStyle("-fx-border-color: #212121; -fx-background-color: #DEDEDE; -fx-border-radius: 15; -fx-background-radius: 15;");
        buttonHealth.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> buttonHealth.setStyle("-fx-border-color: #8D8D8D; -fx-background-color: #D3D3D3; -fx-border-radius: 15; -fx-background-radius: 15;"));
    }

    public void toHealth(ActionEvent actionEvent) {
        clearAll();
        vboxHealth.setVisible(true); vboxHealth.setDisable(false);
        vboxfunction.setVisible(false); vboxfunction.setDisable(true);
        selectedDiagnose = "healthDiagnose";
        labelSelectedCategory.setText("Category");
        labelSelectedSubCategory.setText("SubCategory");
        buttonClientsWishes.setVisible(false); buttonClientsWishes.setDisable(true);
        anchorYellow.setVisible(false); anchorYellow.setDisable(true);
        diagnoseAnchor.setStyle("-fx-background-color:   #E3ECF8;");
    }

    public void mouseOverToFunctionalBtn(MouseEvent mouseEvent) {
        buttonToFunctional.setStyle("-fx-border-color: #212121; -fx-background-color: #DEDEDE; -fx-border-radius: 15; -fx-background-radius: 15;");
        buttonToFunctional.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> buttonToFunctional.setStyle("-fx-border-color: #8D8D8D; -fx-background-color: #D3D3D3; -fx-border-radius: 15; -fx-background-radius: 15;"));
    }

    public void toClientsWishesScreen(ActionEvent actionEvent) throws IOException {
        if(labelSelectedCategory.equals ("Category") && labelSelectedSubCategory.equals("SubCategory")){
            System.out.println("Select Category and SubCategory");
        }
        else {
            labelSelectedCategory1.setText(labelSelectedCategory.getText());
            labelSelectedSubCategory1.setText(labelSelectedSubCategory.getText());
            anchorGoals.setVisible(true); anchorGoals.setDisable(false);
        }
    }

    public void goalReturnEntered(MouseEvent mouseEvent) {
        buttonReturn2.setStyle("-fx-border-color: #212121; -fx-background-color: #E6E6E6; -fx-border-radius: 15; -fx-background-radius: 15;");
        buttonReturn2.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> buttonReturn2.setStyle("-fx-border-color: #8D8D8D; -fx-background-color:  #ECECEC; -fx-border-radius: 15; -fx-background-radius: 15;"));
    }

    public void goalSaveEntered(MouseEvent mouseEvent) {
        buttonSaveGoals.setStyle("-fx-border-color: #212121; -fx-background-color: #E6E6E6; -fx-border-radius: 15; -fx-background-radius: 15;");
        buttonSaveGoals.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> buttonSaveGoals.setStyle("-fx-border-color: #8D8D8D; -fx-background-color:  #ECECEC; -fx-border-radius: 15; -fx-background-radius: 15;"));
    }

    public void saveEntered(MouseEvent mouseEvent) {
        buttonSave.setStyle("-fx-border-color: #212121; -fx-background-color: #E6E6E6; -fx-border-radius: 15; -fx-background-radius: 15;");
        buttonSave.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> buttonSave.setStyle("-fx-border-color: #8D8D8D; -fx-background-color:  #ECECEC; -fx-border-radius: 15; -fx-background-radius: 15;"));
    }

    public void clientsWishesEntered(MouseEvent mouseEvent) {
        buttonClientsWishes.setStyle("-fx-border-color: #212121; -fx-background-color: #E6E6E6; -fx-border-radius: 15; -fx-background-radius: 15;");
        buttonClientsWishes.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> buttonClientsWishes.setStyle("-fx-border-color: #8D8D8D; -fx-background-color:  #ECECEC; -fx-border-radius: 15; -fx-background-radius: 15;"));
    }

    public void functionLevelCLiscke(MouseEvent mouseEvent) {
        clearAll(); VBoxFunctionLevel.setVisible(true); VBoxFunctionLevel.setDisable(false);  labelSelectedCategory.setText("Functionlevel"); labelSelectedSubCategory.setText("SubCategory");
    }

    public void mouseOverFunction(MouseEvent mouseEvent) {
        labelFunctionLevel.setUnderline(true);
        labelFunctionLevel.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelFunctionLevel.setUnderline(false));
    }


    public void cilckedApperatus(MouseEvent mouseEvent) {
        clearAll(); vboxMovementapperatus.setVisible(true); vboxMovementapperatus.setDisable(false); labelSelectedCategory.setText("Movement Apparatus"); labelSelectedSubCategory.setText("SubCategory");
    }

    public void mouseOverApperatus(MouseEvent mouseEvent) {
        labelMovementApperatus.setUnderline(true);
        labelMovementApperatus.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelMovementApperatus.setUnderline(false));
    }

    public void nutritionClicked(MouseEvent mouseEvent) {
        clearAll(); vboxConsumtion.setVisible(true); vboxConsumtion.setDisable(false); labelSelectedCategory.setText("Nutrition"); labelSelectedSubCategory.setText("SubCategory");
    }

    public void mouseOverNutrtion(MouseEvent mouseEvent) {
        labelNutrition.setUnderline(true);
        labelNutrition.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelNutrition.setUnderline(false));
    }

    public void skinClicked(MouseEvent mouseEvent) {
        clearAll(); vboxSkin.setVisible(true); vboxSkin.setDisable(false); labelSelectedCategory.setText("Skin and membranes"); labelSelectedSubCategory.setText("SubCategory");
    }

    public void skinEntered(MouseEvent mouseEvent) {
        labelSkin.setUnderline(true);
        labelSkin.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelSkin.setUnderline(false));
    }

    public void communicationClicked(MouseEvent mouseEvent) {
        clearAll(); vboxCommunication.setVisible(true); vboxCommunication.setDisable(false); labelSelectedCategory.setText("Communication"); labelSelectedSubCategory.setText("SubCategory");
    }

    public void communicationEntered(MouseEvent mouseEvent) {
        labelComunication.setUnderline(true);
        labelComunication.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelComunication.setUnderline(false));
    }

    public void pshycoClicked(MouseEvent mouseEvent) {
        clearAll(); vboxPshyco.setVisible(true); vboxPshyco.setDisable(false); labelSelectedCategory.setText("Psychosocial relationships"); labelSelectedSubCategory.setText("SubCategory");
    }

    public void pshycoEntered(MouseEvent mouseEvent) {
        labelPshyco.setUnderline(true);
        labelPshyco.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelPshyco.setUnderline(false));
    }

    public void respoClicked(MouseEvent mouseEvent) {
        clearAll(); vboxResparation.setVisible(true); vboxResparation.setDisable(false); labelSelectedCategory.setText("Respiration and circulation"); labelSelectedSubCategory.setText("SubCategory");
    }

    public void respoEntered(MouseEvent mouseEvent) {
        labelCirkulation.setUnderline(true);
        labelCirkulation.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelCirkulation.setUnderline(false));
    }

    public void sexualityClicked(MouseEvent mouseEvent) {
        clearAll(); vboxSexuality.setVisible(true); vboxSexuality.setDisable(false); labelSelectedCategory.setText("Sexuality"); labelSelectedSubCategory.setText("SubCategory");
    }

    public void sexualityEntered(MouseEvent mouseEvent) {
        labelSSexuality.setUnderline(true);
        labelSSexuality.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelSSexuality.setUnderline(false));
    }

    public void painsClicked(MouseEvent mouseEvent) {
        clearAll(); vboxPain.setVisible(true); vboxPain.setDisable(false); labelSelectedCategory.setText("Pains and senses"); labelSelectedSubCategory.setText("SubCategory");
    }

    public void painsEntered(MouseEvent mouseEvent) {
        labelPains.setUnderline(true);
        labelPains.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelPains.setUnderline(false));
    }

    public void sleepClicked(MouseEvent mouseEvent) {
        clearAll(); vboxSleep.setVisible(true); vboxSleep.setDisable(false); labelSelectedCategory.setText("Sleep and rest"); labelSelectedSubCategory.setText("SubCategory");
    }

    public void sleepEntered(MouseEvent mouseEvent) {
        labelSleep.setUnderline(true);
        labelSleep.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelSleep.setUnderline(false));
    }

    public void knowledgeClicked(MouseEvent mouseEvent) {
        clearAll(); vboxInsight.setVisible(true); vboxInsight.setDisable(false); labelSelectedCategory.setText("knowledge and development"); labelSelectedSubCategory.setText("SubCategory");
    }

    public void knowledgeEntered(MouseEvent mouseEvent) {
        labelKnowledge.setUnderline(true);
        labelKnowledge.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelKnowledge.setUnderline(false));
    }

    public void wastesClicked(MouseEvent mouseEvent) {
        clearAll(); vboxWastes.setVisible(true); vboxWastes.setDisable(false); labelSelectedCategory.setText("Excrement of wastes"); labelSelectedSubCategory.setText("SubCategory");
    }

    public void wastesEntered(MouseEvent mouseEvent) {
        labelWaste.setUnderline(true);
        labelWaste.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelWaste.setUnderline(false));
    }

    public void selfcareClicked(MouseEvent mouseEvent) {
        clearAll(); vboxSelfCare.setVisible(true); vboxSelfCare.setDisable(false); labelSelectedCategory.setText("Selfcare"); labelSelectedSubCategory.setText("SubCategory");
    }

    public void selfcareEntered(MouseEvent mouseEvent) {
        labelSelfCare.setUnderline(true);
        labelSelfCare.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelSelfCare.setUnderline(false));
    }

    public void practicalClicked(MouseEvent mouseEvent) {
        clearAll(); vboxPracticalWork.setVisible(true); vboxPracticalWork.setDisable(false); labelSelectedCategory.setText("Practical work"); labelSelectedSubCategory.setText("SubCategory");
    }

    public void pacticalEntered(MouseEvent mouseEvent) {
        labelPracticalWork.setUnderline(true);
        labelPracticalWork.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelPracticalWork.setUnderline(false));
    }

    public void mobilityClicked(MouseEvent mouseEvent) {
        clearAll(); vboxMobility.setVisible(true); vboxMobility.setDisable(false); labelSelectedCategory.setText("Mobility"); labelSelectedSubCategory.setText("SubCategory");
    }

    public void mobilityEntered(MouseEvent mouseEvent) {
        labelMobility.setUnderline(true);
        labelMobility.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelMobility.setUnderline(false));
    }

    public void mentalClicked(MouseEvent mouseEvent) {
        clearAll(); vboxMentalFunction.setVisible(true); vboxMentalFunction.setDisable(false); labelSelectedCategory.setText("Mental functions"); labelSelectedSubCategory.setText("SubCategory");
    }

    public void mentalEntered(MouseEvent mouseEvent) {
        labelMentalFunctions.setUnderline(true);
        labelMentalFunctions.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelMentalFunctions.setUnderline(false));
    }

    public void socialClicked(MouseEvent mouseEvent) {
        clearAll(); vboxSocialLife.setVisible(true); vboxSocialLife.setDisable(false); labelSelectedCategory.setText("Social life"); labelSelectedSubCategory.setText("SubCategory");
    }

    public void socialEntered(MouseEvent mouseEvent) {
        labelSocialLife.setUnderline(true);
        labelSocialLife.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelSocialLife.setUnderline(false));
    }

    public void functionLevel1Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with personal care");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has problems with selfcare as a result of an illness, injury or disability, and where the complexity or a critical situation demands a special skill level among the workers, or when needing assistance to perform selfcare, dress and undressing and/or trip to the toilet." );
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }
    public void functionLevel1Entered(MouseEvent mouseEvent) {
        labelFunctionLevel1.setUnderline(true);
        labelFunctionLevel1.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelFunctionLevel1.setUnderline(false));
    }

    public void functionLevel2Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with daily activities ");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has problems with\n" +
                    " carrying out daily activities and where\n" +
                    " the complexity or a critical situation requires a special level of competence in the staff.\n" +
                    " eg need for assistance in coordination and\n" +
                    " Planning of daily activities by loss of\n" +
                    "Physical, Mental and Social Functioning, or by\n" +
                    " need other support for planning and\n" +
                    " Coordination of daily life.\n");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void functionLevel2Entered(MouseEvent mouseEvent) {
        labelFunctionLevel2.setUnderline(true);
        labelFunctionLevel2.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelFunctionLevel2.setUnderline(false));
    }

    public void Apperatus111Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with mobility and movement");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has problems with\n" +
                    " Movement disorders and problems in\n" +
                    " moving, moving, changing the body position or\n" +
                    " by inactivity as a result of illness, injury or\n" +
                    " treatment, eg side effect of medication, or by\n" +
                    " need other support to change the body position,\n" +
                    " transfer and/or to move around.\n" +
                    " eg citizens with Parkinson's disease and essential\n" +
                    " tremor.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }
    public void Apperatus111Entered(MouseEvent mouseEvent) {
        labelMovementapperatus11.setUnderline(true); labelMovementapperatus12.setUnderline(true);
        labelMovementapperatus11.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> {
                    labelMovementapperatus11.setUnderline(false);
                    labelMovementapperatus12.setUnderline(false);
                });
    }

    public void Apperatus12Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with mobility and movement");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has problems with\n" +
                    " Movement disorders and problems in\n" +
                    " moving, moving, changing the body position or\n" +
                    " by inactivity as a result of illness, injury or\n" +
                    " treatment, eg side effect of medication, or by\n" +
                    " need other support to change the body position,\n" +
                    " transfer and/or to move around.\n" +
                    " eg citizens with Parkinson's disease and essential\n" +
                    " tremor.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void Apperatus12Entered(MouseEvent mouseEvent) {
        labelMovementapperatus12.setUnderline(true); labelMovementapperatus11.setUnderline(true);
        labelMovementapperatus12.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> {
                    labelMovementapperatus12.setUnderline(false);
                    labelMovementapperatus11.setUnderline(false);
                });
    }

    public void nutrition1Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with fluid consumption");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has problems with\n" +
                    " consuming a correct amount of fluid as a result of\n" +
                    " illness or treatment, eg side effect of\n" +
                    " medications where there is a risk of dehydration or\n" +
                    " overlying, or when using other support for\n" +
                    " fluid intake.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void nutrition1Entered(MouseEvent mouseEvent) {
        labelConsumtion1.setUnderline(true);
        labelConsumtion1.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelConsumtion1.setUnderline(false));
    }

    public void nutrition2Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with food consumption");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has problems with\n" +
                    " consuming or absorbing nutrition and\n" +
                    " vitamins/minerals or by\n" +
                    " nutrition -related metabolic problems\n" +
                    " as a result of illness or treatment, eg\n" +
                    " Side effect of medicine.\n" +
                    " eg citizens with dysphagia or short -intestinal syndrome,\n" +
                    " or others who receive nutrition either\n" +
                    " parenteral or via probe, or when using\n" +
                    " other support for food intake.\n" +
                    " The condition is also chosen by citizens with\n" +
                    " diabetes.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void nutrition2Entered(MouseEvent mouseEvent) {
        labelConsumtion2.setUnderline(true);
        labelConsumtion2.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelConsumtion2.setUnderline(false));
    }

    public void nutrition3Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Irregular weight chances");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Is chosen when the citizen has problems with\n" +
                    " sudden change of weight as a result of illness\n" +
                    " or treatment, eg side effect of medicine, or\n" +
                    " need other support to deal with unplanned\n" +
                    " weight change.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void nutrition3Entered(MouseEvent mouseEvent) {
        labelConsumtion3.setUnderline(true);
        labelConsumtion3.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelConsumtion3.setUnderline(false));
    }

    public void nutrition4Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with obesity");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Is chosen when the citizen has problems with\n" +
                    " overweight as a result of illness or treatment,\n" +
                    " eg side effect of medicine, or use other\n" +
                    " support to deal with overweight.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void nutrition4Entered(MouseEvent mouseEvent) {
        labelConsumtion4.setUnderline(true);
        labelConsumtion4.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelConsumtion4.setUnderline(false));
    }

    public void nutrition5Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with anorexia");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has problems with weight loss\n" +
                    " and underweight as a result of illness or\n" +
                    " treatment, eg side effect of medication, or use for\n" +
                    " other support to deal with underweight..");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void nutrition5Entered(MouseEvent mouseEvent) {
        labelConsumtion5.setUnderline(true);
        labelConsumtion5.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelConsumtion5.setUnderline(false));
    }

    public void skin1Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with surgical wounds");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Is elected when the citizen has problems with wounds that have occurred as a result of a surgical intervention after\n" +
                    " an operation, or use for other support for\n" +
                    " treatment of surgical wounds.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void skin1Enter(MouseEvent mouseEvent) {
        labelSkin1.setUnderline(true);
        labelSkin1.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelSkin1.setUnderline(false));

    }

    public void skin2Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with diabetic wounds");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has problems with wounds that have arisen as a late complication to diabetes,\n" +
                    " or need other support for treatment of\n" +
                    " diabetic wound");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void skin2Enter(MouseEvent mouseEvent) {
        labelSkin2.setUnderline(true);
        labelSkin2.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelSkin2.setUnderline(false));
    }

    public void skin3Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with cancer wounds");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has problems with wounds\n" +
                    " has occurred as a result of cancer and metastases,\n" +
                    " or need other support for treatment of\n" +
                    " Cancers");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void skin3Enter(MouseEvent mouseEvent) {
        labelSkin3.setUnderline(true);
        labelSkin3.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelSkin3.setUnderline(false));
    }

    public void skin4Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with pressure sores");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has problems with wounds\n" +
                    " has occurred as a result of pressure and/or shear, or\n" +
                    " need other support for treating pressure ulcers");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void skin4Enter(MouseEvent mouseEvent) {
        labelSkin4.setUnderline(true);
        labelSkin4.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelSkin4.setUnderline(false));
    }

    public void skin5Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with arterial wounds");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Is elected when the citizen has problems with wounds that have occurred as a result of decreased arterial\n" +
                    " blood supply, or use other support for\n" +
                    " treatment of arterial wound.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void skin5Enter(MouseEvent mouseEvent) {
        labelSkin5.setUnderline(true);
        labelSkin5.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelSkin5.setUnderline(false));
    }

    public void skin6Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with venous wounds");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has problems with wounds that have occurred as a result of venous insufficiency, typically\n" +
                    " Failure to function of the venous flaps, or use\n" +
                    " for other support for the treatment of venous wound");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void skin6Enter(MouseEvent mouseEvent) {
        labelSkin6.setUnderline(true);
        labelSkin6.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelSkin6.setUnderline(false));
    }

    public void skin7Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with mixed wounds");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has problems with wounds that have occurred as a result of arterial and venous\n" +
                    " insufficiency, typically a worsening of a venous wound,\n" +
                    " or use for other support for treatment of\n" +
                    " Mixing wounds.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void skin7Enter(MouseEvent mouseEvent) {
        labelSkin7.setUnderline(true);
        labelSkin7.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelSkin7.setUnderline(false));
    }

    public void skin8Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with trauma wounds");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has problems with wounds that have occurred as a result of trauma on hard tissue\n" +
                    " and/or soft parts.\n" +
                    " eg by fall or other accident, cut wounds,\n" +
                    " skin scrapes, burns, etchings or\n" +
                    " frostbite, or need other support for\n" +
                    " Treatment of trauma wounds.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void skin8Enter(MouseEvent mouseEvent) {
        labelSkin8.setUnderline(true);
        labelSkin8.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelSkin8.setUnderline(false));
    }

    public void skin91Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Other problems with skin and mucous membrane ");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has problems with skin and\n" +
                    " mucous membranes that are not wounds.\n" +
                    " eg citizens who have fungal infection, scabies or\n" +
                    " mrsa, or need other support for treating\n" +
                    " skin and mucosal problems that are not wound.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void skin91Enter(MouseEvent mouseEvent) {
        labelSkin91.setUnderline(true); labelSkin92.setUnderline(true);
        labelSkin91.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> {
                    labelSkin91.setUnderline(false); labelSkin92.setUnderline(false);
                });
    }

    public void skin92Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Other problems with skin and mucous membrane");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has problems with skin and\n" +
                    " mucous membranes that are not wounds.\n" +
                    " eg citizens who have fungal infection, scabies or\n" +
                    " mrsa, or need other support for treating\n" +
                    " skin and mucosal problems that are not wound.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void skin92Enter(MouseEvent mouseEvent) {
        labelSkin92.setUnderline(true); labelSkin91.setUnderline(true);
        labelSkin92.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> {
                    labelSkin92.setUnderline(false); labelSkin91.setUnderline(false);
                });
    }

    public void communication1Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with communication");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has trouble talking,\n" +
                    " understanding, writing, spelling and reading as a result of illness,\n" +
                    " injury or treatment, eg side effect of medicine.\n" +
                    " eg citizens with a severe brain injury and/or\n" +
                    " decreased level of consciousness, or need other\n" +
                    " support for communication");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void communication1Enter(MouseEvent mouseEvent) {
        labelCommunication.setUnderline(true);
        labelCommunication.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelCommunication.setUnderline(false));
    }

    public void pshyco1Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with social contact");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has trouble\n" +
                    " dealing with socializing, adhering to social\n" +
                    " norms, interacting with others or establishing and\n" +
                    " maintaining relationships, or using other support\n" +
                    " to function social");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void pshyco1Enter(MouseEvent mouseEvent) {
        labelPshyco1.setUnderline(true);
        labelPshyco1.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelPshyco1.setUnderline(false));
    }

    public void pshyco2Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Emotional problems");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has trouble\n" +
                    " dealing with feelings related to chronic\n" +
                    " illness, injury or in connection with\n" +
                    " life events, or need other support to\n" +
                    " deal with feelings.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void pshyco2Enter(MouseEvent mouseEvent) {
        labelPshyco2.setUnderline(true);
        labelPshyco2.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelPshyco2.setUnderline(false));
    }

    public void pshyco3Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("problems with drug misuse ");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has problems with\n" +
                    " sustained and harmful use of medicine, alcohol\n" +
                    " or drugs that cause bodily, psychic\n" +
                    " or social problems, or need other\n" +
                    " support to deal with abuse problems.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void pshyco3Enter(MouseEvent mouseEvent) {
        labelPshyco3.setUnderline(true);
        labelPshyco3.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelPshyco3.setUnderline(false));
    }

    public void pshyco4Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Mental problems");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Is elected when the citizen has problems with\n" +
                    " mental or psychiatric symptoms as a result\n" +
                    " of illness, injury or treatment, eg side effect\n" +
                    " of medicine.\n" +
                    " eg citizens with depression, bipolar disorder,\n" +
                    " psychosis, eating disorder or schizophrenia, or\n" +
                    "Need other support to deal with mental and\n" +
                    " psychiatric symptoms\n");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void pshyco4Enter(MouseEvent mouseEvent) {
        labelPshyco4.setUnderline(true);
        labelPshyco4.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelPshyco4.setUnderline(false));
    }

    public void resporation1Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Respiration problems");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Is elected when the citizen has respiratory problems\n" +
                    " as a result of illness or injury.\n" +
                    " eg citizens with COPD, asthma, pneumonia,\n" +
                    " tracheostomy, or need other support for\n" +
                    " Handling of breathing problems.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void resporation1Enter(MouseEvent mouseEvent) {
        labelResparation1.setUnderline(true);
        labelResparation1.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelResparation1.setUnderline(false));
    }

    public void resporation2Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Circulation problems");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Is elected when the citizen has circulation problems\n" +
                    " as a result of illness, injury or treatment, eg\n" +
                    " Side effect of medicine.\n" +
                    " eg citizens with cardiovascular problems, pacemaker,\n" +
                    " in AK treatment, or need support for\n" +
                    " handling cardio-vascular problems.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void resporation2Enter(MouseEvent mouseEvent) {
        labelResparation2.setUnderline(true);
        labelResparation2.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelResparation2.setUnderline(false));
    }

    public void Sexuality1Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with sexuality");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Is elected when the citizen has problems in terms of sexuality\n" +
                    " as a result of illness, injury or treatment, eg\n" +
                    " Side effect of medicine, need other support for\n" +
                    " sexual activity.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void Sexuality1Enter(MouseEvent mouseEvent) {
        labelSexuality.setUnderline(true);
        labelSexuality.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelSexuality.setUnderline(false));
    }

    public void pain1Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Acute pains");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Is chosen when the citizen has problems with pain\n" +
                    " characterized by the fact that they are suddenly inaugurating\n" +
                    " and of short duration as a result of illness or\n" +
                    " injury, or use other support to deal with\n" +
                    " Acute pain.\n");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void pain1Enter(MouseEvent mouseEvent) {
        labelPain1.setUnderline(true);
        labelPain1.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelPain1.setUnderline(false));
    }

    public void pain2Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Periodic pains");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Is chosen when the citizen has problems with pain\n" +
                    " which sometimes occurs as a result of illness\n" +
                    " or injury, or use other support to\n" +
                    " deal with periodic pain.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void pain2Enter(MouseEvent mouseEvent) {
        labelPain2.setUnderline(true);
        labelPain2.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelPain2.setUnderline(false));
    }

    public void pain3Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Chronic pains");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has problems with pain which has lasted for more than 6 months as a result of illness or injury, or need other support for to deal with chronic pain");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void pain3Enter(MouseEvent mouseEvent) {
        labelPain3.setUnderline(true);
        labelPain3.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelPain3.setUnderline(false));
    }

    public void pain4Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with vision");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Is elected when the citizen has problems with the sense of sight as a result of illness or injury. eg citizens with cataracts, cataracts or eye infection, or need other support to compensate for changed sense of sight");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void pain4Enter(MouseEvent mouseEvent) {
        labelPain4.setUnderline(true);
        labelPain4.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelPain4.setUnderline(false));
    }

    public void pain5Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with olfaction");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Is chosen when the citizen has problems with sense of smell as a result of illness, injury or treatment, eg side effect of medicine, or use for other support to compensate for changed smell sense.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void pain5Enter(MouseEvent mouseEvent) {
        labelPain5.setUnderline(true);
        labelPain5.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelPain5.setUnderline(false));
    }

    public void pain6Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with hearing");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has problems with hearing as a result of illness or injury, or need other support to compensate for changed hearing.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void pain6Enter(MouseEvent mouseEvent) {
        labelPain6.setUnderline(true);
        labelPain6.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelPain6.setUnderline(false));
    }

    public void pain7Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with gustation");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Is chosen when the citizen has problems with Sense of taste due to illness, injury or treatment, eg side effect of medicine, or use for other support to compensate for changed sense of taste.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void pain7Enter(MouseEvent mouseEvent) {
        labelPain7.setUnderline(true);
        labelPain7.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelPain7.setUnderline(false));
    }

    public void pain8Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with taction");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has problems with sensation\n" +
                    " as a result of illness, injury or treatment, eg\n" +
                    " Side effect of medicine.\n" +
                    " eg citizens with reduced sensation due to diabetic\n" +
                    " neuropathy, or use other support to\n" +
                    " compensate for changed Feeling sense.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void pain8Enter(MouseEvent mouseEvent) {
        labelPain8.setUnderline(true);
        labelPain8.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelPain8.setUnderline(false));
    }

    public void Sleep1Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with sleep schedule");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has problems with\n" +
                    " disruption of sleep and rest as a result of\n" +
                    " illness, injury or treatment, eg side effect of\n" +
                    " medicine, or need other support to\n" +
                    " deal with inability to separate day\n" +
                    " and night.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void Sleep1Enter(MouseEvent mouseEvent) {
        labelSleep1.setUnderline(true);
        labelSleep1.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelSleep1.setUnderline(false));
    }

    public void Sleep2Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Sleep problems");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Is elected when the citizen has sleep problems such as\n" +
                    " consequence of illness, injury or treatment, eg\n" +
                    " Side effect of medicine.\n" +
                    " eg citizens with narcolepsy, or need other\n" +
                    " support to compensate for poor sleep quality.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void Sleep2Enter(MouseEvent mouseEvent) {
        labelSleep2.setUnderline(true);
        labelSleep2.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelSleep2.setUnderline(false));
    }

    public void insight1Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with memory");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has problems with\n" +
                    " memory as a result of illness, injury or\n" +
                    " treatment, eg side effect of medicine.\n" +
                    " eg citizens with dementia diseases, or need\n" +
                    " other support to remember, recognize and apply\n" +
                    " Previous experience.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void insight1Enter(MouseEvent mouseEvent) {
        labelInsight1.setUnderline(true);
        labelInsight1.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelInsight1.setUnderline(false));
    }

    public void insight21Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with insight in treatment goals");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has problems with\n" +
                    " self -care and handling of their own health,\n" +
                    " illness or symptoms.\n" +
                    " eg citizens who have a clear feeling in diabetes,\n" +
                    " but do not respond, or citizens with\n" +
                    " dementia diseases that refuse to have problems\n" +
                    " in daily life, or use other support to\n" +
                    " realize inability to selfcare");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void insight21Enter(MouseEvent mouseEvent) {
        labelInsight21.setUnderline(true); labelInsight22.setUnderline(true);
        labelInsight21.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> {
                    labelInsight21.setUnderline(false); labelInsight22.setUnderline(false);
                });
    }

    public void insight22Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with insight in treatment goals");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has problems with\n" +
                    " self -care and handling of their own health,\n" +
                    " illness or symptoms.\n" +
                    " eg citizens who have a clear feeling in diabetes,\n" +
                    " but do not respond, or citizens with\n" +
                    " dementia diseases that refuse to have problems\n" +
                    " in daily life, or use other support to\n" +
                    " realize inability to selfcare");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void insight22Enter(MouseEvent mouseEvent) {
        labelInsight22.setUnderline(true); labelInsight21.setUnderline(true);
        labelInsight22.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> {
                    labelInsight22.setUnderline(false); labelInsight21.setUnderline(false);
                });
    }

    public void insight3Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with illness insight");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Is elected when the citizen has problems with\n" +
                    " Understanding the purpose of the treatment.\n" +
                    " eg citizens with chronic or recurring\n" +
                    " disease where treatment or preventive\n" +
                    " treatment is completed inappropriately. Citizens\n" +
                    " with Inability to Give Informed\n" +
                    " Consent to a Treatment, or need other\n" +
                    " support to understand intent with treatment");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void insight3Enter(MouseEvent mouseEvent) {
        labelInsight3.setUnderline(true);
        labelInsight3.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelInsight3.setUnderline(false));
    }

    public void insight4Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Cognitive problems");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Is elected when the citizen has cognitive problems\n" +
                    " as a result of illness, injury or treatment, eg\n" +
                    " Side effect of medicine.\n" +
                    " eg citizens with nail or delir, or need\n" +
                    " other support for logical thinking, acquisition of\n" +
                    " Knowledge, Overview, planning and organization.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void insight4Enter(MouseEvent mouseEvent) {
        labelInsight4.setUnderline(true);
        labelInsight4.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelInsight4.setUnderline(false));
    }

    public void waste1Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with urination");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Is elected when the citizen has problems with\n" +
                    " urination as a result of illness, injury or\n" +
                    " treatment, eg side effect of medicine.\n" +
                    " eg citizens who are in dialysis treatment or\n" +
                    " citizens with nephrostomy, urostomy, top catheter\n" +
                    " or catheter à demeure, or need other\n" +
                    " support to deal with urination problems that\n" +
                    " are not incontinence.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void waste1Enter(MouseEvent mouseEvent) {
        labelWaste1.setUnderline(true);
        labelWaste1.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelWaste1.setUnderline(false));
    }

    public void waste2Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with urine consistency");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has problems with\n" +
                    " stress incontinence, urge incontinence,\n" +
                    " Mixing incontinence or false incontinence such as\n" +
                    " Following of illness, injury or treatment, eg\n" +
                    " Side effect of medication, or use other support\n" +
                    " to deal with urinary incontinence.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void waste2Enter(MouseEvent mouseEvent) {
        labelWaste2.setUnderline(true);
        labelWaste2.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelWaste2.setUnderline(false));
    }

    public void waste3Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with fecal consistency");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has problems with\n" +
                    " fecal incontinence as a result of illness, injury\n" +
                    " or treatment, eg side effect of medicine, or\n" +
                    " need other support to deal with\n" +
                    " stool problems/ stool stools.");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void waste3Enter(MouseEvent mouseEvent) {
        labelWaste3.setUnderline(true);
        labelWaste3.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelWaste3.setUnderline(false));
    }

    public void waste41Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with stomach and intestines ");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has problems with stomach\n" +
                    " and gut as a result of illness, injury or\n" +
                    " treatment, eg side effect of medicine.\n" +
                    " eg citizens with ileostomy, colostomy and\n" +
                    " diseases of the liver, bile roads or hemorrhoids,\n" +
                    " or use For other support to deal with\n" +
                    " digestive problems");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void waste41Enter(MouseEvent mouseEvent) {
        labelWaste41.setUnderline(true); labelWaste42.setUnderline(true);
        labelWaste41.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> {
                    labelWaste41.setUnderline(false); labelWaste42.setUnderline(false);
                });
    }

    public void waste42Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with stomach and intestines ");
        if(mouseEvent.getClickCount() == 2){
            textInfo.setText("Chosen when the citizen has problems with stomach\n" +
                    " and gut as a result of illness, injury or\n" +
                    " treatment, eg side effect of medicine.\n" +
                    " eg citizens with ileostomy, colostomy and\n" +
                    " diseases of the liver, bile roads or hemorrhoids,\n" +
                    " or use For other support to deal with\n" +
                    " digestive problems");
            paneInfo.setDisable(false); paneInfo.setVisible(true);
        }
        labelSelectedCategory.getScene().addEventFilter(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                paneInfo.setDisable(true); paneInfo.setVisible(false);
            }
        });
    }

    public void waste42Enter(MouseEvent mouseEvent) {
        labelWaste42.setUnderline(true); labelWaste41.setUnderline(true);
        labelWaste42.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> {
                    labelWaste42.setUnderline(false); labelWaste41.setUnderline(false);
                });
    }

    public void waste5Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problems with liquids from drain");
    }

    public void waste5Enter(MouseEvent mouseEvent) {
        labelWaste5.setUnderline(true);
        labelWaste5.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelWaste5.setUnderline(false));
    }

    public void selfcare1Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Ability to clean themselves");
    }

    public void selfcare1Enter(MouseEvent mouseEvent) {
        labelselfcare1.setUnderline(true);
        labelselfcare1.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelselfcare1.setUnderline(false));
    }

    public void selfcare2Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Body care");
    }

    public void selfcare2Enter(MouseEvent mouseEvent) {
        labelselfcare2.setUnderline(true);
        labelselfcare2.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelselfcare2.setUnderline(false));
    }

    public void selfcare3Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Ability to undress and dress up");
    }

    public void selfcare3Entered(MouseEvent mouseEvent) {
        labelselfcare3.setUnderline(true);
        labelselfcare3.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelselfcare3.setUnderline(false));
    }

    public void selfcare4Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Drinking");
    }

    public void selfcare4Enter(MouseEvent mouseEvent) {
        labelselfcare4.setUnderline(true);
        labelselfcare4.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelselfcare4.setUnderline(false));
    }

    public void selfcare5Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Food intake");
    }

    public void selfcare5Enter(MouseEvent mouseEvent) {
        labelselfcare5.setUnderline(true);
        labelselfcare5.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelselfcare5.setUnderline(false));
    }

    public void selfcare6Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Eating");
    }

    public void selfcare6Enter(MouseEvent mouseEvent) {
        labelselfcare6.setUnderline(true);
        labelselfcare6.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelselfcare6.setUnderline(false));
    }

    public void selfcare7Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Taking care of own health");
    }

    public void selfcare7Enter(MouseEvent mouseEvent) {
        labelselfcare7.setUnderline(true);
        labelselfcare7.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelselfcare7.setUnderline(false));
    }

    public void selfcare8Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Using the toilet");
    }

    public void selfcare8Enter(MouseEvent mouseEvent) {
        labelselfcare8.setUnderline(true);
        labelselfcare8.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelselfcare8.setUnderline(false));
    }

    public void practical1Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Perform housework");
    }

    public void practical1Enter(MouseEvent mouseEvent) {
        labelParcticalWork1.setUnderline(true);
        labelParcticalWork1.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelParcticalWork1.setUnderline(false);
                    }
                });
    }

    public void practical2Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Cook Food");
    }

    public void practical2Enter(MouseEvent mouseEvent) {
        labelParcticalWork2.setUnderline(true);
        labelParcticalWork2.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelParcticalWork2.setUnderline(false);
                    }
                });
    }

    public void practical3Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Performing daily routine");
    }

    public void practical3Enter(MouseEvent mouseEvent) {
        labelParcticalWork3.setUnderline(true);
        labelParcticalWork3.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelParcticalWork3.setUnderline(false);
                    }
                });
    }

    public void practical4Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Acquire groceries and services");
    }

    public void practical4Enter(MouseEvent mouseEvent) {
        labelParcticalWork4.setUnderline(true);
        labelParcticalWork4.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelParcticalWork4.setUnderline(false);
                    }
                });
    }

    public void mobility1Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Lifting and carrying ");
    }

    public void mobility1Enter(MouseEvent mouseEvent) {
        labelMobility1.setUnderline(true);
        labelMobility1.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelMobility1.setUnderline(false);
                    }
                });
    }

    public void mobility2Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Moving around");
    }

    public void mobility2Enter(MouseEvent mouseEvent) {
        labelMobility2.setUnderline(true);
        labelMobility2.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelMobility2.setUnderline(false));
    }

    public void mobility3Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Using Transportation ");
    }

    public void mobility3Enter(MouseEvent mouseEvent) {
        labelMobility3.setUnderline(true);
        labelMobility3.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelMobility3.setUnderline(false));

    }

    public void mobility4Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Moving in different surroundings");
    }

    public void mobility4Enter(MouseEvent mouseEvent) {
        labelMobility4.setUnderline(true);
        labelMobility4.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelMobility4.setUnderline(false));
    }

    public void mobility5Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Transferring ");
    }

    public void mobility5Enter(MouseEvent mouseEvent) {
        labelMobility5.setUnderline(true);
        labelMobility5.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelMobility5.setUnderline(false));
    }

    public void mobility6Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Change position");
    }

    public void mobility6Enter(MouseEvent mouseEvent) {
        labelMobility6.setUnderline(true);
        labelMobility6.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelMobility6.setUnderline(false));
    }

    public void mobility7Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Muscle strength");
    }

    public void mobility7Enter(MouseEvent mouseEvent) {
        labelMobility7.setUnderline(true);
        labelMobility7.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelMobility7.setUnderline(false));
    }

    public void mobility8Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Walking");
    }

    public void mobility8Enter(MouseEvent mouseEvent) {
        labelMobility8.setUnderline(true);
        labelMobility8.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelMobility8.setUnderline(false));
    }

    public void mobility9Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Stamina");
    }

    public void mobility9Enter(MouseEvent mouseEvent) {
        labelMobility9.setUnderline(true);
        labelMobility9.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelMobility9.setUnderline(false));
    }

    public void mentalFunction11Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Communication/Technical equipment");
    }

    public void mentalFunction11Enter(MouseEvent mouseEvent) {
        labelMentalFunction11.setUnderline(true); labelMentalFunction12.setUnderline(true);
        labelMentalFunction11.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> {
                    labelMentalFunction11.setUnderline(false); labelMentalFunction12.setUnderline(false);
                });
    }

    public void mentalFunction12Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Communication/Technical equipment");
    }

    public void mentalFunction12Enter(MouseEvent mouseEvent) {
        labelMentalFunction12.setUnderline(true); labelMentalFunction11.setUnderline(true);
        labelMentalFunction12.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> {
                    labelMentalFunction12.setUnderline(false); labelMentalFunction11.setUnderline(false);
                });
    }

    public void mentalFunction2Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Memory");
    }

    public void mentalFunction2Enter(MouseEvent mouseEvent) {
        labelMentalFunction2.setUnderline(true);
        labelMentalFunction2.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelMentalFunction2.setUnderline(false));
    }

    public void mentalFunction3Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Orientation skill");
    }

    public void mentalFunction3Enter(MouseEvent mouseEvent) {
        labelMentalFunction3.setUnderline(true);
        labelMentalFunction3.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelMentalFunction3.setUnderline(false));
    }

    public void mentalFunction4Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Cognitive functions");
    }

    public void mentalFunction4Entered(MouseEvent mouseEvent) {
        labelMentalFunction4.setUnderline(true);
        labelMentalFunction4.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelMentalFunction4.setUnderline(false));
    }

    public void mentalFunction5Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Feeling functions");
    }

    public void mentalFunction5Entered(MouseEvent mouseEvent) {
        labelMentalFunction5.setUnderline(true);
        labelMentalFunction5.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelMentalFunction5.setUnderline(false));
    }

    public void mentalFunction6Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Energy and capacity for action");
    }

    public void mentalFunction6Enter(MouseEvent mouseEvent) {
        labelMentalFunction6.setUnderline(true);
        labelMentalFunction6.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelMentalFunction6.setUnderline(false));
    }

    public void mentalFunction7Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Appropriation of skills");
    }

    public void mentalFunction7Enter(MouseEvent mouseEvent) {
        labelMentalFunction7.setUnderline(true);
        labelMentalFunction7.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelMentalFunction7.setUnderline(false));
    }

    public void mentalFunction8Click(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Problem solving");
    }

    public void mentalFunction8Enter(MouseEvent mouseEvent) {
        labelMentalFunction8.setUnderline(true);
        labelMentalFunction8.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelMentalFunction8.setUnderline(false));
    }

    public void socialLife1Clicked(MouseEvent mouseEvent) {
        labelSelectedSubCategory.setText("Paid occupation");
    }

    public void socialLife1Enter(MouseEvent mouseEvent) {
        labelSocialLife1.setUnderline(true);
        labelSocialLife1.addEventHandler(MouseEvent.MOUSE_EXITED,
                event -> labelSocialLife1.setUnderline(false));
    }

}
