package com.jxper.encoding;

import java.net.URLDecoder;

public class URLEncoding {

	public static void main(String[] args) {
		
		String encodingBeforeStr = "";
		String decodingBeforeStr = "%ED%95%B4%ED%94%BC%EB%B0%94%EB%91%91";
		
		String encodingAfterStr = "";
		String decodingAfterStr = URLDecoder.decode(decodingBeforeStr);
		
		System.out.println("encoding : " + encodingAfterStr);
		System.out.println("decoding : " + decodingAfterStr);

	}

}
