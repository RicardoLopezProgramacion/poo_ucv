
package com.cothify.app.model.dao;

import com.cothify.app.model.entity.Person;

public interface PersonDAO <T>{
    
    void insert(T t);
    void delete(T t);
    void select(T t);
    void update(T t);
    
}
