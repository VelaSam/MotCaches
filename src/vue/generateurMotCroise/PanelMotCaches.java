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
 File: PanelMotCaches.java
 By: Samuel Velasco
 *********************************************************************************************/

package vue.generateurMotCroise;

import modele.Tableau;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.util.Random;

public class PanelMotCaches extends JPanel {

    public PanelMotCaches(boolean redMode){


        Border grayBorder = new LineBorder(Color.GRAY, 1);
        Border blackBorder = new LineBorder(Color.BLACK, 3);
        Font font1 = new Font("Monospaced", Font.PLAIN,  30);



        this.setBorder(blackBorder);
        this.setLayout(new GridLayout(14,14));

        JTextField[] carresse  = new JTextField[196];
        int l = 0;
        for(int i = 0; i < Tableau.getLettres().length; i++){
            for(int j = 0; j < Tableau.getLettres().length; j++, l++){

                carresse[l] = new JTextField();
                carresse[l].setText(Tableau.getLettre(i , j));


                if(Tableau.getArtificial(i,j) && redMode)
                    //VOICI LA LIGNE QUI REND TOUTE ROUGE
                    carresse[l].setBackground(Color.RED);

                carresse[l].setEditable(false);
                carresse[l].setFont(font1);
                carresse[l].setBorder(grayBorder);
                carresse[l].setHorizontalAlignment(JTextField.CENTER);

                this.add(carresse[l]);

            }
        }

    }
}
