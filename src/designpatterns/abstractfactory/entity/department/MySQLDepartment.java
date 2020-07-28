package designpatterns.abstractfactory.entity.department;

public class MySQLDepartment implements Department {
    @Override
    public void insertDepartment() {
        System.out.println("利用 MySQL 实现 department 插入");
    }

    @Override
    public void searchDepartment() {
        System.out.println("利用 MySQL 实现 department 查询");
    }
}
