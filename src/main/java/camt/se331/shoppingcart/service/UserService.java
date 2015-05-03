package camt.se331.shoppingcart.service;

import camt.se331.shoppingcart.entity.User;

import java.util.List;

/**
 * Created by Dell on 2/5/2558.
 */
public interface UserService {
    public List<User> findAll();
    public User findByUserName(String username);
    public User findUserByEmail(String username);
    public User login(String email, String password);
}