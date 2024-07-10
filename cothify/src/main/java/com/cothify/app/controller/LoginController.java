package com.cothify.app.controller;

import Animacion.Animacion;
import com.cothify.app.model.panel.Login;
import com.cothify.app.view.CothifyView;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LoginController implements ActionListener, MouseListener, FocusListener {

    private static CothifyView view;
    private static Login login;

    public LoginController(CothifyView view) {
        this.view = view;
        this.login = null;
        view.btnLogin.addActionListener(this);
        view.btnRegister.addMouseListener(this);
        view.btnExit.addMouseListener(this);
        view.txtUser.addFocusListener(this);
        view.txtPassword.addFocusListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.btnLogin) {
            Login login = new Login();
            char[] password = view.txtPassword.getPassword();
            
            boolean access = login.login(view.txtUser.getText(), view.txtPassword.getText());
            
            if (access) {
                Animacion.mover_izquierda(0, -1280, 1, 8, view.pnlLogin);
                Animacion.mover_derecha(-1280, 0, 1, 8, view.pnlOptions);
                OptionsController options = new OptionsController(view);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == view.btnRegister) {
            Animacion.mover_izquierda(0, -1280, 1, 8, view.pnlLogin);
            Animacion.mover_derecha(-1280, 0, 1, 8, view.pnlRegister);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource() == view.btnExit) {
            view.btnExit.setBackground(Color.red);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (e.getSource() == view.btnExit) {
            view.btnExit.setBackground(null);
        }
    }

    @Override
    public void focusGained(FocusEvent e) {
        if (e.getSource() == view.txtUser) {
            if (view.txtUser.getText().equals("Enter username")) {
                view.txtUser.setText("");
                view.txtUser.setForeground(Color.BLACK);
            }
        }

        if (e.getSource() == view.txtPassword) {
            if (new String((char[]) view.txtPassword.getPassword()).equals("Enter password")) {
                view.txtPassword.setText("");
                view.txtPassword.setForeground(Color.BLACK);
                view.txtPassword.setEchoChar('*');

            }
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource() == view.txtUser) {
            if (view.txtUser.getText().equals("")) {
                view.txtUser.setText("Enter username");
                view.txtUser.setForeground(new Color(91, 91, 91));
            }
        }

        if (e.getSource() == view.txtPassword) {
            if (new String((char[]) view.txtPassword.getPassword()).equals("")) {
                view.txtPassword.setText("Enter password");
                view.txtPassword.setForeground(new Color(91, 91, 91));
                view.txtPassword.setEchoChar('\u0000');
            }
        }
    }

}
