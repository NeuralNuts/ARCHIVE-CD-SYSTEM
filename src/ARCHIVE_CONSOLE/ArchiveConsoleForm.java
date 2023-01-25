package ARCHIVE_CONSOLE;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ArchiveConsoleForm implements ActionListener {

    //<editor-fold defaultstate="collapsed" desc="Swing UI private classes variables instantiated eg; JFrame..">

    //Main frame and header label section
    private JFrame main_frame;
    private JLabel lbl_header_label;

    // Search string UI section
    private JLabel lbl_search_string;
    private JTextField txt_search_string;
    private JButton btn_search;

    // Process log UI section
    private JLabel lbl_process_log;
    private JButton btn_process_log;
    private JTextArea txt_area_process_log;

    // Display binary tree UI section
    private JLabel lbl_display_binary_tree;
    private JButton btn_pre_order;
    private JButton btn_in_order;
    private JButton btn_post_order;
    private JButton btn_graphical;

    // Hash map and set UI section
    private JLabel lbl_hash_map_set;
    private JButton btn_save;
    private JButton btn_display;

    // Title UI section
    private JLabel lbl_title;
    private JTextField txt_title;
    private JTextField txt_title_id;

    // Author UI section
    private JLabel lbl_author;
    private JTextField txt_author;

    // Sections UI section lol
    private JLabel lbl_section;
    private JLabel txt_section;

    // X coordinate UI section
    private JLabel lbl_x_coordinate;
    private JTextField txt_x_coordinate;

    // Y coordinate UI section
    private JLabel lbl_y_coordinate;
    private JTextField txt_y_coordinate;

    // Bar code UI section
    private JLabel lbl_bar_code;
    private JTextField txt_bar_code;

    // Description UI section
    private JLabel lbl_description;
    private JTextField txt_description;

    // New item and save/update UI section
    private JButton btn_new_item;
    private JButton btn_save_or_update;

    // Automation action request UI section
    private JLabel lbl_automation_action_request;
    private JButton btn_retrieve;
    private JButton btn_remove;
    private JButton btn_return;
    private JButton btn_add_to_collection;

    // Sort section UI section
    private JLabel lbl_sort_section;
    private JTextField txt_sort_section;
    private JButton btn_random_collection_sort;
    private JButton btn_mostly_sorted_sort;
    private JButton btn_reverse_order_sort;

    // Exit UI section
    private JButton btn_exit;
    //</editor-fold>


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
