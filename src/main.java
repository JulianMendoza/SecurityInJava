import java.math.BigInteger;

public class main {
	public static BigInteger convertToBigInt(String str) {
		return new BigInteger(str);
	}

	public static void main(String[] args) {
		int p, q, n, totient, e;
		p = 17;
		q = 11;
		n = p * q;
		totient = (p - 1) * (q - 1);
		e = 7;
		BigInteger test = convertToBigInt(String.valueOf(e));
		System.out.println(test.modInverse(convertToBigInt(String.valueOf(totient))));
	}

}
