package tppm;

import java.io.IOException;

public class main {

	public static void main(String[] args) 
	{
		Rede r;
		/* O arquivo que contem a configuracao das centrais, assinantes e linhas sera 
		   passado como parametro para o programa (args). */
		try 
		{
			r = new Rede(args[0]);
		} catch (IOException e) 
		{
			System.out.println("Arquivo de configuracao nao foi passado como parametro. Verifique isso!");
		} 
		
		
//		InputStream is = null;
//		BufferedReader br = null;
//		try {
//			is = new FileInputStream("config.txt");
//			InputStreamReader isr = new InputStreamReader(is);
//		    br = new BufferedReader(isr);		 
//		    String s = br.readLine(); // primeira linha		     
//		    while (s != null) {
//		      System.out.println(s);
//		      s = br.readLine();   		     
//		    }
//		} catch (FileNotFoundException e) {
//			System.out.println("Problema ao abrir arquivo de configuracao!");
//			//e.printStackTrace();
//		}
//	     
//		 try {
//			br.close();
//		} catch (IOException e) {
//			System.out.println("Falha ao fechar arquivo");
//		}
//	     
	}
}
