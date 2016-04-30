import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
   VehicleViewer class is a tester class for VehicleComponent, Vehicle, Car and Truck classes. <br>
   This asks the user for the number of Vehicles to draw, and then, draw either car or truck
   with random choice of location (coordinates). <br>
   The choice of car or truck is also random.
   After getting an appropriate input, it will display n vehicles in the window.
   
   @author Naoya Hayashi
   @date March 5th, 2013
   @version 1.0
*/
public class VehicleViewer{
   private static final int FRAME_WIDTH = 800;
   private static final int FRAME_HEIGHT = 600;
   
   /**
         Main method which actually executes the program implementing all classes. <br>
         Precondition: Input must be an integer. (ie, Input must not include a character)
         @param args args is not used
      */
   public static void main(String[] args){
      String inputStr;
      int inputNum;
      
      inputStr = JOptionPane.showInputDialog(null
         , "How many behicles should be displayed?\n"
         + "(give an integer)", "Input", JOptionPane.QUESTION_MESSAGE);
      
      while((inputStr == null) || (inputStr.isEmpty())){
         // Check if the cancel button was hit.
         // If so, the program terminates.
         if(inputStr == null){
            JOptionPane.showMessageDialog(null
               , "Cancel button was clicked.\n" 
               + "So, the program terminates.");
            System.exit(1);
         }
         else if(inputStr.isEmpty()){
            JOptionPane.showMessageDialog(null
               , "No value is typed.\n" + "Please type an integer.");
            inputStr = JOptionPane.showInputDialog(null
            , "How many behicles should be displayed?\n"
            + "(give an integer)", "Input"
            , JOptionPane.QUESTION_MESSAGE);
         }
      }
      
      inputNum = Integer.parseInt(inputStr);
      
      VehicleComponent VC = new VehicleComponent
         (FRAME_WIDTH, FRAME_HEIGHT, inputNum);
      
      JFrame frame = new JFrame();
      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setTitle("VehicleBouncer");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(VC);
      frame.setVisible(true);
   }
}


