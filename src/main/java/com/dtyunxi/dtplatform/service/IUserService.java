package com.dtyunxi.dtplatform.service;

/**
 * Created by xunge on 2017/6/27.
 */

public interface IUserService {
    public boolean login(String username, String password) throws Exception;

    public int checkEmailExist(String email) throws Exception;

    public int checkUserExist(String user) throws Exception;

    //public User findUserByEmail(String email);
}
