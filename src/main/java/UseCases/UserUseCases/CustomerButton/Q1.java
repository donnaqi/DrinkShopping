package UseCases.UserUseCases.CustomerButton;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q1 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e){
       JButton sourse = (JButton)e.getSource();
       JOptionPane.showMessageDialog(sourse, "Sorry, currently we do not offer any reward points");
    }
}