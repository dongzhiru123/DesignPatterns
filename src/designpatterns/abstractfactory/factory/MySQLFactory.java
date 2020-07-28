package designpatterns.abstractfactory.factory;

import designpatterns.abstractfactory.entity.user.MySQLUser;
import designpatterns.abstractfactory.entity.user.User;

public class MySQLFactory extends Factory{
    @Override
    public User createUser() {
        return new MySQLUser();
    }
}
