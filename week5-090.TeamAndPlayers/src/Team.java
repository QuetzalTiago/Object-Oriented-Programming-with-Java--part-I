/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ama
 */
import java.util.ArrayList;
public class Team {
    private String name;
    private ArrayList<Player> playerList = new ArrayList<Player>();
    private int maxSize = 16;                    
    public Team (String name){
        this.name=name;
    }
    public String getName(){
        return ""+name;
    }
    public void addPlayer(Player newPlayer){
        if (playerList.size()<maxSize){
        playerList.add(newPlayer);}
    }

    
    public void printPlayers(){
            for (Player d:playerList){
                System.out.println(d);
        }
    }
    public void setMaxSize(int maxSize){
        this.maxSize=maxSize;
    }
    public int size(){
        return playerList.size();
    }
    public int goals(){
        int totalTeamGoals = 0;
        for (Player d:playerList){
        totalTeamGoals+=d.goals();}
        return totalTeamGoals;
    }
}

