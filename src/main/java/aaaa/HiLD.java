package aaaa;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javase.A;

public class HiLD {
public static void main(String[] args) throws NoSuchMethodException, SecurityException {
	System.out.println("你好，死胖子");
	System.out.println("SSH");
	System.out.println("ni ge bitch");

	System.out.println("请写一个工具类，实现‘去掉字符串中所有的空格’，不借助trim()方法");



	
	System.out.println("写一个文件读取类，用来读取properties文件（读出来在控制台即可）");
	
	System.out.println("反射调用A类的void play(String name)方法（方法体自定义）");
	A a = new A();
	Class s = a.getClass();
	Method m = s.getDeclaredMethod("play",String.class);
	A a1 = (A) s.newInstance();
	m.invoke(a1,"diao");
	
}

	public static void trimSpace(String s){
		 s ="sb s n ";
		 String[] split = s.split(" ");
		 String s1 = split[0]+split[1]+split[2];
		 System.out.println(s1);
	}

}

class ReadFile{
	public static void main(String[] args) throws IOException {
		FileReader fw = new FileReader("123.properties");
		int read =0;
		while((read=fw.read())!=-1){
			System.out.println((char)read);
		}
		System.out.println("我写不出来，又不想看流，感觉好多啊");
	}
	
}
class A{
	public void play(String name){
		System.out.println("王凡爱玩"+name);
	}
}


interface chi{}
