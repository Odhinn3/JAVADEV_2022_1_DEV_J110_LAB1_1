package MainPackage;


public class MainClass {
    public static void main(String[] args) {
        
        //массив стран по условию задачи
        Country[] conArray = new Country[5];
        conArray[0] = new Country("Russia", 17100000, 146700000, "Moscow", 12600000);
        conArray[1] = new Country("Finland", 338000, 5500000, "Helsinki", 655000);
        conArray[2] = new Country("France", 643800, 67800000, "Paris", 2100000);
        conArray[3] = new Country("Andorra", 467, 85400, "Andorra la Vella", 22600);
        conArray[4] = new Country("Singapore", 725, 5700000);
        
        
        
        //вывод на печать данных массива
        Country.printAll(conArray);
        Country.printPopDens(conArray);
        System.out.println("End app");
        
    }
     
}

