import java.util.HashMap;

import java.util.Map;
public class EjercicioPD{
    public long getFibonacci(long n){
        if (n <=1){
            return n;
        }
        return getFibonacci(n-1)+getFibonacci(n-2);

    }

    public long getFibonacciPD(long n){
        Map<Long,Long> caching =new HashMap<>();
        return getFibonacciPDHelper(n, caching);
            
    }
    public long getFibonacciPDHelper(long n, Map<Long,Long> cache){
        if(n<=1){
            return n;
        }

        if(cache.containsKey(n)){
            return cache.get(n);
        }

        long resultado = getFibonacciPDHelper(n-1, cache) + getFibonacciPDHelper(n-2, cache);
        cache.put(n,resultado);

        return resultado;

        
    }
}