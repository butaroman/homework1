import static org.junit.Assert.*;

import tasks.Task207;
import tasks.Task593;


public class Task207Test {
	Task207 task = new Task207();
	@org.junit.Test
	public void testForFormatter() {
		int output  = task.formatter(59015509);
		assertEquals (919, output);
		
	}
	
	@org.junit.Test
	public void testForGetTaskNumber(){
		String output  = task.getTaskNumber();
		assertEquals ("207", output);
	}
	
	@org.junit.Test
	public void testForGetTaskCondition(){		
		String output  = task.getTaskCondition();
		assertEquals ("Given a natural number n. Throw from the record number n "
				+ "digits 0 and 5, leaving the rest of the same order of digits. "
				+ "For example, from number 59015509 should have 919.", output);
	}
	@org.junit.Test
	public void testForSolution() throws Exception{
		String output = task.solution();
		assertEquals("919", output);
		
	}
	

}
