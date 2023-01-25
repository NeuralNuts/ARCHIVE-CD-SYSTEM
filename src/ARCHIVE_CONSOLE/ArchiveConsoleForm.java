package ARCHIVE_CONSOLE;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ArchiveConsoleForm implements ActionListener
{

    //<editor-fold defaultstate="collapsed" desc="Swing UI private classes variables instantiated eg; JFrame..">

    //Main frame and header label section
    private JFrame main_frame;
    private JPanel control_panel;
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

    public ArchiveConsoleForm()
    {
        prepareGUI();
        showGidBagLayout();
    }
    public static void main(String[] args)
    {
        ArchiveConsoleForm archive_console_form = new ArchiveConsoleForm();
        archive_console_form.showGidBagLayout();
    }

    private void prepareGUI()
    {
        main_frame = new JFrame("Archive Console");
        main_frame.setSize(400, 400);
        main_frame.setLayout(new GridLayout(3, 1));

        lbl_header_label = new JLabel("Archive Console", JLabel.CENTER);
        lbl_header_label.setSize(100, 100);

        main_frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });

        control_panel = new JPanel();
        control_panel.setLayout(new FlowLayout());

        main_frame.add(lbl_header_label);
        main_frame.add(control_panel);
        main_frame.setVisible(true);

    }


    private void showGidBagLayout()
    {
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setSize(300, 300);
        GridBagLayout layout = new GridBagLayout();

        panel.setLayout(layout);
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        btn_search =  new JButton("Search");
        panel.add(btn_search, gbc);

        control_panel.add(panel);
        main_frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {

    }
}
