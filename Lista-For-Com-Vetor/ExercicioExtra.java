/*Relogio com For*/
public class ExercicioExtra {

	public static void main(String[] args) {
		
		for (int h = 0; h < 24; h++) {
			for (int m = 0; m < 60; m++) {
				for (int s = 0; s < 60; s++) {
					if(h < 10){
						System.out.print("0");
					}
					System.out.print(h + ":");
					if(m < 10){
						System.out.print("0");
					}
					System.out.print(m + ":");
					if(s < 10){
						System.out.print("0");
					}
					System.out.println(s);
				}
			}
		}

	}

}
