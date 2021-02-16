package coaching.awts;

//program to implement a notepad(some functions to be added)
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

class Notepad extends KeyAdapter implements ActionListener {

    JFrame fr, fr2;
    String filemenu[] = {"New", "Open", "Save", "Print", "Exit"};
    String editmenu[] = {"Cut", "Copy", "Paste", "Find", "Replace"};
    int change;
    JTextArea ta;
    JScrollPane sp;
    JTextField tfind, trep;
    JMenuBar mb;
    JMenu file, edit;
    JMenuItem fmi[], emi[];//new,open,save,print,exit,cut,copy,paste,find,replace;
    JButton save, nosave, cancel, bfind, brep;

    Notepad() {
        fr = new JFrame("Notepad");
        fr.setSize(800, 650);
        fr.setLayout(null);
        fr2 = new JFrame("Find or Replace");
        fr2.setLayout(null);
        fr2.setSize(300, 200);

        mb = new JMenuBar();           //create menu bar
        fr.setJMenuBar(mb);            //set menu bar on frame

        file = new JMenu("File");
        edit = new JMenu("Edit");



        fmi = new JMenuItem[5];
        for (int i = 0; i < fmi.length; i++) {
            fmi[i] = new JMenuItem(filemenu[i]);
            file.add(fmi[i]);
        }

        emi = new JMenuItem[5];
        for (int i = 0; i < emi.length; i++) {
            emi[i] = new JMenuItem(editmenu[i]);
            edit.add(emi[i]);
        }

        save = new JButton("Save");
        nosave = new JButton("Don't save");
        cancel = new JButton("Cancel");
        bfind = new JButton("Find");
        brep = new JButton("Replace");

        tfind = new JTextField();
        trep = new JTextField();

        tfind.setBounds(10, 10, 100, 30);
        trep.setBounds(10, 60, 100, 30);
        bfind.setBounds(130, 10, 50, 30);
        brep.setBounds(130, 60, 50, 30);

        fr2.add(tfind);
        fr2.add(trep);
        fr2.add(bfind);
        fr2.add(brep);


        mb.add(file);
        mb.add(edit);

        ta = new JTextArea();
        sp = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);    //this will specify add text area on scroll pane
        sp.setBounds(10, 10, 750, 580);
        fr.add(sp);

        for (int i = 0; i < fmi.length; i++) {
            fmi[i].addActionListener(this);
        }

        for (int i = 0; i < emi.length; i++) {
            emi[i].addActionListener(this);
        }

        bfind.addActionListener(this);
        brep.addActionListener(this);
        ta.addKeyListener(this);

        fr.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("New")) {
        }
        if (e.getActionCommand().equals("Open")) {            //this block will open a file from disk
            JFileChooser fch = new JFileChooser();
            int op = fch.showOpenDialog(fr);
            if (op == JFileChooser.APPROVE_OPTION) {
                try {
                    File f = fch.getSelectedFile();
                    FileReader flr = new FileReader(f);
                    BufferedReader br = new BufferedReader(flr);
                    while (true) {
                        String str = br.readLine();
                        if (str == null) {
                            break;
                        }
                        ta.append(str);
                        ta.append("\n");
                    }
                } catch (Exception ee) {
                }
            }

        }

        if (e.getActionCommand().equals("Save")) {
            JFileChooser fch = new JFileChooser();
            int op = fch.showSaveDialog(fr);
            if (op == JFileChooser.APPROVE_OPTION) {
                try {
                    File f = fch.getSelectedFile();
                    FileWriter fw = new FileWriter(f);
                    PrintWriter pw = new PrintWriter(fw);
                    String str = ta.getText();
                    pw.print(str);
                    pw.flush();
                } catch (Exception eee) {
                }
            }
        }

        if (e.getActionCommand().equals("Print")) {
        }

        if (e.getActionCommand().equals("Exit")) {
            if (change == 1) {
                int ext = JOptionPane.showConfirmDialog(fr, "Do you want to save changes?", "Exit", JOptionPane.YES_NO_CANCEL_OPTION);
                if (ext == JOptionPane.YES_OPTION) {

                    JFileChooser fch = new JFileChooser();
                    int op = fch.showSaveDialog(fr);
                    if (op == JFileChooser.APPROVE_OPTION) {
                        try {
                            File f = fch.getSelectedFile();
                            FileWriter fw = new FileWriter(f);
                            PrintWriter pw = new PrintWriter(fw);
                            String str = ta.getText();
                            pw.print(str);
                            pw.flush();
                        } catch (Exception eee) {
                        }
                    }


                    // System.exit(1);
                }
                if (ext == JOptionPane.NO_OPTION) {
                    System.exit(1);
                }
                if (ext == JOptionPane.CANCEL_OPTION) {
                    return;
                }
            } else {
                System.exit(1);
            }
        }

    }

    public void keyTyped(KeyEvent ke) {
        if (ke.getSource() == ta) {
            change = 1;
        }


    }

    public static void main(String s[]) {
        new Notepad();
    }
}
