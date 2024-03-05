package org.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;


@Service
public class UserService {

    @Autowired
    UserDAO userDAO;


    public void Regist(User user) {
        userDAO.insert(user);




        }
    public void list() {
        Collection<User> collection = userDAO.select();
        collection.forEach(System.out::println);

    }


    }


