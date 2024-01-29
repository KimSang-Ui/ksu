package org.example.Item;

public class ItemDB {
    private ItemCLi icli = new ItemCLi();

    public void insert(){
        System.out.println("상품 등록 가능 만들계획");
        Item item = icli.inputItem();
    }
}
