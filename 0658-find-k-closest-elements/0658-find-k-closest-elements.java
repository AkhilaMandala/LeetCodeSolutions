class Solution {
    //an array the k value and the x value are passes to the function
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<int[]> maxheap = new PriorityQueue<>((a, b) -> a[0] == b[0] ? b[1] - a[1] : b[0] - a[0]);
        for (int i = 0; i < arr.length; i++) {
            int diff = Math.abs(arr[i] - x);
            maxheap.add(new int[] { diff, arr[i] });
            if (maxheap.size() > k)
                maxheap.poll();
        }
        List<Integer> result = new ArrayList<>();
        while (!maxheap.isEmpty()) {
            result.add(maxheap.poll()[1]);
        }
        Collections.sort(result);
        return result; //returns the k elements which are closest to the element x
    }
}