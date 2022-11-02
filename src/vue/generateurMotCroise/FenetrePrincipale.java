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
 File: FenetrePrincipale.java
 By: Samuel Velasco
 *********************************************************************************************/
package vue.generateurMotCroise;

import javax.swing.*;
import java.awt.*;

public class FenetrePrincipale extends JFrame{

    public static ImageIcon logo = new ImageIcon("blackRocketLogo.jpg");

    public FenetrePrincipale() {

        this.setTitle("Générateur de Mot Cachés");
        this.setResizable(false);
        this.setLayout(new GridLayout(1,2));
        this.setIconImage(FenetrePrincipale.logo.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1600,800);


    }

}
