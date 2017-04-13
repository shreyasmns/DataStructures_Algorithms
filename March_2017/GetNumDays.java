package arrays;

/**
 * @author ${Shreyas Mahanthappa Nagaraj}
 * 
 */
public class GetNumDays {

	public static void main(String[] args) throws Exception {
		
		String date = "2011-04-16";
		String[] indate = date.split("-");
		
		int year = Integer.valueOf(indate[0]);
		int month = Integer.valueOf(indate[1]);
		int days = Integer.valueOf(indate[2]);
		
		if(month < 1 || month > 12 || days < 1 || days > 31){
			System.out.println("Wrong Input");
			throw new Exception();
		}
		
		int daysinMonth = getDaysinMonth(month);
		int result = daysinMonth + days;
		
		System.out.println("Total number of days : "+result);
		
	}

	/**
	 * @param month
	 * @return
	 */
	private static int getDaysinMonth(int month) {
		int[] monthdays = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};
		int days = 0;
		for(int i=0; i< month-1; i++){
		  days = days+ monthdays[month-1];
		}
		//System.out.println("total days : "+days);
		return days;
	}

}
