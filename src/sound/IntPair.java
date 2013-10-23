package sound;

public class IntPair {
	final int numerator;
    final int denominator;
    final double value;
    
    public IntPair(int num, int denom){
    	this.denominator = denom;
    	this.numerator = num;
    	this.value = new Double(num).doubleValue()/new Double(denom).doubleValue();
    	
    }

}
