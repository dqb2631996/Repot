/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DepotManagementSystem;

/**
 *
 * @author mac
 */
public class Product {

    private String name;
    private int quanity;
    private Category category;

    public Product() {
    }

    public Product(String name, int quanity, Category category) {
        this.name = name;
        this.quanity = quanity;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", quanity=" + quanity + ", category=" + category + '}';
    }

}
