#include <stdio.h>
#include <stdbool.h>

#define MAX_VAL 200

bool is_prime(int x) {
    if (x <= 1) return false;
    if (x <= 3) return true;
    if (x % 2 == 0  x % 3 == 0) return false;
    for (int i = 5; i * i <= x; i += 6) {
        if (x % i == 0  x % (i + 2) == 0) return false;
    }
    return true;
}

void find_non_prime_pair(int arr[], int n) {
    for (int i = 0; i < n; ++i) {
        for (int j = i + 1; j < n; ++j) {
            if (!is_prime(arr[i] + arr[j])) {
                printf("%d %d\n", i + 1, j + 1); 
                return;
            }
        }
    }
    printf("-1\n");
}

int main() {
    int T;
    scanf("%d", &T); 

    while (T--) {
        int N;
        scanf("%d", &N);
        
        int arr[N];
        for (int i = 0; i < N; ++i) {
            scanf("%d", &arr[i]);
        }
        
        find_non_prime_pair(arr, N);
    }

    return 0;
}