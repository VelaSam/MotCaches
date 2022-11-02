/*********************************************************************************************
 ___                  _      ___   _____  ___
 |  _`\               ( )    (  _`\(_   _)(  _`\
 | (_) )   _      ___ | |/') | (_(_) | |  | (_(_)
 | ,  /  /'_`\  /'___)| , <  |  _)_  | |  `\__ \
 | |\ \ ( (_) )( (___ | |\`\ | (_( ) | |  ( )_) |
 (_) (_)`\___/'`\____)(_) (_)(____/' (_)  `\____)
 Copyright (c) 2022-2023
 RockETS, Montreal
 Ecole de Technologie Superieure
 File: MotCache.java
 By: Samuel Velasco
 *********************************************************************************************/
package modele;

public class MotCache {

    private String mot;
    public MotCache(String mot){
        this.mot = mot;
    }

    public char[] getSplittedMot(){
        return this.mot.toCharArray();
    }



    public boolean drawVertical(int starting_x, int starting_y, Tableau tableau){
        int i = 0;
        int j = 0;



        if(starting_y + this.mot.length() > 14) {
            return false;
        }

        for(char lettre : this.getSplittedMot()){
            if(Tableau.getArtificial(starting_y+j, starting_x) /* && !(Tableau.getLettre(starting_x, starting_y+j).equals(Character.toString(lettre)))*/){
                return false;
            }
            j++;
        }
        j = 0;

        for(char lettre : this.getSplittedMot()){
            tableau.setLettre(starting_x, starting_y+j, lettre);
            i++;
            j++;
        }

        return true;
    }

    public boolean drawHorizontal(int starting_x, int starting_y, Tableau tableau){

        int i = 0;

        if(starting_x+ this.mot.length()>14) {
            return false;
        }

        for(char lettre : this.getSplittedMot()){
            if(Tableau.getArtificial(starting_y, starting_x+i)  /*&& !(Tableau.getLettre(starting_x+i, starting_y).equals(Character.toString(lettre)))*/){
                return false;
            }
            i++;
        }

        i=0;

        for(char lettre : this.getSplittedMot()){
            tableau.setLettre(starting_x+i, starting_y, lettre);
            i++;
        }

        return true;
    }

    public boolean drawDiagonal(int starting_x, int starting_y, Tableau tableau){

        int i = 0;
        int j = 0;

        if(starting_x+mot.length() > Tableau.getLettres().length || starting_y + mot.length()> Tableau.getLettres().length) {
            return false;
        }

        for(char lettre : this.getSplittedMot()){
            if(Tableau.getArtificial(starting_y + i, starting_x + j) /* && !(Tableau.getLettre(starting_x+i, starting_y+j).equals(Character.toString(lettre)))*/){
                return false;
            }
            i++;
            j++;
        }
        i=0;
        j=0;

        for(char lettre : this.getSplittedMot()){
            tableau.setLettre(starting_x+i, starting_y+j, lettre);
            i++;
            j++;
        }

        return true;
    }
}
