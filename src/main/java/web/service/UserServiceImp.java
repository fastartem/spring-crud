package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    public void add(User user) {
        userDao.add(user);
    }

    public void update(User user) {
        userDao.update(user);
    }

    public List<User> listUsers() {
        return userDao.listUsers();
    }

    public void delete(int id) {
        userDao.delete(id);
    }
}
