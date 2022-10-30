package REadCSVFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVFileBasics {

	public static void main(String[] args) throws IOException {

		//		FileReader
		//		BufferedReader
		String fpath = "C:\\brahma\\Practise\\SelniumPractiseNew\\Aug2022BatchWorkSpace\\MavenProjMrngCmd\\src\\test\\java\\REadCSVFiles\\TestDataOct16CSVFile.csv";
		File  f  = new File(fpath);
		FileReader fr = new FileReader(f);

		BufferedReader br = new BufferedReader(fr);

		//		String line1= br.readLine();
		//		System.out.println("line1= " + line1); // CustomerName,CusotmerDescription,CustId
		//		
		//		
		//		// read 2nd line 
		//		String line2=  br.readLine();
		//		System.out.println("line2 =" +line2); // SumaNAG,Sum Descr,10


		// read all,lines
		//		while(br.readLine()!=null)
		//		{    //  1st line              true
		//			//  3rd line		truye
		//			System.out.println(br.readLine());
		//			
		//		}

		//		SumaNAG,Sum Descr,10
		//		Sridhar,Sridhar Dscr,30

		// read all,lines
		String x;
		while((x=br.readLine())!=null)
		{    
//			System.out.println(x);
			String sarr [] = x.split(",");
			String cname =  sarr[0] ;
			String custDescr = sarr[1];
			String custId = sarr[2];
			System.out.println(cname + " " + custDescr + " "  + custId );
			

		}




	}

}
