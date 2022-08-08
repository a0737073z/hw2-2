package com.example.hw22.userservice;

import com.example.hw22.user.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> userList;
    public UserService(){
        this.userList = new ArrayList<>();
        this.userList.add(new User(1,"SSD",2200));
        this.userList.add(new User(2,"GTX3080",20000));
        this.userList.add(new User(3,"I7-7700",3000));

    }
    public List<User> getAllUsers() {

        return this.userList;
    }

    public User getUser(int id) {
        for(User user : this.userList){
            if(id == user.getId()){
                return user;
            }
        }
        return null;
    }

    public User createUser(User name) {
        this.userList.add(name);
        return name;
    }

    public User updateUser(int id,User name) {
        for(User updateUser : this.userList){
            if(id == updateUser.getId()){
                updateUser.setPrice(name.getPrice());
                updateUser.setName(name.getName());
                return updateUser;
            }
        }
        return null;
    }

    public User deleteUser(int id) {
        for(User deleteUser : this.userList){
            if(id == deleteUser.getId()){
                this.userList.remove(deleteUser);
                return deleteUser;
            }
        }
        return null;
    }

}
