package lab1;
import java.util.*;

public class calc {

	static String str;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			str = s.nextLine();
			String reg1 = ".*simplify.*";//ÃüÁî1ÔËËã
			String reg2 = ".*d/d.*";//ÃüÁî2Çóµ¼
			String reg3 = ".*end.*";
			while(! str.matches(reg3))
			{
				if(str != null && str.length() > 0){
					if( "!".equals(str.substring(0,1))){
						if (str.matches(reg1)){
							System.out.println("wrong");
						}
						else if(str.matches(reg2)){
							System.out.println("command");
						}
						else{
							System.out.println("wrong command");
						}
					}
					else{
						System.out.println(str);
					}
				}
				str = s.nextLine();
			}
	}
	private int  expression(int p){
		int tt = 0;
		if (p == 0){
			String reg = "[a-zA-Z0-9+*]+";
			String reg4 = "[a-zA-Z][0-9]+";
			String reg5 = "[0-9]+[a-zA-Z]";
			String reg6 = "[a-zA-Z]{2,}";
			if(str.matches(reg) && ! str.matches(reg4) && !str.matches(reg5) && !str.matches(reg6))
			{
				
			}
			else{
				System.out.println("wrong expression");
			}
		}
	}

}
