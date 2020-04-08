import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
 
public class ReverseString{
 
    public static void main(String[] args) throws IOException{

	FileInputStream in = null;

	FileOutputStream out = null;

	int t,cnt=0;
	int text[]= new int[10000];

	try {

	    in = new FileInputStream("input.txt");
	    out = new FileOutputStream("output.txt");
	    int b;
	    while ((b = in.read()) != -1){
	        text[cnt]=b;
		cnt++;
	    }
	    
	    for(int j = 0; j<cnt/2; j++){
	        t = text[j];
		text[j] = text[cnt - j - 1];
		text[cnt - j - 1] = t;
	    }

	    for(int j = 0; j<cnt; j++){
 
	          out.write(text[j]);
	    }

	    


	} finally {
	    if (in != null) {
		in.close();
	    }
	    
	    if (out != null) {

		out.close();

	    }
	}
    


	/*

	int i=0;
	byte t;
	String moji ="";


	try {
            // 1.ファイルのパスを指定する

	    
            File filei = new File("input.txt");
         
            // 2.ファイルが存在しない場合に例外が発生するので確認する
            if (!filei.exists()) {
                System.out.print("ファイルが存在しません");
                return;
            }
         
            // 3.FileReaderクラスとreadメソッドを使って1文字ずつ読み込み表示する
            FileReader fileReader = new FileReader(filei);
            
	    char data;

	    System.out.println("a");
	    
	    while ((data = (char)fileReader.read()) != -1) {
		
		moji = String.valueOf(data);
		i++;
	    }

	    System.out.println("a");
	    
	    
	    byte b1[]=moji.getBytes();
	    
	    for(int j = 0; j<i/2; j++){
	        t = b1[j];
		b1[j] = b1[i - j - 1];
		b1[i - j - 1] = t;
	    }
	    
	    try{	 
		FileOutputStream fileo = new FileOutputStream("output.txt");

		fileo.write(b1);

		fileo.close();
	    }
	    catch(IOException e){
		System.out.println(e);
	    }
         
            // 4.最後にファイルを閉じてリソースを開放する
            fileReader.close();
         
	} catch (IOException e) {
	    e.printStackTrace();
	}
    
	*/
    }
}
