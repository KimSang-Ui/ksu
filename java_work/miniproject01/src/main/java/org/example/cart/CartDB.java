package org.example.cart;

import org.example.DBINFO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CartDB {
    private CartCLI cartCLI = new CartCLI();

    public void insert(){
        //장바구니 만들기
        Connection con = null;
        PreparedStatement pstmt = null;
        try{
            //insert into cart
            //insert into cart_item
            con = DriverManager.getConnection(DBINFO.url, DBINFO.user, DBINFO.password);
            pstmt = con.prepareStatement("inset into cart()");

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                pstmt.close();
                con.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    // 장바구니 안에 아이템 넣기
}
