/*********************************************************************************************
 ___                  _      ___   _____  ___
 |  _`\               ( )    (  _`\(_   _)(  _`\
 | (_) )   _      ___ | |/') | (_(_) | |  | (_(_)
 | ,  /  /'_`\  /'___)| , <  |  _)_  | |  `\__ \
 | |\ \ ( (_) )( (___ | |\`\ | (_( ) | |  ( )_) |
 (_) (_)`\___/'`\____)(_) (_)(____/' (_)  `\____)
 RockETS, Montreal
 Ecole de Technologie Superieure
 File: Tableau.java
 By: Samuel Velasco
 *********************************************************************************************/
package modele;


import java.util.Random;

public class Tableau {
    Random random = new Random();

    private int grandeur;
    private static char[][] lettres = new char[14][14];

    private static final boolean[][] artificial = new boolean[14][14];

    public void setLettre(int i, int j, char c){
        lettres[j][i] = c;
        artificial[j][i] = true;
    }

    public static String getLettre(int i, int j) {
        return Character.toString(lettres[i][j]);
    }

    public static boolean getArtificial(int i, int j) {return artificial[i][j];}

    public void setLettres(char[][] lettres) {
        Tableau.lettres = lettres;
    }

    public static char[][] getLettres() {
        return lettres;
    }

    public void remplirTableau(){
        for(int i = 0; i < 14; i++){
            for(int j = 0; j < 14; j++){
                lettres[i][j] = (char)(random.nextInt(26) + 'A');
                artificial[i][j] = false;
            }
        }
    }

    public void printTableau(){
        for(int i = 0; i < 14; i++){
            for(int j = 0; j < 14; j++){
                System.out.print(lettres[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public void printArtificials(){
        for(int i = 0; i < 14; i++){
            for(int j = 0; j < 14; j++){
                System.out.print(artificial[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
