import java.util.ArrayList;
import java.util.Scanner;

class FootballPasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  

        while (--n>=0) {
            int a = sc.nextInt();
            int b = sc.nextInt();  
            ArrayList<Integer> players = new ArrayList<>();
            players.add(b);  

            for (int j = 0; j < a; j++) {
                String action = sc.next();
                if (action.equals("P")) {
                    int id = sc.nextInt();
                    players.add(id);
                } else {
                    players.add(players.get(players.size() - 2));  
                }
            }
            System.out.println("Player " + players.get(players.size() - 1));  
        }
    }
}

