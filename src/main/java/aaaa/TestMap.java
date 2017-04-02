package aaaa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) throws IOException {
		Map<Object, Object> map = new HashMap<>();
		map.put(null, "a");
		map.put(null, "b");
		map.put(null, "gtgg");
//		System.out.println(map.get(null));
		
		String str = "丹";
		List list =new ArrayList<>();
		System.out.println("GBK:	"+str.getBytes("GBK").length);
		System.out.println("utf-8:	"+str.getBytes("UTF-8").length);
		
	}
}

//class ByteSelect {
//	public ByteSelect() {
//	};
//	public void splitIt(String str) throws IOException {
//		byte[] bytes = str.getBytes("utf-8");
//		System.out.println();
//		StringBuilder sb =new StringBuilder();
//			for (int i = 0; i < bytes.length-2 ;i += 3) {
//				BufferedOutputStream bos = new BufferedOutputStream(new ByteArrayOutputStream(bytes[i]+bytes[i+1]+bytes[i+2]));
////			System.out.println(sb.append(bytes[i] ).append(bytes[i+1] ).append(bytes[i+2] ));
//		System.out.println(bos);
//		bos.close();
//			}
//	}
//}
