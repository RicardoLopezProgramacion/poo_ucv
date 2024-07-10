package com.cothify.app.controller;

import Animacion.Animacion;
import com.cothify.app.view.CothifyView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionsController implements ActionListener {

    private static CothifyView view;

    public OptionsController(CothifyView view) {
        this.view = view;
        view.btnProfile.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == view.btnProfile) {
            Animacion.mover_izquierda(0, -1280, 1, 8, view.pnlCatalogue);
            Animacion.mover_derecha(-1280, 0, 1, 8, view.pnlProfile);
            ProfileController profile = new ProfileController(view);
        }

        
    }

}
