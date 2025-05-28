package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Assignment4_ArraysandCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<Integer> largestCities = new ArrayList<Integer>();
         
         largestCities.add(123);
         largestCities.add(345);
         largestCities.add(678);
         largestCities.add(910);
         largestCities.add(113);
         largestCities.add(123);
         
         System.out.println("Total Area:" + largestCities.get(3)+largestCities.get(4));
         
         
         Set<String> touristAttraction = new HashSet<String>();
         touristAttraction.add("tajMahal");
         touristAttraction.add("Back water kerla");
         touristAttraction.add("andaman nikobar");
         touristAttraction.add("hampta");
         touristAttraction.add("pink city");
         touristAttraction.add("balaji temple");
         touristAttraction.add("vaishnav devi temple");
         touristAttraction.add("himachal pradesh");
         touristAttraction.add("Goa");
         
         
         
         System.out.println(touristAttraction.size());
         System.out.println(touristAttraction);
         
         
         int [] numbers = {10,23,13,14,34,25,22,27,28,29};
         
         int avg = numbers[5] + numbers[6] / 2 ;
         
         System.out.println("Average:"+ avg);
         
         List<String> grossingMovies = new LinkedList <String>();
         
         grossingMovies.add("dangal");
         grossingMovies.add("Jawan");
         grossingMovies.add("pathan");
         grossingMovies.add("Bajrangi bhaijan");
         grossingMovies.add("secret superstar");
         
         System.out.println(grossingMovies.get(2));
	}

}
