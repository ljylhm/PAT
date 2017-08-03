package second;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Three three = new Three();
		GetAllNum getAllNum = new GetAllNum();
		Pass pass = new Pass();
		String str01[] = pass.main();
		for(int i=0;i<str01.length;i++){
			System.out.println(str01[i]);
		}
	
	}

}
