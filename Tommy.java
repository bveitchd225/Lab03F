import java.awt.*;
import gbs.*;
import gbs.game.*;

public class Tommy extends GBSGame {

    // The size of `/assets/tommy.png` is 100x150
    // The size of `/assets/tommy.png` is 50x50

    public Tommy() {
        
    }

    public void update(double dt) {

    }

    public void draw(Graphics g) {
        
    }

    public static void main(String[] args) {
        Tommy game = new Tommy();
        game.setResolution(800, 600);
        game.setFrameRate(60);
        game.createWindow();
    }
}