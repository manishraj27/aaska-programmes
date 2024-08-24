import java.util.*;

class ShortestPathQueries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (--t>=0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] A = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                A[i] = sc.nextInt();
            }

            int[][] distances = new int[n + 1][n + 1];
            for (int i = 1; i <= n; i++) {
                Arrays.fill(distances[i], -1);
                bfs(n, A, i, distances);
            }

            for (int i = 0; i < q; i++) {
                int X = sc.nextInt();
                int Y = sc.nextInt();
                System.out.println(distances[X][Y]);
            }
        }
    }

    private static void bfs(int n, int[] A, int start, int[][] distances) {
        boolean[] visited = new boolean[n + 1];
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{start, 0});
        visited[start] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int node = current[0];
            int distance = current[1];

            if (distances[start][node] == -1) {
                distances[start][node] = distance;
            }

            for (int j = 1; j <= A[node] && node + j <= n; j++) {
                int nextNode = node + j;
                if (!visited[nextNode]) {
                    visited[nextNode] = true;
                    queue.add(new int[]{nextNode, distance + 1});
                }
            }
        }
    }
}