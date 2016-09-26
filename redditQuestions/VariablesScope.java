package redditQuestions;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class VariablesScope {

	public static void main(String[] args) {
		{
			{
				int x =10;
			}
		}
	}
	
	protected void testMe(){
		System.out.println();
	}

}
