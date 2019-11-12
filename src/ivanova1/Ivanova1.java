/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ivanova1;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author ivano
 */
public class Ivanova1 extends Application {
    
     public static void main(String[] args) 
    {
        launch(args);
    }
    @Override
    public void start(Stage img) {
         img.setTitle("Добро пожаловать!");
           Group root = new Group();
    Scene theScene = new Scene( root );
   img.setScene( theScene );
         
    Canvas canvas = new Canvas( 500, 600 );
    root.getChildren().add( canvas );
         
      Button btn = new Button();
     
    btn.setStyle("-fx-text-fill: blue;-fx-background-color: transparent");  
    

      btn.relocate(50, 200);
      
  
Font font = new Font("Calibri",48); 
btn.setFont(font);
    
      
        btn.setText("Добро пожаловать!");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                 Label secondLabel = new Label("I'm a Label on new Window");
              
                StackPane secondaryLayout = new StackPane();
                secondaryLayout.getChildren().add(secondLabel);
 
                Scene secondScene = new Scene(secondaryLayout, 230, 100);
 
                // New window (Stage)
                Stage newWindow = new Stage();
                newWindow.setTitle("Поймай ромашку!");
                newWindow.setScene(secondScene);
 
                // Set position of second window, related to primary window.
                newWindow.setX(img.getX() + 200);
                newWindow.setY(img.getY() + 100);
                secondLabel.getStylesheets().add("css/label.css");
                newWindow.show();
           /* StackPane root = new StackPane();
        root.getChildren().add(btn);
            Scene scene = new Scene(root, 300, 250);
        scene.getStylesheets().add("css/mycss.css");*/
            
            }
        });
        
        
            
        
        
     
        root.getChildren().add(btn);
        
    GraphicsContext gc = canvas.getGraphicsContext2D();
    
      Image p1 = new Image( "mak.png");
    gc.drawImage( p1, 1, 200 );
    
     Image p2 = new Image( "golub.jpg");
    gc.drawImage( p2, 300, 30 ); 
    
      Image p3 = new Image( "babochka.png");
    gc.drawImage( p3, 100, 10 ); 
    
   /* gc.setFill( Color.BLUE );
    gc.setStroke( Color.RED );
    gc.setLineWidth(2);
    Font theFont = Font.font( "Calibri", FontWeight.BOLD, 48 );
    gc.setFont( theFont );
    gc.fillText( "Добро пожаловать!", 50, 300 );
    gc.strokeText( "Добро пожаловать!", 50, 300 );*/
    
    gc.setFill( Color.LIGHTGREY );
    gc.setLineWidth(2);
    Font in = Font.font( "Calibri", FontWeight.BOLD, 20 );
    gc.setFont( in );
    gc.fillText( "©IvanovaK.A/b18PIo", 300, 580 );
    
        img.show();
    }

   
}


//©IvanovaK.A