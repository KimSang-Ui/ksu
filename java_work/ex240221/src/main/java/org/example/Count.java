package org.example;

public class Count {
    private  int cnt;

//    public void incre(){
      synchronized public void incre(){
        cnt++;
    }

//    public void decre(){
      synchronized public void decre(){
        cnt--;
    }

    public int getCnt(){
        return cnt;
    }
}
