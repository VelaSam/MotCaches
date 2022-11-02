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
 File: PanelInformatif.java
 By: Samuel Velasco
 *********************************************************************************************/

package vue.generateurMotCroise;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class PanelInformatif extends JPanel {

    Border blackBorder = new LineBorder(Color.BLACK, 3);
    Font fontTitle = new Font("Dialog", Font.PLAIN,  55);
    Font fontExplanation = new Font("Dialog", Font.PLAIN,  20);
    Font FontUpsideDown = new Font("Sans_Serif", Font.PLAIN,  -50);

    public PanelInformatif(String club, String theme ,int nombreMots){

        GridBagConstraints gbc = new GridBagConstraints();
        this.setLayout(new GridBagLayout());


        JTextArea presentation = new JTextArea("MOTS CACHÉS");
        JTextArea explication = new JTextArea(theme + ", proposé par " + club);
        JTextArea explication2 = new JTextArea("Retrouvez les " + nombreMots +  " mots cachés dans la grille");
        JTextArea upsideDown = new JTextArea("Hello");


        presentation.setEditable(false);
        presentation.setFont(fontTitle);
        explication.setFont(fontExplanation);
        explication.setEditable(false);
        explication2.setFont(fontExplanation);
        explication2.setEditable(false);
        upsideDown.setFont(FontUpsideDown);
        upsideDown.setEditable(false);

        explication.setBackground(new Color(240,240,240));
        explication2.setBackground(new Color(240,240,240));
        upsideDown.setBackground(new Color(240,240,240));

        this.setBorder(blackBorder);
        presentation.setBackground(new Color(240,240,240));
        gbc.gridy = 1;
        this.add(presentation, gbc);
        gbc.gridy = 2;
        this.add(explication, gbc);
        gbc.gridy = 3;
        this.add(explication2, gbc);
        gbc.gridy=4;
        this.add(upsideDown, gbc);

    }
}
