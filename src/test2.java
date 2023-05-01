import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run() {
                JFrame frame=new JFrame("first graphic project");
                frame.setSize(800,600);
                frame.setVisible(true);
                //frame.setLayout(new BorderLayout());
                JButton jb=new JButton("OK");
                frame.add(jb,BorderLayout.SOUTH);
                JTextArea jtx =new JTextArea();
                frame.add(jtx,BorderLayout.NORTH);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                jb.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Random ran =new Random();
                        jtx.setBackground(new Color(ran.nextInt(255),
                                ran.nextInt(255),
                                ran.nextInt(255)));
                        jtx.setText(jtx.getText()+'\n'+jtx.getText());
                    }
                });



            }
        } );


    }
}
