public class LongestConsecutivesubSequences{
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   int[] hashMap = new int[100000+1];
	   int count = 0, res = 1;
	   for(int i = 0; i < N;i++){
	       hashMap[arr[i]] = 1;
	   }
	   for(int i = 0;i<100000+1;i++){
	       if(hashMap[i] == 0){
	           count = 0;
	       }
	       else{
	           count++;
	           res = Math.max(count, res);
	       }
	   }
	   return res;
	}
}