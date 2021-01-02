class MinSizeSubArraySum {
  public static int findMinSubArray(int S, int[] arr) {
    // TODO: Write your code here
    int count = 999;
    int start = 0;
    int sum = 0;

    for(int end=0; end< arr.length; end++){
      sum += arr[end];
      while(sum >= S){
        count = Math.min((end+1-start), count);
        sum -= arr[start];
        start++;
        
      }
    }

    return (count == 999) ? 0 : count;
  }
}
