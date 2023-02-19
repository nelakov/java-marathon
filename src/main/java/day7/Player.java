/*
package day7;

import java.util.Random;

public class Player {
    private int stamina;
    private static int countOfPlayer = 0;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    
    public Player(int stamina) {
        if(countOfPlayer >= 6){
            info();
            return;
        }
        info();
        this.stamina = stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStamina() {
        return this.stamina;
    }
    
    public static int getCountOfPlayer() {
        return countOfPlayer;
    }

    public void run(Player player) {
        int stamina = player.getStamina();
        if(stamina < MIN_STAMINA || stamina > MAX_STAMINA) {
           return;
        } else if(stamina == 0) {
            System.out.println("Игрок уходит с поля");
            --countOfPlayer;
            info();
            return;
        }
        int decreaseStamina = stamina - 1;
        player.setStamina(decreaseStamina);
        
    }

    public void info() {
        if(countOfPlayer < 6) {
            switch(countOfPlayer) {
                case 0:
                System.out.println("Команды неполные. Cвободных мест на поле: 6");
                break;

                case 1:
                System.out.println("Команды неполные. Cвободных мест на поле: 5");
                break;

                case 2:
                System.out.println("Команды неполные. Cвободных мест на поле: 4");
                break;

                case 3:
                System.out.println("Команды неполные. Cвободных мест на поле: 3");
                break;

                case 4:
                System.out.println("Команды неполные. Cвободных мест на поле: 2");
                break;

                case 5:
                System.out.println("Команды неполные. Cвободных мест на поле: 1");
                break;
            }
            ++countOfPlayer;
        } else {
            System.out.println("На поле нет свободных мест");
        }
    
    }
    
    public static void main(String[] args) {
        Random random = new Random();
        Player player1 = new Player(random.nextInt(90,100));
        Player player2 = new Player(random.nextInt(90,100));
        Player player3 = new Player(random.nextInt(90,100));
        Player player4 = new Player(random.nextInt(90,100));
        Player player5 = new Player(random.nextInt(90,100));
        Player player6 = new Player(random.nextInt(90,100));
        Player player7 = new Player(random.nextInt(90,100));
        Player player8 = new Player(random.nextInt(90,100));
        
        for (int i = player1.getStamina(); i == player1.getStamina(); i--) {
            player1.run(player1);
        }
    }

}
*/
