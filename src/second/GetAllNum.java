package second;

public class GetAllNum {
	
     //�Ƚ�����ת��Ϊ�ַ���	
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
	
	// ��Ϊ��ֵ̫�����Խ�����ת�����ַ�����ʽ
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
	
	//�ϲ���������
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
