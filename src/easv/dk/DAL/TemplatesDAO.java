package easv.dk.DAL;


import easv.dk.BE.Template;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class TemplatesDAO {
    private static ConnectionManager cm;

    public TemplatesDAO() throws Exception {
        cm = new ConnectionManager();
    }



    public List<Template> getAllTemplates() throws Exception {
        List<Template> templateList = new ArrayList<>();
        Connection con = cm.getConnection();
        String sqlSelectTemplates = "\n" +
                "SELECT * from Citizen\n" +
                "where isTemplate = (select isTemplate from Citizen where isTemplate = 1) " +
                "GROUP by Citizen.ID, firstname, lastName, address, birthDate, isTemplate, phoneNumber\n;";
        PreparedStatement psSelectTemplates = con.prepareStatement(sqlSelectTemplates);
        ResultSet rs = psSelectTemplates.executeQuery();
        while (rs.next()) {
            String firstName = rs.getString("firstName");
            String lastName = rs.getString("lastName");
            String address = rs.getString("address");
            Date birthDate = rs.getDate("birthDate");
            boolean isTemplate = rs.getBoolean("isTemplate");
            int phoneNumber = rs.getInt("phoneNumber");
            int Id = rs.getInt("id");
            Template template = new Template(firstName, lastName, address, birthDate, phoneNumber, isTemplate, Id);
            templateList.add(template);
        }
        rs.close();
        psSelectTemplates.close();
        con.close();
        return templateList;
    }

    public void updateTemplate(Template template) throws Exception {
        Connection con = cm.getConnection();
        String sqlUpdateTemplate = "UPDATE  Citizen SET firstName=?, lastName=?, address=?, phoneNumber=? WHERE ID=?, WHERE isTemplate=1;";
        PreparedStatement psUpdateTemplate = con.prepareStatement(sqlUpdateTemplate);
        psUpdateTemplate.setString(1,template.getFirstName());
        psUpdateTemplate.setString(2,template.getLastName());
        psUpdateTemplate.setString(3,template.getAddress());
        psUpdateTemplate.setInt(4,template.getPhoneNumber());
        psUpdateTemplate.setInt(5,template.getID());
        psUpdateTemplate.execute();
        psUpdateTemplate.close();
        con.close();
        System.out.println(template.getFirstName()+" "+template.getID());
    }

    public Template createTemplate(Template template) throws Exception{
        Connection con = cm.getConnection();
        String sqlCreateTemplate = "INSERT INTO Citizen VALUES(?,?,?,?,?,?,?)";
        PreparedStatement psCreateTemplate = con.prepareStatement(sqlCreateTemplate, Statement.RETURN_GENERATED_KEYS);
        psCreateTemplate.setString(1,template.getFirstName());
        psCreateTemplate.setString(2,template.getLastName());
        psCreateTemplate.setString(3,template.getAddress());
        psCreateTemplate.setInt(4,template.getPhoneNumber());
        psCreateTemplate.setDate(5, (Date) template.getBirthDate());
        psCreateTemplate.setBoolean(6, template.isTemplate(true));
        psCreateTemplate.setInt(7,template.getID());
        psCreateTemplate.addBatch();
        psCreateTemplate.executeBatch();
        return template;
    }
}
