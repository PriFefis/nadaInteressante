package tppm;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//teste
		//sempre sincronizar!!!!!
		System.out.println("boa sorte!!");
	public static void main(String[] args) throws IOException {
		InputStream is = null;
		BufferedReader br = null;
		try {
			is = new FileInputStream("config.txt");
			InputStreamReader isr = new InputStreamReader(is);
		    br = new BufferedReader(isr);		 
		    String s = br.readLine(); // primeira linha		     
		    while (s != null) {
		      System.out.println(s);
		      s = br.readLine();   		     
		    }
		} catch (FileNotFoundException e) {
			System.out.println("Problema ao abrir arquivo de configuracao!");
			//e.printStackTrace();
		}
	     
		 try {
			br.close();
		} catch (IOException e) {
			System.out.println("Falha ao fechar arquivo");
		}
	     
	}

}
