public class BinarySearchSqrRoot {
  public static void main(String[] args) {
    int n = 40;
    int p = 3;

    System.out.printf("%.3f", sqrt(n, p));
}

// Time: O(log(n))
static double sqrt(int n, int p) {
    int s = 0;
    int e = n;

    double root = 0.0;
//binary search between 0 to 40
    while (s <= e) {
        int m = s + (e - s) / 2;

        if (m * m == n) {
            return m;
        }

        if (m * m > n) {
            e = m - 1;
        } else {
            s = m + 1;
            root = m;
        }
    }
    double incr = 0.1;
//
    for (int i = 0; i < p; i++) {
//6.1 * 6.1 < 40 
//6.2 * 6.2 < 40 
//6.3 * 6.3 < 40

        while (root * root <= n) {
            root += incr;
        }
//6.4 *6.4 > 40
//therefore again move to 6.3
        root -= incr;
        incr /= 10;
    }

    return root;
}
}
