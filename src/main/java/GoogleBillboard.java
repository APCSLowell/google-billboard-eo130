

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
		for(int i = 2; i<e.length()-10; i++){
    String reee = e.substring(i,10+i);
    double dNum = Double.parseDouble(reee);
    boolean cat = isPrime(dNum);
    if(cat == true){
    System.out.print(dNum);
    break;
    }
    }
	}
	

	//Finish this function
	public static boolean isPrime(double dNum){
		boolean wow = false;
      if(dNum<2)
  return wow;
  else
  for(int i=2; i<= Math.sqrt(dNum); i++){
  if(dNum % i == 0){
  return false;
  }
  else
  wow = true;
  }
  return wow;
	}

}

