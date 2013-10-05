import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: manisingh
 * Date: 10/4/13
 * Time: 5:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class GameView {
    JPanel gameConfig = new JPanel();

    public GameView(){

    }

    private void createGameConfigUIComponents() {
        String [] difficulty = {"Easy", "Hard"};
        String [] mapType = {"1", "2", "3"};
        String [] playerNumList = {"1","2","3","4"};
        final JComboBox gameDifficultyList = new JComboBox(difficulty);
        final JComboBox mapTypeList = new JComboBox(mapType);
        final JComboBox playerList = new JComboBox(playerNumList);
        final JLabel diffLabel = new JLabel("Difficulty:");
        final JLabel mapLable = new JLabel("Map Type:");
        final JLabel playerLabel = new JLabel("Number of Players:");
        final JButton continueButton = new JButton("Continue");
        continueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                gameConfig.remove(diffLabel);
                gameConfig.remove(gameDifficultyList);
                gameConfig.remove(mapLable);
                gameConfig.remove(mapTypeList);
                gameConfig.remove(playerLabel);
                gameConfig.remove(playerList);
                gameConfig.remove(continueButton);
                gameConfig.revalidate();
                gameConfig.repaint();

                createPlayerConfigUIComponents();




            }
        });


        gameConfig.setLayout(new FlowLayout());

        gameConfig.add(diffLabel);
        gameConfig.add(gameDifficultyList);

        gameConfig.add(mapLable);
        gameConfig.add(mapTypeList);

        gameConfig.add(playerLabel);
        gameConfig.add(playerList);

        gameConfig.add(continueButton);


    }

    private void createPlayerConfigUIComponents() {
        String [] race = {"race1", "race2"};
        String [] color = {"red", "blue", "green", "yellow"};
        final JComboBox playerRaceList = new JComboBox(race);
        final JComboBox playerColorList = new JComboBox(color);
        final JTextField playerNameField = new JTextField("Anonymule");

        final JLabel raceLabel = new JLabel("Select Race:");
        final JLabel colorLabel = new JLabel("Select Color:");
        final JLabel nameLabel = new JLabel("PlayerName:");
        final JButton continueButton = new JButton("Continue");
        continueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                gameConfig.remove(playerRaceList);
                gameConfig.remove(playerColorList);
                gameConfig.remove(playerNameField);
                gameConfig.remove(raceLabel);
                gameConfig.remove(colorLabel);
                gameConfig.remove(nameLabel);
                gameConfig.remove(continueButton);
                gameConfig.revalidate();
                gameConfig.repaint();




            }
        });

        gameConfig.add(raceLabel);
        gameConfig.add(playerRaceList);

        gameConfig.add(colorLabel);
        gameConfig.add(playerColorList);

        gameConfig.add(nameLabel);
        gameConfig.add(playerNameField);

        gameConfig.add(continueButton);


    }








    public JPanel getPanel(){
        createGameConfigUIComponents();
        return gameConfig;
    }




}

