package tutorial12;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

public class DescriptionPane extends BorderPane {

  private Label lblImageTitle = new Label();

  public DescriptionPane() {
    lblImageTitle.setContentDisplay(ContentDisplay.TOP);
    lblImageTitle.setPrefSize(100,  200);
    lblImageTitle.setFont(new Font("SansSerif", 16));
    setLeft(lblImageTitle);
    setPadding(new Insets(5, 5, 5, 5));
  }
  
  public void setTitle(String title) {
    lblImageTitle.setText(title);
  }

  public void setImageView(ImageView icon) {
    lblImageTitle.setGraphic(icon);

  }

 
}