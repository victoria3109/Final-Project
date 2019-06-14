/**
 * Eco.java
 * Assignment: Final Project
 * Purpose: This project demonstrates the use
 * of constructors, mouselistensers, 
 * Mouse events, JFrames, and JOptionPanes.
 *
 * @version 06/14/19
 */

import java.awt.Dimension;
import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseListener;

public class Eco {  
    
    int x,y; //This line declares up the coordinates to be changed 
             //whenever the user clicks on the JFrame.
    JFrame frame;//This line declares the JFrame.
    
    public static void main (String args[]) {  
        SwingUtilities.invokeLater(new Runnable() {  
            public void run() {  
                new Eco();  //This runs the constructor
            }  
        });  
    }
    
    public Eco() {  //This constructor oriantes the JFrame's size, closing and set up.
                    // As well as adds pop-up screens when teh user clicks on the 
                    // appropriate aspect, or pops-up "No Image Clicked" if no aspect 
                    //is selected.
        frame = new JFrame("Display Image");  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frameSetUp(); //This sets up the JFrame with the appropriate pictures in the
                      // correct locations. 
       
        frame.setSize(1000, 650);
        frame.setVisible(true); 
        
        frame.addMouseListener(new MouseAdapter() { //This sets up the Mouse Actions.

        public void mouseClicked(MouseEvent e) {//This overrides a method of MouseAdapter to 
                                                //personalize the mouseClicked method to my program.
            x = e.getX();
            y =e.getY();
            
            if ((x>210)&&(x<292)&&(y>235)&&(y<321)) {
               JOptionPane.showMessageDialog(frame,
               "Salmon are a vital part of the Pacific Northwest Ecosystem. \n"
               + "Not only do they supply more than 137 species with  a vital\n"
               + "food supply, but further when eaten especially by walking\n" 
               + "species, their nutrients (specifically nitrogen) is spread \n"
               + "throughout the forest and surrounding ecosystem. It has \nbeen"
               + "shown that these nutrients are vital to a healthy forest\n and "
               + "thus all the surrounding organisms.",
               "The Salmon",
               JOptionPane.PLAIN_MESSAGE);
            } else if ((x>180)&&(x<478)&&(y>300)&&(y<512)) {
               JOptionPane.showMessageDialog(frame,
               "Streams, specifically cold, fresh water streams, are vital to\n"
               + "the survival of salmon. Additionally they provide water to\n"
               + "the wild species of the forest, including bears, birds, trees,"
               + "\n and many other species within the surrounding ecosystem \n"
               + "(called the riparian zone).",
               "The Stream",
               JOptionPane.PLAIN_MESSAGE);
            } else if ((x>450)&&(x<540)&&(y>460)&&(y<560)) {
               JOptionPane.showMessageDialog(frame,
               "There are many types of fungi, some of which (called mycorrhizal\n"
               + "fungi) largely benefit the surrounding ecosystem through\n"
               + "expanding the plant’s root system allowing them greater access\n"
               + "to nutrients and water, while the plant provides the \nfungi with"
               +" glucose to help it grow. ",
               "The Fungi",
               JOptionPane.PLAIN_MESSAGE);
            } else if ((x>835)&&(x<930)&&(y>445)&&(y<537)) {
               JOptionPane.showMessageDialog(frame,
               "There are many types of bacteria, some (called Rhizobial \nbacteria)"
               + "that fix nitrogen for plants (a vital ingredient for \nplant’s "
               + "growth and health). In return the plant provides glucose \nfor the "
               + "bacteria to use to grow and survive. Other types\n of bacteria are"
               + " also vital in the decomposing cycle, as they\n help to break down"
               + " material and its nutrients into a form\n that can be absorbed by "
               + "the ecosystem.",
               "The Bacteria",
               JOptionPane.PLAIN_MESSAGE);
            } else if ((x>480)&&(x<781)&&(y>290)&&(y<457)) {
               JOptionPane.showMessageDialog(frame,
               " Bear’s diets mostly include vegetation or salmon. Their \nscat "
               + "(especially ones that contain what’s left of salmon) provide\n "
               + "nutrients (nitrogen) to the forest floor and surrounding \n"
               + "vegetation. The scat that contains vegetation, typically berries"
               + " \nor fruit, spreads seeds throughout the forest. This increases "
               + "\nthe biodiversity of the surrounding forest, creating a healthier"
               + "\n ecosystem and thus in turn helping the bears thrive.",
               "The Bear",
               JOptionPane.PLAIN_MESSAGE);
            } else if ((x>20)&&(x<113)&&(y>490)&&(y<572)) {
               JOptionPane.showMessageDialog(frame,
               "Similar to that of the bear, birds eat both berries, vegetation\n"
               + " and salmon. Thus, much like the bear, birds help increase the\n"
               + " biodiversity of the forest (through the seed contaminants of their"
               + "\n droppings) and spread the nutrients from dead salmon \nthroughout"
               + " the forest. These nutrients and seed droppings thus \nincrease the"
               + " health of the forest and all the organisms\n within the surrounding"
               + " ecosystem.",
               "The Bird",
               JOptionPane.PLAIN_MESSAGE);
            } else if ((x>780)&&(x<968)&&(y>300)&&(y<444)) {
               JOptionPane.showMessageDialog(frame,
               "Berry plants, such as huckleberries, provide vital food supplies\n"
               + " to surrounding wildlife (including bears and birds) as well as\n"
               + " provide microhabitats for organisms such as invertebrates.\n These"
               + " plants increase biodiversity in the surrounding ecosystem. ",
               "The Berry",
               JOptionPane.PLAIN_MESSAGE);
            } else if ((x>125)&&(x<153)&&(y>513)&&(y<537)) {
               JOptionPane.showMessageDialog(frame,
               "Invertebrates are a key part of the decomposing cycle, breaking \n" 
               + "down material such as salmon and bear scat to the proper nutrients"
               + "\n that the surrounding plants can absorb, whether that be through"
               + "\n the use of Rhizobial bacteria, Mycorrhizal fungi, or the plants "
               + "own\n roots. Not only is providing these nutrients vital, but "
               + "further breaking\n down and helping decompose material that gravely"
               + " needs to be. ",
               "The Invertebrate",
               JOptionPane.PLAIN_MESSAGE);
            } else if ((x>19)&&(x<194)&&(y>84)&&(y<446)) {
               JOptionPane.showMessageDialog(frame,
               "Western Red Cedar trees are, and have been, a vital tree to our \n"
               + "local ecosystem for hundreds of years. They were used by Native \n"
               + "Americans for canoes, totem poles, rain gear, and many cooking \n"
               + "aspects. As for our environment, cedar trees are best grown in full"
               + " \nsun to partial shade, therefore being a key tree for the "
               + "beginning of\n a young forest. Cedar trees are one among the many"
               + " types of trees \nthat provide shade, and thus cool, the streams "
               + "that salmon run\n through. When the salmon die, the nutrients from"
               + " the departed\n salmon help the cedar tree to grow and stay strong.",
               "The Cedar",
               JOptionPane.PLAIN_MESSAGE);
            } else {
               JOptionPane.showMessageDialog(frame,
               "No Image Clicked",
               " ",
               JOptionPane.PLAIN_MESSAGE);
            
            }
        }
        });
   }
   
