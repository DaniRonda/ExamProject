package easv.dk.BLL;


import easv.dk.BE.Template;
import easv.dk.DAL.DALFacade;
import easv.dk.DAL.IDataAccess;
import easv.dk.DAL.TemplatesDAO;

import java.util.List;

public class TemplateManager {

    private IDataAccess dataAccess;


    public TemplateManager() throws Exception {dataAccess= DALFacade.getInstance(); }

    public List<Template> getAllTemplates() throws Exception{
        return this.dataAccess.getAllTemplates();
    }

    public void createTemplate(Template template) throws Exception{
        dataAccess.createTemplate(template);
    }

    public void updateTemplate(Template template) throws Exception{
        dataAccess.updateTemplate(template);
    }
}
