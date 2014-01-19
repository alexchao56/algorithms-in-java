/** 
* An implementation of efficient exponetiation.
* Takes advantage of fact that if X is even, then X^N = X^(N/2) * X^(N/2)
* and if X is odd, then X^N = X^((N - 1)/2) * X^((N - 1)/2) * X.
*/

public static boolean isEven(x) {
    return (x % 2 == 0);
}

public static long pow(long x, int n) {
    if (n ==0) {
        return 1;
    } else if (n == 1) {
        return x;
    } else if (isEven(n)) {
        return pow (x * x, n / 2);
    } else {
        return pow(x * x, n / 2) * x;
    }
}