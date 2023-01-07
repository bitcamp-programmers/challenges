package home.app.apps;

public class McAlba2_CP {
	public static int solution(int[] ingredient) {
	    int answer = 0;
	    String all = "";
	    
	    
	    for (int i = 0; i < ingredient.length; i++) {
	      int idx = ingredient[i];

	      if (idx == 1) {
	    	  if(all.length() > 2 && all.substring(all.length()-3).equals("123")) {
	    		  all = all.substring(0,all.length()-3);
	    		  answer++;
	    	  }else if(i+3 < ingredient.length && ingredient[i+1] == 2 && ingredient[i+2] == 3 && ingredient[i+3] == 1) {
	    		  i += 3;
	    		  answer++;
	    	  }else if(i+3 < ingredient.length && ingredient[i+1] == 2 && ingredient[i+2] == 3 && ingredient[i+3] != 1) {
	    		  i += 3;
	    		  all = "";
	    	  }else if(i+2 < ingredient.length && ingredient[i+1] == 2 && ingredient[i+2] == 2 ) {
	    		  i += 2;
	    		  all = "";
	    	  }else if(i+2 < ingredient.length && ingredient[i+1] == 2 && ingredient[i+2] == 1 ) {
	    		  i += 2;
	    		  all += "121";
	    	  }else if(i+1 < ingredient.length && ingredient[i+1] == 1) {
	    		  i += 1;
	    		  all += "11";
	    	  }else if(i+1 < ingredient.length && ingredient[i+1] == 3) {
	    		  i += 1;
	    		  all = "";
	    	  }
	      }else if(idx == 2) {
	    	  if(all.length() > 0 && all.substring(all.length()-1).equals("1")) {
	    		  all += "2";
	    	  }else {
	    		  all = "";
	    	  }
	      }else if(idx == 3) {
	    	  if(all.length() > 1 && all.substring(all.length()-1).equals("2")) {
	    		  all += "3";
	    	  }else {
	    		  all = "";
	    	  }
	      }
	      System.out.println(all);
	    }

	    return answer;
	  }
}
