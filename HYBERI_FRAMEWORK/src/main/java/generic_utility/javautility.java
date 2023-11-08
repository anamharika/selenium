package generic_utility;

import java.util.Random;

import net.bytebuddy.asm.Advice.Return;

public class javautility {
	public int getrandomnumber() {
	
	Random ran=new Random();
	int r = ran.nextInt(1000);
	return r;
}
}
