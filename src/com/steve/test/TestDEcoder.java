package com.steve.test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class TestDEcoder {

	public static void main(String[] args) {
		String str = "%E4%B8%AD%E8%BD%AF%E8%9E%8D%E9%91%AB%E6%9C%9F";
		try {
			String decodeStr = URLDecoder.decode(str, "UTF-8");
			System.out.println(decodeStr);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
