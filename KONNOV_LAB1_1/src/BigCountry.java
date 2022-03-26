

/**
 *
 * @author user
 */
public class BigCountry extends Country {
    private String capname;//название столицы
    private int cappopul;//население столицы, чел.
   
    //конструктор для государств со столицей
    public BigCountry(String name, int area, int popul, String capname, int cappopul) {
        super.setName(name);
        super.setArea(area);
        super.setPopul(popul);
        populdensity = popul/area;
        
        setCapname(capname);
        setCappopul(cappopul);
        }
   
    //Геттеры и сеттеры государств со столицей
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
    
    @Override
    //расчет плотности населения
    public double getPopuldensity(double populdencity) {
        populdensity = popul/area;
        return populdensity;
    }
    
    @Override
    //вывод плотности населения на печать
    public void printPopulDensity () {
        if (popul > 0) {
            System.out.println("Плотность населения в " + name + " равна " + populdensity + " чел./кв. км");
        }
        else {
            System.out.println("Расчет плотности наседения невозможен: население в " + name + " неизвестно");
        }
    }
    
    @Override
    //вывод на печать информации о стране
    public void print(){
        if (popul > 0) {
            System.out.println(name + " - страна площадью "
                + area/1000 + " тыс. кв. км с населением " + popul/1000
                + " тыс. человек . Столица - город " + capname +
                " с населением " + cappopul/1000 + " тыс. человек");
                  
        }
        else {
            System.out.println(name + " - страна площадью "
                + area/1000 + " тысяч кв. км, население неизвестно. Столица - город " + capname +
                " с населением " + cappopul/1000 + " тысяч человек");
        }
    }
    
}