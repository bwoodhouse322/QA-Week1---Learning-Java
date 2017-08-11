public class Prime1 {

    public static void main(String[] args){
       
    	Prime1 m = new Prime1();

        for(int j=1; j<3000000;j++) {
            if(m.isPrime(j)==true){
                System.out.println(j);
            }
        }
    }

    boolean  isPrime(int n) {
     
        if (n%2==0){ 
        	return false;
        }
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0){
                return false;
                }
        }
        return true;
    }

}
