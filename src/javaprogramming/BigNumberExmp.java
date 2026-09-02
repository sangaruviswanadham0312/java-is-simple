package javaprogramming;
import java.math.BigInteger;
import java.math.BigDecimal;

public class BigNumberExmp {

	public static void main(String[] args) {
		BigInteger b1=new BigInteger("999999999999999999109");
		BigInteger b2=new BigInteger("8888888888888888880911");
		// BigInteger BigIntegerResult=b1.add(b2);
		BigDecimal b3=new BigDecimal("12345699999999999.7000000000");
		BigDecimal b4=new BigDecimal("67849099999999999.34");
 		// BigDecimal BigDecimalResult=b3.add(b4);
		//System.out.println("BigInteger Result:"+BigIntegerResult);
		//System.out.println("BigDecimal Result:"+BigDecimalResult);
		
		System.out.println(b1.add(b2));
		System.out.println(b3.add(b4));

	}

}
