package second;

public class Three {
    int time;
    //运用递归的方法
	public int getTimes(int number,int times){
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
     //运用while的方法
	public int getTimesByWhile(int number){
		int times = 0;
		boolean isOne = number>1?true:false;
		while(isOne){
		 if(number%2==0){
			times = times+1;
			number = number/2;
			isOne = number==1?false:true;
		 }else{
			 times = times+1;
			 number=(number*3+1)/2;
			 isOne = true;
		 } 
		 
		}
		return times;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Three three = new Three();
	    int times = three.getTimesByWhile(3);
	   /* int times = three.getTimes(3,0);*/
	    System.out.println(times);
        
	}


}
