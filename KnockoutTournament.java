import java.util.*;

public class KnockoutTournament {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (--t>=0) {
            int[] slvl = new int[16];
            for (int i = 0; i < 16; i++) {
                slvl[i] = sc.nextInt();
            }
            int[] rss = maxWon(slvl);
            for (int rs : rss) {
                System.out.print(rs + " ");
            }
            System.out.println();
        }
  
    }

    private static int[] maxWon(int[] slvl) {
        int[] rss = new int[16];
        Player[] players = new Player[16];

        for (int i = 0; i < 16; i++) {
            players[i] = new Player(slvl[i], i);
        }

        Arrays.sort(players, Comparator.comparingInt(p -> p.skillLevel));

        for (int i = 0; i < 16; i++) {
            int count = i; 
            rss[players[i].index] = getWinsFromCount(count);
        }

        return rss;
    }

    private static int getWinsFromCount(int count) {
        if (count >= 15) return 4;
        if (count >= 7) return 3;
        if (count >= 3) return 2;
        if (count >= 1) return 1;
        return 0;
    }

    static class Player {
        int skillLevel;
        int index;

        Player(int skillLevel, int index) {
            this.skillLevel = skillLevel;
            this.index = index;
        }
    }
}
