package ARCHIVE_CONSOLE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class JFrame {
    //<editor-fold defaultstate="collapsed" desc="BuildJLabel">
    public static JLabel BuildJLabel1(String text, int xPos, int yPos, int xSize, int ySize, SpringLayout layout, javax.swing.JFrame frame){

        JLabel lbl1 = new JLabel(text);

        lbl1.setPreferredSize((new Dimension(xSize, ySize)));
        layout.putConstraint(SpringLayout.NORTH, lbl1, yPos, SpringLayout.NORTH, frame);
        layout.putConstraint(SpringLayout.WEST, lbl1, xPos, SpringLayout.WEST, frame);

        frame.add(lbl1);

        return lbl1;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="BuildJButton">
    public static JButton BuildJButton(String text, ActionListener actionListener, int xSize, int ySize, int xPos, int yPos, SpringLayout layout, javax.swing.JFrame frame){

        JButton JB1 = new JButton(text);

        JB1.setPreferredSize((new Dimension(xSize, ySize)));
        layout.putConstraint(SpringLayout.SOUTH, JB1, xPos, SpringLayout.SOUTH, frame);
        layout.putConstraint(SpringLayout.EAST, JB1, yPos, SpringLayout.EAST, frame);
        JB1.addActionListener((ActionListener)frame);
        frame.add(JB1);

        return JB1;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="BuildJTextField">
    public static  JTextField BuildJTextField(String text, ActionListener actionListener,  int xSize, int ySize, int xPos, int yPos, SpringLayout layout, javax.swing.JFrame frame){

        JTextField JT1 = new JTextField(text);

        JT1.setPreferredSize((new Dimension(xSize, ySize)));
        layout.putConstraint(SpringLayout.NORTH, JT1, xPos, SpringLayout.NORTH, frame);
        layout.putConstraint(SpringLayout.WEST, JT1, yPos, SpringLayout.WEST, frame);
        JT1.addActionListener((ActionListener)frame);
        frame.add(JT1);

        return JT1;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="BuildAJTextAreal">
    public static JTextArea BuildAJTextArea(int cols, int rows, int xPos, int yPos, SpringLayout layout, Frame frame){

        JTextArea myText = new JTextArea(rows,cols);
        layout.putConstraint(SpringLayout.NORTH, myText, yPos, SpringLayout.NORTH, frame);
        layout.putConstraint(SpringLayout.WEST,  myText, xPos, SpringLayout.WEST, frame);
        frame.add(myText);
        return  myText;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="BuildAJTable">
    public static JTable BuildAJTable(int cols, int rows, int xPos, int yPos, SpringLayout layout, Frame frame){

        JTable my_table = new JTable(cols, rows);
        layout.putConstraint(SpringLayout.NORTH, my_table, yPos, SpringLayout.NORTH, frame);
        layout.putConstraint(SpringLayout.WEST,  my_table, xPos, SpringLayout.WEST, frame);
        frame.add(my_table);
        return my_table;
    }
    //</editor-fold>
}
