package MYframes;
import javax.swing.JOptionPane;

public class dialogue {
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog("Enter Your Name");
        
        // JOptionPane.showMessageDialog(null, "hello "+name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age")); // using parseInt we can change the data type of int to string and Integer is the data type. we can use any other data type too 

        int num = (int) Double.parseDouble(JOptionPane.showInputDialog("Enter your number"));
        
        int height = (int) Float.parseFloat(JOptionPane.showInputDialog(null,"enter your height"));
        
        JOptionPane.showMessageDialog(null, "Hello! "+name+" you are "+ age+" years old and your number is "+num+ "and your height is "+height);
    }
}
