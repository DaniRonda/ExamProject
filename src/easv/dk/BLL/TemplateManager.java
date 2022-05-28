package easv.dk.BLL;


import easv.dk.BE.Template;
import easv.dk.DAL.TemplatesDAO;

import java.util.List;

public class TemplateManager {

    TemplatesDAO templateDAO = new TemplatesDAO();

    public TemplateManager() throws Exception {
    }

    public List<Template> getAllTemplates() throws Exception{
        return this.templateDAO.getAllTemplates();
    }


    public void updateTemplate(Template template) throws Exception{
        templateDAO.updateTemplate(template);
    }
}
