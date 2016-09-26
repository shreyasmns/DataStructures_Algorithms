package google;

import java.io.File;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class CreateDirectory {

	public static void main(String[] args) {
		
		File dir = new File("directory");
		if(!dir.exists()){
			
			try{
				dir.mkdir();
			} catch(SecurityException e){
				System.out.println("Security exception occured");
			}
		}
	}

}
