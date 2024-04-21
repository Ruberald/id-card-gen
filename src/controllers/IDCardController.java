package controllers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import models.User;

public class IDCardController {

    private static final String TEMPLATE_PATH = "src/resources/templates/id_card_template.html";

    public void generateIDCard(User user) {
        try {
            // Read the content of the HTML template
            String templateContent = new String(Files.readAllBytes(new File(TEMPLATE_PATH).toPath()));

            // Replace placeholders with actual user data
            String idCardContent = templateContent
                    .replace("{{name}}", user.getName())
                    .replace("{{idNumber}}", user.getIdNumber());

            // Save the modified content to a new HTML file 
            saveIDCardToFile(idCardContent, user.getName() + "_ID_Card.html");

            System.out.println("ID Card generated successfully for " + user.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveIDCardToFile(String content, String filename) {
        try (FileWriter fileWriter = new FileWriter(filename)) {
            fileWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

