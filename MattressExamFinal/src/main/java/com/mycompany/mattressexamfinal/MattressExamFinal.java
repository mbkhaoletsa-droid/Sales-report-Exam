/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mattressexamfinal;

/**
 *
 * @author User
 */
public class MattressExamFinal {

    public static void main(String[] args) {
        String [] productName = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phukrt"};
        
        int [][] numberOfProduct = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };
        
        int sum = 0;
        for (int i = 0; i < numberOfProduct.length; i++) {
            for (int j = 0; j < numberOfProduct[i].length; j++) {
                sum += numberOfProduct[i][j];
            }
        }

        int[] totals = new int[productName.length];//LOOP TO CALCULATE THE TOTAL
        for (int j = 0; j < productName.length; j++) {
            for (int store = 0; store < numberOfProduct.length; store++) {
                totals[j] += numberOfProduct[store][j];
            }
        }

        int mostPopularIndex = 0;//LOOP TO FIND THE HIGHEST VALUE
        int highestSale = 0;
        for (int i = 0; i < numberOfProduct.length; i++) {
            for (int j = 0; j < numberOfProduct[i].length; j++) {
                if (numberOfProduct[i][j] > highestSale) {
                    highestSale = numberOfProduct[i][j];
                    mostPopularIndex = j;
                }
            }
        }

        double averageSales = (double) sum / (productName.length * numberOfProduct.length);//CALCULATE THE AVERAGE


        
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println(" ");
        System.out.println("***********************************************");
        System.out.println("TOTAL PRODUCT SALES: " + sum);
        System.out.println("AVERAGE PRODUCTS SALES: " + (int) averageSales);
        System.out.println("MOST POPULAR PRODUCT: " + productName[mostPopularIndex].toLowerCase() + "(" + highestSale + ")");
        
        
        
        
        
    }
}
