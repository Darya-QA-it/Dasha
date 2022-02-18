import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Runall {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setTitle("ТВОРЕНИЕ");
        frame.setSize(600,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menu =new JMenuBar();
        JMenu menuHelloCli = new JMenu("HelloCli");
        JMenuItem itemHelloEng =new JMenuItem("HelloEn");
        menuHelloCli.add(itemHelloEng);
        menu.add(menuHelloCli);

        frame.setJMenuBar(menu);


        itemHelloEng.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Hello, world!");
            }
        });

        frame.setVisible(true);


    }
}
