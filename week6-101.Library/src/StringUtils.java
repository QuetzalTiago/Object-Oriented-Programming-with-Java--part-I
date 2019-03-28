/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ama
 */
public class StringUtils {
    public static boolean included(String word, String searched){
        String trimSearched = searched.trim();
        String trimWord = word.trim();
       // System.out.println(trimSearched);
        //System.out.println(trimWord);
            if (trimWord.toLowerCase().contains(trimSearched.toLowerCase())){
                return true;
            }
            if ((word==null)&(searched==null)){
        return false;}
            return false;
}
}