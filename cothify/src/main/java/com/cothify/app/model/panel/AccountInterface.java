
package com.cothify.app.model.panel;


public interface AccountInterface {
    
    // Solo sentencias DML (Data Model Lenguage) para obtener 
    public abstract boolean login(String user, String password);
    public abstract void register();
    
}
