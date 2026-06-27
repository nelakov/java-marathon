package day7;

import java.util.Random;

public class Player {
    private static final int MAX_PLAYERS = 6;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static final int MIN_INITIAL_STAMINA = 90;

    private static int playerCount = 0;

    private int stamina;

    public Player(int stamina) {
        boolean seated = takeSeat();
        if (seated) {
            this.stamina = stamina;
        }
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStamina() {
        return this.stamina;
    }

    public static int getPlayerCount() {
        return playerCount;
    }

    public void run(Player player) {
        int currentStamina = player.getStamina();
        if (currentStamina > MAX_STAMINA) {
            return;
        }
        if (currentStamina <= MIN_STAMINA) {
            System.out.println("Player leaves the field");
            --playerCount;
            printFieldStatus();
            return;
        }
        player.setStamina(currentStamina - 1);
    }

    private static boolean takeSeat() {
        if (playerCount >= MAX_PLAYERS) {
            System.out.println("No free seats on the field");
            return false;
        }
        ++playerCount;
        printFieldStatus();
        return true;
    }

    private static void printFieldStatus() {
        if (playerCount >= MAX_PLAYERS) {
            System.out.println("No free seats on the field");
            return;
        }
        int freeSeats = MAX_PLAYERS - playerCount;
        System.out.println("Teams are incomplete. Free seats on the field: " + freeSeats);
    }

    public static void main(String[] args) {
        Random random = new Random();
        Player player = new Player(random.nextInt(MIN_INITIAL_STAMINA, MAX_STAMINA));

        while (player.getStamina() > MIN_STAMINA) {
            player.run(player);
        }
    }
}
