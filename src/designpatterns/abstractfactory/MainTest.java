package designpatterns.abstractfactory;

import designpatterns.abstractfactory.entity.department.Department;
import designpatterns.abstractfactory.entity.user.User;
import designpatterns.abstractfactory.factory.MySQLFactory;
import designpatterns.abstractfactory.factory.SQLServerFactory;

/**
 * 测试主方法。
 */
public class MainTest {
    public static void main(String[] args) {
        // SQlServer 

        MySQLFactory mySQLFactory = new MySQLFactory();
        User user = mySQLFactory.createUser();
        user.insertUser();
        user.searchUser();

        // MySQL
        SQLServerFactory sqlServerFactory = new SQLServerFactory();
        Department department = sqlServerFactory.createDepartment();
        department.insertDepartment();
        department.searchDepartment();
    }
}
