package designpatterns.abstractfactory.factory;

import designpatterns.abstractfactory.entity.department.Department;
import designpatterns.abstractfactory.entity.department.SQLServerDepartment;

public class SQLServerFactory extends Factory{
    @Override
    public Department createDepartment() {
        return new SQLServerDepartment();
    }
}
