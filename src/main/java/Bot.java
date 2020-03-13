import bwapi.BWClient;
import bwapi.DefaultBWListener;
import bwapi.Game;

public class Bot extends DefaultBWListener {
    private BWClient bwClient;
    private Game game;

    @Override
    public void onStart() {
        game = bwClient.getGame();
    }

    @Override
    public void onFrame() {
        game.drawTextScreen(100, 100, "Hello World!");
    }

    public static void main(String[] args) {
        Bot bot = new Bot();
        bot.bwClient = new BWClient(bot);
        bot.bwClient.startGame();
    }
}
