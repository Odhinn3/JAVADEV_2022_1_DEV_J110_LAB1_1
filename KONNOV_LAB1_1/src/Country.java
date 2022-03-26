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

    private String capname;//название столицы
    private int cappopul;//население столицы, чел.
    private String name;//название страны
    private double area;//площадь страны, кв. км
    private int popul;//население страны, чел
    private double populdensity;//плотность населения в стране, чел/кв. км
    
    //конструктор по умолчанию
    public Country() {
    }
    
    //конструктор для государств без столицы
    public Country(String name, double area, int popul) {
        setName(name);
        setArea(area);
        setPopul(popul);
        populdensity = popul/area;
    }
    
    //конструктор для государств со столицей
    public Country(String name, int area, int popul, String capname, int cappopul) {
        setName(name);
        setArea(area);
        setPopul(popul);
        setCapname(capname);
        setCappopul(cappopul);
        populdensity = popul/area; 
        }
 
    //геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        //проверка названия страны на пустоту
        if (name.isEmpty() || name == null)
            throw new IllegalArgumentException("Название страны не задано!");
        this.name = name;  
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        //проверка площади на корректность значения
        if (area <= 0)
            throw new IllegalArgumentException("Площадь страны не задана или задана некорректно!");
        this.area = area;
    }

    public int getPopul() {
        return popul;
    }

    public void setPopul(int popul) {
        //проверка населения страны на корректность
        if (popul < 0 || popul == 0){
            throw new IllegalArgumentException("Население страны задано некорректно!");
        }
        this.popul = popul;
    }
    
     public String getCapname() {
        return capname;
    }

    public void setCapname(String capname) {
        this.capname = capname;
    }

    public int getCappopul() {
        return cappopul;
    }

    public void setCappopul(int cappopul) {
        this.cappopul = cappopul;
    }

   
    //расчет плотности населения
    public double getPopuldensity(double populdencity) {
        return populdensity;
    }
    
    
    //вывод плотности населения на печать
    public void printPopulDensity () {
        //проверка на наличие населения для расчета
        if (popul > 0) {
            System.out.println("Плотность населения в " + name + " равна " + populdensity + " чел./кв. км");
        }
        else {
            System.out.println("Расчет плотности наседения невозможен: население в " + name + " неизвестно");
        }
    }
    
    //вывод на печать информации о стране
    public void print() {
        //проверка на наличие столицы, если нет, выводит как город-государство
        if (capname != null /*& popul > 0*/) {
            System.out.println(name + " - страна площадью "
                + area/1000 + " тыс. кв. км с населением " + popul/1000
                + " тыс. человек . Столица - город " + capname +
                " с населением " + cappopul/1000 + " тыс. человек");
            }
        else
            System.out.println(name + " - город-государство площадью "
                + area + " кв. км с населением " + popul/1000
                + " тыс. человек .");
    }
        


    
    //вывод на печать информации о всех странах в массиве
    public static void printAll (Country[] conArray){
        for (Country c : conArray){
            c.print();
        }
    }
    
    
    //вывод на печать информации о плотности населения в массиве
    public static void printPopDens(Country[] conArray){
        for (Country d : conArray){
            d.printPopulDensity();
        }
    }
}