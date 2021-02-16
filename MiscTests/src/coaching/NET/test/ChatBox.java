package coaching.NET.test;

//prog to implement window based chat server
import java.io.*;
import java.net.*;
import java.util.*;

import javax.swing.*;
import java.awt.event.*;

class ChatBox implements ActionListener {

    static ArrayList al;
    static ChatWindow cw;
    JFrame fr1;
    JLabel name, wel, log, msg;
    JButton submit;
    JTextField tfname;

    ChatBox() {
        fr1 = new JFrame("Login");
        fr1.setLayout(null);

        name = new JLabel("User Name");
        tfname = new JTextField();
        submit = new JButton("Submit");

        name.setBounds(5, 5, 80, 30);
        tfname.setBounds(90, 5, 80, 30);
        submit.setBounds(40, 60, 80, 30);

        fr1.add(name);
        fr1.add(tfname);
        fr1.add(submit);
        submit.addActionListener(this);
        fr1.setSize(200, 150);
        fr1.setVisible(true);
        fr1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String user = tfname.getText();
            if (tfname.getText().equals("")) {
                JOptionPane.showMessageDialog(fr1, "Please enter a name", "Name", JOptionPane.INFORMATION_MESSAGE);
            } else {
                cw = new ChatWindow(this, user, al);                         //create a new chat window object

                tfname.setText("");
            }
        }
    }

    public static void main(String s[]) {
        ChatBox cb = new ChatBox();                         //main object created and also act as server

        try {
            al = new ArrayList();                              //ArrayList to store socket objects
            ServerSocket ss = new ServerSocket(1050);
            while (true) {
                Socket st = ss.accept();                           //accept connections from various sockets
                al.add(st);                         	//add sockets to ArrayList

            }
        } catch (Exception e) {
        }

    }
}

class ChatWindow implements ActionListener, Runnable {

    Socket st;
    ArrayList al;
    ChatBox cb;
    String user;
    JFrame fr2;
    JButton send, logout;
    JTextArea ta;
    JLabel log, msg, wel;
    JScrollPane pane, spane;
    JList list;
    JTextField tfmsg;
    DefaultListModel dl;
    //JScrollPane spane;
    Thread t;                                          //Thread ref var created
    //t.setDaemon(true);   
    ChatWindow(ChatBox cb, String user, ArrayList al) {

        t = new Thread(this, user);                             //thread created

        this.al = al;
        this.cb = cb;
        this.user = user;

        try {
            st = new Socket("localhost", 1050);                        //socket created for this chat window
        } catch (Exception e) {
        }

        fr2 = new JFrame("Chat " + user);
        fr2.setLayout(null);
        log = new JLabel("Logged in user");
        msg = new JLabel("Message");
        wel = new JLabel("Welcome " + user);
        send = new JButton("Send");
        logout = new JButton("Logout");
        ta = new JTextArea();
        pane = new JScrollPane(ta);
        dl = new DefaultListModel();
        list = new JList(dl);
        spane = new JScrollPane(list);
        tfmsg = new JTextField();

        wel.setBounds(5, 5, 100, 30);
        log.setBounds(250, 5, 100, 30);
        pane.setBounds(5, 40, 220, 250);
        list.setBounds(250, 40, 80, 250);
        msg.setBounds(5, 300, 80, 30);
        tfmsg.setBounds(75, 300, 100, 30);
        send.setBounds(175, 300, 80, 30);
        logout.setBounds(250, 300, 80, 30);


        send.addActionListener(this);
        logout.addActionListener(this);



        fr2.add(wel);
        fr2.add(log);
        fr2.add(pane);
        fr2.add(list);
        fr2.add(msg);
        fr2.add(tfmsg);
        fr2.add(send);
        fr2.add(logout);

        fr2.setSize(400, 400);
        fr2.setVisible(true);

//conn();
        t.start();                   //start the thread
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == send) {
            String msg = tfmsg.getText();
            broadcast(msg, user);
            tfmsg.setText("");
        }

        if (e.getSource() == logout) {
            fr2.setVisible(false);
        }
    }

    public void run() {
        DataInputStream din;
        String inmsg;

        try {

            while (true) {
                din = new DataInputStream(st.getInputStream());

                inmsg = din.readUTF();

                ta.append(inmsg + "\n");

            }

        } catch (Exception e) {
        }

    }

    void broadcast(String ms, String user) {

        try {
            String msg = ms;
            String us = user;
            DataOutputStream dout;
//Socket sc;
            Iterator itr = al.iterator();

            while (itr.hasNext()) {
                st = (Socket) itr.next();
                dout = new DataOutputStream(st.getOutputStream());
                dout.writeUTF(user + ": " + ms);
                dout.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
