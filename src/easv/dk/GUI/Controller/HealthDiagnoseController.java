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
    public void cilckedApperatus(MouseEvent mouseEvent) {clearAll(); vboxMovementapperatus.setVisible(true); vboxMovementapperatus.setDisable(false); labelSelectedCategory.setText("Movement Apparatus"); ;}
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
    public void nutritionClicked(MouseEvent mouseEvent) {clearAll(); vboxConsumtion.setVisible(true); vboxConsumtion.setDisable(false); labelSelectedCategory.setText("Nutrition");}
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
    public void skinClicked(MouseEvent mouseEvent) {clearAll(); vboxSkin.setVisible(true); vboxSkin.setDisable(false); labelSelectedCategory.setText("Skin and membranes");}
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
    public void communicationClicked(MouseEvent mouseEvent) {clearAll(); vboxCommunication.setVisible(true); vboxCommunication.setDisable(false); labelSelectedCategory.setText("Communication");}
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
    public void pshycoClicked(MouseEvent mouseEvent) {clearAll(); vboxPshyco.setVisible(true); vboxPshyco.setDisable(false); labelSelectedCategory.setText("Psychosocial relationships");}
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
    public void respoClicked(MouseEvent mouseEvent) {clearAll(); vboxResparation.setVisible(true); vboxResparation.setDisable(false); labelSelectedCategory.setText("Respiration and circulation");}
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
    public void sexualityClicked(MouseEvent mouseEvent) {clearAll(); vboxSexuality.setVisible(true); vboxSexuality.setDisable(false); labelSelectedCategory.setText("Sexuality");}
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
    public void painsClicked(MouseEvent mouseEvent) {clearAll(); vboxPain.setVisible(true); vboxPain.setDisable(false); labelSelectedCategory.setText("Pains and senses");}
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
    public void sleepClicked(MouseEvent mouseEvent) {clearAll(); vboxSleep.setVisible(true); vboxSleep.setDisable(false); labelSelectedCategory.setText("Sleep and rest");}
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
    public void knowledgeClicked(MouseEvent mouseEvent) {clearAll(); vboxInsight.setVisible(true); vboxInsight.setDisable(false); labelSelectedCategory.setText("knowledge and development");}
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
    public void wastesClicked(MouseEvent mouseEvent) {clearAll(); vboxWastes.setVisible(true); vboxWastes.setDisable(false); labelSelectedCategory.setText("Excrement of wastes");}
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
    public void selfcareClicked(MouseEvent mouseEvent) {clearAll(); vboxSelfCare.setVisible(true); vboxSelfCare.setDisable(false); labelSelectedCategory.setText("Selfcare");}
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
    public void practicalClicked(MouseEvent mouseEvent) {clearAll(); vboxPracticalWork.setVisible(true); vboxPracticalWork.setDisable(false); labelSelectedCategory.setText("Practical work");}
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
    public void mobilityClicked(MouseEvent mouseEvent) {clearAll(); vboxMobility.setVisible(true); vboxMobility.setDisable(false); labelSelectedCategory.setText("Mobility");}
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
    public void mentalClicked(MouseEvent mouseEvent) {clearAll(); vboxMentalFunction.setVisible(true); vboxMentalFunction.setDisable(false); labelSelectedCategory.setText("Mental functions");}
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
    public void socialClicked(MouseEvent mouseEvent) {clearAll(); vboxSocialLife.setVisible(true); vboxSocialLife.setDisable(false); labelSelectedCategory.setText("Social life");}
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




    @FXML
    private Label labelFunctionLevel1;
    public void functionLevel1Clicked(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with personal care");}
    public void functionLevel1Entered(MouseEvent mouseEvent) {
        labelFunctionLevel1.setUnderline(true);
        labelFunctionLevel1.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelFunctionLevel1.setUnderline(false);
                    }
                });
    }


    @FXML
    private Label labelFunctionLevel2;
    public void functionLevel2Clicked(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with daily activities ");}
    public void functionLevel2Entered(MouseEvent mouseEvent) {
        labelFunctionLevel2.setUnderline(true);
        labelFunctionLevel2.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelFunctionLevel2.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelMovementapperatus1;
    public void Apperatus1Clicked(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with mobility and movement"); }
    public void Apperatus1Entered(MouseEvent mouseEvent) {
        labelMovementapperatus1.setUnderline(true);
        labelMovementapperatus1.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelMovementapperatus1.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelConsumtion1;
    public void nutrition1Clicked(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with fluid consumption"); }
    public void nutrition1Entered(MouseEvent mouseEvent) {
        labelConsumtion1.setUnderline(true);
        labelConsumtion1.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelConsumtion1.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelConsumtion2;
    public void nutrition2Clicked(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with food consumption"); }
    public void nutrition2Entered(MouseEvent mouseEvent) {
        labelConsumtion2.setUnderline(true);
        labelConsumtion2.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelConsumtion2.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelConsumtion3;
    public void nutrition3Clicked(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Irregular weight chances"); }
    public void nutrition3Entered(MouseEvent mouseEvent) {
        labelConsumtion3.setUnderline(true);
        labelConsumtion3.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelConsumtion3.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelConsumtion4;
    public void nutrition4Clicked(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with obesity"); }
    public void nutrition4Entered(MouseEvent mouseEvent) {
        labelConsumtion4.setUnderline(true);
        labelConsumtion4.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelConsumtion4.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelConsumtion5;
    public void nutrition5Clicked(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with anorexia"); }
    public void nutrition5Entered(MouseEvent mouseEvent) {
        labelConsumtion5.setUnderline(true);
        labelConsumtion5.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelConsumtion5.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelSkin1;
    public void skin1Clicked(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with surgical wounds"); }
    public void skin1Enter(MouseEvent mouseEvent) {
        labelSkin1.setUnderline(true);
        labelSkin1.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelSkin1.setUnderline(false);
                    }
                });

    }

    @FXML
    private Label labelSkin2;
    public void skin2Clicked(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with diabetic wounds");}
    public void skin2Enter(MouseEvent mouseEvent) {
        labelSkin2.setUnderline(true);
        labelSkin2.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelSkin2.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelSkin3;
    public void skin3Clicked(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with cancer wounds");}
    public void skin3Enter(MouseEvent mouseEvent) {
        labelSkin3.setUnderline(true);
        labelSkin3.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelSkin3.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelSkin4;
    public void skin4Clicked(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with pressure sores");}
    public void skin4Enter(MouseEvent mouseEvent) {
        labelSkin4.setUnderline(true);
        labelSkin4.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelSkin4.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelSkin5;
    public void skin5Clicked(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with arterial wounds");}
    public void skin5Enter(MouseEvent mouseEvent) {
        labelSkin5.setUnderline(true);
        labelSkin5.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelSkin5.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelSkin6;
    public void skin6Clicked(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with venous wounds");}
    public void skin6Enter(MouseEvent mouseEvent) {
        labelSkin6.setUnderline(true);
        labelSkin6.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelSkin6.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelSkin7;
    public void skin7Clicked(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with mixed wounds"); }
    public void skin7Enter(MouseEvent mouseEvent) {
        labelSkin7.setUnderline(true);
        labelSkin7.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelSkin7.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelSkin8;
    public void skin8Clicked(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with trauma wounds");}
    public void skin8Enter(MouseEvent mouseEvent) {
        labelSkin8.setUnderline(true);
        labelSkin8.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelSkin8.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelSkin91;
    public void skin91Clicked(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Other problems with skin and mucous membrane ");}
    public void skin91Enter(MouseEvent mouseEvent) {
        labelSkin91.setUnderline(true); labelSkin92.setUnderline(true);
        labelSkin91.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelSkin91.setUnderline(false); labelSkin92.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelSkin92;
    public void skin92Clicked(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Other problems with skin and mucous membrane");}
    public void skin92Enter(MouseEvent mouseEvent) {
        labelSkin92.setUnderline(true); labelSkin91.setUnderline(true);
        labelSkin92.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelSkin92.setUnderline(false); labelSkin91.setUnderline(false);
                    }
                });

    }

    @FXML
    private Label labelCommunication;
    public void communication1Clicked(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with communication");}
    public void communication1Enter(MouseEvent mouseEvent) {
        labelCommunication.setUnderline(true);
        labelCommunication.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelCommunication.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelPshyco1;
    public void pshyco1Clicked(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with social contact");}
    public void pshyco1Enter(MouseEvent mouseEvent) {
        labelPshyco1.setUnderline(true);
        labelPshyco1.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelPshyco1.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelPshyco2;
    public void pshyco2Clicked(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Emotional problems");}
    public void pshyco2Enter(MouseEvent mouseEvent) {
        labelPshyco2.setUnderline(true);
        labelPshyco2.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelPshyco2.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelPshyco3;
    public void pshyco3Click(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("problems with drug misuse ");}
    public void pshyco3Enter(MouseEvent mouseEvent) {
        labelPshyco3.setUnderline(true);
        labelPshyco3.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelPshyco3.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelPshyco4;
    public void pshyco4Click(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Mental problems");}
    public void pshyco4Enter(MouseEvent mouseEvent) {
        labelPshyco4.setUnderline(true);
        labelPshyco4.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelPshyco4.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelResparation1;
    public void resporation1Click(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Respiration problems");}
    public void resporation1Enter(MouseEvent mouseEvent) {
        labelResparation1.setUnderline(true);
        labelResparation1.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelResparation1.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelResparation2;
    public void resporation2Click(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Circulation problems");}
    public void resporation2Enter(MouseEvent mouseEvent) {
        labelResparation2.setUnderline(true);
        labelResparation2.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelResparation2.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelSexuality;
    public void Sexuality1Clicked(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with sexuality");}
    public void Sexuality1Enter(MouseEvent mouseEvent) {
        labelSexuality.setUnderline(true);
        labelSexuality.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelSexuality.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelPain1;
    public void pain1Click(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Acute pains");}
    public void pain1Enter(MouseEvent mouseEvent) {
        labelPain1.setUnderline(true);
        labelPain1.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelPain1.setUnderline(false);
                    }
                });
    }

    @FXML
    private Label labelPain2;
    public void pain2Click(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Periodic pains");}
    public void pain2Enter(MouseEvent mouseEvent) {
        labelPain2.setUnderline(true);
        labelPain2.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelPain2.setUnderline(false);
                    }
                });
    }


    @FXML
    private Label labelPain3;
    public void pain3Click(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Chronic pains");}
    public void pain3Enter(MouseEvent mouseEvent) {
        labelPain3.setUnderline(true);
        labelPain3.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelPain3.setUnderline(false);
                    }
                });
    }


    @FXML
    private Label labelPain4;
    public void pain4Click(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with vision");}
    public void pain4Enter(MouseEvent mouseEvent) {
        labelPain4.setUnderline(true);
        labelPain4.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelPain4.setUnderline(false);
                    }
                });
    }


    @FXML
    private Label labelPain5;
    public void pain5Click(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with olfaction");}
    public void pain5Enter(MouseEvent mouseEvent) {
        labelPain5.setUnderline(true);
        labelPain5.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelPain5.setUnderline(false);
                    }
                });
    }


    @FXML
    private Label labelPain6;
    public void pain6Click(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with hearing");}
    public void pain6Enter(MouseEvent mouseEvent) {
        labelPain6.setUnderline(true);
        labelPain6.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelPain6.setUnderline(false);
                    }
                });
    }


    @FXML
    private Label labelPain7;
    public void pain7Click(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with gustation");}
    public void pain7Enter(MouseEvent mouseEvent) {
        labelPain7.setUnderline(true);
        labelPain7.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelPain7.setUnderline(false);
                    }
                });
    }


    @FXML
    private Label labelPain8;
    public void pain8Click(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with taction");}
    public void pain8Enter(MouseEvent mouseEvent) {
        labelPain8.setUnderline(true);
        labelPain8.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelPain8.setUnderline(false);
                    }
                });
    }


    @FXML
    private Label labelSleep1;
    public void Sleep1Click(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with sleep schedule");}
    public void Sleep1Enter(MouseEvent mouseEvent) {
        labelSleep1.setUnderline(true);
        labelSleep1.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelSleep1.setUnderline(false);
                    }
                });
    }


    @FXML
    private Label labelSleep2;
    public void Sleep2Click(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Sleep problems");}
    public void Sleep2Enter(MouseEvent mouseEvent) {
        labelSleep2.setUnderline(true);
        labelSleep2.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelSleep2.setUnderline(false);
                    }
                });
    }


    @FXML
    private Label labelInsight1;
    public void insight1Clicked(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with memory");}
    public void insight1Enter(MouseEvent mouseEvent) {
        labelInsight1.setUnderline(true);
        labelInsight1.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelInsight1.setUnderline(false);
                    }
                });
    }


    @FXML
    private Label labelInsight21;
    public void insight21Clicked(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with insight in");}
    public void insight21Enter(MouseEvent mouseEvent) {
        labelInsight21.setUnderline(true); labelInsight22.setUnderline(true);
        labelInsight21.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelInsight21.setUnderline(false); labelInsight22.setUnderline(false);
                    }
                });
    }


    @FXML
    private Label labelInsight22;
    public void insight22Click(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("treatment goals");}
    public void insight22Enter(MouseEvent mouseEvent) {
        labelInsight22.setUnderline(true); labelInsight21.setUnderline(true);
        labelInsight22.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelInsight22.setUnderline(false); labelInsight21.setUnderline(false);
                    }
                });
    }


    @FXML
    private Label labelInsight3;
    public void insight3Click(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with illness insight");}
    public void insight3Enter(MouseEvent mouseEvent) {
        labelInsight3.setUnderline(true);
        labelInsight3.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelInsight3.setUnderline(false);
                    }
                });
    }


    @FXML
    private Label labelInsight4;
    public void insight4Click(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Cognitive problems");}
    public void insight4Enter(MouseEvent mouseEvent) {
        labelInsight4.setUnderline(true);
        labelInsight4.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelInsight4.setUnderline(false);
                    }
                });
    }


    @FXML
    private Label labelWaste1;
    public void waste1Click(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with urination");}
    public void waste1Enter(MouseEvent mouseEvent) {
        labelWaste1.setUnderline(true);
        labelWaste1.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelWaste1.setUnderline(false);
                    }
                });
    }


    @FXML
    private Label labelWaste2;
    public void waste2Click(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with urine consistency");}
    public void waste2Enter(MouseEvent mouseEvent) {
        labelWaste2.setUnderline(true);
        labelWaste2.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelWaste2.setUnderline(false);
                    }
                });
    }


    @FXML
    private Label labelWaste3;
    public void waste3Click(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with fecal consistency");}
    public void waste3Enter(MouseEvent mouseEvent) {
        labelWaste3.setUnderline(true);
        labelWaste3.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelWaste3.setUnderline(false);
                    }
                });
    }


    @FXML
    private Label labelWaste4;
    public void waste4Click(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with stomach and intestines ");}
    public void waste4Enter(MouseEvent mouseEvent) {
        labelWaste4.setUnderline(true);
        labelWaste4.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelWaste4.setUnderline(false);
                    }
                });
    }


    @FXML
    private Label labelWaste5;
    public void waste5Click(MouseEvent mouseEvent) {labelSelectedSubCategory.setText("Problems with liquids from drain");}
    public void waste5Enter(MouseEvent mouseEvent) {
        labelWaste5.setUnderline(true);
        labelWaste5.addEventHandler(MouseEvent.MOUSE_EXITED,
                new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        labelWaste5.setUnderline(false);
                    }
                });
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
