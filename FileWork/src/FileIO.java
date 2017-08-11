
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileIO {
	final String FILENAME = "C:\\Users\\Administrator\\workspace\\FileWork\\src\\filename.txt";
	ArrayList<Person> list2 = new ArrayList<>();
	
	
	
	public void readFile() {
		BufferedReader br = null;
		FileReader fr = null;

		try {

			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
			//	System.out.println(sCurrentLine);
				String[] pieces= sCurrentLine.split(",");
				
				Person p = new Person(pieces[0],Integer.parseInt(pieces[1]),pieces[2]);
				list2.add(p);
			
			}
			
		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
		for(int i=0; i<list2.size(); i++){
			
			System.out.println(list2.get(i).toString());
		
		}
			
	}

	public void writeFile(ArrayList<Person> peopleList) {

		BufferedWriter bw = null;
		FileWriter fw = null;

		String stringStream = null;
		for (int i = 0; i < peopleList.size(); i++) {
			stringStream = peopleList.get(i).toString();
		//	System.out.println(stringStream);

			try {

				fw = new FileWriter(FILENAME, true);
				bw = new BufferedWriter(fw);
				bw.write(stringStream);
				bw.newLine();

				System.out.println("Done");

			} catch (IOException e) {

				e.printStackTrace();

			} finally {

				try {

					if (bw != null)
						bw.close();

					if (fw != null)
						fw.close();

				} catch (IOException ex) {

					ex.printStackTrace();

				}

			}

		}
	}
}
