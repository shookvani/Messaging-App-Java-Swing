import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Main {
  Boolean framet=true;
  public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    JLabel y = new JLabel();
    System.out.println("message");
    String z= scan.nextLine();
    System.out.println("person");
    String a = scan.nextLine();
    JLabel b = new JLabel();
    System.out.println("your name");
    String c = scan.nextLine();
    JButton x = new JButton("Your message to " + a +" is:");
    JButton d = new JButton("Your message from " + c +" is:");
    JButton yes = new JButton("Yes");
    JButton no = new JButton("no");
    JLabel f = new JLabel();
   // Boolean framet=true;
    JButton yes2 = new JButton("Yes");
    JButton no2 = new JButton("no");
    JButton yes3 = new JButton("Yes");
    JButton no3 = new JButton("no");
    JButton restart = new JButton("restart");



    JFrame frame = new JFrame("From "+a);
    frame.setSize(600, 600);
    frame.setLayout(null);
    frame.setVisible(true);

    JFrame framex = new JFrame("From "+c);
    framex.setSize(600, 600);
    framex.setLayout(null);
    framex.setVisible(false);
    

    x.setBounds(10, 10, 300, 50);
    yes.setBounds(10, 140, 100, 50);
    yes2.setBounds(10, 140, 100, 50);
    yes3.setBounds(9, 250, 100, 50);
    no.setBounds(110, 140, 100, 50);
    no2.setBounds(110, 140, 100, 50);
    no3.setBounds(109, 250, 100, 50);
    y.setBounds(100,50,200,50);
    y.setFont(new Font("Arial", Font.PLAIN, 17));
    y.setForeground(Color.BLUE);
    b.setBounds(100,70,400,50);
    b.setFont(new Font("Arial", Font.PLAIN, 17));
    b.setForeground(Color.BLACK);
    d.setBounds(10, 10, 300, 50);
    f.setBounds(10,50,400,50);
    f.setFont(new Font("Arial", Font.PLAIN, 17));
    f.setForeground(Color.RED);
    restart.setBounds(250, 250, 100, 50);


    frame.add(x);
    frame.add(y);
    frame.add(b);
    
    frame.setVisible(true);


    x.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        y.setText(z);
        b.setText("ready to send?");
        frame.add(yes);
        frame.add(no);
        
      }    });
      no.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        b.setText("ok, let me know");
        
      }    });

      yes.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        b.setText("ok, sent");
        
        frame.setVisible(false);
       // framet=false;
       // framex.add(d);
       framex.add(f);
        framex.add(b);
        //framex.add(x);
       f.setText("your message from "+c+" is: "+z);
        y.setText("");
        b.setText("would you like to respond?");
        framex.add(yes2);
        framex.add(no2);
        framex.add(no3);
        framex.add(yes3);
        framex.add(restart);

        no2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            b.setText("ok, let me know");
        
      }    });

      yes2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
          //  framex.removeAll();
            f.setText("");
          //  d.setText("your message to "+c+" is:");
            System.out.println("message");
            y.setBounds(10,175,200,50);
            framex.add(y);
            String m=scan.next();
            y.setText(m);
            b.setBounds(100,200,400,50);
            b.setText("ready to send?");
            
            
            no3.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
                b.setText("ok, let me know");
                f.setText("refresh, please");
                // framex.getContentPane().removeAll();
                restart.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {

                    framex.getContentPane().removeAll();
                    framex.setVisible(false);
                    frame.setVisible(true);  
                    
                    
                  }    });
        
      }    });
          yes3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            
            b.setText("ok, sent");
            f.setText("refresh, please");
             restart.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {

                    framex.getContentPane().removeAll();
                    framex.setVisible(false);
                    frame.setVisible(true); 
                    System.out.println("message");
                    String st= scan.nextLine();
                    JLabel y2 = new JLabel();
                    y2.setBounds(100,50,200,50);
                    y2.setFont(new Font("Arial", Font.PLAIN, 17));
                      y2.setForeground(Color.BLUE);
                      JLabel b2 = new JLabel();
                    b2.setBounds(100,250,200,50);
                    b2.setFont(new Font("Arial", Font.PLAIN, 17)); 
                      y2.setForeground(Color.BLACK);
                      y2.setText(z);
                   b2.setText("ready to send?");
                   frame.add(y2);
                   frame.add(b2);
                    
                  }    }); 
    
  }    });

            
            
        
      }    });
      



        framex.setVisible(true);


        
      }    });
     // z=st;

     


      


  }
}