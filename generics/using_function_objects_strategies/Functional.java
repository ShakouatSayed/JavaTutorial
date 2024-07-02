package generics.using_function_objects_strategies;
import java.math.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Functional
 */

 interface Combiner<T>{T combine(T x, T y);}
 interface UrinaryFunction<R, T> {R function(T x);}
 interface Collector<T> extends UrinaryFunction<T, T>{T result();}
 interface UrinaryPredicate<T> {boolean test(T x);}

public class Functional {

    public static <T> T reduce(Iterable<T> seq, Combiner<T> combiner){
        Iterator<T> iterator  = seq.iterator();
        if(iterator.hasNext()){
            T result = iterator.next();
            while (iterator.hasNext()) {
                result = combiner.combine(result, iterator.next());
                return result;
            }
        }
        return null;
    }

    public static <T> Collector<T> forEachMethod(Iterable<T> seq, Collector<T> func){
        for(T t : seq)
            func.function(t);
        return func;
    }

    public static <T> List<T> transfrom(Iterable<T> seq, UrinaryFunction<T, T> func){
        List<T> result = new ArrayList<>();
        for(T t : seq)
            result.add(func.function(t));
        return result;
    }

    public static <T> List<T> filter(Iterable<T> seq, UrinaryPredicate<T> pred){
        List<T> result = new ArrayList<>();
        for(T t: seq)
            if(pred.test(t)){
                result.add(t);
            }
        return result;
    }

    static class IntegerAdder implements Combiner<Integer>{
        public Integer combine(Integer x, Integer y){
            return x + y;
        }
    }

    static class IntegerSubtractor implements Combiner<Integer>{
        public Integer combine(Integer x, Integer y){
            return x - y;
        }
    }

    static class BigIntegerAdder implements Combiner<BigInteger>{
        public BigInteger combine(BigInteger x, BigInteger y){
            return x.add(y);
        }
    }
    static class BigDecimalAdder implements Combiner<BigDecimal>{
        public BigDecimal combine(BigDecimal x, BigDecimal y){
            return x.add(y);
        }
    }
    static class AtomicLongAdder implements Combiner<AtomicLong>{
        public AtomicLong combine(AtomicLong x, AtomicLong y){
            return new AtomicLong(x.addAndGet(y.get()));
        }
    }

    static class BigDecimalUlp implements UrinaryFunction<BigDecimal, BigDecimal>{
        public BigDecimal function(BigDecimal x){
            return x.ulp();
        }
    } 

    static class GretherThem<T extends Comparable<T>> implements UrinaryPredicate<T>{
        private T bound;
        public GretherThem(T bound){this.bound = bound;}
        public boolean test(T x){
            return x.compareTo(bound)>0;
        }
    }

    static class MultiplyingIntegerCollector implements Collector<Integer> {
        private Integer val = 1;
        public Integer function(Integer x){
            val *= x;
            return val;
        }
        public Integer result(){return val;}
    } 
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(10, 20, 30, 40, 45, 50, 21, 31);
        Integer result = reduce(li, new IntegerAdder());
        System.out.println(result);

        result = reduce(li, new IntegerSubtractor());
        System.out.println(result);

        System.out.println(filter(li, new GretherThem<Integer>(3)));
        System.out.println(forEachMethod(li, new MultiplyingIntegerCollector()).result());
        System.out.println(forEachMethod(filter(li, new GretherThem<Integer>(3)), new MultiplyingIntegerCollector()).result());
        
        //print with BigDecimal Number
        MathContext mc = new MathContext(7);
        List<BigDecimal> bigDecimalList = Arrays.asList(new BigDecimal(1.2, mc), new BigDecimal(3.2, mc), new BigDecimal(2.2, mc), new BigDecimal(5.2, mc));
        BigDecimal bigDecimalResult = reduce(bigDecimalList, new BigDecimalAdder());
        System.out.println(bigDecimalResult);
        System.out.println(filter(bigDecimalList, new GretherThem<BigDecimal>(new BigDecimal(3))));
        System.out.println(transfrom(bigDecimalList, new BigDecimalUlp()));

        //print with BigInteger Number
        List<BigInteger> bigIntegerList = new ArrayList<>();
        BigInteger bigIntegerValue = BigInteger.valueOf(11);
        for(int i = 0; i < 11; i++){
            bigIntegerList.add(bigIntegerValue);
            bigIntegerValue = bigIntegerValue.nextProbablePrime();
        }

        bigIntegerValue = reduce(bigIntegerList, new BigIntegerAdder());

        System.out.println(bigIntegerList);
        System.out.println(bigIntegerValue);
        System.out.println(bigIntegerValue.isProbablePrime(5));

        //print with AtomicLong number
        List<AtomicLong> atomicLongList = Arrays.asList(new AtomicLong(12), new AtomicLong(15), new AtomicLong(25), new AtomicLong(35));
        AtomicLong atomicLongResult = reduce(atomicLongList, new AtomicLongAdder());
        System.out.println(atomicLongResult);
    }
} 
