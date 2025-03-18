/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtest;

/**
 *
 * @author micha
 */
public class Person {
    private String name;
    private String priority; // Urgent, Medium, Low
    private String gpDetails;
    private int age;
    private boolean comingFromWard;

    public Person(String name, String priority, String gpDetails, int age, boolean comingFromWard) {
        this.name = name;
        this.priority = priority;
        this.gpDetails = gpDetails;
        this.age = age;
        this.comingFromWard = comingFromWard;
    }

    // Getters and Setters
    public String getName() { return name; }
    public String getPriority() { return priority; }
    public String getGpDetails() { return gpDetails; }
    public int getAge() { return age; }
    public boolean isComingFromWard() { return comingFromWard; }
    
    //  method for displaying info toString
    @Override
    public String toString() {
        return name + " | " + priority + " | Age: " + age + " | GP: " + gpDetails;
    }
}

