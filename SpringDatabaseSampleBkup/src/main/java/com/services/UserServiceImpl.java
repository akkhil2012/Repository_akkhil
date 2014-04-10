package com.services;

import com.dao.UserDAO;
import com.model.User;

/**
 * Created by akhilg on 10/4/14.
 */
public class UserServiceImpl implements UserService{


    private UserDAO userDAO = new UserDAO();

    public void deleteUser(int id){

          userDAO.deleteUser(id);

    }


}
