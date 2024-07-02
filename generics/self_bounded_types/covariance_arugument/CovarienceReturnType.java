package generics.self_bounded_types.covariance_arugument;

/**
 * CovarienceReturnType
 */
class Base{}
class Drived extends Base{}

interface OrdinaryGetter {
 Base get();
}

interface DrivedGetter extends OrdinaryGetter{
    Drived get();
}

public class CovarienceReturnType {
    void test(DrivedGetter d){
        Drived d2 = d.get();
    }
}