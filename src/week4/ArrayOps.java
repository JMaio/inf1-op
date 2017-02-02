package week4;

public class ArrayOps {
	
	public static void main(String[] args) {
		
		double[] arr1 = {0.3,3.5,2.4,8.3,1.9,7.2};
		double[] arr2 = { 2.2, 6.6, 8.8, 4.4 };
		
		printArr(arr1);
		printArr(arr2);
		
		
		printArr(normalise(arr1));
		printArr(normalise(arr2));
		
	}
	
	public static void printArr(double[] arr) {
		for (double d : arr) {
			System.out.print(d + " ");
		}
		System.out.println();
	}

    public static double findMax(double[] data) {
        double m = data[0];
    	for (double d : data) {
        	if (d > m) {
        		m = d;
        	}
        }
    	return m;
    }

    public static double[] normalise(double data[]) {
    	double[] newA = new double[data.length];
        double s = 0;
        for (int i = 0; i < newA.length; i++) {
    		newA[i] = data[i];
    	}
        for (double d : newA) {
        	s += d;
        }
        for (int i = 0; i < newA.length; i++) {
        	newA[i] /= s;
        }
        return newA;
    }

    public static void normaliseInPlace(double data[]) {
    	double s = 0;
        for (double d : data) {
        	s += d;
        }
        for (int i = 0; i < data.length; i++) {
        	data[i] /= s;
        }
    }

    public static double[] reverse(double[] data) {
    	double[] newA = new double[data.length];
    	int l = newA.length - 1;
    	for (int i = 0; i < newA.length; i++) {
    		newA[i] = data[l - i];
    	}
    	return newA;
    }

    public static void reverseInPlace(double[] data) {
    	double[] copy = new double[data.length];
    	int l = copy.length - 1;
    	for (int i = 0; i < copy.length; i++) {
    		copy[i] = data[l - i];
    	}
    	for (int i = 0; i < copy.length; i++) {
    		data[i] = copy[i];
    	}
    }

    public static void swap(double[] data1, double[] data2) {
        double[] copy1 = new double[data1.length];
        double[] copy2 = new double[data2.length];
    	for (int i = 0; i < data1.length; i++) {
    		copy1[i] = data1[i];
    		copy2[i] = data2[i];
        }
    	for (int i = 0; i < data1.length; i++) {
    		data1[i] = copy2[i];
    		data2[i] = copy1[i];
        }
    }

}