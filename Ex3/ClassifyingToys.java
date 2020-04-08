
public class ClassifyingToys {
    public static void main(String [] args){

	double[] x={0.03, 3.0, 0.3, 2, 5, 0.5, 19.0, 0.9, 10, 3, 4};
	double[] y={0.04, 4.0, 0.4, 3, 12, 1.2, 19.0, 4.0, 14, 5, 0.5};
	double[] z={0.05, 5.0, 0.5, 4, 13, 1.3, 19.0, 4.1, 12, 24, 0.42};

	double longest;

	int i;
	// e = 0.000001;
	//float sum = (x[0] + y[0] + z[0]);
	//   if  ( 0.12 <  x[0] + y[0] + z[0] < 0.12 + e);
		

	//System.out.println((float)x[0] + y[0] + z[0]);

       	for(i=0; i<11 ; i++){
	    
	    x[i] = x[i] * 10 * 10;
	    y[i] = y[i] * 10 * 10;
	    z[i] = z[i] * 10 * 10;
		
	    longest = z[i];
	    
	    if (longest < x[i]) {
		z[i] = longest;
		longest = x[i];
		x[i] = z[i];
	    }
	    if (longest < y[i]) {
		z[i] = longest;
		longest = y[i];
		y[i] = z[i];
	    }

	    if( x[i] * x[i] + y[i] * y[i] == longest * longest ) {
		System.out.println(x[i]/100 + " " + y[i]/100 + " " + z[i]/100 + " right-angled");
	    }
	    else if( x[i] * x[i] + y[i] * y[i] > longest * longest) {
		System.out.println(x[i]/100 + " " + y[i]/100 + " " + z[i]/100 + " acute-angled");
	    }
	    else{
		System.out.println(x[i]/100 + " " + y[i]/100 + " " + z[i]/100 + " obtuse-angled");
	    }	
	
	}
        
    }
}

