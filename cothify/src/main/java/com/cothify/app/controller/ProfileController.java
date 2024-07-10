package com.cothify.app.controller;

import Animacion.Animacion;
import com.cothify.app.view.CothifyView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

public class ProfileController implements ActionListener {

    private static CothifyView view;

    public ProfileController(CothifyView view) {
        this.view = view;
        view.btnPersonalData.addActionListener(this);
        view.btnPaymentMethods.addActionListener(this);
        view.btnShoppingHistory.addActionListener(this);
        view.btnInventaryControl.addActionListener(this);
        view.btnAnalitycs.addActionListener(this);
        PersonalDataController personalData = new PersonalDataController(view);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //currentPanel = view.pnlPersonalData;
        if (e.getSource() == view.btnPersonalData) {
            Animacion.mover_izquierda(270, -1010, 1, 8, view.pnlPaymentMethods);
            /*
            Animacion.mover_izquierda(270, -1010, 1, 8, view.pnlShoppingHistory);
            Animacion.mover_izquierda(270, -1010, 1, 8, view.pnlInventaryControl);
            Animacion.mover_izquierda(270, -1010, 1, 8, view.pnlAnalitycs);
             */
            Animacion.mover_derecha(-1010, 270, 1, 8, view.pnlPersonalData);

            PersonalDataController personalData = new PersonalDataController(view);
        }

        if (e.getSource() == view.btnPaymentMethods) {
            Animacion.mover_izquierda(270, -1010, 1, 8, view.pnlPersonalData);
            /*
            Animacion.mover_izquierda(270, -1010, 1, 8, view.pnlShoppingHistory);
            Animacion.mover_izquierda(270, -1010, 1, 8, view.pnlInventaryControl);
            Animacion.mover_izquierda(270, -1010, 1, 8, view.pnlAnalitycs);
             */
            Animacion.mover_derecha(-1010, 270, 1, 8, view.pnlPaymentMethods);

        }
        if (e.getSource() == view.btnShoppingHistory) {
            /*
            Animacion.mover_izquierda(270, -1010, 1, 8, view.pnlPersonalData);
            Animacion.mover_izquierda(270, -1010, 1, 8, view.pnlPaymentMethods);
            Animacion.mover_izquierda(270, -1010, 1, 8, view.pnlInventaryControl);
            Animacion.mover_izquierda(270, -1010, 1, 8, view.pnlAnalitycs);
            Animacion.mover_derecha(-1280, 0, 1, 8, view.pnlShoppingHistory);
             */
        }
        if (e.getSource() == view.btnInventaryControl) {
            /*
            Animacion.mover_izquierda(270, -1010, 1, 8, view.pnlPersonalData);
            Animacion.mover_izquierda(270, -1010, 1, 8, view.pnlPaymentMethods);
            Animacion.mover_izquierda(270, -1010, 1, 8, view.pnlShoppingHistory);
            Animacion.mover_izquierda(270, -1010, 1, 8, view.pnlAnalitycs);
            Animacion.mover_derecha(-1280, 0, 1, 8, view.pnlInventaryControl);
             */
        }
        if (e.getSource() == view.btnAnalitycs) {
            /*
            Animacion.mover_izquierda(270, -1010, 1, 8, view.pnlPersonalData);
            Animacion.mover_izquierda(270, -1010, 1, 8, view.pnlPaymentMethods);
            Animacion.mover_izquierda(270, -1010, 1, 8, view.pnlShoppingHistory);
            Animacion.mover_izquierda(270, -1010, 1, 8, view.pnlInventaryControl);
            Animacion.mover_derecha(-1280, 0, 1, 8, view.pnlAnalitycs);
             */
        }

    }

}
