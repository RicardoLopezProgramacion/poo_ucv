package com.cothify.app.controller;

import com.cothify.app.model.dao.ClientDAO;
import com.cothify.app.model.entity.Client;
import com.cothify.app.view.CothifyView;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class PersonalDataController implements ActionListener, FocusListener {

    private static CothifyView view;

    public PersonalDataController(CothifyView view) {
        this.view = view;
        view.btnSaveChanges.addActionListener(this);
        view.txtChangeUsername.addFocusListener(this);
        view.txtChangePassword.addFocusListener(this);
        view.txtConfirmPassword.addFocusListener(this);
        view.txtSetName.addFocusListener(this);
        view.txtSetLastname.addFocusListener(this);
        view.txtSetDayBirth.addFocusListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.btnSaveChanges) {
            System.out.println("ACA!");
            ClientDAO dao = new ClientDAO();
            Client c = new Client();
            c.setName(view.txtChangeUsername.getText());
            c.setName(view.txtChangePassword.getText());
            c.setName(view.txtSetName.getText());
            c.setName(view.txtSetLastname.getText());
            c.setName(view.txtSetDayBirth.getText());
            dao.update(c);
        }
    }

    @Override
    public void focusGained(FocusEvent e) {

        if (e.getSource() == view.txtChangeUsername) {
            if (view.txtChangeUsername.getText().equals("Change username")) {
                view.txtChangeUsername.setText("");
            }
        }
        if (e.getSource() == view.txtChangePassword) {
            if (view.txtChangePassword.getText().equals("Change password")) {
                view.txtChangePassword.setText("");
            }
        }
        if (e.getSource() == view.txtConfirmPassword) {
            if (view.txtConfirmPassword.getText().equals("Confirm password")) {
                view.txtConfirmPassword.setText("");
            }
        }
        if (e.getSource() == view.txtSetName) {
            if (view.txtSetName.getText().equals("Set Name")) {
                view.txtSetName.setText("");
            }
        }
        if (e.getSource() == view.txtSetLastname) {
            if (view.txtSetLastname.getText().equals("Set Lastname")) {
                view.txtSetLastname.setText("");
            }
        }
        if (e.getSource() == view.txtSetDayBirth) {
            if (view.txtSetDayBirth.getText().equals("Set day of birth")) {
                view.txtSetDayBirth.setText("");
            }
        }
    }

    @Override
    public void focusLost(FocusEvent e) {

        if (e.getSource() == view.txtChangeUsername) {
            if (view.txtChangeUsername.getText().equals("")) {
                view.txtChangeUsername.setText("Change username");
                view.txtChangeUsername.setForeground(new Color(91, 91, 91));
            }
        }
        if (e.getSource() == view.txtChangePassword) {
            if (view.txtChangePassword.getText().equals("")) {
                view.txtChangePassword.setText("Change password");
                view.txtChangePassword.setForeground(new Color(91, 91, 91));
            }
        }
        if (e.getSource() == view.txtConfirmPassword) {
            if (view.txtConfirmPassword.getText().equals("")) {
                view.txtConfirmPassword.setText("Confirm password");
                view.txtConfirmPassword.setForeground(new Color(91, 91, 91));
            }
        }
        if (e.getSource() == view.txtSetName) {
            if (view.txtSetName.getText().equals("")) {
                view.txtSetName.setText("Set Name");
                view.txtSetName.setForeground(new Color(91, 91, 91));
            }
        }
        if (e.getSource() == view.txtSetLastname) {
            if (view.txtSetLastname.getText().equals("")) {
                view.txtSetLastname.setText("Set Lastname");
                view.txtSetLastname.setForeground(new Color(91, 91, 91));
            }
        }
        if (e.getSource() == view.txtSetDayBirth) {
            if (view.txtSetDayBirth.getText().equals("")) {
                view.txtSetDayBirth.setText("Set day of birth");
                view.txtSetDayBirth.setForeground(new Color(91, 91, 91));
            }
        }

    }

}
