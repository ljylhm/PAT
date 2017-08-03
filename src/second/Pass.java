package second;

import java.util.ArrayList;
import java.util.Scanner;

public class Pass {
	 // 提示输入
	public String[] getInput(){

		ArrayList<String> momArr = new ArrayList<String>();
		System.out.println("请输入需要检测的字符串个数");
		Scanner in = new Scanner(System.in);
		int getNum = in.nextInt();
		if(getNum>10){
			System.out.println("请输入10以内");
			in.close();
			return null;
		}
		for(int i=0;i<getNum;i++){
			System.out.println("请输入需要检测的字符串");
			String str = in.next();
			momArr.add(str);
		}
		in.close();
		String strArr[] = (String[])momArr.toArray(new String[momArr.size()]);
		return strArr;
	}

	// 判断方法
	private String[] getChoose(String[] args){
		int l = args.length;
		String strArr[] = new String[l];
		for(int i=0;i<l;i++){
			String strTest = args[i];
			strArr[i] = chooseSingle(strTest);
		}
		
		return strArr;
	}
	
	//判断是否全为A
	private int isAllA(String str){
		char strArr[] = str.toCharArray(); 
		for(int i=0,l=str.length();i<l;i++){
			if(strArr[i]!='A'){
				return 0;
			}
		}
		return str.length();
	}
	
	// 对单个字符串的判断
	public String chooseSingle(String str){
		System.out.println(str);
		int len = str.length();
		int isNumIndex = 0;
		int isNumSpace = 0;
		int isNumEnd = 0;
		String strArr[]= new String[]{"PAT","PTA","APT","ATP","TAP","TPA"}; 
		//长度为3的情况
			if(len==3){
				for(int i=0,l=strArr.length;i<l;i++){
					
					if(strArr[i]==str)
					    return "Yes"; 
				}
			
			}else if(len>3){
				// 先得到p的顺序,在得到T的顺序
				int indexP = str.indexOf("P");
				int indexT = str.indexOf("T");
				if(indexP!=-1&&indexT!=-1&&(isNumSpace=isAllA(str.substring(indexP+1, indexT)))!=0){
				   if(indexP==0){
					   if(isNumSpace+2==str.length()){
						   return "Yes";
					   }
					   return "No";	   
				   }else{
					   if((isNumIndex=isAllA(str.substring(0, indexP)))!=0&&(isNumEnd=isAllA(str.substring(indexT+1, str.length())))!=0){
						  if(isNumEnd==isNumIndex*isNumSpace){
							  return "Yes";
						  }else{
							  return "no";
						  }  
					   }
					   return "No";
				   }
				}	
		       return "No";
			}
		return "No";
	}
	

	public String[] main(){
		/*String str[] = getChoose(getInput());*/
		/*for(int i=0,l=getChoose(getInput()).length;i<l;i++){
			System.out.println(getChoose(getInput())[i]);
		}*/
		
		return getChoose(getInput()); 
	/*	return str;*/
	}
	
	
}
