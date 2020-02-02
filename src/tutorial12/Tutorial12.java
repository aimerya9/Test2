import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import tutorial12.DescriptionPane;

public class Tutorial12 extends Application {

  private String[] flagTitles = {"Apple", "Orange", "Lemon"};

  
  private ImageView[] flagImage = {new ImageView("image/apple.jpg"),
      new ImageView("image/orange.jpg"), new ImageView("image/lemon.jpg")};

  private String[] flagDescription = new String[3];
  private DescriptionPane descriptionPane = new DescriptionPane();
  private ComboBox<String> cbo = new ComboBox<>(); 

  @Override 
  public void start(Stage primaryStage) {
  
    setDisplay(0);

    BorderPane pane = new BorderPane();
      
    BorderPane paneForComboBox = new BorderPane();
    paneForComboBox.setLeft(new Label("Select a fruit: "));
    paneForComboBox.setCenter(cbo);
    pane.setTop(paneForComboBox);
    cbo.setPrefWidth(400);
    cbo.setValue("Apple");
    
    ObservableList<String> items = 
      FXCollections.observableArrayList(flagTitles);
    cbo.getItems().addAll(items); 
    pane.setCenter(descriptionPane);
    cbo.setOnAction(e -> setDisplay(items.indexOf(cbo.getValue())));
    

    Scene scene = new Scene(pane, 400, 450);
    primaryStage.setTitle("ComboBoxDemo");
    primaryStage.setScene(scene); 
    primaryStage.show(); 
  }

  public void setDisplay(int index) {
    descriptionPane.setTitle(flagTitles[index]);
    descriptionPane.setImageView(flagImage[index]);
   
  }

  public static void main(String[] args) {
    launch(args);
  }
}
