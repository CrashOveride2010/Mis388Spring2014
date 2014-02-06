
public class Problem7 {

public static void main(String[] args) {
		
		int totalSeconds = 50391;
		int hours = totalSeconds / 3600;
		int minutes = (totalSeconds % 3600)/60;
		int seconds = totalSeconds % 60;
		
		System.out.println(hours + "hours" + minutes + "minutes" + seconds + "seconds");
		

	}

}
