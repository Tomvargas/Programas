/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.midespensa.classes;

/**
 *
 * @author User
 */
public class article extends proveedor {
    private int Id;
    private String Desc;
    private float Pvp;
    private float Price;
    private int Stock;
    private String Category;
    private String DateIn;

    public article(int Id, String Desc, float Pvp, float Price, int Stock, String Category, String DateIn, String NameCommerce, String CodProd, String NumDoc, String TipeDoc, String Name, String Surname, String CodCity, String Dir, String Phone) {
        super(NameCommerce, CodProd, NumDoc, TipeDoc, Name, Surname, CodCity, Dir, Phone);
        this.Id = Id;
        this.Desc = Desc;
        this.Pvp = Pvp;
        this.Price = Price;
        this.Stock = Stock;
        this.Category = Category;
        this.DateIn = DateIn;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public float getPvp() {
        return Pvp;
    }

    public void setPvp(float Pvp) {
        this.Pvp = Pvp;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getDateIn() {
        return DateIn;
    }

    public void setDateIn(String DateIn) {
        this.DateIn = DateIn;
    }
    
    
}
