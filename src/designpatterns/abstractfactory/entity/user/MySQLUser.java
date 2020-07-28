package designpatterns.abstractfactory.entity.user;

public class MySQLUser implements User {
    @Override
    public void insertUser() {
        System.out.println("利用 MySQL 实现插入 user");
    }

    @Override
    public void searchUser() {
        System.out.println("利用 MySQL 实现查询 user");
    }
}
