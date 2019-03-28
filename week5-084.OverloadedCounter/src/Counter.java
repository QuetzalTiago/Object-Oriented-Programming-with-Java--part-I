/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ama
 */
public class Counter {
private int number;
private boolean check=false;

public Counter(int startingValue, boolean check){
number=startingValue;
if (check==true){
    this.check=true;
}
if  (check==false){
    this.check=false;
}
 }
public Counter (int startingValue){
    number=startingValue;
}
public Counter (boolean check){
    number=0;
    if (check==true){
    this.check=true;
}
if  (check==false){
    this.check=false;
}
}
public Counter(){
    number=0;
}
public int value(){
    return number;
}
public void increase(){
    number++;
}
public void increase(int increaseAmount){
    if (increaseAmount>0){
    number+=increaseAmount;}
}
public void decrease(){
    if (check==false){
    number--;}
    if (check==true){
    number--;
      if(number<0){     
        number=0;}
    }
}
public void decrease(int decreaseAmount){
    if (check==false&&decreaseAmount>0){
    number-=decreaseAmount;}
    if (check==true){
    number-=decreaseAmount;
      if(number<0){     
        number=0;}
    }
}

}