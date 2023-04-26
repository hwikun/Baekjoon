class Solution {
    public int solution(int balls, int share) {
        return fact(balls, share);
    }
    public static int fact(int n, int m) {
		if (n == m || m == 0) return 1;
		return fact((n-1), (m-1)) + fact((n-1), m);
	}
}