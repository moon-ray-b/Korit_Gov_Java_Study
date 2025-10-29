package _25_LayeredArchitecture.repository;

import _25_LayeredArchitecture.entity.User;

public class UserList {
    private User[] users;

     public UserList(){
         this.users = new User[0]; //초기화를 위해서 0으로 기준 잡음
     }

     public User findByUsername(String username){
         for(User user : users){
             if (user.getUsername().equals(username)){
                 return  user;
             }
         }
         return null;
     }
}
