package com.rensenergy;

public class HexadecimalToBinary {/*

	public void hexStringToByte(String hex) {
		int len = (hex.length() / 2);
		byte[] result = new byte[len];
		char[] achar = hex.toCharArray();
		for (int i = 0; i < len; i++) {
			int pos = i * 2;
			result[i] = (byte) (toByte(achar[pos]) << 4 | toByte(achar[pos + 1]));
		}
		System.out.println(result);
	}

	private static byte toByte(char c) {
		byte b = (byte) "0123456789abcdef".indexOf(c);
		return b;
	}
	public static void main(String[] args) {
		HexadecimalToBinary hex = new HexadecimalToBinary();
		hex.hexStringToByte("000F");
	}
*/
    public static void main(String[] args) {
//        int octalB = 012;
//        int hexB = 0x0000900A;
//        String a = Integer.toBinaryString(hexB);
//        System.out.println(octalB);
//        System.out.println(hexB);
//        System.out.println(Integer.toBinaryString(hexB));
//        System.out.println(a);
        System.out.println(Integer.parseInt("719", 16));
    }
}
