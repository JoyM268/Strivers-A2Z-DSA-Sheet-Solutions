/*
    Print Maximum Subarray Sum
    Ninjas has been given an array. He wants to find a subarray such that the sum of all elements in the subarray is maximum.
    Subarray 'A' is greater than sub-array 'B' if sum(A) > sum(B). If two sub-array have the same maximum sum, then output the subarray that has a larger length.
    A subarray means a contiguous part of an array. For example, In 'arr' = [1, 2, 3, 4], [1, 2], [2, 3, 4] are the contiguous subarry but [1, 3, 4] is not a subarray.
    The Subarray elements should be returned in a ArrayList.
    Note: More than one sub-array can have a maximum sum, in that case, output any.

    Link: https://www.naukri.com/code360/problems/maximum-subarray_893296?leftPanelTabValue=PROBLEM

    Time Complexity: O(n)
    Space Complexity: O(n)
*/

class Solution {
	public static ArrayList<Integer> maximumsumSubarray(int n, int arr[]) {
		ArrayList<Integer> ans = new ArrayList<>();
		int maxSum = Integer.MIN_VALUE, currSum = 0, start = 0, maxStart = 0, maxEnd = 0;

		for (int i = 0; i < n; i++) {
			currSum += arr[i];

			if (currSum > maxSum) {
				maxSum = currSum;
				maxStart = start;
				maxEnd = i;
			}

			if (currSum < 0) {
				currSum = 0;
				start = i + 1;
			}
		}

		for (int i = maxStart; i <= maxEnd; i++) {
			ans.add(arr[i]);
		}

		return ans;
	}
}