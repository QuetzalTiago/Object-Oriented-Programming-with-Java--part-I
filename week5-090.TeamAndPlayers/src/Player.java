/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ama
 */
public class Player {
    private String name;
    private int amountOfGoals;
public Player (String name){
    this.name=name;
    }
public Player (String name, int Goals){
    this.name=name;
    amountOfGoals=Goals;
}
public String getName(){
    return ""+name;            
}
public int goals(){
    return amountOfGoals;
}
public String toString(){
    return ""+name+" goals "+amountOfGoals;
}
}
