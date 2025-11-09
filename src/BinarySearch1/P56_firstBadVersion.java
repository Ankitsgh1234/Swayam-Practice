package BinarySearch1;

// Simulated VersionControl class (like in LeetCode)
class VersionControl {
    private int bad;

    // Constructor to set the first bad version
    public VersionControl(int bad) {
        this.bad = bad;
    }

    // Mock API (simulates LeetCode's API)
    public boolean isBadVersion(int version) {
        return version >= bad;
    }
}

public class P56_firstBadVersion extends VersionControl {

    // Constructor
    public P56_firstBadVersion(int bad) {
        super(bad);
    }

    public int firstBadVersion(int n) {
        int l = 1;        // versions start from 1, not 0
        int r = n;
        int ans = n;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (isBadVersion(mid)) {
                ans = mid;   // found a bad version, try earlier
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 10;      // total versions
        int bad = 4;     // first bad version

        // Create object and run test
        P56_firstBadVersion obj = new P56_firstBadVersion(bad);
        int result = obj.firstBadVersion(n);

        System.out.println("First bad version: " + result);
    }
}
