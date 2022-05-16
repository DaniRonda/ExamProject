package easv.dk.GUI.Controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    @FXML
    private Label labelSelectedCategory;
    @FXML
    private Label labelSelectedSubCategory;

    String selectedDiagnose;
    String selectedCategory;
    String selectedSubCategory;





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

    @FXML
    private Button buttonHealth;
    public void toFunctional(ActionEvent actionEvent) {
        vboxfunction.setVisible(true); vboxfunction.setDisable(false);
        vboxHealth.setVisible(false); vboxHealth.setDisable(true);
        selectedDiagnose = "functionalDiagnose";}
    public void mouseOverToHealthBtn(MouseEvent mouseEvent) {
        buttonHealth.setStyle("-fx-border-color: #212121; -fx-background-color: #DEDEDE; -fx-border-radius: 15; -fx-background-radius: 15;");

        buttonHealth.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        buttonHealth.setStyle("-fx-border-color: #8D8D8D; -fx-background-color: #D3D3D3; -fx-border-radius: 15; -fx-background-radius: 15;");}
                });
    }


    @FXML
    private Button buttonToFunctional;
    public void toHealth(ActionEvent actionEvent) {
        vboxHealth.setVisible(true); vboxHealth.setDisable(false);
        vboxfunction.setVisible(false); vboxfunction.setDisable(true);
        selectedDiagnose = "healthDiagnose";}
    public void mouseOverToFunctionalBtn(MouseEvent mouseEvent) {
        buttonToFunctional.setStyle("-fx-border-color: #212121; -fx-background-color: #DEDEDE; -fx-border-radius: 15; -fx-background-radius: 15;");

        buttonToFunctional.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        buttonToFunctional.setStyle("-fx-border-color: #8D8D8D; -fx-background-color: #D3D3D3; -fx-border-radius: 15; -fx-background-radius: 15;");}
                });
    }

    public void toClientsWishesScreen(ActionEvent actionEvent) {

    }


    @FXML
    private Label labelFunctionLevel;
    public void functionLevelCLiscke(MouseEvent mouseEvent) {clearAll(); VBoxFunctionLevel.setVisible(true); VBoxFunctionLevel.setDisable(false);  labelSelectedCategory.setText("Functionlevel");}
    public void mouseOverFunction(MouseEvent mouseEvent) {
        labelFunctionLevel.setUnderline(true);
        labelFunctionLevel.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelFunctionLevel.setUnderline(false);
                    }
                });
    }



    @FXML
    private Label labelMovementApperatus;
    public void cilckedApperatus(MouseEvent mouseEvent) {clearAll(); vboxMovementapperatus.setVisible(true); vboxMovementapperatus.setDisable(false); selectedCategory = "Movement Apparatus";}
    public void mouseOverApperatus(MouseEvent mouseEvent) {
        labelMovementApperatus.setUnderline(true);
        labelMovementApperatus.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelMovementApperatus.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelNutrition;
    public void nutritionClicked(MouseEvent mouseEvent) {clearAll(); vboxConsumtion.setVisible(true); vboxConsumtion.setDisable(false); selectedCategory = "Nutrition";}
    public void mouseOverNutrtion(MouseEvent mouseEvent) {
        labelNutrition.setUnderline(true);
        labelNutrition.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelNutrition.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelSkin;
    public void skinClicked(MouseEvent mouseEvent) {clearAll(); vboxSkin.setVisible(true); vboxSkin.setDisable(false); selectedCategory = "Skin and membranes";}
    public void skinEntered(MouseEvent mouseEvent) {
        labelSkin.setUnderline(true);
        labelSkin.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelSkin.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelComunication;
    public void communicationClicked(MouseEvent mouseEvent) {clearAll(); vboxCommunication.setVisible(true); vboxCommunication.setDisable(false); selectedCategory = "Communication";}
    public void communicationEntered(MouseEvent mouseEvent) {
        labelComunication.setUnderline(true);
        labelComunication.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelComunication.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelPshyco;
    public void pshycoClicked(MouseEvent mouseEvent) {clearAll(); vboxPshyco.setVisible(true); vboxPshyco.setDisable(false); selectedCategory = "Psychosocial relationships";}
    public void pshycoEntered(MouseEvent mouseEvent) {
        labelPshyco.setUnderline(true);
        labelPshyco.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelPshyco.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelCirkulation;
    public void respoClicked(MouseEvent mouseEvent) {clearAll(); vboxResparation.setVisible(true); vboxResparation.setDisable(false); selectedCategory = "Respiration and circulation";}
    public void respoEntered(MouseEvent mouseEvent) {
        labelCirkulation.setUnderline(true);
        labelCirkulation.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelCirkulation.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelSSexuality;
    public void sexualityClicked(MouseEvent mouseEvent) {clearAll(); vboxSexuality.setVisible(true); vboxSexuality.setDisable(false); selectedCategory = "Sexuality";}
    public void sexualityEntered(MouseEvent mouseEvent) {
        labelSSexuality.setUnderline(true);
        labelSSexuality.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelSSexuality.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelPains;
    public void painsClicked(MouseEvent mouseEvent) {clearAll(); vboxPain.setVisible(true); vboxPain.setDisable(false); selectedCategory = "Pains and senses";}
    public void painsEntered(MouseEvent mouseEvent) {
        labelPains.setUnderline(true);
        labelPains.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelPains.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelSleep;
    public void sleepClicked(MouseEvent mouseEvent) {clearAll(); vboxSleep.setVisible(true); vboxSleep.setDisable(false); selectedCategory = "Sleep and rest";}
    public void sleepEntered(MouseEvent mouseEvent) {
        labelSleep.setUnderline(true);
        labelSleep.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelSleep.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelKnowledge;
    public void knowledgeClicked(MouseEvent mouseEvent) {clearAll(); vboxInsight.setVisible(true); vboxInsight.setDisable(false); selectedCategory = "knowledge and development";}
    public void knowledgeEntered(MouseEvent mouseEvent) {
        labelKnowledge.setUnderline(true);
        labelKnowledge.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelKnowledge.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelWaste;
    public void wastesClicked(MouseEvent mouseEvent) {clearAll(); vboxWastes.setVisible(true); vboxWastes.setDisable(false); selectedCategory = "Excrement of wastes";}
    public void wastesEntered(MouseEvent mouseEvent) {
        labelWaste.setUnderline(true);
        labelWaste.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelWaste.setUnderline(false);
                    }
                });
    }


    @FXML
    private Label labelSelfCare;
    public void selfcareClicked(MouseEvent mouseEvent) {clearAll(); vboxSelfCare.setVisible(true); vboxSelfCare.setDisable(false); selectedCategory = "Selfcare";}
    public void selfcareEntered(MouseEvent mouseEvent) {
        labelSelfCare.setUnderline(true);
        labelSelfCare.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelSelfCare.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelPracticalWork;
    public void practicalClicked(MouseEvent mouseEvent) {clearAll(); vboxPracticalWork.setVisible(true); vboxPracticalWork.setDisable(false); selectedCategory = "Practical work";}
    public void pacticalEntered(MouseEvent mouseEvent) {
        labelPracticalWork.setUnderline(true);
        labelPracticalWork.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelPracticalWork.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelMobility;
    public void mobilityClicked(MouseEvent mouseEvent) {clearAll(); vboxMobility.setVisible(true); vboxMobility.setDisable(false); selectedCategory = "Mobility";}
    public void mobilityEntered(MouseEvent mouseEvent) {
        labelMobility.setUnderline(true);
        labelMobility.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelMobility.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelMentalFunctions;
    public void mentalClicked(MouseEvent mouseEvent) {clearAll(); vboxMentalFunction.setVisible(true); vboxMentalFunction.setDisable(false); selectedCategory = "Mental functions";}
    public void mentalEntered(MouseEvent mouseEvent) {
        labelMentalFunctions.setUnderline(true);
        labelMentalFunctions.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelMentalFunctions.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelSocialLife;
    public void socialClicked(MouseEvent mouseEvent) {clearAll(); vboxSocialLife.setVisible(true); vboxSocialLife.setDisable(false); selectedCategory = "Social life";}
    public void socialEntered(MouseEvent mouseEvent) {
        labelSocialLife.setUnderline(true);
        labelSocialLife.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelSocialLife.setUnderline(false);
                    }
                });
    }





    public void functionLevel1Clicked(MouseEvent mouseEvent) {
    }

    public void functionLevel1Entered(MouseEvent mouseEvent) {
    }



    public void functionLevel2Clicked(MouseEvent mouseEvent) {
    }

    public void functionLevel2Entered(MouseEvent mouseEvent) {
    }


    public void Apperatus1Clicked(MouseEvent mouseEvent) {
    }

    public void Apperatus1Entered(MouseEvent mouseEvent) {
    }


    public void nutrition1Clicked(MouseEvent mouseEvent) {
    }

    public void nutrition1Entered(MouseEvent mouseEvent) {
    }


    public void nutrition2Clicked(MouseEvent mouseEvent) {
    }

    public void nutrition2Entered(MouseEvent mouseEvent) {
    }


    public void nutrition3Clicked(MouseEvent mouseEvent) {
    }

    public void nutrition3Entered(MouseEvent mouseEvent) {
    }


    public void nutrition4Clicked(MouseEvent mouseEvent) {
    }

    public void nutrition4Entered(MouseEvent mouseEvent) {
    }


    public void nutrition5Clicked(MouseEvent mouseEvent) {
    }

    public void nutrition5Entered(MouseEvent mouseEvent) {
    }

    
    public void skin1Clicked(MouseEvent mouseEvent) {
    }

    public void skin1Enter(MouseEvent mouseEvent) {
    }


    public void skin2Clicked(MouseEvent mouseEvent) {
    }

    public void skin2Enter(MouseEvent mouseEvent) {
    }


    public void skin3Clicked(MouseEvent mouseEvent) {
    }

    public void skin3Enter(MouseEvent mouseEvent) {
    }


    public void skin4Clicked(MouseEvent mouseEvent) {
    }

    public void skin4Enter(MouseEvent mouseEvent) {
    }


    public void skin5Clicked(MouseEvent mouseEvent) {
    }

    public void skin5Enter(MouseEvent mouseEvent) {
    }


    public void skin6Clicked(MouseEvent mouseEvent) {
    }

    public void skin6Enter(MouseEvent mouseEvent) {
    }


    public void skin7Clicked(MouseEvent mouseEvent) {
    }

    public void skin7Enter(MouseEvent mouseEvent) {
    }


    public void skin8Clicked(MouseEvent mouseEvent) {
    }

    public void skin8Enter(MouseEvent mouseEvent) {
    }


    public void skin91Clicked(MouseEvent mouseEvent) {
    }

    public void skin91Enter(MouseEvent mouseEvent) {
    }


    public void skin92Clicked(MouseEvent mouseEvent) {
    }

    public void skin92Enter(MouseEvent mouseEvent) {
    }


    public void communication1Clicked(MouseEvent mouseEvent) {
    }

    public void communication1Enter(MouseEvent mouseEvent) {
    }


    public void pshyco1Clicked(MouseEvent mouseEvent) {
    }

    public void pshyco1Enter(MouseEvent mouseEvent) {
    }


    public void pshyco2Clicked(MouseEvent mouseEvent) {
    }

    public void pshyco2Enter(MouseEvent mouseEvent) {
    }


    public void pshyco3Click(MouseEvent mouseEvent) {
    }

    public void pshyco3Enter(MouseEvent mouseEvent) {
    }


    public void pshyco4Click(MouseEvent mouseEvent) {
    }

    public void pshyco4Enter(MouseEvent mouseEvent) {
    }


    public void resporation1Click(MouseEvent mouseEvent) {
    }

    public void resporation1Enter(MouseEvent mouseEvent) {
    }


    public void resporation2Click(MouseEvent mouseEvent) {
    }

    public void resporation2Enter(MouseEvent mouseEvent) {
    }


    public void Sexuality1Clicked(MouseEvent mouseEvent) {
    }

    public void Sexuality1Enter(MouseEvent mouseEvent) {
    }


    public void pain1Click(MouseEvent mouseEvent) {
    }

    public void pain1Enter(MouseEvent mouseEvent) {
    }


    public void pain2Click(MouseEvent mouseEvent) {
    }

    public void pain2Enter(MouseEvent mouseEvent) {
    }



    public void pain3Click(MouseEvent mouseEvent) {
    }

    public void pain3Enter(MouseEvent mouseEvent) {
    }



    public void pain4Click(MouseEvent mouseEvent) {
    }

    public void pain4Enter(MouseEvent mouseEvent) {
    }



    public void pain5Click(MouseEvent mouseEvent) {
    }

    public void pain5Enter(MouseEvent mouseEvent) {
    }



    public void pain6Click(MouseEvent mouseEvent) {
    }

    public void pain6Enter(MouseEvent mouseEvent) {
    }



    public void pain7Click(MouseEvent mouseEvent) {
    }

    public void pain7Enter(MouseEvent mouseEvent) {
    }



    public void pain8Click(MouseEvent mouseEvent) {
    }

    public void pain8Enter(MouseEvent mouseEvent) {
    }



    public void Sleep1Click(MouseEvent mouseEvent) {
    }

    public void Sleep1Enter(MouseEvent mouseEvent) {
    }



    public void Sleep2Click(MouseEvent mouseEvent) {
    }

    public void Sleep2Enter(MouseEvent mouseEvent) {
    }



    public void insight1Clicked(MouseEvent mouseEvent) {
    }

    public void insight1Enter(MouseEvent mouseEvent) {
    }



    public void insight21Clicked(MouseEvent mouseEvent) {
    }

    public void insight21Enter(MouseEvent mouseEvent) {
    }



    public void insight22Click(MouseEvent mouseEvent) {
    }

    public void insight22Enter(MouseEvent mouseEvent) {
    }



    public void insight3Click(MouseEvent mouseEvent) {
    }

    public void insight3Enter(MouseEvent mouseEvent) {
    }



    public void insight4Click(MouseEvent mouseEvent) {
    }

    public void insight4Enter(MouseEvent mouseEvent) {
    }



    public void waste1Click(MouseEvent mouseEvent) {
    }

    public void waste1Enter(MouseEvent mouseEvent) {
    }



    public void waste2Click(MouseEvent mouseEvent) {
    }

    public void waste2Enter(MouseEvent mouseEvent) {
    }



    public void waste3Click(MouseEvent mouseEvent) {
    }

    public void waste3Enter(MouseEvent mouseEvent) {
    }



    public void waste4Click(MouseEvent mouseEvent) {
    }

    public void waste4Enter(MouseEvent mouseEvent) {
    }



    public void waste5Click(MouseEvent mouseEvent) {
    }

    public void waste5Enter(MouseEvent mouseEvent) {
    }



    public void selfcare1Clicked(MouseEvent mouseEvent) {
    }

    public void selfcare1Enter(MouseEvent mouseEvent) {
    }



    public void selfcare2Click(MouseEvent mouseEvent) {
    }

    public void selfcare2Enter(MouseEvent mouseEvent) {
    }



    public void selfcare3Clicked(MouseEvent mouseEvent) {
    }

    public void selfcare3Entered(MouseEvent mouseEvent) {
    }



    public void selfcare4Clicked(MouseEvent mouseEvent) {
    }
    
    public void selfcare4Enter(MouseEvent mouseEvent) {
    }


    public void selfcare5Clicked(MouseEvent mouseEvent) {
    }

    public void selfcare5Enter(MouseEvent mouseEvent) {
    }



    public void selfcare6Click(MouseEvent mouseEvent) {
    }

    public void selfcare6Enter(MouseEvent mouseEvent) {
    }



    public void selfcare7Click(MouseEvent mouseEvent) {
    }

    public void selfcare7Enter(MouseEvent mouseEvent) {
    }



    public void selfcare8Click(MouseEvent mouseEvent) {
    }

    public void selfcare8Enter(MouseEvent mouseEvent) {
    }



    public void practical1Click(MouseEvent mouseEvent) {
    }

    public void practical1Enter(MouseEvent mouseEvent) {
    }



    public void practical2Click(MouseEvent mouseEvent) {
    }

    public void practical2Enter(MouseEvent mouseEvent) {
    }



    public void practical3Click(MouseEvent mouseEvent) {
    }

    public void practical3Enter(MouseEvent mouseEvent) {
    }



    public void practical4Click(MouseEvent mouseEvent) {
    }

    public void practical4Enter(MouseEvent mouseEvent) {
    }



    public void mobility1Click(MouseEvent mouseEvent) {
    }

    public void mobility1Enter(MouseEvent mouseEvent) {
    }



    public void mobility2Click(MouseEvent mouseEvent) {
    }

    public void mobility2Enter(MouseEvent mouseEvent) {
    }



    public void mobility3Click(MouseEvent mouseEvent) {
    }

    public void mobility3Enter(MouseEvent mouseEvent) {
    }



    public void mobility4Click(MouseEvent mouseEvent) {
    }

    public void mobility4Enter(MouseEvent mouseEvent) {
    }



    public void mobility5Click(MouseEvent mouseEvent) {
    }

    public void mobility5Enter(MouseEvent mouseEvent) {
    }



    public void mobility6Click(MouseEvent mouseEvent) {
    }

    public void mobility6Enter(MouseEvent mouseEvent) {
    }



    public void mobility7Click(MouseEvent mouseEvent) {
    }

    public void mobility7Enter(MouseEvent mouseEvent) {
    }



    public void mobility8Click(MouseEvent mouseEvent) {
    }

    public void mobility8Enter(MouseEvent mouseEvent) {
    }



    public void mobility9Click(MouseEvent mouseEvent) {
    }

    public void mobility9Enter(MouseEvent mouseEvent) {
    }



    public void mentalFunction1Clicked(MouseEvent mouseEvent) {
    }

    public void mentalFunction1Enter(MouseEvent mouseEvent) {
    }



    public void mentalFunction2Click(MouseEvent mouseEvent) {
    }

    public void mentalFunction2Enter(MouseEvent mouseEvent) {
    }



    public void mentalFunction3Clicked(MouseEvent mouseEvent) {
    }

    public void mentalFunction3Enter(MouseEvent mouseEvent) {
    }



    public void mentalFunction4Clicked(MouseEvent mouseEvent) {
    }

    public void mentalFunction4Entered(MouseEvent mouseEvent) {
    }



    public void mentalFunction5Clicked(MouseEvent mouseEvent) {
    }

    public void mentalFunction5Entered(MouseEvent mouseEvent) {
    }



    public void mentalFunction6Click(MouseEvent mouseEvent) {
    }

    public void mentalFunction6Enter(MouseEvent mouseEvent) {
    }



    public void mentalFunction7Click(MouseEvent mouseEvent) {
    }

    public void mentalFunction7Enter(MouseEvent mouseEvent) {
    }



    public void mentalFunction8Click(MouseEvent mouseEvent) {
    }

    public void mentalFunction8Enter(MouseEvent mouseEvent) {
    }



    public void socialLife1Clicked(MouseEvent mouseEvent) {
    }

    public void socialLife1Enter(MouseEvent mouseEvent) {
    }


}
