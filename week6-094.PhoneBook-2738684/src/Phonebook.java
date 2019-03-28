/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author ama
 */
public class Phonebook {
    private ArrayList<Person> phonebook = new ArrayList<Person>();
    public void add(String name, String number){
        Person newPerson = new Person(name,number);
        phonebook.add(newPerson);
    }
    public void printAll(){
    for (Person i:phonebook){
        System.out.println(i);
    }
    }
    public String searchNumber(String name){
        for (Person i:phonebook){
            if (i.getName().equals(name)){
                return i.getNumber();}
            }
        return ""+"number not known";
        }
    }
