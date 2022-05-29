package easv.dk.GUI.Controller;
import easv.dk.BE.Template;
import easv.dk.GUI.Model.TemplateModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class EditTemplateViewController {
    @FXML
    private TextField templateFirstName_txt;
    @FXML
    private TextField templateLastName_txt;
    @FXML
    private TextField templateAddress_txt;
    @FXML
    private TextField templatePhoneNumber_txt;
    @FXML
    private Button btnSaveUpdateTemplate;
    @FXML
    private Button btnCancelUpdateTemplate;
    @FXML
    private Template selectedTemplate;

    TemplateModel templateModel = new TemplateModel();
    private TemplateViewController parentController;

    public void setParentController(TemplateViewController templateViewController){
        this.parentController = templateViewController;
    }

    public EditTemplateViewController() throws Exception {
    }

    public void saveUpdateTemplate(ActionEvent actionEvent) throws Exception {
        String templateFirstName= templateFirstName_txt.getText();
        String templateLastName= templateLastName_txt.getText();
        String templateAddress = templateAddress_txt.getText();
        int templatePhoneNumber = templatePhoneNumber_txt.getProperties().size();
        Template templateUpdated = new Template(templateFirstName,templateLastName,templateAddress, selectedTemplate.getBirthDate(), templatePhoneNumber, selectedTemplate.isTemplate(false), selectedTemplate.getID());
        templateModel.updateTemplate(templateUpdated);
        Stage stage = (Stage)btnSaveUpdateTemplate.getScene().getWindow();
        stage.close();
        parentController.initialize();
    }

    public void cancelUpdateTemplate(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Discard changes ?", ButtonType.YES, ButtonType.NO, ButtonType.CANCEL);
        alert.showAndWait();
        if (alert.getResult() == ButtonType.YES) {
            Stage stage = (Stage) btnCancelUpdateTemplate.getScene().getWindow();
            stage.close();
        }
    }

    public void setInfo(Template selectedItem) {
        selectedTemplate = selectedItem;
        templateFirstName_txt.setText(selectedItem.getFirstName());
        templateLastName_txt.setText(String.valueOf(selectedItem.getLastName()));
        templateAddress_txt.setText(String.valueOf(selectedItem.getAddress()));
        templatePhoneNumber_txt.setText(String.valueOf(selectedItem.getPhoneNumber()));
    }
}
