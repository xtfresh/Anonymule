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
    JPanel playerConfig = new JPanel();

    public GameView(){

    }

    private void createUIComponents() {
        String [] difficulty = {"Easy", "Hard"};
        String [] mapType = {"1", "2", "3"};
        String [] playerNumList = {"1","2","3","4"};
        JComboBox gameDifficultyList = new JComboBox(difficulty);
        JComboBox mapTypeList = new JComboBox(mapType);
        JComboBox playerList = new JComboBox(playerNumList);
        JLabel diffLabel = new JLabel("Difficulty:");
        JLabel mapLable = new JLabel("Map Type:");
        JLabel playerLabel = new JLabel("Number of Players:");
        JButton continueButton = new JButton("Continue");
        continueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

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

    public JPanel getPanel(){
        createUIComponents();
        return gameConfig;
    }




}

