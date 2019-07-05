//// Java Collections : lists ////

import java.lang.management.GarbageCollectorMXBean;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

//tring to learn deep into try and catch throwables and chatchables

    public static void main(String[] args){

        Set <Integer> hash_set = new HashSet<>();
        hash_set.addAll(Arrays.asList(new Integer[] {15,9,16,11}));
///
        Set <Integer> hash_set2 = new HashSet<>();
        hash_set2.addAll(Arrays.asList(new Integer[] {11,9,20,17}));
///
        System.out.println("pirveli seti "+hash_set);
        System.out.println("meore set "+hash_set2);

        Set <Integer> tree = new TreeSet<>(hash_set);

        System.out.println("pirveli  seti tree setshi gatarebis shemdeg  "+tree);

        Set<Integer> union = new HashSet<>(hash_set);
        union.addAll(hash_set2);

        System.out.println("hash_set is gaertianeba hash_set2 tan "+union);
        Set <Integer> treeUnion = new TreeSet<>(union);

        System.out.println("gaertianeba treeSetshi  "+treeUnion);

        Set <Integer> intersection = new TreeSet<>(hash_set);
        intersection.retainAll(hash_set2); // hashset is tanakveta hashset2 tan //
        System.out.println("hashset is tanakveta hashset2 tan  "+ intersection);

        Set <Integer> difference = new TreeSet<>(hash_set);
        difference.removeAll(hash_set2);
        System.out.println("hashset is sxvapba hashset2 tan "+ difference);

    }
}
