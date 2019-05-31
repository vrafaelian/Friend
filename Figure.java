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
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.input.*;
import javafx.scene.image.*;
//VictoriaRafaelian
//current emotion
public class Figure {
public String name = "?";
public String age = "?";
public String purpose = "?";
public String newName;
public String newAge;
public String newPurpose;

public Figure(String name, String age, String purpose){
this.name = name;
this.age = age;
this.purpose = purpose;
}

public void ChangeName(String newName){
  this.name = newName;
}

public void ChangeAge(String newAge){
  this.age = newAge;
}

public void ChangePurpose(String newPurpose){
  this.purpose = newPurpose;
}
}
