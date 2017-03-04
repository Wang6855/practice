package aaaa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HiLD {
public static void main(String[] args) {
	System.out.println("你好，死胖子");
	System.out.println("SSH");
	System.out.println("ni ge bitch");
	trimSpace("");
	System.out.println("请写一个工具类，实现‘去掉字符串中所有的空格’，不借助trim()方法");



	
	System.out.println("写一个文件读取类，用来读取properties文件（读出来在控制台即可）");
	
	System.out.println("反射调用A类的void play(String name)方法（方法体自定义）");

	
}

	public static void trimSpace(String s){
		 String[] strs1 = s.split(" ");
		 StringBuilder sb = new StringBuilder();
         for (String str : strs1) {
        	 sb.append(str);
		}      
         s = sb.toString();
         String[] strs2 =s.split("　");
         sb.delete(0, sb.length());
         for (String str : strs2) {
        	 sb.append(str);
		}
         s = sb.toString();
         String[] strs3 =s.split("	");
         sb.delete(0, sb.length());
         for (String str : strs3) {
        	 sb.append(str);
		}
         
		 System.out.println(sb);
	}


	

}


interface chi{}
