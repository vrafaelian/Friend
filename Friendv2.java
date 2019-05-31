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
import javafx.scene.transform.Translate;
import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

//VictoriaRafaelian
public class Friendv2 extends Application {
  public Text verdict = new Text();
  public Figure character = new Figure("?", "?", "?");

    String music = "LightContainmentDecontamination.mp3"; //by Jacek "Fragik" Rogal
  Media hit = new Media(new File(music).toURI().toString());
  MediaPlayer mediaPlayer = new MediaPlayer(hit);

  @Override
  public void start(Stage primaryStage) throws FileNotFoundException {

    // Figure Character = new Figure("?", "?", "?");
    //Music said "No"
    try {
    File soundFile = new File("LightContainmentDecontamination.mp3"); //by Jacek "Fragik" Rogal
    AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
    }
    catch (Exception e) {
      System.out.println("The music literally will not work.");
    }

    // mediaPlayer.play();

    //Creating Background Image
    Image background1 = new Image(new FileInputStream("Corridor.jpg"));
    ImageView Corridor = new ImageView(background1);
    Corridor.setX(0);
    Corridor.setY(0);
    Corridor.setFitHeight(950);
    Corridor.setFitWidth(850);
    Corridor.setPreserveRatio(true);
    Corridor.setOpacity(15.0);

    Image background2 = new Image(new FileInputStream("Cellwall.jpg"));
    ImageView Cell = new ImageView(background2);
    Cell.setX(0);
    Cell.setY(0);
    Cell.setFitHeight(950);
    Cell.setFitWidth(850);
    Cell.setPreserveRatio(true);
    Cell.setOpacity(0.0);

    Image figure1 = new Image(new FileInputStream("Scared.png"));
    ImageView Scared = new ImageView(figure1);
    Scared.setX(350);
    Scared.setY(100);
    Scared.setFitHeight(300);
    Scared.setFitWidth(300);
    Scared.setPreserveRatio(true);
    Scared.setOpacity(0.0);

    // } catch (Exception e) {
    //   System.out.println("The Image was not found.");
    // }
    //Large Central Text
    Text StartUp = new Text("Friend (?)");
    StartUp.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 50));
    StartUp.setFill(Color.WHITE);
    StartUp.setX(200);
    StartUp.setY(95);
    //Whats My Name
    Text myName = new Text("What's my name?");
    myName.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 17));
    myName.setFill(Color.BLACK);
    myName.setX(360);
    myName.setY(55);
    myName.setOpacity(0.0);
    //Whats My age
    Text myAge = new Text("What's my age?");
    myAge.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 17));
    myAge.setFill(Color.BLACK);
    myAge.setX(370);
    myAge.setY(55);
    myAge.setOpacity(0.0);
    //Whats My Purpose
    Text myPurpose = new Text("What's my purpose?");
    myPurpose.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 16));
    myPurpose.setFill(Color.BLACK);
    myPurpose.setX(350);
    myPurpose.setY(55);
    myPurpose.setOpacity(0.0);
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
    //Name Connor
    Button nameConnor = new Button("Connor");
    nameConnor.setLayoutX(265);
    nameConnor.setLayoutY(150);
    nameConnor.setStyle("-fx-background-color: white; -fx-textfill: black;");
    nameConnor.setOnMouseClicked((new EventHandler<MouseEvent>() {
      public void handle(MouseEvent event) {
        System.out.println("Is its name Connor?");
      }
    }));
    nameConnor.setOpacity(0.0);
    //Name Henry
    Button nameHenry = new Button("Henry");
    nameHenry.setLayoutX(500);
    nameHenry.setLayoutY(150);
    nameHenry.setStyle("-fx-background-color: white; -fx-textfill: black;");
    nameHenry.setOnMouseClicked((new EventHandler<MouseEvent>() {
      public void handle(MouseEvent event) {
        System.out.println("Is its name Henry?");
      }
    }));
    nameHenry.setOpacity(0.0);
    //Age Fourty
    Button ageFourty = new Button("Fourty");
    ageFourty.setLayoutX(500);
    ageFourty.setLayoutY(200);
    ageFourty.setStyle("-fx-background-color: white; -fx-textfill: black;");
    ageFourty.setOnMouseClicked((new EventHandler<MouseEvent>() {
      public void handle(MouseEvent event) {
        System.out.println("Is it fourty years old?");
      }
    }));
    ageFourty.setOpacity(0.0);
    //Age Twenty
    Button ageTwenty = new Button("Twenty");
    ageTwenty.setLayoutX(265);
    ageTwenty.setLayoutY(200);
    ageTwenty.setStyle("-fx-background-color: white; -fx-textfill: black;");
    ageTwenty.setOnMouseClicked((new EventHandler<MouseEvent>() {
      public void handle(MouseEvent event) {
        System.out.println("Is it twenty years old?");
      }
    }));
    ageTwenty.setOpacity(0.0);
    //Bad Purpose
    Button badPurpose = new Button("Bad");
    badPurpose.setLayoutX(320);
    badPurpose.setLayoutY(250);
    badPurpose.setStyle("-fx-background-color: white; -fx-textfill: black;");
    badPurpose.setOnMouseClicked((new EventHandler<MouseEvent>() {
      public void handle(MouseEvent event) {
        System.out.println("Does it have a bad purpose?");
      }
    }));
    badPurpose.setOpacity(0.0);
    //Good Purpose
    Button goodPurpose = new Button("Good");
    goodPurpose.setLayoutX(500);
    goodPurpose.setLayoutY(250);
    goodPurpose.setStyle("-fx-background-color: white; -fx-textfill: black;");
    goodPurpose.setOnMouseClicked((new EventHandler<MouseEvent>() {
      public void handle(MouseEvent event) {
        System.out.println("Does it have a good purpose?");
      }
    }));
    goodPurpose.setOpacity(0.0);
    //Conclusion
    Button theConclusion = new Button("Conclusion");
    theConclusion.setLayoutX(200);
    theConclusion.setLayoutY(250);
    theConclusion.setStyle("-fx-background-color: white; -fx-textfill: black;");
    theConclusion.setOnMouseClicked((new EventHandler<MouseEvent>() {
      public void handle(MouseEvent event) {
        System.out.println("Does it have a bad purpose?");
      }
    }));
    theConclusion.setOpacity(0.0);
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
        Scared.setOpacity(100.0);
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
        mediaPlayer.play();

        FadeTransition figureMoving = new FadeTransition(Duration.millis(2000));
        figureMoving.setNode(Scared);
        figureMoving.setFromValue(1.0);
        figureMoving.setToValue(0.6);
        figureMoving.setCycleCount(figureMoving.INDEFINITE);
        figureMoving.setAutoReverse(true);
        figureMoving.play();

        myName.setOpacity(100.0);
        nameConnor.setOpacity(100.0);
        nameHenry.setOpacity(100.0);

        nameConnor.setOnMouseClicked((new EventHandler<MouseEvent>() {
          public void handle(MouseEvent event) {

            nameConnor.setOpacity(0.0);
            nameHenry.setOpacity(0.0);
            myName.setOpacity(0.0);
            character.newName = "Connor";
            //variable in another class was replaced
            System.out.println("My name is " + character.newName);

            myAge.setOpacity(100.0);
            ageFourty.setOpacity(100.0);
            ageTwenty.setOpacity(100.0);

            ageFourty.setOnMouseClicked((new EventHandler<MouseEvent>() {
              public void handle(MouseEvent event) {

                myAge.setOpacity(0.0);
                ageFourty.setOpacity(0.0);
                ageTwenty.setOpacity(0.0);
                character.newAge = "Fourty";
                //variable in another class was replaced
                System.out.println("I am " + character.newAge + " years old");

                myPurpose.setOpacity(100.0);
                badPurpose.setOpacity(100.0);
                goodPurpose.setOpacity(100.0);

                goodPurpose.setOnMouseClicked((new EventHandler<MouseEvent>() {
                  public void handle(MouseEvent event) {

                    myPurpose.setOpacity(0.0);
                    badPurpose.setOpacity(0.0);
                    goodPurpose.setOpacity(0.0);
                    character.newPurpose = "good";
                    //variable in another class was replaced
                    System.out.println("I have " + character.newPurpose + " intentions");

                    theConclusion.setOpacity(100.0);

                    //Final Verdict
                    theConclusion.setOnMouseClicked((new EventHandler<MouseEvent>() {
                      public void handle(MouseEvent event) {
                        theConclusion.setOpacity(0.0);
                        finalVerdict();
                      }
                    }));

                  }
                }));

                badPurpose.setOnMouseClicked((new EventHandler<MouseEvent>() {
                  public void handle(MouseEvent event) {

                    myPurpose.setOpacity(0.0);
                    badPurpose.setOpacity(0.0);
                    goodPurpose.setOpacity(0.0);
                    character.newPurpose = "bad";
                    //variable in another class was replaced
                    System.out.println("I have " + character.newPurpose + " intentions");

                    theConclusion.setOpacity(100.0);

                    //Final Verdict
                    theConclusion.setOnMouseClicked((new EventHandler<MouseEvent>() {
                      public void handle(MouseEvent event) {
                        theConclusion.setOpacity(0.0);
                        finalVerdict();
                      }
                    }));

                  }
                }));

              }
            }));

            ageTwenty.setOnMouseClicked((new EventHandler<MouseEvent>() {
              public void handle(MouseEvent event) {

                myAge.setOpacity(0.0);
                ageFourty.setOpacity(0.0);
                ageTwenty.setOpacity(0.0);
                character.newAge = "Twenty";
                //variable in another class was replaced
                System.out.println("I am " + character.newAge + " years old");

                myPurpose.setOpacity(100.0);
                badPurpose.setOpacity(100.0);
                goodPurpose.setOpacity(100.0);

                goodPurpose.setOnMouseClicked((new EventHandler<MouseEvent>() {
                  public void handle(MouseEvent event) {

                    myPurpose.setOpacity(0.0);
                    badPurpose.setOpacity(0.0);
                    goodPurpose.setOpacity(0.0);
                    character.newPurpose = "good";
                    //variable in another class was replaced
                    System.out.println("I have " + character.newPurpose + " intentions");

                    theConclusion.setOpacity(100.0);

                    //Final Verdict
                    theConclusion.setOnMouseClicked((new EventHandler<MouseEvent>() {
                      public void handle(MouseEvent event) {
                        theConclusion.setOpacity(0.0);
                        finalVerdict();
                      }
                    }));

                  }
                }));

                badPurpose.setOnMouseClicked((new EventHandler<MouseEvent>() {
                  public void handle(MouseEvent event) {

                    myPurpose.setOpacity(0.0);
                    badPurpose.setOpacity(0.0);
                    goodPurpose.setOpacity(0.0);
                    character.newPurpose = "bad";
                    //variable in another class was replaced
                    System.out.println("I have " + character.newPurpose + " intentions");

                    theConclusion.setOpacity(100.0);

                    //Final Verdict
                    theConclusion.setOnMouseClicked((new EventHandler<MouseEvent>() {
                      public void handle(MouseEvent event) {
                        theConclusion.setOpacity(0.0);
                        finalVerdict();
                      }
                    }));

                  }
                }));

              }
            }));

          }
        }));

        nameHenry.setOnMouseClicked((new EventHandler<MouseEvent>() {
          public void handle(MouseEvent event) {

            nameHenry.setOpacity(0.0);
            nameConnor.setOpacity(0.0);
            myName.setOpacity(0.0);
            character.newName = "Henry";
            //variable in another class was replaced
            System.out.println("My name is " + character.newName);

            myAge.setOpacity(100.0);
            ageFourty.setOpacity(100.0);
            ageTwenty.setOpacity(100.0);

            ageFourty.setOnMouseClicked((new EventHandler<MouseEvent>() {
              public void handle(MouseEvent event) {

                myAge.setOpacity(0.0);
                ageFourty.setOpacity(0.0);
                ageTwenty.setOpacity(0.0);
                character.newAge = "Fourty";
                //variable in another class was replaced
                System.out.println("I am " + character.newAge + " years old");

                myPurpose.setOpacity(100.0);
                badPurpose.setOpacity(100.0);
                goodPurpose.setOpacity(100.0);

                goodPurpose.setOnMouseClicked((new EventHandler<MouseEvent>() {
                  public void handle(MouseEvent event) {

                    myPurpose.setOpacity(0.0);
                    badPurpose.setOpacity(0.0);
                    goodPurpose.setOpacity(0.0);
                    character.newPurpose = "good";
                    //variable in another class was replaced
                    System.out.println("I have " + character.newPurpose + " intentions");

                    theConclusion.setOpacity(100.0);

                    //Final Verdict
                    theConclusion.setOnMouseClicked((new EventHandler<MouseEvent>() {
                      public void handle(MouseEvent event) {
                        theConclusion.setOpacity(0.0);
                        finalVerdict();
                      }
                    }));

                  }
                }));

                badPurpose.setOnMouseClicked((new EventHandler<MouseEvent>() {
                  public void handle(MouseEvent event) {

                    myPurpose.setOpacity(0.0);
                    badPurpose.setOpacity(0.0);
                    goodPurpose.setOpacity(0.0);
                    character.newPurpose = "bad";
                    //variable in another class was replaced
                    System.out.println("I have " + character.newPurpose  + " intentions");

                    theConclusion.setOpacity(100.0);

                    //Final Verdict
                    theConclusion.setOnMouseClicked((new EventHandler<MouseEvent>() {
                      public void handle(MouseEvent event) {
                        theConclusion.setOpacity(0.0);
                        finalVerdict();
                      }
                    }));

                  }
                }));

              }
            }));

            ageTwenty.setOnMouseClicked((new EventHandler<MouseEvent>() {
              public void handle(MouseEvent event) {

                myAge.setOpacity(0.0);
                ageFourty.setOpacity(0.0);
                ageTwenty.setOpacity(0.0);
                character.newAge = "Twenty";
                //variable in another class was replaced
                System.out.println("I am " + character.newAge + " years old");

                myPurpose.setOpacity(100.0);
                badPurpose.setOpacity(100.0);
                goodPurpose.setOpacity(100.0);

                goodPurpose.setOnMouseClicked((new EventHandler<MouseEvent>() {
                  public void handle(MouseEvent event) {

                    myPurpose.setOpacity(0.0);
                    badPurpose.setOpacity(0.0);
                    goodPurpose.setOpacity(0.0);
                    character.newPurpose = "good";
                    //variable in another class was replaced
                    System.out.println("I have " + character.newPurpose + " intentions");

                    theConclusion.setOpacity(100.0);

                    //Final Verdict
                    theConclusion.setOnMouseClicked((new EventHandler<MouseEvent>() {
                      public void handle(MouseEvent event) {
                        theConclusion.setOpacity(0.0);
                        finalVerdict();
                      }
                    }));

                  }
                }));

                badPurpose.setOnMouseClicked((new EventHandler<MouseEvent>() {
                  public void handle(MouseEvent event) {

                    myPurpose.setOpacity(0.0);
                    badPurpose.setOpacity(0.0);
                    goodPurpose.setOpacity(0.0);
                    character.newPurpose = "bad";
                    //variable in another class was replaced
                    System.out.println("I have " + character.newPurpose + " intentions");

                    theConclusion.setOpacity(100.0);

                    //Final Verdict
                    theConclusion.setOnMouseClicked((new EventHandler<MouseEvent>() {
                      public void handle(MouseEvent event) {
                        theConclusion.setOpacity(0.0);
                        finalVerdict();
                      }
                    }));

                  }
                }));

              }
            }));


          }
        }));

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
    Group root = new Group(Corridor, StartUp, star1, star2, star3, star4, star5, star6, star7, Cell, myName, myAge, myPurpose, verdict, nameConnor, nameHenry, ageFourty, ageTwenty, badPurpose, goodPurpose, leaveButton, enterButton, theConclusion, Scared);
    Scene scene = new Scene(root, 800, 400);
    scene.addEventFilter(KeyEvent.KEY_PRESSED, eventHandlerPress);
    primaryStage.setTitle("Friend (?)");
    scene.setFill(Color.BLACK);
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public void finalVerdict() {

    // Figure Character = new Figure("?", "?", "?");

    verdict.setText("My name is " + character.newName + ". I am " + character.newAge + " years old. And I am here to do " + character.newPurpose + " things.");
    verdict.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 20));
    verdict.setFill(Color.WHITE);
    verdict.setX(70);
    verdict.setY(200);
    verdict.setOpacity(0.0);

    if(character.newPurpose == "good") {
      System.out.println("I am " + character.newPurpose + ".");
      verdict.setOpacity(100.0);
    } else if(character.newPurpose == "bad") {
      System.out.println("I am " + character.newPurpose + ".");
      verdict.setOpacity(100.0);
    } else {
      System.out.println("Hey, you definitely shouldn't be here.");
    }

  }

  public static void main(String args[]){
    launch(args);
  }
}
