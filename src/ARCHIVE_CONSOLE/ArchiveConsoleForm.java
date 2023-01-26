package ARCHIVE_CONSOLE;

import BUILDER_LIBARY.JFrame;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

public class ArchiveConsoleForm extends javax.swing.JFrame implements ActionListener
{
    SpringLayout layout = new SpringLayout();

    //<editor-fold default-state="collapsed" desc="Instantiating J components">
    JLabel lbl_header_label,
            lbl_search_string,
            lbl_sort,
            lbl_process_log,
            lbl_display_binary_tree,
            lbl_hash_map_set,
            lbl_title,
            lbl_author,
            lbl_section,
            lbl_x_coordinate,
            lbl_y_coordinate,
            lbl_bar_code,
            lbl_description,
            lbl_automation_action_request,
            lbl_sort_section;

    JTextField txt_search_string,
            txt_title,
            txt_title_id,
            txt_author,
            txt_x_coordinate,
            txt_y_coordinate,
            txt_bar_code,
            txt_description,
            txt_sort_section;

    JButton btn_search,
            btn_process_log,
            btn_by_title,
            btn_by_author,
            btn_by_barcode,
            btn_pre_order,
            btn_in_order,
            btn_post_order,
            btn_graphical,
            btn_save,
            btn_display,
            btn_new_item,
            btn_save_or_update,
            btn_retrieve,
            btn_remove,
            btn_return,
            btn_add_to_collection,
            btn_random_collection_sort,
            btn_mostly_sorted_sort,
            btn_reverse_order_sort,
            btn_exit;

    JTextArea txt_area_process_log;

    JTable tbl_archive_cd;
    //</editor-fold>

    //<editor-fold default-state="collapsed" desc="UI">
    public ArchiveConsoleForm() throws IOException {
        setSize(900, 600);
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

        lbl_header_label = JFrame.BuildJLabel("Archive Console", 10, 0, 300, 50, layout, this);
        lbl_header_label.setForeground(Color.WHITE);
        lbl_header_label.setFont(new Font("Comic Sans", Font.BOLD, 30));

        lbl_search_string = JFrame.BuildJLabel("Search String:", 10, 10, 140, 100, layout, this);
        lbl_search_string.setForeground(Color.WHITE);
        lbl_search_string.setFont(new Font("Comic Sans", Font.BOLD, 15));

        txt_search_string = JFrame.BuildJTextField("", this, 80, 20, 51, 135, layout, this);

        btn_search = JFrame.BuildJButton("Search", this, 80, 20, 32, 300, layout, this);

        tbl_archive_cd = JFrame.BuildAJTable(6,10, 10, 100, layout, this);
        Border white_line = BorderFactory.createLineBorder(Color.BLACK);
        tbl_archive_cd.setBorder(white_line);


        setVisible(true);
    }
    //</editor-fold>

    @Override
    public void actionPerformed(ActionEvent e)
    {

    }
}
