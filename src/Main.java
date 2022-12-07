/*********************************************************************************************
 ___                  _      ___   _____  ___
 |  _`\               ( )    (  _`\(_   _)(  _`\
 | (_) )   _      ___ | |/') | (_(_) | |  | (_(_)
 | ,  /  /'_`\  /'___)| , <  |  _)_  | |  `\__ \
 | |\ \ ( (_) )( (___ | |\`\ | (_( ) | |  ( )_) |
 (_) (_)`\___/'`\____)(_) (_)(____/' (_)  `\____)
 RockETS, Montreal
 Ecole de Technologie Superieure
 File: Main.java
 By: Samuel Velasco
 *********************************************************************************************/
import modele.MotCache;
import modele.Tableau;
import vue.generateurMotCroise.GenerateurMotCroise;
import vue.listeMots.InterfaceGetListeMots;

import javax.swing.*;
import java.util.*;



public class Main {
    public static ArrayList<MotCache> mots = new ArrayList<>();
    static Random r = new Random();

    public static void main(String[] args) {

        //S'il te plait ne va pas essayer de lire le code si tu tiens à ta santé mentale :D

        //Rentrer le nom du Club
        String nomDuClub = "RockETS";

        //Rentrer le thème du Mot Caché
        String theme = "Sur le thème de l'aérospatial";

        //Entrer tous les mots que vous voulez avoir dans le mot caché. Déconseille d'avoir plus que 15 mots.
        //Ne pas mettre de mots plus longs que 14 caractères

        mots.add(new MotCache("VOIURE"));

        mots.add(new MotCache("MERCEDES"));
        mots.add(new MotCache("FUSEE"));
        mots.add(new MotCache("MOTEUR"));
        mots.add(new MotCache("DOMINATION"));
        mots.add(new MotCache("VITESSE"));
        mots.add(new MotCache("TABARNAK"));






        //Génère 2 tableaux. 1 avec les mots en rouge et un autre sans le rouge. Les deux tableaux sont identiques
        //Répéter l'éxécution du programme jusqu'à temps que le tableau est convenable.
        generer(nomDuClub, theme);

    }



    public static void generer(String nomDuClub, String theme){


        boolean checkValide;

        Tableau tableau = new Tableau();
        tableau.remplirTableau();

        for(MotCache mot : mots){

            checkValide = false;

            while(!checkValide) {
                switch (r.nextInt(4)) {
                    case 0:
                        checkValide = mot.drawHorizontal(getRandom(), getRandom(), tableau);
                        break;
                    case 1:
                        checkValide = mot.drawVertical(getRandom(), getRandom(), tableau);
                        break;
                    case 2:
                    case 3:
                        checkValide = mot.drawDiagonal(getRandom(), getRandom(), tableau);
                        break;
                }
            }
        }

        //Genere les interfaces graphiques où il va y avoir les mots croisés.
        //Première interface qui sera utilisée pour le mot croisé
        GenerateurMotCroise interfaceMotCroise = new GenerateurMotCroise(nomDuClub, theme ,mots.size(), false);
        //Deuxième interface qui montrera où les mots se trouvent (fin de tests seulement)
        GenerateurMotCroise interfaceMotCroiseRouge = new GenerateurMotCroise(nomDuClub, theme ,mots.size(), true);

    }

    public static int getRandom(){
        return r.nextInt(14);
    }





}
