package M2.fase1;

import javax.swing.*;

public class TableName {
    JFrame f;
    JTable jt;
    TableName(){
        f = new JFrame();
        f.setTitle("JTable Name");
        // Data that will be displayed in JTable
        char[][] d = {{"A", "I", "I", "L", "S", "V"}};
        // Table initialization
        jt = new JTable(d);
        //set bounds for JTable
        jt.setBounds(30, 40, 200, 300);
        // add it to the JScrollPane
        JScrollPane jsp = new JScrollPane(jt);
        f.add(jsp);
        // set the Size of frame
        f.setSize(500, 200);
        //set the frame visibility as true
        f.setVisible(true);
    }
    // main method
    public static void main(String[] args) {
        new TableName();
    }
}
