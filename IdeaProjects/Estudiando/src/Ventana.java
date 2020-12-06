import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

public Ventana(){
    setSize(500, 500);
    setTitle("allegro");
    //setLocation(100,200);
    //setBounds(100, 200, 500, 1000);

    setLocationRelativeTo(null);
    //setResizable(false);
    setMinimumSize( new Dimension(500,500));

    //this.getContentPane().setBackground(Color.BLACK);




    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

}

private void iniciarComponente(){
    JPanel panel = new JPanel();
    panel.setBackground(Color.green);

    this.getContentPane().add(panel);


}


}
