
package com.cothify.app;

import com.cothify.app.view.CothifyView;
import com.formdev.flatlaf.FlatDarkLaf;


public class Cothify {
    
    public static void main(String[] args) {
        FlatDarkLaf.setup();
        CothifyView view = new CothifyView();
        view.setVisible(true);
    }
    
}
