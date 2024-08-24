import java.util.ArrayList;
import java.util.Scanner;

public class PlayerCommands {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); 

        while (-- n >= 0) {
            String[] initialInputs = sc.nextLine().split(" ");
            int a = Integer.parseInt(initialInputs[0]);
            int b = Integer.parseInt(initialInputs[1]);

            ArrayList<Integer> l = new ArrayList<>();
            l.add(b);

            for (int j = 0; j < a; j++) {
                String s = sc.nextLine();
                if (s.charAt(0) == 'P') {
                    String[] parts = s.split(" ");
                    int id1 = Integer.parseInt(parts[1]);
                    l.add(id1);
                } else {
                    l.add(l.get(l.size() - 2));
                }
            }

            System.out.println("Player " + l.remove(l.size() - 1));
        }

    }
}