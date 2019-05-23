import javafx.application.Application;
import javafx.animation.FillTransition;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.input.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.event.EventHandler;
import javafx.application.Platform;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.input.KeyEvent;
import javafx.scene.control.TextField;
import javafx.animation.FadeTransition;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.CubicCurveTo;
import javafx.animation.PathTransition;
//VictoriaRafaelian
public class Friend extends Application {
  @Override
  public void start(Stage primaryStage) throws FileNotFoundException {
    //Creating Background Image
    //try {
      Image background1 = new Image(new FileInputStream("Corridor.jpg"));
          ImageView Corridor = new ImageView(background1);
          Corridor.setX(0);
          Corridor.setY(0);
          Corridor.setFitHeight(950);
          Corridor.setFitWidth(850);
          Corridor.setPreserveRatio(true);
          Corridor.setOpacity(100.0);

      Image background2 = new Image(new FileInputStream("Cellwall.jpg"));
          ImageView Cell = new ImageView(background2);
          Cell.setX(0);
          Cell.setY(0);
          Cell.setFitHeight(950);
          Cell.setFitWidth(850);
          Cell.setPreserveRatio(true);
          Cell.setOpacity(0.0);
  // } catch (Exception e) {
  //   System.out.println("The Image was not found.");
  // }
    //Large Central Text
    Text StartUp = new Text("Friend (?)");
    StartUp.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 70));
    StartUp.setFill(Color.WHITE);
    StartUp.setX(200);
    StartUp.setY(100);
     //First Shape: BIGSTAR1
     Circle star1 = new Circle();
     star1.setCenterX(100.0f);
     star1.setCenterY(100.0f);
     star1.setRadius(50.0f);
     star1.setFill(Color.WHITE);
     FadeTransition BigStar1 = new FadeTransition(Duration.millis(2000));
     BigStar1.setNode(star1);
     BigStar1.setFromValue(1.0);
     BigStar1.setToValue(0.3);
     BigStar1.setCycleCount(BigStar1.INDEFINITE);
     BigStar1.setAutoReverse(true);
     BigStar1.play();
     //Second shape
     Circle star2 = new Circle();
     star2.setCenterX(100.0f);
     star2.setCenterY(100.0f);
     star2.setRadius(20.0f);
     star2.setFill(Color.WHITE);

     //Fourth Shape
     Circle star3 = new Circle();
     star3.setCenterX(100.0f);
     star3.setCenterY(100.0f);
     star3.setRadius(5.0f);
     star3.setFill(Color.WHITE);
     Path path2 = new Path();
     MoveTo moveTo2 = new MoveTo(900, 180);

     //BIGSTAR2
     Circle star4 = new Circle();
     star4.setCenterX(600.0f);
     star4.setCenterY(200.0f);
     star4.setRadius(10.0f);
     star4.setFill(Color.WHITE);
     Circle star5 = new Circle();
     star5.setCenterX(600.0f);
     star5.setCenterY(200.0f);
     star5.setRadius(40.0f);
     star5.setFill(Color.WHITE);
     FadeTransition BigStar2 = new FadeTransition(Duration.millis(1000));
     BigStar2.setNode(star5);
     BigStar2.setFromValue(1.0);
     BigStar2.setToValue(0.3);
     BigStar2.setCycleCount(BigStar2.INDEFINITE);
     BigStar2.setAutoReverse(true);
     BigStar2.play();

     //BIGSTAR3
     Circle star6 = new Circle();
     star6.setCenterX(550.0f);
     star6.setCenterY(30.0f);
     star6.setRadius(5.0f);
     star6.setFill(Color.WHITE);
     Circle star7 = new Circle();
     star7.setCenterX(550.0f);
     star7.setCenterY(30.0f);
     star7.setRadius(20.0f);
     star7.setFill(Color.WHITE);
     FadeTransition BigStar3 = new FadeTransition(Duration.millis(500));
     BigStar3.setNode(star7);
     BigStar3.setFromValue(1.0);
     BigStar3.setToValue(0.3);
     BigStar3.setCycleCount(BigStar3.INDEFINITE);
     BigStar3.setAutoReverse(true);
     BigStar3.play();

     //Exit the Game
         Button leaveButton = new Button("Leave");
           leaveButton.setLayoutX(265);
           leaveButton.setLayoutY(250);
           leaveButton.setStyle("-fx-background-color: white; -fx-textfill: black;");
           leaveButton.setOnMouseClicked((new EventHandler<MouseEvent>() {
             public void handle(MouseEvent event) {
               System.out.println("Game Status: Offline");
                 Platform.exit();
        }
      }));

     //Game Continues
     Button enterButton = new Button("Enter");
     enterButton.setLayoutX(450);
     enterButton.setLayoutY(250);
     enterButton.setStyle("-fx-background-color: white; -fx-textfill: black;");
     //Enter Button is Pressed
        enterButton.setOnMouseClicked (new EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
              public void handle(javafx.scene.input.MouseEvent e)  {
                  System.out.println("Game Status: Online");

         }
      });
              enterButton.setOnMouseClicked((new EventHandler<MouseEvent>() {
                public void handle(MouseEvent event) {

                  Cell.setOpacity(100.0);
                  Corridor.setOpacity(0.0);
                  star1.setOpacity(0.0);
                  star2.setOpacity(0.0);
                  star3.setOpacity(0.0);
                  star4.setOpacity(0.0);
                  star5.setOpacity(0.0);
                  star6.setOpacity(0.0);
                  star7.setOpacity(0.0);
                  enterButton.setOpacity(0.0);
                  leaveButton.setOpacity(0.0);
                  StartUp.setOpacity(0.0);

         }
      }));

      EventHandler<KeyEvent> eventHandlerPress = new EventHandler<KeyEvent>() {
        @Override
          public void handle(KeyEvent event) {
            if (event.getCode().equals(KeyCode.ENTER)) {
              System.out.println("IT WORKS! IT ACTUALLY WORKS!");
             }
           }
         };

    //Group, scene, stage, game start
    Group root = new Group( Corridor,  StartUp, leaveButton, enterButton, star1, star2, star3, star4, star5, star6, star7);
    Scene scene = new Scene(root, 800, 400);
    scene.addEventFilter(KeyEvent.KEY_PRESSED, eventHandlerPress);
    primaryStage.setTitle("Friend (?)");
    scene.setFill(Color.BLACK);
    primaryStage.setScene(scene);
    primaryStage.show();
}
public static void main(String args[]){
     launch(args);
  }
}
