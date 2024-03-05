package org.example;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main6 {

    public static void main(String[] args) {

        Path fp = Paths.get("nio2.dat");

        try (DataOutputStream dos = new DataOutputStream(Files.newOutputStream(fp))) {
            dos.writeInt(10);
            dos.writeDouble(20.2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (DataInputStream dis = new DataInputStream(Files.newInputStream(fp))) {
            int temp = dis.readInt();
            System.out.println(temp);
            double temp1 = dis.readDouble();
            System.out.println(temp1);
        }catch (Exception e) {
            e.printStackTrace();


        }

    }
    }

