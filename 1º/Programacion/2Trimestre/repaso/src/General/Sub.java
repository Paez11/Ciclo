package General;

public class Sub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lon=5;
		int []Array = new int [lon];
		RellenaArray(Array);
		SubArray(Array,1,3);
		
	}
	public static void RellenaArray(int []Array) {
		for (int i=0;i<Array.length;i++) {
			Array[0]=1;
			Array[1]=2;
			Array[2]=3;
			Array[3]=4;
			Array[4]=5;
		}
	}
	
	public static void SubArray(int []Array, int p1, int p2) {
	    for(int i = 0; i <Array.length; i++){
	    	
	        if(Array[i]==p1 && Array[i]==p2){
	            for(int j=i;j<Array.length; j++)
	                Array[j]=Array[j+1];
	            break;
	        }
	    }
	    for (int i=0;i<Array.length;i++) {
	    	System.out.println(Array[i]);
	    }
	}
}
