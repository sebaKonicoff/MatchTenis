import java.util.ArrayList;
import java.util.List;

public class Set {
    private List<Game> gameList;
    private int empiezaSaque;
    private int setGanadoJ1 =0;
    private int setGanadoJ2 =0;

    Game game;

    public Set(int saca) {
        this.setGanadoJ1 = 0;
        this.setGanadoJ2 = 0;
        this.empiezaSaque = saca;
    }

    public int getSetGanadoJ1() {
        return setGanadoJ1;
    }

    public void setSetGanadoJ1(int setGanadoJ1) {
        this.setGanadoJ1 = setGanadoJ1;
    }

    public int getSetGanadoJ2() {
        return setGanadoJ2;
    }

    public void setSetGanadoJ2(int setGanadoJ2) {
        this.setGanadoJ2 = setGanadoJ2;
    }

    public void inicializarGames(){
        game.setGameGanadoJ1(0);
        game.setGameGanadoJ2(0);
    }

    public List<Game> seJuegaSet(double probJ1, String nomJ1, String nomJ2){
        gameList = new ArrayList<>();
        game = new Game();
        int gamesGanadosJ1 = 0;
        int gamesGanadosJ2 = 0;
        boolean setTerminado = false;

        System.out.println("====================================");
        System.out.println("Comienzo del set");

        do {
            System.out.println("Games:");
            System.out.println(nomJ1+": "+ gamesGanadosJ1);
            System.out.println(nomJ2+": "+ gamesGanadosJ2);
            if(game.seJuegaGame(empiezaSaque,probJ1, nomJ1, nomJ2) == 1){
                gamesGanadosJ1 += 1;
                game.setGameGanadoJ1(gamesGanadosJ1);
                //System.out.println("Game para " + nom_j1);
            }
            else {
                gamesGanadosJ2 += 1;
                game.setGameGanadoJ2(gamesGanadosJ2);
                //System.out.println("Game para " + nom_j2);
            }

            if ((gamesGanadosJ1 == 6 && gamesGanadosJ2 <=4) || (gamesGanadosJ1 == 7 && gamesGanadosJ2 == 5)){
                System.out.println("Set para " + nomJ1);
                setGanadoJ1 +=1;
                setTerminado = true;
            }
            else if ((gamesGanadosJ2 == 6 && gamesGanadosJ1 <=4) || (gamesGanadosJ2 == 7 && gamesGanadosJ1 == 5)){
                System.out.println("Set para " + nomJ2);
                setGanadoJ2 +=1;
                setTerminado = true;
            }
        }while (!setTerminado);
        System.out.println("Set finalizado: ");
        System.out.println(nomJ1+": "+ gamesGanadosJ1);
        System.out.println(nomJ2+": "+ gamesGanadosJ2);
        gameList.add(game);
        return gameList;
    }
}
