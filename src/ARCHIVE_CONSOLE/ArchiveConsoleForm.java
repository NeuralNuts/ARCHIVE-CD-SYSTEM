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
import java.util.ArrayList;

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
            txt_section,
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

    JTextArea txt_area_process_log,
                txt_area_description;

    JTable tbl_archive_cd;
    CDModel.MyModel cd_model;
    //</editor-fold>

    //<editor-fold default-state="collapsed" desc="UI">
    public ArchiveConsoleForm() throws IOException {
        setSize(900, 620);
        setLocation(300, 200);

        getContentPane().setBackground(new Color(4, 136, 82, 195));

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                super.windowClosing(windowEvent);
                System.exit(0);
            }
        });

        //<editor-fold default-state="collapsed" desc="UI">

        setLayout(layout);
        Border black_line = BorderFactory.createLineBorder(Color.BLACK);

        lbl_header_label = JFrame.BuildJLabel("Archive Console", 10, 0, 300, 50, layout, this);
        lbl_header_label.setForeground(Color.WHITE);
        lbl_header_label.setFont(new Font("Comic Sans", Font.BOLD, 30));

        lbl_search_string = JFrame.BuildJLabel("Search String:", 10, 10, 140, 100, layout, this);
        lbl_search_string.setForeground(Color.WHITE);
        lbl_search_string.setFont(new Font("Comic Sans", Font.BOLD, 15));
        txt_search_string = JFrame.BuildJTextField("", this, 80, 20, 51, 135, layout, this);
        btn_search = JFrame.BuildJButton("Search", this, 80, 20, 32, 300, layout, this);

        tbl_archive_cd = JFrame.BuildAJTable(6,10, 10, 100, layout, this);
        tbl_archive_cd.setBorder(black_line);

        lbl_sort = JFrame.BuildJLabel("Sort:", 10, 260, 140, 50, layout, this);
        lbl_sort.setForeground(Color.WHITE);
        lbl_sort.setFont(new Font("Comic Sans", Font.BOLD, 15));
        btn_by_title = JFrame.BuildJButton("By Title", this, 80, 20, 258, 120, layout, this);
        btn_by_author = JFrame.BuildJButton("By Author", this, 90, 20, 258, 230, layout, this);
        btn_by_author = JFrame.BuildJButton("By Barcode", this, 110, 20, 258, 440, layout, this);

        lbl_process_log = JFrame.BuildJLabel("Process Log:", 10, 310, 140, 50, layout, this);
        lbl_process_log.setForeground(Color.WHITE);
        lbl_process_log.setFont(new Font("Comic Sans", Font.BOLD, 15));
        btn_process_log = JFrame.BuildJButton("Process Log", this, 110, 20, 310, 435, layout, this);
        txt_area_process_log = JFrame.BuildAJTextArea(40, 9, 10, 355, layout, this);
        txt_area_process_log.setBorder(black_line);

        lbl_display_binary_tree = JFrame.BuildJLabel("Display Binary tree:", 10, 490, 150, 50, layout, this);
        lbl_display_binary_tree.setForeground(Color.WHITE);
        lbl_display_binary_tree.setFont(new Font("Comic Sans", Font.BOLD, 15));
        btn_pre_order = JFrame.BuildJButton("Pre-Order", this, 100, 20, 489, 235, layout, this);
        btn_in_order = JFrame.BuildJButton("In-Order", this, 100, 20, 489, 336, layout, this);
        btn_post_order = JFrame.BuildJButton("Post-Order", this, 100, 20, 489, 437, layout, this);
        btn_graphical = JFrame.BuildJButton("Graphical", this, 100, 20, 489, 538, layout, this);

        lbl_hash_map_set = JFrame.BuildJLabel("HashMap / Set:", 10, 520, 140, 50, layout, this);
        lbl_hash_map_set.setForeground(Color.WHITE);
        lbl_hash_map_set.setFont(new Font("Comic Sans", Font.BOLD, 15));
        btn_save = JFrame.BuildJButton("Save", this, 80, 20, 518, 190, layout, this);
        btn_display = JFrame.BuildJButton("Display", this, 80, 20, 518, 275, layout, this);

        lbl_title = JFrame.BuildJLabel("Title:", 600, 10, 140, 100, layout, this);
        lbl_title.setForeground(Color.WHITE);
        lbl_title.setFont(new Font("Comic Sans", Font.BOLD, 15));
        txt_title = JFrame.BuildJTextField("", this, 80, 20, 51, 645, layout, this);

        lbl_author = JFrame.BuildJLabel("Author:", 600, 40, 140, 100, layout, this);
        lbl_author.setForeground(Color.WHITE);
        lbl_author.setFont(new Font("Comic Sans", Font.BOLD, 15));
        txt_author = JFrame.BuildJTextField("", this, 80, 20, 81, 657, layout, this);

        lbl_section = JFrame.BuildJLabel("Section:", 600, 70, 180, 100, layout, this);
        lbl_section.setForeground(Color.WHITE);
        lbl_section.setFont(new Font("Comic Sans", Font.BOLD, 15));
        txt_section = JFrame.BuildJTextField("", this, 30, 20, 111, 665, layout, this);

        lbl_x_coordinate = JFrame.BuildJLabel("X:", 600, 100, 180, 100, layout, this);
        lbl_x_coordinate.setForeground(Color.WHITE);
        lbl_x_coordinate.setFont(new Font("Comic Sans", Font.BOLD, 15));
        txt_x_coordinate = JFrame.BuildJTextField("", this, 30, 20, 140, 665, layout, this);

        lbl_y_coordinate = JFrame.BuildJLabel("Y:", 600, 130, 180, 100, layout, this);
        lbl_y_coordinate.setForeground(Color.WHITE);
        lbl_y_coordinate.setFont(new Font("Comic Sans", Font.BOLD, 15));
        txt_y_coordinate = JFrame.BuildJTextField("", this, 30, 20, 170, 665, layout, this);

        lbl_bar_code = JFrame.BuildJLabel("BarCode:", 600, 160, 180, 100, layout, this);
        lbl_bar_code.setForeground(Color.WHITE);
        lbl_bar_code.setFont(new Font("Comic Sans", Font.BOLD, 15));
        txt_bar_code = JFrame.BuildJTextField("", this, 30, 20, 201, 680, layout, this);

        lbl_description = JFrame.BuildJLabel("Description:", 600, 190, 180, 100, layout, this);
        lbl_description.setForeground(Color.WHITE);
        lbl_description.setFont(new Font("Comic Sans", Font.BOLD, 15));
        txt_area_description = JFrame.BuildAJTextArea(10, 3, 700, 237, layout, this);
        txt_area_description.setBorder(black_line);

        lbl_automation_action_request = JFrame.BuildJLabel("Automation Action Request for the item above", 550, 260, 350, 100, layout, this);
        lbl_automation_action_request.setForeground(Color.WHITE);
        lbl_automation_action_request.setFont(new Font("Comic Sans", Font.BOLD, 15));

        btn_retrieve = JFrame.BuildJButton("Retrieve", this, 100, 20, 310, 680, layout, this);
        btn_remove = JFrame.BuildJButton("Remove", this, 100, 20, 335, 800, layout, this);
        btn_return = JFrame.BuildJButton("Return", this, 100, 20, 335, 680, layout, this);
        btn_add_to_collection = JFrame.BuildJButton("Add to Collection", this, 130, 20, 310, 830, layout, this);

        lbl_automation_action_request = JFrame.BuildJLabel("Sort Section:", 590, 360, 350, 100, layout, this);
        lbl_automation_action_request.setForeground(Color.WHITE);
        lbl_automation_action_request.setFont(new Font("Comic Sans", Font.BOLD, 15));
        txt_sort_section = JFrame.BuildJTextField("", this, 80, 20, 401, 690, layout, this);

        btn_random_collection_sort = JFrame.BuildJButton("Random Collection Sort", this, 180, 20, 410, 820, layout, this);
        btn_mostly_sorted_sort = JFrame.BuildJButton("Mostly Sorted sort", this, 180, 20, 435, 820, layout, this);
        btn_reverse_order_sort = JFrame.BuildJButton("Reverse Order Sort", this, 180, 20, 460, 820, layout, this);

        btn_exit = JFrame.BuildJButton("Exit", this, 180, 20, 530, 820, layout, this);

        //</editor-fold>

        SelectionAllowed(true);
        add(tbl_archive_cd);// Create a panel to hold all other components
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        add(topPanel);

        // Create column names
        String columnNames[] =
                { "Word 1", "Word 2", "Sent"};

        // Create some data
        ArrayList<Object[]> dataValues = new ArrayList();
        dataValues.add(new Object[] {"Yes","No",true});
        dataValues.add(new Object[] {"Hi","there",true});
        dataValues.add(new Object[] {"True","False",true});
        dataValues.add(new Object[] {"Cat","Dog",false});

        // constructor of JTable model
        cd_model = new CDModel.MyModel(dataValues, columnNames);

        // Create a new table instance
        tbl_archive_cd = new JTable(cd_model);

        // Configure some of JTable's paramters
        tbl_archive_cd.isForegroundSet();
        tbl_archive_cd.setShowHorizontalLines(false);
        tbl_archive_cd.setRowSelectionAllowed(true);
        tbl_archive_cd.setColumnS


        setVisible(true);


    }
    //</editor-fold>

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
