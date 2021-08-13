/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DepotManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mac
 */
public class Program {

    private StoreHouse storeHouse = new StoreHouse();

    // Xong cau b
    void insertProducts(int count) {
        for (int i = 0; i < count; i++) {
            Product p = new Product();
            p.setName("Gao");
            p.setQuanity(10);

            Category c = new Category("Loai 1");
            p.setCategory(c);

            storeHouse.getProducts().add(p);
        }
    }

    // Cau c
    void showProductsByCategory(String categoryName) {
        for (Product p : storeHouse.getProducts()) {
            if (p.getCategory().getName().equals(categoryName)) {
                System.out.println(p);
            } else {
                // Not same(Khong giong nhau)
                // Do nothing (Khong giong lam gi ca)
            }
        }
    }

    void showMenu() {
        System.out.println("1. Nhap mang san pham");
        System.out.println("2. Hien thi cac san pham theo loai");
        System.out.println("===========");
    }

    void handleMenu() {
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        System.out.println("====option" + option);
        switch (option) {
            case 1:
                insertProducts(2);
                break;
            case 2:
                showProductsByCategory("Loai 1");
                break;
            default:
                break;
        }
    }

    void run() {
        while (true) {
            showMenu();
            handleMenu();
        }
    }

    

    }
