//classe READER

package tppm;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Config 
{
	private int nLinhas;
	private int nCentrais;
	private Central [] c;
	public Config(String arq) throws IOException 
	{
		configura(arq);
	}
	private void configura(String arq) throws IOException 
	{
		InputStream is = null;
		BufferedReader br = null;
		String s = null;
		try 
		{
			is = new FileInputStream(arq);
			InputStreamReader isr = new InputStreamReader(is);
		    br = new BufferedReader(isr);		 
		    s = br.readLine(); // primeira linha
		    this.nCentrais = Integer.parseInt(s);
		    this.c = new Central[this.nCentrais];
		    int i = 0;
		    while (i < this.nCentrais) 
		    {
		    	s = br.readLine();
		    	String[] t = s.split("\t", 1);
		    	String st = t[0];
		    	int nAssinantes = Integer.parseInt(t[1]);
		    	this.c[i] = new Central(st);
		    	int j=0;
		    	while (j < nAssinantes) 
		    	{
		    		s = br.readLine();
		    		this.c[i].addAssinante(s);
		    		j++;
		    	}
		    	i++;
		    }
		    s = br.readLine();
		    this.nLinhas = Integer.parseInt(s);
		    int k = 0;
		    while (k < this.nLinhas)
		    {
		    	s = br.readLine();
		    	String[] t = s.split("\t");
		    	this.c[0].addLinha(t[0], t[1]);
		    	k++;
		    }
		} catch (FileNotFoundException e) 
		{
			System.out.println("Problema ao abrir arquivo de configuracao!");
			//e.printStackTrace();
		}
	     
		 try 
		 {
			br.close();
		} catch (IOException e) 
		 {
			System.out.println("Falha ao fechar arquivo");
		}   			
	}
	
	public Central[] getCentrais()
	{
		return this.c;
	}
}
