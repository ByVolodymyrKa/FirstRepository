import javax.swing.*;

public class WindowAplication {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,500);
        JButton button1 = new JButton("Add");
        button1.setBounds(580,20,100,40);
        frame.add(button1);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
