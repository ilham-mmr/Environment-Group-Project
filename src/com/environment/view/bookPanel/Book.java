package com.environment.view.bookPanel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public final class Book extends javax.swing.JPanel {

    private final List<BookInfo> list;

    int row, col;

    public Book() {
        initComponents();
        list = new ArrayList<>();

        populateList();
        showData();
    }

    public void showData() {
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < list.size(); i++) {
            BookInfo info = list.get(i);
            String[] data = {info.getTitle(), info.getCategory(),info.getQuantity(), info.getReason()};
            tableModel.addRow(data);
        }
    }

    public void populateList() {
        try {
            FileInputStream fi = new FileInputStream(new File("BookInfo.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            BookInfo[] md = (BookInfo[]) oi.readObject();
            list.addAll(Arrays.asList(md));
        } catch (Exception e) {
        }

    }

    public void saveToFile() {

        try {
            FileOutputStream fo = new FileOutputStream(new File("BookInfo.txt"));
            try (ObjectOutputStream oo = new ObjectOutputStream(fo)) {
                BookInfo[] md = new BookInfo[list.size()];
                md = list.toArray(md);

                oo.writeObject(md);
            }

        } catch (IOException e) {
        }

    }

   
    @SuppressWarnings("unchecked")
   
    private void initComponents() {

        Title = new javax.swing.JLabel();
        BookTitle = new javax.swing.JLabel();
        Quantity = new javax.swing.JLabel();
        Reason = new javax.swing.JLabel();
        Category = new javax.swing.JLabel();
        jTextBkTitle = new javax.swing.JTextField();
        jTextQuantity = new javax.swing.JTextField();
        jTextReason = new javax.swing.JTextField();
        jCBCategory = new javax.swing.JComboBox<>();
        ADD = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        EDIT = new javax.swing.JButton();
        SEARCH = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        RESET = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(32767, 500));
        setMinimumSize(new java.awt.Dimension(0, 500));

        Title.setFont(new java.awt.Font("Times New Roman", 1, 30)); 
        Title.setText("Sales Report during MCO Covid-19");

        BookTitle.setFont(new java.awt.Font("Times New Roman", 3, 20)); 
        BookTitle.setText("Book Title :");

        Category.setFont(new java.awt.Font("Times New Roman", 3, 20)); 
        Category.setText("Category : ");
        
        Quantity.setFont(new java.awt.Font("Times New Roman", 3, 20)); 
        Quantity.setText("Quantity : ");
        
        Reason.setFont(new java.awt.Font("Times New Roman", 3, 20)); 
        Reason.setText("Reason : ");

        jTextBkTitle.setFont(new java.awt.Font("Times New Roman", 0, 15)); 
        jTextBkTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBkTitleActionPerformed(evt);
            }
        });

        jCBCategory.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        jCBCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Medical Book", "School Book", "General Book" }));
        jTextQuantity.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        jTextReason.setFont(new java.awt.Font("Times New Roman", 0, 18));

        ADD.setFont(new java.awt.Font("Times New Roman", 1, 15)); 
        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });

        DELETE.setFont(new java.awt.Font("Times New Roman", 1, 15)); 
        DELETE.setText("DELETE");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

        EDIT.setFont(new java.awt.Font("Times New Roman", 1, 15)); 
        EDIT.setText("EDIT");
        EDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITActionPerformed(evt);
            }
        });

        SEARCH.setFont(new java.awt.Font("Times New Roman", 1, 15)); 
        SEARCH.setText("SEARCH");
        SEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
            "Book Title", "Book Category", "Quantity","Reason"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

       

        RESET.setFont(new java.awt.Font("Times New Roman", 1, 15)); 
        RESET.setText("RESET");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
        .addGap(116, 116, 116)
        .addComponent(Title))
        .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(Category)))
        .addGap(0, 0, Short.MAX_VALUE))
        .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addComponent(RESET)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        )
        .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(BookTitle)
        .addComponent(Quantity)
        .addComponent(Reason)
        .addComponent(ADD))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jCBCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addComponent(jTextQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        .addComponent(jTextReason, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
        
        .addComponent(DELETE))
        .addGap(28, 28, 28)
        .addComponent(EDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(129, 129, 129)
        .addComponent(SEARCH))
        .addComponent(jTextBkTitle)))
        .addComponent(jScrollPane1))))
        .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(Title)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(BookTitle)
            .addComponent(jTextBkTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(Category)
            .addComponent(jCBCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(Quantity)
            .addComponent(jTextQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(Reason)
            .addComponent(jTextReason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(ADD)
            .addComponent(DELETE)
            .addComponent(EDIT)
            .addComponent(SEARCH))
            .addGap(18, 18, 18)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            
            .addComponent(RESET))
            .addContainerGap(92, Short.MAX_VALUE))
        );
    }

    private void jTextBkTitleActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        String title = jTextBkTitle.getText();
        String category = jCBCategory.getSelectedItem().toString();
        String quantity = jTextQuantity.getText();
        String reason = jTextReason.getText();
        

        BookInfo info = new BookInfo(title, category, quantity, reason);
        list.add(info);

        String[] data = {info.getTitle(), info.getCategory(), info.getQuantity(),info.getReason()};
        tableModel.addRow(data);

        clearField();

        saveToFile();
    }

    private void clearField() {
    	jTextBkTitle.requestFocus();
    	jTextBkTitle.setText("");
    	jCBCategory.setSelectedIndex(0);
    	jTextQuantity.setText("");
    	jTextReason.setText("");
    	

    }

   
    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Delete this data", "Delete", dialogButton);
        if (dialogResult == 0) {
            tableModel.removeRow(row);
            list.remove(row);

            clearField();
        } else {

        }

        saveToFile();
    }

    private void EDITActionPerformed(java.awt.event.ActionEvent evt) {
        String editedtitle = jTextBkTitle.getText();
        String editedcategory = jCBCategory.getSelectedItem().toString();
        String editedquantity = jTextQuantity.getText();
        String editedreason = jTextReason.getText();

        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        int index = jTable1.getSelectedRow();
        BookInfo bookInfo = list.get(index);

        bookInfo.setTitle(editedtitle);
        bookInfo.setCategory(editedcategory);
        bookInfo.setQuantity(editedquantity);
        bookInfo.setQuantity(editedreason);
        

        tableModel.setValueAt(editedtitle, jTable1.getSelectedRow(), 0);
        tableModel.setValueAt(editedcategory, jTable1.getSelectedRow(), 1);
        tableModel.setValueAt(editedquantity, jTable1.getSelectedRow(), 2);
        tableModel.setValueAt(editedreason, jTable1.getSelectedRow(), 3);

        clearField();
        saveToFile();

    }
    private void SEARCHActionPerformed(java.awt.event.ActionEvent evt) {
        String input = JOptionPane.showInputDialog(this, "Search Book Name : ");
         BookInfo bk = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTitle().equalsIgnoreCase(input)) {
                JOptionPane.showMessageDialog(SEARCH, "Found!!!", "Search book", 2);
                 bk = list.get(i);
                 
                jTextBkTitle.setText(bk.getTitle());
                System.out.println(bk.getTitle());
                String category = bk.getCategory();
                System.out.println(bk.getCategory());
                jTextQuantity.setText(bk.getQuantity());
                System.out.println(bk.getQuantity());
                jTextReason.setText(bk.getReason());
                System.out.println(bk.getReason());
           
                return;
            }
        }

        JOptionPane.showMessageDialog(SEARCH, "Not Found!!!", "Search Book", 1);
    }

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {
        clearField();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(800, 600);
        frame.add(new Book());

        java.awt.EventQueue.invokeLater(() -> {
            new Book().setVisible(true);
        });
    }

    // Variables declaration 
    private javax.swing.JButton ADD;
    private javax.swing.JLabel Category;
    private javax.swing.JButton DELETE;
    private javax.swing.JButton EDIT;
    private javax.swing.JLabel Quantity;
    private javax.swing.JLabel Reason;
    private javax.swing.JLabel BookTitle;
    private javax.swing.JButton RESET;
    private javax.swing.JButton SEARCH;
    private javax.swing.JLabel Title;
    private javax.swing.JComboBox<String> jCBCategory;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextQuantity;
    private javax.swing.JTextField jTextReason;
    private javax.swing.JTextField jTextBkTitle;
    // End of variables declaration
}

