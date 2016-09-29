package interesting;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */

public class StaticInitializerBlocks {

	static{
		System.out.println("static block gets called first\n");
	 }
	
	{
		System.out.println("Initializer block called every time obejct is created");
	}
	
	public StaticInitializerBlocks(){
		System.out.println("Paramterless constructor called");
	}

	public StaticInitializerBlocks(int x){
		System.out.println("Paramterized constructor called : "+x);
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args){
		StaticInitializerBlocks j1 = new StaticInitializerBlocks();
		System.out.println();
		StaticInitializerBlocks j2 = new StaticInitializerBlocks(4);
	}
	
}
