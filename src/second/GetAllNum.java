package second;

public class GetAllNum {
	
     //先将数字转换为字符串	
	private String changeNum(char a){
		String str;
		switch (Integer.parseInt(String.valueOf(a))) {
		case 1:
			str = "yi";
			break;
		case 2:
			str = "er";
			break;
		case 3:
			str = "san";
			break;
		case 4:
			str = "si";
			break;
		case 5:
			str = "wu";
			break;
		case 6:
			str = "liu";
			break;
		case 7:
			str = "qi";
			break;
		case 8:
			str = "ba";
			break;
		case 9:
			str = "jiu";
		default:
			str = "ling";
			break;
		}
		
		return str;
	}
	
	// 因为数值太大，所以将数字转换成字符串样式
	private int countStr(String str){
		int num = 0;
		if(str.length()>0){
			char arrChar[] = str.toCharArray();
			for(int i=0,l=arrChar.length;i<l;i++){
			   num = num+Integer.parseInt(String.valueOf(arrChar[i]));
			}
		}
		return num;
	}
	
	//合并两个方法
	public String CountAll(String str){
		String finStr = "";
		int num = countStr(str);
		str = String.valueOf(num);
		System.out.println(str);
		for(int i=0,l=str.length();i<l;i++){
			if(i==l-1){
		        finStr = finStr+changeNum(str.charAt(i));
			       }else{
			    finStr = finStr+changeNum(str.charAt(i))+" ";  
			    }
			
		}
		return finStr;	
	}
	
	
	
}
