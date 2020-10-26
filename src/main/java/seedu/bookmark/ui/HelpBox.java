package seedu.bookmark.ui;

import java.io.IOException;
import java.util.logging.XMLFormatter;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

/**
 * An example of a custom control using FXML.
 * This control represents a dialog box consisting of an ImageView to represent the speaker's face and a label
 * containing text from the speaker.
 */
public class HelpBox extends VBox {
    @FXML
    private Label exampleIntro;

    @FXML
    private Label exampleCommand;

    private HelpBox(String intro, String message) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MainWindow.class.getResource("/view/HelpBox.fxml"));
            fxmlLoader.setController(this);
            fxmlLoader.setRoot(this);
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        exampleIntro.setText(intro);
        exampleCommand.setText(message);
    }

    /**
     * Creates a HelpBox object
     * @param text Text that is to be included in the Help Box
     * @param img A picture as an example
     * @return a HelpBox object
     */
    public static HelpBox getHelpBox(String intro, String message) {
        return new HelpBox(intro, message);
    }
}
