
package com.cothify.app.model.dao;

import com.cothify.app.model.entity.Person;

public interface PersonDAO {
    
    void insert(Person person);
    void delete(Person person);
    void select(Person person);
    void update(Person person);
    
}
