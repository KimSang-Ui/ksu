package org.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

        //Input 소스가 많을 때 사용

        Path path = Paths.get("C:\\javastudy\\PathDemo.java");

        System.out.println(path.getRoot());
        System.out.println(path.getParent());
        System.out.println(path.getFileName());

        //현재 경로를 상대경로로 작성
        Path curpath = Paths.get("");

        if(curpath.isAbsolute())
            System.out.println(curpath);
        else{
            String temp = curpath.toAbsolutePath().toString();
            System.out.println(temp);
        }


        try (FileOutputStream fos = new FileOutputStream("aa.dat")) {
           fos.write(10);
           fos.write(20);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

        try (FileReader fr = new FileReader("aa.dat")){
            int temp = fr.read();
            System.out.println(temp);
            temp = fr.read();
            System.out.println(temp);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}