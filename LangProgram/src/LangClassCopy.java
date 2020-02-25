import java.util.Scanner;
import static java.lang.System.in;

import static java.lang.System.out;
public class LangClassCopy {
public static void main(String args[]) {
	Scanner Keyboard=new Scanner(in);
	int hankees,socks;
	out.print("hankees & socks score?");
hankees=Keyboard.nextInt();
socks=Keyboard.nextInt();
out.println();
if(hankees>socks) {
	out.print("hankees:");
	out.println(hankees);
	out.print("socks:");
	out.println(socks);
			
}else {
	out.print("socks:");
	out.println(socks);
	out.print("hankees:");
	out.println(hankees);
}
Keyboard.close();

	
}


}
