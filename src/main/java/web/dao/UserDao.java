package web.dao;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    void update(User user);

    List<User> listUsers();

    void delete(int id);
}
