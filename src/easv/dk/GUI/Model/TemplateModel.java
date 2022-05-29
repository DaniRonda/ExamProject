package easv.dk.GUI.Model;
import easv.dk.BE.Template;
import easv.dk.BLL.TemplateManager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.util.List;


public class TemplateModel {
    ObservableList<Template> getAllTemplates;
    TemplateManager templateManager = new TemplateManager();

    public TemplateModel() throws Exception {
        getAllTemplates = FXCollections.observableArrayList();
    }

    public List<Template> getAllTemplates() throws Exception {
        this.getAllTemplates = FXCollections.observableArrayList();
        this.getAllTemplates.addAll(this.templateManager.getAllTemplates());
        return this.getAllTemplates;
    }
    public void updateTemplate(Template templateUpdated) throws Exception {
        templateManager.updateTemplate(templateUpdated);
    }
}
