package designpatterns.abstractfactory.factory;

import designpatterns.abstractfactory.entity.department.Department;
import designpatterns.abstractfactory.entity.user.User;

public abstract class Factory {

    public User createUser(){
        return null;
    }

    public Department createDepartment() {
        return null;
    }
}
