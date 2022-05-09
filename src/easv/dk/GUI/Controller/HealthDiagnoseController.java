package easv.dk.GUI.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;



public class HealthDiagnoseController {

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

    public void sendToCaseScreen(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/caseView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Log In");
        stage.centerOnScreen();
        stage.show();
    }

    public void logOut(ActionEvent actionEvent) throws IOException {
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

    public void Return(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getClassLoader().getResource("easv/dk/GUI/View/StudentView.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Log In");
        stage.centerOnScreen();
        stage.show();
    }

    public void toClientsWishesScreen(ActionEvent actionEvent) {


    }

    
    public void functionLevelCLiscke(MouseEvent mouseEvent) {
        clearAll();
        VBoxFunctionLevel.setVisible(true);
        VBoxFunctionLevel.setDisable(false);

    }

    public void mouseOverFunction(MouseEvent mouseEvent) {

    }

    public void mouseExitFunction(MouseEvent mouseEvent) {
    }


    public void cilckedApperatus(MouseEvent mouseEvent) {
    }

    public void mouseOverApperatus(MouseEvent mouseEvent) {
    }

    public void mouseExitApperatus(MouseEvent mouseEvent) {
    }

    
    public void nutritionClicked(MouseEvent mouseEvent) {
    }

    public void mouseOverNutrtion(MouseEvent mouseEvent) {
    }

    public void mouseExitNutrition(MouseEvent mouseEvent) {
    }

    public void skinClicked(MouseEvent mouseEvent) {
    }

    public void skinEntered(MouseEvent mouseEvent) {
    }

    public void skinExited(MouseEvent mouseEvent) {
    }

    public void communicationClicked(MouseEvent mouseEvent) {
    }

    public void communicationEntered(MouseEvent mouseEvent) {
    }

    public void communicationExited(MouseEvent mouseEvent) {
    }

    public void pshycoClicked(MouseEvent mouseEvent) {
    }

    public void pshycoEntered(MouseEvent mouseEvent) {
    }

    public void pshycoExited(MouseEvent mouseEvent) {
    }

    public void respoClicked(MouseEvent mouseEvent) {
    }

    public void respoEntered(MouseEvent mouseEvent) {
    }

    public void respoExited(MouseEvent mouseEvent) {
    }

    public void sexualityClicked(MouseEvent mouseEvent) {
    }

    public void sexualityEntered(MouseEvent mouseEvent) {
    }

    public void sexualityExited(MouseEvent mouseEvent) {
    }

    public void painsClicked(MouseEvent mouseEvent) {
    }

    public void painsEntered(MouseEvent mouseEvent) {
    }

    public void painsExited(MouseEvent mouseEvent) {
    }

    public void sleepClicked(MouseEvent mouseEvent) {
    }

    public void sleepEntered(MouseEvent mouseEvent) {
    }

    public void sleepExited(MouseEvent mouseEvent) {
    }

    public void knowledgeClicked(MouseEvent mouseEvent) {
    }

    public void knowledgeEntered(MouseEvent mouseEvent) {
    }

    public void knowledgeExited(MouseEvent mouseEvent) {
    }

    public void wastesClicked(MouseEvent mouseEvent) {
    }

    public void wastesEntered(MouseEvent mouseEvent) {
    }

    public void wastesExited(MouseEvent mouseEvent) {
    }

    public void toFunctional(ActionEvent actionEvent) {
    }

    public void selfcareClicked(MouseEvent mouseEvent) {
    }

    public void selfcareEntered(MouseEvent mouseEvent) {
    }

    public void selfcareExited(MouseEvent mouseEvent) {
    }

    public void practicalClicked(MouseEvent mouseEvent) {
    }

    public void pacticalEntered(MouseEvent mouseEvent) {
    }

    public void practicalExited(MouseEvent mouseEvent) {
    }

    public void mobilityClicked(MouseEvent mouseEvent) {
    }

    public void mobilityEntered(MouseEvent mouseEvent) {
    }

    public void mobilityExited(MouseEvent mouseEvent) {
    }

    public void mentalClicked(MouseEvent mouseEvent) {
    }

    public void mentalEntered(MouseEvent mouseEvent) {
    }

    public void mentalExit(MouseEvent mouseEvent) {
    }

    public void socialClicked(MouseEvent mouseEvent) {
    }

    public void socialEntered(MouseEvent mouseEvent) {
    }

    public void socialExit(MouseEvent mouseEvent) {
    }

    public void toHealth(ActionEvent actionEvent) {
    }


    public void functionLevel1Clicked(MouseEvent mouseEvent) {
    }

    public void functionLevel1Entered(MouseEvent mouseEvent) {
    }

    public void functionLevel1Exit(MouseEvent mouseEvent) {
    }


    public void functionLevel2Clicked(MouseEvent mouseEvent) {
    }

    public void functionLevel2Entered(MouseEvent mouseEvent) {
    }

    public void functionLevel2Exit(MouseEvent mouseEvent) {
    }


    public void Apperatus1Clicked(MouseEvent mouseEvent) {
    }

    public void Apperatus1Entered(MouseEvent mouseEvent) {
    }

    public void Apperatus1Exit(MouseEvent mouseEvent) {
    }


    public void nutrition1Clicked(MouseEvent mouseEvent) {
    }

    public void nutrition1Entered(MouseEvent mouseEvent) {
    }

    public void nutrition1Exit(MouseEvent mouseEvent) {
    }


    public void nutrition2Clicked(MouseEvent mouseEvent) {
    }

    public void nutrition2Entered(MouseEvent mouseEvent) {
    }

    public void nutrition2Exit(MouseEvent mouseEvent) {
    }


    public void nutrition3Clicked(MouseEvent mouseEvent) {
    }

    public void nutrition3Entered(MouseEvent mouseEvent) {
    }

    public void nutrition3Exit(MouseEvent mouseEvent) {
    }


    public void nutrition4Clicked(MouseEvent mouseEvent) {
    }

    public void nutrition4Entered(MouseEvent mouseEvent) {
    }

    public void nutrition4Exit(MouseEvent mouseEvent) {
    }


    public void nutrition5Clicked(MouseEvent mouseEvent) {
    }

    public void nutrition5Entered(MouseEvent mouseEvent) {
    }

    public void nutrition5Exit(MouseEvent mouseEvent) {
    }

    
    public void skin1Clicked(MouseEvent mouseEvent) {
    }

    public void skin1Enter(MouseEvent mouseEvent) {
    }

    public void skin1Exit(MouseEvent mouseEvent) {
    }


    public void skin2Clicked(MouseEvent mouseEvent) {
    }

    public void skin2Enter(MouseEvent mouseEvent) {
    }

    public void skin2Exit(MouseEvent mouseEvent) {
    }


    public void skin3Clicked(MouseEvent mouseEvent) {
    }

    public void skin3Enter(MouseEvent mouseEvent) {
    }

    public void skin3Exit(MouseEvent mouseEvent) {
    }


    public void skin4Clicked(MouseEvent mouseEvent) {
    }

    public void skin4Enter(MouseEvent mouseEvent) {
    }

    public void skin4Exit(MouseEvent mouseEvent) {
    }


    public void skin5Clicked(MouseEvent mouseEvent) {
    }

    public void skin5Enter(MouseEvent mouseEvent) {
    }

    public void skin5Exit(MouseEvent mouseEvent) {
    }


    public void skin6Clicked(MouseEvent mouseEvent) {
    }

    public void skin6Enter(MouseEvent mouseEvent) {
    }

    public void skin6Exit(MouseEvent mouseEvent) {
    }


    public void skin7Clicked(MouseEvent mouseEvent) {
    }

    public void skin7Enter(MouseEvent mouseEvent) {
    }

    public void skin7Exit(MouseEvent mouseEvent) {
    }


    public void skin8Clicked(MouseEvent mouseEvent) {
    }

    public void skin8Enter(MouseEvent mouseEvent) {
    }

    public void skin8Exit(MouseEvent mouseEvent) {
    }


    public void skin91Clicked(MouseEvent mouseEvent) {
    }

    public void skin91Enter(MouseEvent mouseEvent) {
    }

    public void skin91Exit(MouseEvent mouseEvent) {
    }


    public void skin92Clicked(MouseEvent mouseEvent) {
    }

    public void skin92Enter(MouseEvent mouseEvent) {
    }

    public void skin92Exit(MouseEvent mouseEvent) {
    }


    public void communication1Clicked(MouseEvent mouseEvent) {
    }

    public void communication1Enter(MouseEvent mouseEvent) {
    }

    public void communication1Exit(MouseEvent mouseEvent) {
    }


    public void pshyco1Clicked(MouseEvent mouseEvent) {
    }

    public void pshyco1Enter(MouseEvent mouseEvent) {
    }

    public void pshyco1Exit(MouseEvent mouseEvent) {
    }


    public void pshyco2Clicked(MouseEvent mouseEvent) {
    }

    public void pshyco2Enter(MouseEvent mouseEvent) {
    }

    public void pshyco2Exit(MouseEvent mouseEvent) {
    }


    public void pshyco3Click(MouseEvent mouseEvent) {
    }

    public void pshyco3Enter(MouseEvent mouseEvent) {
    }

    public void pshyco3Exit(MouseEvent mouseEvent) {
    }


    public void pshyco4Click(MouseEvent mouseEvent) {
    }

    public void pshyco4Enter(MouseEvent mouseEvent) {
    }

    public void pshyco4Exit(MouseEvent mouseEvent) {
    }


    public void resporation1Click(MouseEvent mouseEvent) {
    }

    public void resporation1Enter(MouseEvent mouseEvent) {
    }

    public void resporation1Exit(MouseEvent mouseEvent) {
    }


    public void resporation2Click(MouseEvent mouseEvent) {
    }

    public void resporation2Enter(MouseEvent mouseEvent) {
    }

    public void resporation2Exit(MouseEvent mouseEvent) {
    }


    public void Sexuality1Clicked(MouseEvent mouseEvent) {
    }

    public void Sexuality1Enter(MouseEvent mouseEvent) {
    }

    public void Sexuality1Exit(MouseEvent mouseEvent) {
    }


    public void pain1Click(MouseEvent mouseEvent) {
    }

    public void pain1Enter(MouseEvent mouseEvent) {
    }

    public void pain1Exit(MouseEvent mouseEvent) {
    }


    public void pain2Click(MouseEvent mouseEvent) {
    }

    public void pain2Enter(MouseEvent mouseEvent) {
    }

    public void pain2Exit(MouseEvent mouseEvent) {
    }


    public void pain3Click(MouseEvent mouseEvent) {
    }

    public void pain3Enter(MouseEvent mouseEvent) {
    }

    public void pain3Exit(MouseEvent mouseEvent) {
    }


    public void pain4Click(MouseEvent mouseEvent) {
    }

    public void pain4Enter(MouseEvent mouseEvent) {
    }

    public void pain4Exit(MouseEvent mouseEvent) {
    }


    public void pain5Click(MouseEvent mouseEvent) {
    }

    public void pain5Enter(MouseEvent mouseEvent) {
    }

    public void pain5Exit(MouseEvent mouseEvent) {
    }


    public void pain6Click(MouseEvent mouseEvent) {
    }

    public void pain6Enter(MouseEvent mouseEvent) {
    }

    public void pain6Exit(MouseEvent mouseEvent) {
    }


    public void pain7Click(MouseEvent mouseEvent) {
    }

    public void pain7Enter(MouseEvent mouseEvent) {
    }

    public void pain7Exit(MouseEvent mouseEvent) {
    }


    public void pain8Click(MouseEvent mouseEvent) {
    }

    public void pain8Enter(MouseEvent mouseEvent) {
    }

    public void pain8Exit(MouseEvent mouseEvent) {
    }


    public void Sleep1Click(MouseEvent mouseEvent) {
    }

    public void Sleep1Enter(MouseEvent mouseEvent) {
    }

    public void Sleep1Exit(MouseEvent mouseEvent) {
    }


    public void Sleep2Click(MouseEvent mouseEvent) {
    }

    public void Sleep2Enter(MouseEvent mouseEvent) {
    }

    public void Sleep2Exit(MouseEvent mouseEvent) {
    }


    public void insight1Clicked(MouseEvent mouseEvent) {
    }

    public void insight1Enter(MouseEvent mouseEvent) {
    }

    public void insight1Exit(MouseEvent mouseEvent) {
    }


    public void insight21Clicked(MouseEvent mouseEvent) {
    }

    public void insight21Enter(MouseEvent mouseEvent) {
    }

    public void insight21Exit(MouseEvent mouseEvent) {
    }


    public void insight22Click(MouseEvent mouseEvent) {
    }

    public void insight22Enter(MouseEvent mouseEvent) {
    }

    public void insight22Exit(MouseEvent mouseEvent) {
    }


    public void insight3Click(MouseEvent mouseEvent) {
    }

    public void insight3Enter(MouseEvent mouseEvent) {
    }

    public void insight3Exit(MouseEvent mouseEvent) {
    }


    public void insight4Click(MouseEvent mouseEvent) {
    }

    public void insight4Enter(MouseEvent mouseEvent) {
    }

    public void insight4Ecit(MouseEvent mouseEvent) {
    }


    public void waste1Click(MouseEvent mouseEvent) {
    }

    public void waste1Enter(MouseEvent mouseEvent) {
    }

    public void waste1Exit(MouseEvent mouseEvent) {
    }


    public void waste2Click(MouseEvent mouseEvent) {
    }

    public void waste2Enter(MouseEvent mouseEvent) {
    }

    public void waste2Exit(MouseEvent mouseEvent) {
    }


    public void waste3Click(MouseEvent mouseEvent) {
    }

    public void waste3Enter(MouseEvent mouseEvent) {
    }

    public void waste3Exit(MouseEvent mouseEvent) {
    }


    public void waste4Click(MouseEvent mouseEvent) {
    }

    public void waste4Enter(MouseEvent mouseEvent) {
    }

    public void waste4Exit(MouseEvent mouseEvent) {
    }


    public void waste5Click(MouseEvent mouseEvent) {
    }

    public void waste5Enter(MouseEvent mouseEvent) {
    }

    public void waste5Exit(MouseEvent mouseEvent) {
    }


    public void selfcare1Clicked(MouseEvent mouseEvent) {
    }

    public void selfcare1Enter(MouseEvent mouseEvent) {
    }

    public void selfcare1Exit(MouseEvent mouseEvent) {
    }


    public void selfcare2Click(MouseEvent mouseEvent) {
    }

    public void selfcare2Enter(MouseEvent mouseEvent) {
    }

    public void selfcare2Exit(MouseEvent mouseEvent) {
    }


    public void selfcare3Clicked(MouseEvent mouseEvent) {
    }

    public void selfcare3Entered(MouseEvent mouseEvent) {
    }

    public void selfcare3Exit(MouseEvent mouseEvent) {
    }


    public void selfcare4Clicked(MouseEvent mouseEvent) {
    }
    
    public void selfcare4Exit(MouseEvent mouseEvent) {
    }
    
    public void selfcare4Enter(MouseEvent mouseEvent) {
    }


    public void selfcare5Clicked(MouseEvent mouseEvent) {
    }

    public void selfcare5Enter(MouseEvent mouseEvent) {
    }

    public void selfcare5Exit(MouseEvent mouseEvent) {
    }


    public void selfcare6Click(MouseEvent mouseEvent) {
    }

    public void selfcare6Enter(MouseEvent mouseEvent) {
    }

    public void selfcare6Exit(MouseEvent mouseEvent) {
    }


    public void selfcare7Click(MouseEvent mouseEvent) {
    }

    public void selfcare7Enter(MouseEvent mouseEvent) {
    }

    public void selfcare7Exit(MouseEvent mouseEvent) {
    }


    public void selfcare8Click(MouseEvent mouseEvent) {
    }

    public void selfcare8Enter(MouseEvent mouseEvent) {
    }

    public void selfcare8Exit(MouseEvent mouseEvent) {
    }


    public void practical1Click(MouseEvent mouseEvent) {
    }

    public void practical1Enter(MouseEvent mouseEvent) {
    }

    public void practical1Exit(MouseEvent mouseEvent) {
    }


    public void practical2Click(MouseEvent mouseEvent) {
    }

    public void practical2Enter(MouseEvent mouseEvent) {
    }

    public void practical2Exit(MouseEvent mouseEvent) {
    }


    public void practical3Click(MouseEvent mouseEvent) {
    }

    public void practical3Enter(MouseEvent mouseEvent) {
    }

    public void practical3Exit(MouseEvent mouseEvent) {
    }


    public void practical4Click(MouseEvent mouseEvent) {
    }

    public void practical4Enter(MouseEvent mouseEvent) {
    }

    public void practical4Exit(MouseEvent mouseEvent) {
    }


    public void mobility1Click(MouseEvent mouseEvent) {
    }

    public void mobility1Enter(MouseEvent mouseEvent) {
    }

    public void mobility1Exit(MouseEvent mouseEvent) {
    }


    public void mobility2Click(MouseEvent mouseEvent) {
    }

    public void mobility2Enter(MouseEvent mouseEvent) {
    }

    public void mobility2Exit(MouseEvent mouseEvent) {
    }


    public void mobility3Click(MouseEvent mouseEvent) {
    }

    public void mobility3Enter(MouseEvent mouseEvent) {
    }

    public void mobility3Exit(MouseEvent mouseEvent) {
    }


    public void mobility4Click(MouseEvent mouseEvent) {
    }

    public void mobility4Enter(MouseEvent mouseEvent) {
    }

    public void mobility4Exit(MouseEvent mouseEvent) {
    }


    public void mobility5Click(MouseEvent mouseEvent) {
    }

    public void mobility5Enter(MouseEvent mouseEvent) {
    }

    public void mobility5Exit(MouseEvent mouseEvent) {
    }


    public void mobility6Click(MouseEvent mouseEvent) {
    }

    public void mobility6Enter(MouseEvent mouseEvent) {
    }

    public void mobility6Exit(MouseEvent mouseEvent) {
    }


    public void mobility7Click(MouseEvent mouseEvent) {
    }

    public void mobility7Enter(MouseEvent mouseEvent) {
    }

    public void mobility7Exit(MouseEvent mouseEvent) {
    }


    public void mobility8Click(MouseEvent mouseEvent) {
    }

    public void mobility8Enter(MouseEvent mouseEvent) {
    }

    public void mobility8Exit(MouseEvent mouseEvent) {
    }


    public void mobility9Click(MouseEvent mouseEvent) {
    }

    public void mobility9Enter(MouseEvent mouseEvent) {
    }

    public void mobility9Exit(MouseEvent mouseEvent) {
    }


    public void mentalFunction1Clicked(MouseEvent mouseEvent) {
    }

    public void mentalFunction1Enter(MouseEvent mouseEvent) {
    }

    public void mentalFunction1Exit(MouseEvent mouseEvent) {
    }


    public void mentalFunction2Click(MouseEvent mouseEvent) {
    }

    public void mentalFunction2Enter(MouseEvent mouseEvent) {
    }

    public void mentalFunction2Exit(MouseEvent mouseEvent) {
    }


    public void mentalFunction3Clicked(MouseEvent mouseEvent) {
    }

    public void mentalFunction3Enter(MouseEvent mouseEvent) {
    }

    public void mentalFunction3Exit(MouseEvent mouseEvent) {
    }


    public void mentalFunction4Clicked(MouseEvent mouseEvent) {
    }

    public void mentalFunction4Entered(MouseEvent mouseEvent) {
    }

    public void mentalFunction4Exited(MouseEvent mouseEvent) {
    }


    public void mentalFunction5Clicked(MouseEvent mouseEvent) {
    }

    public void mentalFunction5Entered(MouseEvent mouseEvent) {
    }

    public void mentalFunction5Exit(MouseEvent mouseEvent) {
    }


    public void mentalFunction6Click(MouseEvent mouseEvent) {
    }

    public void mentalFunction6Enter(MouseEvent mouseEvent) {
    }

    public void mentalFunction6Exit(MouseEvent mouseEvent) {
    }


    public void mentalFunction7Click(MouseEvent mouseEvent) {
    }

    public void mentalFunction7Enter(MouseEvent mouseEvent) {
    }

    public void mentalFunction7Exit(MouseEvent mouseEvent) {
    }


    public void mentalFunction8Click(MouseEvent mouseEvent) {
    }

    public void mentalFunction8Enter(MouseEvent mouseEvent) {
    }

    public void mentalFunction8Exit(MouseEvent mouseEvent) {
    }


    public void socialLife1Clicked(MouseEvent mouseEvent) {
    }

    public void socialLife1Enter(MouseEvent mouseEvent) {
    }

    public void socialLife1Exit(MouseEvent mouseEvent) {
    }
}
