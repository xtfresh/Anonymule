import javax.swing.*;

/**
 * Created with IntelliJ IDEA.
 * User: manisingh
 * Date: 10/4/13
 * Time: 6:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class GameController {
    public static void main(String [] args){
        GameView view = new GameView();
        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(view.getPanel());
        frame.setSize(500,500);
        frame.setVisible(true);


    }
}