   public void frameSetUp() { //This methods sets up the JFrame so that the 
                              //appropriate images are shown in the correct location.
        JPanel panel = (JPanel)frame.getContentPane();
        Color theGreen= new Color (50,120,50);
        panel.setBackground(theGreen);  
        panel.setLayout(null);

        JLabel cedar = new JLabel();  
        cedar.setIcon(new ImageIcon("thecedar.jpg"));
        panel.add(cedar);
        Dimension size = cedar.getPreferredSize();
        cedar.setBounds(0, 30, size.width, size.height);
                
        JLabel bear = new JLabel();  
        bear.setIcon(new ImageIcon("thebear.jfif"));
        panel.add(bear);
        Dimension size2 = bear.getPreferredSize();
        bear.setBounds(480, 290, size2.width, size2.height);
        
        JLabel salmon = new JLabel();  
        salmon.setIcon(new ImageIcon("thesalmon.jpg"));
        panel.add(salmon);
        Dimension size1 = salmon.getPreferredSize();
        salmon.setBounds(210, 235, size1.width, size1.height);
        
        JLabel fungi = new JLabel();  
        fungi.setIcon(new ImageIcon("thefungi.jpg"));
        panel.add(fungi);
        Dimension size3 = fungi.getPreferredSize();
        fungi.setBounds(450, 460, size3.width, size3.height);
        
        JLabel invertabrete = new JLabel();  
        invertabrete.setIcon(new ImageIcon("theworm.jpg"));
        panel.add(invertabrete);
        Dimension size4 = invertabrete.getPreferredSize();
        invertabrete.setBounds(120, 480, size4.width, size4.height);
        
        JLabel stream = new JLabel();  
        stream.setIcon(new ImageIcon("thestream.jpg"));
        panel.add(stream);
        Dimension size5 = stream.getPreferredSize();
        stream.setBounds(180, 300, size5.width, size5.height);
        
        JLabel bacteria = new JLabel();  
        bacteria.setIcon(new ImageIcon("thebacteria.png"));
        panel.add(bacteria);
        Dimension size6 = bacteria.getPreferredSize();
        bacteria.setBounds(835, 445, size6.width, size6.height);
        
        JLabel bird = new JLabel();  
        bird.setIcon(new ImageIcon("thebird.jpg"));
        panel.add(bird);
        Dimension size7 = bird.getPreferredSize();
        bird.setBounds(20, 490, size7.width, size7.height);
        
        JLabel berry = new JLabel();  
        berry.setIcon(new ImageIcon("theberry.jpg"));
        panel.add(berry);
        Dimension size8 = berry.getPreferredSize();
        berry.setBounds(780, 300, size8.width, size8.height);
   }  
}