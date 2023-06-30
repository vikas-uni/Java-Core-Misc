package coaching.awts;

import javax.swing.*;
import java.awt.event.*;

class Combotest implements ActionListener {

    JFrame fr;
    JComboBox cbstate, cbcity;
    DefaultComboBoxModel upmodel, mpmodel, rajmodel;    //this represents the model of combo box
    Combotest() {
        fr = new JFrame("Combotest");
        fr.setLayout(null);

        String state[] = {"UP", "MP", "RAJ"};
        cbstate = new JComboBox(state);
        cbcity = new JComboBox();

        upmodel = new DefaultComboBoxModel();    //models created
        mpmodel = new DefaultComboBoxModel();
        rajmodel = new DefaultComboBoxModel();

        upmodel.addElement("Agra");               //this method is used to add elements to default models
        upmodel.addElement("Gorakhpur");
        upmodel.addElement("Lucknow");

        mpmodel.addElement("Indore");
        mpmodel.addElement("bhopal");
        mpmodel.addElement("jabalpur");

        rajmodel.addElement("Jaipur");
        rajmodel.addElement("Kota");
        rajmodel.addElement("Jaisalmer");

        cbstate.setBounds(15, 10, 80, 30);
        cbcity.setBounds(110, 10, 80, 30);

        fr.add(cbstate);
        fr.add(cbcity);

        cbstate.addActionListener(this);
        fr.setSize(250, 100);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String st = (String) cbstate.getSelectedItem();     //this will get the selected value of model in string format 
        if (st.equals("UP")) {
            cbcity.setModel(upmodel);                      //this method sets the values in the city combo box as defined in their respectiive models
        } else if (st.equals("MP")) {
            cbcity.setModel(mpmodel);
        } else {
            cbcity.setModel(rajmodel);
        }
    }

    public static void main(String s[]) {
        new Combotest();
    }
}
