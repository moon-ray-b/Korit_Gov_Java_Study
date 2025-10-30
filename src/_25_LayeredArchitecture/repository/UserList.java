package _25_LayeredArchitecture.repository;

import _25_LayeredArchitecture.entity.User;

public class UserList {
    private User[] users;

     public UserList(){
         this.users = new User[0]; //초기화를 위해서 0으로 기준 잡음
     }
     public User[] getAllUsers(){
         return users;
     }

     public User findByUsername(String username){
         for(User user : users){
             if (user.getUsername().equals(username)){
                 return  user;
             }
         }
         return null;
     }

     public int generateUerId() {
         //만약 users 배열에 아무것도 없으면 1반환
         //있으면 마지막 user객체의 userId에 +1 한 결과값을 반환
         //삼항연산자
//             if (users == null && users.length == 0) {
//                 return 1;
//             }else {
//                 return users[users.length -1].getUserId()+1;
//             }
         return users.length == 0 ? 1 : users[users.length - 1].getUserId() + 1;// 강사님이 한거
     }

    public void add(User user){
         //새로 넣을 배열 => 길이? => 원래 있던 배열의 길이에서 +1
        //새로 넣을 배열에 원래 있던 요소들을 먼저 추가
        //새로 추가할 user를 넣어야함
        //users에 있던 배열에서 새로운 배열로 바꾸기

        User[] users1 = new User[users.length +1];
        for (int i = 0; i < users.length ; i++) {
            users1[i] = users[i];
        }
        users1[users1.length - 1] = user;
        users = users1;
     }
}
