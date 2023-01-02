import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
public class minoptomakezero{
	static int gcd(int p, int q)
	{
		if (q == 0) {
			return p;
		}
		int r = p % q;
		return gcd(q, r);
	}

	// method to find maximum collinear point
	static int maxPointOnSameLine(int[][] points, int N)
	{
		if (N < 2)
			return N;
		int maxPoint = 0;
		int curMax, overlapPoints, verticalPoints;

		HashMap<String, Integer> slopeMap = new HashMap<>();
		// looping for each point
		for (int i = 0; i < N; i++) {
			curMax = verticalPoints = 0;

			// looping from i + 1 to ignore same pair again
			for (int j = i + 1; j < N; j++) {
				// If both point are equal then just
				// increase overlapPoint count
				// If x co-ordinate is same, then both
				// point are vertical to each other
				if (points[i][0] == points[j][0])
					verticalPoints++;

				else {
					int yDif = points[j][1] - points[i][1];
					int xDif = points[j][0] - points[i][0];
					int g = gcd(xDif, yDif);

					// reducing the difference by their gcd
					yDif /= g;
					xDif /= g;

					// Convert the pair into a string to use
					// as dictionary key
					String pair = (yDif) + " " + (xDif);
					if (!slopeMap.containsKey(pair))
						slopeMap.put(pair, 0);

					// increasing the frequency of current
					// slope in map
					slopeMap.put(pair,
								slopeMap.get(pair) + 1);
					curMax = Math.max(curMax,
									slopeMap.get(pair));
				}

				curMax = Math.max(curMax, verticalPoints);
			}

			// updating global maximum by current point's
			// maximum
			maxPoint = Math.max(maxPoint,
								curMax + 1);
			slopeMap.clear();
		}

		return maxPoint;
	}

	public static void main(String[] args)
	{
		int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        System.out.println(maxPointOnSameLine(arr,n));
    }
}