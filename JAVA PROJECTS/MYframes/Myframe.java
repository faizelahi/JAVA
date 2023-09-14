package MYframes;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
public class Myframe extends JFrame {
    Myframe()
    {
        this.setTitle("   My First Frame");            // title is written here  //
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);                  // Restrict Resizing of panel//
        this.setSize(400,350);                  // Set the size of a frame //
        this.setVisible(true);                             // Make frame visible //
        ImageIcon logo = new ImageIcon("logo.png"); // Create an image icon //
        this.setIconImage(logo.getImage());                  // Set Logo to the panel //
        this.getContentPane().setBackground(Color.white);     // Change Background Color of panel //
   
    }
    
    
}
