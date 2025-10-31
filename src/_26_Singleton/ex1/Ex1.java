package _26_Singleton.ex1;

import _26_Singleton.LogManger;

public class Ex1 {
    private static Ex1 instance;
    private Ex1(){}
    private  static  Ex1 getInstance(){
        if (instance == null){
            instance == new Ex1();
        }
        return instance;
}
}
