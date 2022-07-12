import java.util.List;
import java.util.ArrayList;

class Pair<F,S> {
   private F first;
   private S second;
   Pair(F first, S second) {
      this.first = first;
      this.second = second;
   }
   F getFirst() {
      return first;
   }
   S getSecond() {
      return second;
   }
}



public class Log2 {
    public static void main(String[] args) {
        Version initial = new Version();
        Pair<Version,List<Version>> result = seqChange(5, initial);
        System.out.println(result.getSecond());
    }
    public static Pair<Version, List<Version>> seqChange(int n, Version actual) {
        Version finalVersion = new Version(actual.getVersionNumber());
        List<Version> log = new ArrayList<Version>();
        for (int i = 0; i < n; i++) {
            System.out.println("Current version: " +
                               finalVersion);
            log.add(finalVersion);
            finalVersion = finalVersion.incrVersionNumber();
            System.out.println("New version: " +
                               finalVersion);
        }
        return new Pair<Version,List<Version>>(finalVersion, log);
    }
}
