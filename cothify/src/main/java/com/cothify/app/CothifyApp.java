
package com.cothify.app;

import com.cothify.app.controller.LoginController;
import com.cothify.app.view.CothifyView;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;


public class CothifyApp {
    
    public static void main(String[] args) {
        FlatLightLaf.setup();
        CothifyView view = new CothifyView();
        LoginController login = new LoginController(view);
        view.setVisible(true);
    }
    
}
