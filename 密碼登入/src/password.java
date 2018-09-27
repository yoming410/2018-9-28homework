//密碼登入
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class password extends JFrame implements ActionListener{
    private JPanel jPanel1,jPanel2;
    private JTextField resultField;
    private JButton s1,s2,s3,s4,s5,s6,s7,s8,s9,s0,Summit,AC;
    private boolean end;
    private String str;
    private double num1,PWD=12345.0;

    public password(){
        super("密碼登入 資工1B  106021153  郭又銘");
        setSize(400,300);
        Container con=getContentPane();
        con.setLayout(new BorderLayout());

        jPanel1=new JPanel();
        jPanel1.setLayout(new GridLayout(1,1));
        jPanel2=new JPanel();
        jPanel2.setLayout(new GridLayout(4,3));

        resultField=new JTextField("");
        jPanel1.add(resultField);
        con.add(jPanel1,BorderLayout.NORTH);

        //ImageIcon icon1 = new ImageIcon("1.png");
       // s1=new JButton(icon1); s1.addActionListener(this);
        s1=new JButton("1"); s1.addActionListener(this);

        //ImageIcon icon2 = new ImageIcon("2.png");
        s2=new JButton("2"); s2.addActionListener(this);

        //ImageIcon icon3 = new ImageIcon("3.png");
        s3=new JButton("3"); s3.addActionListener(this);

        //ImageIcon icon4 = new ImageIcon("4.png");
        s4=new JButton("4"); s4.addActionListener(this);

        //ImageIcon icon5 = new ImageIcon("5.png");
        s5=new JButton("5"); s5.addActionListener(this);

        //ImageIcon icon6 = new ImageIcon("6.png");
        s6=new JButton("6"); s6.addActionListener(this);

        //ImageIcon icon7 = new ImageIcon("7.png");
        s7=new JButton("7"); s7.addActionListener(this);

        //ImageIcon icon8 = new ImageIcon("8.png");
        s8=new JButton("8"); s8.addActionListener(this);

        //ImageIcon icon9 = new ImageIcon("9.png");
        s9=new JButton("9"); s9.addActionListener(this);

        //ImageIcon icon0 = new ImageIcon("0.png");
        s0=new JButton("0"); s0.addActionListener(this);


        Summit=new JButton("登入"); Summit.addActionListener(this);

        AC=new JButton("AC "); AC.addActionListener(this);

        jPanel2.add(s1);
        jPanel2.add(s2);
        jPanel2.add(s3);

        jPanel2.add(s4);
        jPanel2.add(s5);
        jPanel2.add(s6);

        jPanel2.add(s7);
        jPanel2.add(s8);
        jPanel2.add(s9);

        jPanel2.add(s0);
        jPanel2.add(Summit);
        jPanel2.add(AC);
        con.add(jPanel2,BorderLayout.CENTER);
    }

    public void num(int i){
        String s;

        s=String.valueOf(i);
        str = resultField.getText() + s;
        resultField.setText(str);
    }

    public void actionPerformed(ActionEvent e){ //數字事件
        if(e.getSource()==s1)
            num(1);
        else if(e.getSource()==s2)
            num(2);
        else if(e.getSource()==s3)
            num(3);
        else if(e.getSource()==s4)
            num(4);
        else if(e.getSource()==s5)
            num(5);
        else if(e.getSource()==s6)
            num(6);
        else if(e.getSource()==s7)
            num(7);
        else if(e.getSource()==s8)
            num(8);
        else if(e.getSource()==s9)
            num(9);
        else if(e.getSource()==s0)
            num(0);
        else if(e.getSource()==Summit){
            num1=Double.parseDouble(resultField.getText());
            if ((num1-PWD)==0)
                resultField.setText("登入成功!");
            else
                resultField.setText("密碼錯誤!");
        }

        else if(e.getSource()==AC){
            num1=0;
            resultField.setText("");
        }
    }

    public static void main(String[] args){
        password th1=new password();
        th1.show();
    }
}


