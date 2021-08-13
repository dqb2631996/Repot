/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DepotManagementSystem;

import java.util.ArrayList;

/**
 *
 * @author mac
 */
public class StoreHouse {

    private ArrayList<Product> products = new ArrayList();

    public StoreHouse() {
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "StoreHouse{" + "products=" + products + '}';
    }

}
