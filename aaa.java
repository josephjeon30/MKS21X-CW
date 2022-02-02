public class aaa{
	public static void main(String[] args){
		System.out.println(stringToInt("4282"));
	}

	public static int stringToInt(String s){
      //return the value of Integer.parseInt(s) but do it yourself!
      //Do not use any built in parse methods.
      //put this in your classwork directory on your repo.
		int ans = 0;
		for (int i = 0; i < s.length(); i++){
			int temp = valueOfDigit(s.charAt(s.length() - 1 - i));
			if ((s.charAt(i) != '-') && (temp < 0 || temp > 9)){
				throw new IllegalArgumentException("Has illegal character");
			}
			ans += Math.pow(10, i) * temp;
		}
		return ans;
    }

    public static int valueOfDigit(char c){
    	return c - 48;
    }
}