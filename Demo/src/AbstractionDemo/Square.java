package AbstractionDemo;

public class Square {
	
	private String name;
	   private int numStudents;

	   public School(String name, int numStudents) {
	       this.name = name;
	       this.numStudents = numStudents;
	   }

	   public String getName() {
	       return this.name;
	   }

	   public int getNumStudents() {
	       return this.numStudents;
	   }
	}


	class University extends School {
	   private final String type = "University";
	   private boolean isPublic;
	private String name;
	private int numStudents;

	   public University(String name, int numStudents, boolean isPublic) {
	       this.name = name;
	       this.numStudents = numStudents;
	       this.isPublic = isPublic;
	   }

	   public boolean getIsPublic() {
	       return this.isPublic;
	   }
	}