package generics.issues;

import java.util.*;
import java.util.Set;

public class Byteset {
    Byte[] possible = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    Set<Byte> byteSet = new HashSet<Byte>(Arrays.asList(possible));
}
