import java.time.LocalDate;

public class Building {

    private String name;

    private int yearBuilt;

    private int numberOfFloors;

    public Building(String name, int yearBuilt, int numberOfFloors) {
        this.name = name;
        this.yearBuilt = yearBuilt;
        this.numberOfFloors = numberOfFloors;
    }
    public int calculateAge(){
        int currentYear = LocalDate.now().getYear();
        return currentYear - yearBuilt;

    }
   public void view(){
       System.out.println(name+
               " ma "+numberOfFloors+" pieter"+
               " i "+calculateAge()+" lata.");



    }
}
