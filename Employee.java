public class Employee {
		private String name;
		private String  joingyear;
		private String salary;
		private String address;
		
		public Employee(String name, String joingyear, String salary, String address) {
			this.name = name;
			this. joingyear = joingyear ;
			this.salary = salary;
			this.address = address;
		}
		
		
		public String toString() {
			return name + "\t\t\t" +  joingyear + "\t\t\t  " + salary + "\t\t" + address;
		}



		public static void main(String[] args) {
			Employee e = new Employee("Robert", "1994" , "64C", " WallsStreat");
			Employee e1 = new Employee("Sam ", "2000 ", "68D", " WallsStreat");
			Employee e2 = new Employee("John", "2000 ", "26B", " WallsStreat");
			
			
			
			
		
			System.out.println(e.toString());
			System.out.println(e1.toString());
			System.out.println(e2.toString());
		}
		
		

	}