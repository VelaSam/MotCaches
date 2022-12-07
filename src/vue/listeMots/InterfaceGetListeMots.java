/*********************************************************************************************
 ___                  _      ___   _____  ___
 |  _`\               ( )    (  _`\(_   _)(  _`\
 | (_) )   _      ___ | |/') | (_(_) | |  | (_(_)
 | ,  /  /'_`\  /'___)| , <  |  _)_  | |  `\__ \
 | |\ \ ( (_) )( (___ | |\`\ | (_( ) | |  ( )_) |
 (_) (_)`\___/'`\____)(_) (_)(____/' (_)  `\____)
 RockETS, Montreal
 Ecole de Technologie Superieure
 File: InterfaceGetListeMots.java
 By: Samuel Velasco
 *********************************************************************************************


                        UNUSED CODE                          UNUSED CODE                            UNUSED CODE



 **********************************************************************************************/
package vue.listeMots;

import vue.generateurMotCroise.FenetrePrincipale;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class InterfaceGetListeMots {

    Font fontTitle = new Font("Dialog", Font.PLAIN,  25);
    Border blackBorder = new LineBorder(Color.BLACK, 3);
    public InterfaceGetListeMots(){

        JTextField presentationTitre = new JTextField(" ENTREZ LES MOTS QUI IRONT DANS LA GRILLE ");
        presentationTitre.setEditable(false);
        presentationTitre.setFont(fontTitle);
        presentationTitre.setBackground(new Color(240,240,240));
        presentationTitre.setBorder(blackBorder);


        JFrame fen = new JFrame();
        fen.setIconImage(FenetrePrincipale.logo.getImage());
        fen.setLayout(new BorderLayout());
        fen.setSize(900,400);
        JPanel panHaut = new JPanel();
        panHaut.add(presentationTitre);

        JPanel panBas = new JPanel(new FlowLayout());


        fen.add(panHaut, BorderLayout.NORTH);
        fen.add(panBas, BorderLayout.CENTER);



        JTextField[] champsDeTextes = new JTextField[14];

        for(int i = 0; i < 14; i++){
            champsDeTextes[i] = new JTextField("Hello");
            panBas.add((champsDeTextes[i]));

        }

        fen.setVisible(true);

    }


}
