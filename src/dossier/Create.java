package dossier;

import java.io.File;

public class Create {
	public Create(String name) {
		String dossier ="D:\\"+name;
		File f = new File(dossier);
		try{
		    if(f.mkdir()) { 
		        System.out.println("Directory Created");
		    } else {
		        System.out.println("Directory is not created");
		    }
		} catch(Exception e){
		    e.printStackTrace();
		} 

}

}