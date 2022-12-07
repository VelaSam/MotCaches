/*********************************************************************************************
 ___                  _      ___   _____  ___
 |  _`\               ( )    (  _`\(_   _)(  _`\
 | (_) )   _      ___ | |/') | (_(_) | |  | (_(_)
 | ,  /  /'_`\  /'___)| , <  |  _)_  | |  `\__ \
 | |\ \ ( (_) )( (___ | |\`\ | (_( ) | |  ( )_) |
 (_) (_)`\___/'`\____)(_) (_)(____/' (_)  `\____)
 RockETS, Montreal
 Ecole de Technologie Superieure
 File: GenerateurMotCroise.java
 By: Samuel Velasco
 *********************************************************************************************/package vue.generateurMotCroise;

import javax.swing.*;

public class GenerateurMotCroise {

    public GenerateurMotCroise(String club, String theme, int nombreMots, boolean redMode){

        JFrame mainFrame = new FenetrePrincipale();
        JPanel panelMotCaches = new PanelMotCaches(redMode);
        JPanel panelInformatif = new PanelInformatif(club, theme, nombreMots);

        mainFrame.add(panelMotCaches);
        mainFrame.add(panelInformatif);

        mainFrame.setVisible(true);

    }
}
