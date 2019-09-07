public class CountPrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        int limit = 20;
        System.out.println("These are the first " + limit + " primes:");
        int number = 2;
        while (count < limit) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        boolean result = true;
        if (number < 2) {
            result = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
