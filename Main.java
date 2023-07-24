import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{
    private Container c;
    private Font f,f1;
    private JLabel Username,passward,imageLabel;

    private JTextField textField;
    private JPasswordField passwordField;
    private Cursor cursor;
    private JButton button,button1;
    private ImageIcon img;

    private JFrame frame;

    private Object Public;
    Main(){
        initComponents();
    }

    public void initComponents(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        ImageIcon icon = new ImageIcon(getClass().getResource("logo.png"));
        this.setIconImage(icon.getImage());

        f = new Font("Arial",Font.BOLD,14);
        f1 = new Font("Arial",Font.PLAIN,10);



        Username = new JLabel();
        Username.setText("UserName");
        Username.setBounds(135,50,100,20);
        Username.setFont(f);
        Username.setForeground(Color.darkGray);
        Username.setToolTipText("Enter Your Valid Username");
        c.add(Username);

        passward = new JLabel();
        passward.setText("Password");
        passward.setBounds(135,90,100,20);
        passward.setFont(f);
        passward.setForeground(Color.darkGray);
        passward.setToolTipText("Enter Valid Password");
        c.add(passward);


        textField = new JTextField();
        textField.setText("Username");
        textField.setBounds(215,50,138,30);
        textField.setBackground(Color.LIGHT_GRAY);
        textField.setForeground(Color.BLACK);
        textField.setFont(f1);

        c.add(textField);

        passwordField = new JPasswordField();
        passwordField.setText("Passward");
        passwordField.setBounds(215,90,138,30);
        passwordField.setBackground(Color.LIGHT_GRAY);
        passwordField.setForeground(Color.BLACK);
        passwordField.setFont(f1);

        c.add(passwordField);


        cursor = new Cursor(Cursor.HAND_CURSOR);

        button = new JButton("Submit");
        button.setFont(f1);
        button.setBounds(215,130,68,25);
        button.setBackground(Color.green);
        button.setCursor(cursor);
        c.add(button);

        button1 = new JButton("Clear");
        button1.setFont(f1);
        button1.setBounds(290,130,60,25);
        button1.setBackground(Color.RED);
        button1.setCursor(cursor);
        c.add(button1);

        img = new ImageIcon(getClass().getResource("backGround.png"));

        imageLabel = new JLabel(img);
        imageLabel.setBounds(115,30,280,200);
        c.add(imageLabel);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String User = textField.getText();
                String pass = passwordField.getText();
                if (User.equals("Hosain") && pass.equals("1234")) {
                    /*JOptionPane.showMessageDialog(null, "Login Successful", "welcome", JOptionPane.WARNING_MESSAGE);*/
                    NewPage page = new NewPage();
                    page.setVisible(true);
                    JLabel wel_label = new JLabel("Welcome:"+User);
                    page.getContentPane().add(wel_label);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Wrong Information","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                passwordField.setText("");
            }
        });
    }
    public static void main(String[] args) {
        Main frame = new Main();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,170,600,470);
        frame.setTitle("Login Panel");
        frame.setBackground(Color.YELLOW);
        /*ImageIcon icon = new ImageIcon(Main.class.getResource("logo.png"));
        frame.setIconImage(icon.getImage());*/
    }
}