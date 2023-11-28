import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String s = "a32b 95cd 67dh hd19hd";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(s);
        ArrayList <Integer> primes = new ArrayList<>();
        while (matcher.find()) {
            int n = Integer.parseInt(matcher.group());
            if (isPrime(n)) primes.add(n);
        }
        System.out.print(primes.size()+primes.toString());
        
    }
    public static boolean isPrime(int n) {
        if (n <= 1)return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
