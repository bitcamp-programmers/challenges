package home.app.apps;

public class McAlba {
	public static int solution(int[] ingredient) {
	    int answer = 0;
	    int count1 = 0;
	    int count2 = 0;
	    int count3 = 0;

	    for (int i = 0; i < ingredient.length; i++) {
	      int idx = ingredient[i];

	      if (idx == 1) {
	        count1++;
	      } else if (count1 > 0 && idx == 2) {
	    	  if(i+2 < ingredient.length && ingredient[i+1] == 3 && ingredient[i+2] == 1) {
	    		  
	    	  }
	      } else if (count2 > 0 && idx == 3)  {
	    	  
	      }
	    }

	    return answer;
	  }
}
