import java.io.*;

class Nuke2{
	public static void main(String[] arg) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();	
		String ret = "";
		for (int i =0; i < str.length(); i++){
			if(i==1){
				continue;
			}
			ret += str.charAt(i);
			
		}	
		System.out.println(ret);
       
	}
}

//note
/*class小写
String的s大写
System的s大写
用到readLine()方法的时候需要写throw IOException
将字符串转为char一位一位输出，并连接为新的字符串，可以首先创建一个空的字符串，String ret = "";
ret += str.charAt(i),将str中的每一位依次输出
或者如果想去掉其中的某一位，可以ret = str.char(o)+str.subString(2); 输出str的第一位字符同时接入从第二位开始的subString
同时注意，continue是直接跳出其所在的本次for循环，直接进入下一次for循环*/
