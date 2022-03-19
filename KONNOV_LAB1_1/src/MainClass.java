/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class MainClass {
    public static void main(String[] args) {
        Country[] conArray = new Country[5];
        conArray[0] = new BigCountry("Russia", 17100000, 146700000, "Moscow", 12600000);
        conArray[1] = new BigCountry("Finland", 338000, 5500000, "Helsinki", 655000);
        conArray[2] = new BigCountry("France", 643800, 67800000, "Paris", 2100000);
        conArray[3] = new BigCountry("Andorra", 467, 85400, "Andorra la Vella", 22600);
        conArray[4] = new Country("Singapore", 725, 5700000);
        
        //вывод на печать данных массива
        Country.printAll(conArray);
        Country.printPopDens(conArray);
        System.out.println("End app");
        
    }
     
}

