package com.cothify.app.controller;

import Animacion.Animacion;
import com.cothify.app.model.panel.Login;
import com.cothify.app.view.CothifyView;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LoginController implements ActionListener, MouseListener {

    CothifyView view;
    Login login;

    public LoginController(CothifyView view) {
        this.view = view;
        this.login = null;
        view.btnLogin.addActionListener(this);
        view.btnRegister.addMouseListener(this);
        view.btnExit.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Entrar a panel catalogo
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

}
