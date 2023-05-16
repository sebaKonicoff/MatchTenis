import java.util.Random;

public class Game {
    private int gameGanadoJ1;
    private int gameGanadoJ2;

    Random rm = new Random();
    String puntos[] = {"0", "15", "30", "40", "Ventaja"};

    public Game() {
        this.gameGanadoJ1 = 0;
        this.gameGanadoJ2 = 0;
    }

    public int getGameGanadoJ1() {
        return gameGanadoJ1;
    }

    public void setGameGanadoJ1(int gameGanadoJ1) {
        this.gameGanadoJ1 = gameGanadoJ1;
    }

    public int getGameGanadoJ2() {
        return gameGanadoJ2;
    }

    public void setGameGanadoJ2(int gameGanadoJ2) {
        this.gameGanadoJ2 = gameGanadoJ2;
    }

    public int seJuegaGame(int saca, double probJ1, String nomJ1, String nomJ2){
        int puntoGanadoJ1 = 0;
        int puntoGanadoJ2 = 0;
        int gameGanador = 0;

        boolean gameTerminado = false;
        System.out.println("====================================");
        do {
            if (saca == 1){
                System.out.println("Saca jugador " + nomJ1);
            }
            else { System.out.println("Saca jugador " + nomJ2); }

            System.out.println(nomJ1+": "+ puntos[puntoGanadoJ1]);
            System.out.println(nomJ2+": "+ puntos[puntoGanadoJ2]);

            if (puntoGanado(probJ1) == 1){
                puntoGanadoJ1 += 1;
                System.out.println("Punto para " + nomJ1);
            }
            else {
                puntoGanadoJ2 += 1;
                System.out.println("Punto para " + nomJ2);
            }
            System.out.println("======================================");

            if ((puntoGanadoJ1 == 4 && puntoGanadoJ2 <=2) || (puntoGanadoJ1 == 5)){
                System.out.println("Game para " + nomJ1);
                gameGanador = 1;//game ganado por el jugador 1
                gameTerminado = true;

            }
            else if ((puntoGanadoJ2 == 4 && puntoGanadoJ1 <=2) || (puntoGanadoJ2 == 5)){
                System.out.println("Game para " + nomJ2);
                gameGanador = 2;//game ganado por el jugador 2
                gameTerminado = true;
            }

            else if (puntoGanadoJ1 == 4 && puntoGanadoJ2 == 4){
                puntoGanadoJ1 -= 1;
                puntoGanadoJ2 -=1;
            }
        }while (!gameTerminado);
        /*if (saca == 1){ saca = 2; }
        else { saca = 1;}*/
        return gameGanador;
    }

    public int puntoGanado(double probJ1){
        double punto = rm.nextDouble();
        if (punto <= probJ1){ return 1; }
        else { return 2; }
    }
}
