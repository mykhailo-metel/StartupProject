package com.startupApp.dao;

import com.startupApp.entities.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FakeDaoUserImpl implements DaoUser<User, String>{
    private Map<String, User> mapUser = new HashMap(0);

    public FakeDaoUserImpl() {
    }

    public void insert(User user) {
        mapUser.put(user.getLogin(), user);
    }

    public User read(String s) {
        return mapUser.get(s);
    }

    public User update(User user) {
        User oldUser = user;
        if(mapUser.containsKey(user.getLogin())){
            oldUser = mapUser.get(user.getLogin());
            mapUser.remove(user.getLogin());
        }
        mapUser.put(user.getLogin(), user);
        return oldUser;
    }

    public void delete(String s) {
        if(mapUser.containsKey(s)){
            mapUser.remove(s);
        }
    }

    public List<User> getAll() {
        return new ArrayList<User>(mapUser.values());
    }
}
