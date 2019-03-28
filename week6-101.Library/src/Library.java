
import java.util.Arrays;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ama
 */
public class Library {  
private ArrayList<Book> list = new ArrayList<Book>();
public Library(){   
}
public void addBook(Book newBook){
    list.add(newBook);
}
public void printBooks() {
    int size = list.size();
    for (int i = 0; i < size;i++) {
        System.out.println(list.get(i));
    }
    //System.out.println(Arrays.toString(list.toArray()));
    }
public ArrayList<Book> searchByTitle(String title) {
    ArrayList<Book> found = new ArrayList<Book>();
    for (Book i:list){
        //if(i.title().contains(title))
        if (StringUtils.included(i.title(), title)){
            found.add(i);}
    }
    return found;
}
public ArrayList<Book> searchByPublisher(String publisher) {
ArrayList<Book> found = new ArrayList<Book>();
    for (Book i:list){
        if(i.publisher().contains(publisher))
            found.add(i);
    }
    return found;    
}
public ArrayList<Book> searchByYear(int year) {
    ArrayList<Book> found = new ArrayList<Book>();
    for (Book i:list){
        if(i.year()==(year))
            found.add(i);
    }
    return found;    
}
}


