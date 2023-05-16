import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int gameGanador = 0;
        int bo = 3;
        for (int i = 0; i < bo; i++){
            Set set = new Set(1);
            List<Game> listaGames, listGamesTotales;
            listaGames = set.seJuegaSet(0.9, "Pedro1", "Juan2");
            for (Game g: listaGames){
                System.out.println("For Lista");
                System.out.println("Pedro1: " + g.getGameGanadoJ1());
                System.out.println("Juan2: " + g.getGameGanadoJ2());
            }
            set.inicializarGames();
        }
        /*for (Game g: listaGames){
            System.out.println("For Lista");
            System.out.println("Pedro1: " + g.getGameGanadoJ1());
            System.out.println("Juan2: " + g.getGameGanadoJ2());
        */
        /*
        Game game = new Game();
        gameGanador = game.seJuegaGame(1,0.9,"Pedro1", "JUan2");
        if (gameGanador == 1){
            System.out.println("Ganó jugador 1");
        }
        else {
            System.out.println("Gano jugador 2");
        }*/
    }
}
