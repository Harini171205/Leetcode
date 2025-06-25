class Solution {
    public int countPrimes(int n) {
        if(n<3) return 0;
		int c = n/2; //All odds are prime candidates
	    boolean isPrime[] = new boolean[n+1];
	    Arrays.fill(isPrime,true);
	    for(int i = 3;i*i<n;i+=2){
	        if(isPrime[i]){
	            for(int j =i*i;j<n;j+=2*i){
                    if(isPrime[j]){
                        isPrime[j]=false;
                        c--;
                    }
                }
	        }
        }
	    return c;
	}     
}