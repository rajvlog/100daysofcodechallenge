/* Merge Intervals
Given an array of intervals where intervals[i] = [starti, endi], 
merge all overlapping intervals, and return an array of the non-overlapping intervals
 that cover all the intervals in the input.

 

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping. */
 
public int[][] merge(int[][] intervals)
{
   Arrays.sort(intervals, (a, b) ->
   {
      if (a[1] == b[1])
      {
         return a[0] - b[0];
      }

      return a[1] - b[1];
   });

   LinkedList<int[]> list = new LinkedList<>();
   for (int[] interval : intervals)
   {
      if (!list.isEmpty() && list.getLast()[1] >= interval[0])
      {

         while (!list.isEmpty() && list.getLast()[1] >= interval[0])
         {
            interval[0] = Math.min(list.getLast()[0], interval[0]);
            interval[1] = Math.max(list.getLast()[1], interval[1]);
            list.removeLast();
         }
      }

      list.addLast(interval);
   }

   int pos = 0;
   int[][] answer = new int[list.size()][];
   for (int[] inteval : list)
   {
      answer[pos++] = inteval;
   }

   return answer;
}
