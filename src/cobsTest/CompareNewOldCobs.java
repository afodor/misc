package cobsTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CompareNewOldCobs 
{
	/*
	 * Here is another comment
	 */
	public static void main(String[] args) throws Exception
	{
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File(  
				"d:\\oldNewCobsCompare\\2OG-FeII_Oxy_5_COBS_UNCORRECTED.txt")));
		
		writer.write("region1FromKyleCleanroom\tregion2FromKyleCleanroom\tscoreFromKyleCleanroom\tavDistFromKyleCleanroom\t");
		
		writer.write("region1Fromgithub\tregion2Fromgithub\tscoreFromgithub\tavDistFromgithub\n");
		
		
		BufferedReader reader1= new BufferedReader(new FileReader(
				new File("D:\\KyleCleanroom\\2OG-FeII_Oxy_5_COBS_UNCORRECTED.txt")));
		
		BufferedReader reader2 = new BufferedReader(new FileReader(
				new File("D:\\KyleResultsFromGIT_HUB\\2OG-FeII_Oxy_5_COBS_UNCORRECTED.txt")));

		reader1.readLine();  reader2.readLine();
		
		for(String s= reader1.readLine(); s != null; s= reader1.readLine())
		{
			String s2 = reader2.readLine();
			
			String[] splits1 = s.split("\t");
			String[] splits2 = s2.split("\t");
			
			writer.write(splits1[0] + "\t");
			writer.write(splits1[1] + "\t");
			writer.write(splits1[3] + "\t");
			writer.write(splits1[4] + "\t");
			

			writer.write(splits2[0] + "\t");
			writer.write(splits2[1] + "\t");
			writer.write(splits2[3] + "\t");
			writer.write(splits2[4] + "\n");
			
		}
		
		writer.flush();  writer.close();
		
		reader1.close();
		reader2.close();
	}
}
