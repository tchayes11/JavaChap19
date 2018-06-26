package hayes_19;//Exercise 1

public class MediaDisplay {         //Executable class

	public static void main(String[] args) {
		GenericStack <Printed> stack = new GenericStack<>();
		
		stack.push (new Book ("The Stand", "Science Fiction" ));
		stack.push(new Blog ("Flu Season", "","World Health Organazation"));
		stack.push(new TextBook("Germ Warfare","Eductional","Health"));
		
		//stack.push (new Printed("All subjects")); Cannot be used because it is in abstract class can only add to subclasses.
		show(stack);   //Evoke the method
	}


	public static void show(GenericStack <? extends Printed> stack){ //Generic method show
		int size = stack.getSize();
		for(int i=0; i<size; i++){
			System.out.println(stack.pop());
			
		}
		
	}
}