package generics.generic_methods.a_Set_utility;

import java.util.*;

public class WaterColorSets {
    public static void main(String[] args) {
        Set<WaterColors> set1 = EnumSet.range(WaterColors.MEDIUM_YELLOW, WaterColors.PHTHALO_BLUE);
        System.out.println("set1 : "+set1);

        System.out.println();
        Set<WaterColors> set2 = EnumSet.range(WaterColors.CRIMSON, WaterColors.BURNT_SIENNA);
        System.out.println("set2 : "+set2);

        System.out.println();
        System.out.println("union (set1 , set2) : "+ Sets.union(set1, set2));

        System.out.println();
        Set<WaterColors> subSet = Sets.intersection(set1, set2);
        System.out.println("intersection (set1, set2) : "+subSet);

        System.out.println();
        System.out.println("difference(set1, subSet) : "+Sets.difference(set1, subSet));

        System.out.println();
        System.out.println("difference(set2, subSet) : "+Sets.difference(set2, subSet));

        System.out.println();
        System.out.println("complement(set1, set2) : "+Sets.complement(set1, set2));

    }
}
   