/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Country {
    protected String name;//название страны
    protected double area;//площадь страны, кв. км
    protected int popul;//население страны, чел
    protected double populdensity;//плотность населения в стране, чел/кв. км
    

    //конструктор по умолчанию
    public Country() {
    }
    
    
    //конструктор для государств
    public Country(String name, double area, int popul) {
        setName(name);
        setArea(area);
        setPopul(popul);
        populdensity = popul/area;
    }

 
    //геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty())
            throw new IllegalArgumentException("Название страны не задано!");
        this.name = name;  
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if (area <= 0)
            throw new IllegalArgumentException("Площадь страны не задана или задана некорректно!");
        this.area = area;
    }

    public int getPopul() {
        return popul;
    }

    public void setPopul(int popul) {
         if (popul < 0){
            throw new IllegalArgumentException("Население страны задано некорректно!");
         }
        this.popul = popul;
    }

   
    //расчет плотности населения
    public double getPopuldensity(double populdencity) {
        return populdensity;
    }
    
    
    //вывод плотности населения на печать
    public void printPopulDensity () {
        if (popul > 0) {
            System.out.println("Плотность населения в " + name + " равна " + populdensity + " чел./кв. км");
        }
        else {
            System.out.println("Расчет плотности наседения невозможен: население в " + name + " неизвестно");
        }
    }
    
    //вывод на печать информации о стране
    public void print() {
        if (popul > 0) {
            System.out.println(name + " - город-государство площадью "
                + area + " кв. км с населением " + popul/1000
                + " тыс. человек .");
        }
        else {
            System.out.println(name + " - город-государство площадью "
                + area + " кв. км, население неизвестно");
        }
    }

    
    //вывод на печать информации о всех странах в массиве
    public static void printAll(Country[] conArray){
        conArray[0].print();
        conArray[1].print();
        conArray[2].print();
        conArray[3].print();
        conArray[4].print();
    }
    
    
     //вывод на печать информации о плотности населения в массиве
     public static void printPopDens(Country[] conArray){
        conArray[0].printPopulDensity();
        conArray[1].printPopulDensity();
        conArray[2].printPopulDensity();
        conArray[3].printPopulDensity();
        conArray[4].printPopulDensity();
    }

    
    
    
}