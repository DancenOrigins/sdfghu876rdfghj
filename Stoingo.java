package packstuff;

public class Stoingo {
public static void main(String[] args) {
		
		
		int[]DS={6,18,21,1,72,13};
		int odd = 0;
		int even = 0;
		for(int i = 0;i<6;i++){
			if(DS[i]%2==1){
				odd = odd+1;
			}else{
				even = even+1;
			}
			
		}
		System.out.println("there are " + even + " even numbers and " + odd + " odd numbers");
	}

}
