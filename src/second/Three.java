package second;

import java.security.Timestamp;

public class Three {
    int time;
	public int getTimes(int number,int times){
		System.out.println(time);
		if(number>1){
			if(number%2==0){
		         number = number/2;
		         time = times+1;
		         if(number!=1){
		        	 getTimes(number,time);
		         }
			} else{
				 number = (number*3+1)/2;
			     time = time+1;
			     if(number!=1){
		        	 getTimes(number,time);
		         }
			}
			
		 }
		return time;
         
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Three three = new Three();
	    int times = three.getTimes(3,0);
	    System.out.println(times);
        
	}


}
