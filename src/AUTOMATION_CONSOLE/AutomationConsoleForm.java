package AUTOMATION_CONSOLE;

import BUILDER_LIBARY.JFrame;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class AutomationConsoleForm extends javax.swing.JFrame implements ActionListener {

    SpringLayout layout = new SpringLayout();

    //<editor-fold default-state="collapsed" desc="Instantiating J components">
    JLabel lbl_header_label,
            lbl_current_requested_action,
            lbl_bar_code_of_selected_item,
            lbl_section;

    JTextField txt_bar_code_of_selected_item,
            txt_section;

    JButton btn_process,
            btn_add_item,
            btn_exit;

    JTable tbl_archive_cd;
    //</editor-fold>

    //<editor-fold default-state="collapsed" desc="UI">
    public AutomationConsoleForm() throws IOException {
        setSize(550, 365);
        setLocation(300, 200);

        getContentPane().setBackground(new Color(4, 136, 82, 195));

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                super.windowClosing(windowEvent);
                System.exit(0);
            }
        });

        setLayout(layout);
        Border black_line = BorderFactory.createLineBorder(Color.BLACK);

        lbl_header_label = BUILDER_LIBARY.JFrame.BuildJLabel("Automation Console", 10, 0, 300, 40, layout, this);
        lbl_header_label.setForeground(Color.WHITE);
        lbl_header_label.setFont(new Font("Comic Sans", Font.BOLD, 30));

        lbl_current_requested_action = BUILDER_LIBARY.JFrame.BuildJLabel("Current Requested Action:", 10, 10, 200, 100, layout, this);
        lbl_current_requested_action.setForeground(Color.WHITE);
        lbl_current_requested_action.setFont(new Font("Comic Sans", Font.BOLD, 15));
        txt_section = BUILDER_LIBARY.JFrame.BuildJTextField("", this, 100, 20, 51, 205, layout, this);
        btn_process = BUILDER_LIBARY.JFrame.BuildJButton("Process", this, 100, 20, 32, 400, layout, this);

        lbl_bar_code_of_selected_item = BUILDER_LIBARY.JFrame.BuildJLabel("Bar Code of Selected Item:", 10, 50, 200, 100, layout, this);
        lbl_bar_code_of_selected_item.setForeground(Color.WHITE);
        lbl_bar_code_of_selected_item.setFont(new Font("Comic Sans", Font.BOLD, 15));
        txt_bar_code_of_selected_item = BUILDER_LIBARY.JFrame.BuildJTextField("", this, 100, 20, 91, 205, layout, this);

        lbl_section = BUILDER_LIBARY.JFrame.BuildJLabel("Section:", 320, 50, 100, 100, layout, this);
        lbl_section.setForeground(Color.WHITE);
        lbl_section.setFont(new Font("Comic Sans", Font.BOLD, 15));
        txt_section = BUILDER_LIBARY.JFrame.BuildJTextField("", this, 20, 20, 91, 385, layout, this);
        btn_add_item = BUILDER_LIBARY.JFrame.BuildJButton("Add Item" +
                "", this, 100, 20, 72, 500, layout, this);

        tbl_archive_cd = BUILDER_LIBARY.JFrame.BuildAJTable(6,10, 10, 130, layout, this);
        tbl_archive_cd.setBorder(black_line);

        btn_exit = JFrame.BuildJButton("Exit", this, 180, 20, 280, 445, layout, this);

        setVisible(true);
    }
    //</editor-fold>

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
