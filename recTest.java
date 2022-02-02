public class recTest{
	public static int fact(int k){
		if (k > 1){
			return k * fact(k - 1);
		}
		return 1;
	}

	public static boolean isEven(int x){
		if (x < 0){
			return isEven(-x);
		}
		if (x > 1){
			return isEven(x - 2);
		}
		if (x == 0){
			return true;
		}
		return false;
	}

	public static int fibonacci(int n) {
  		if (n > 1){
    		return fibonacci(n - 1) + fibonacci (n - 2); 
  		}
  		return n;
	}

	public static String toWord(long n){
		if (n >= 1000000000000000L){
			return toWord(n / 1000000000000000L) + " quadrillion " + toWord(n % 1000000000000000L);
		}
		if (n >= 1000000000000L){
			return toWord(n / 1000000000000L) + " trillion " + toWord(n % 1000000000000L);
		}
		if (n >= 1000000000){
			return toWord(n / 1000000000) + " billion " + toWord(n % 1000000000);
		}
		if (n >= 1000000 && n < 1000000000){
			return toWord(n / 1000000) + " million " + toWord(n % 1000000);
		}
		if (n >= 1000 && n < 1000000){
			return toWord(n / 1000) + " thousand " + toWord(n % 1000);
		}
		if (n >= 100 && n < 1000){
			return toWord(n / 100) + " hundred " + toWord(n % 100);
		}
		if (n >= 20 && n < 100){
			if (n > 90){
				return "ninety-" + toWord(n % 90);
			}
			if (n > 80){
				return "eighty-" + toWord(n % 80);
			}
			if (n > 70){
				return "seventy-" + toWord(n % 70);
			}
			if (n > 60){
				return "sixty-" + toWord(n % 60);
			}
			if (n > 50){
				return "fifty-" + toWord(n % 50);
			}
			if (n > 40){
				return "forty-" + toWord(n % 40);
			}
			if (n > 30){
				return "thirty-" + toWord(n % 30);
			}
			if (n > 20){
				return "twenty-" + toWord(n % 20);
			}
		}
		if (n >= 10 && n < 20){
			if (n == 10){
				return "ten";
			}
			if (n == 11){
				return "eleven";
			}
			if (n == 12){
				return "twelve";
			}
			if (n == 13){
				return "thirteen";
			}
			if (n == 14){
				return "fourteen";
			}
			if (n == 15){
				return "fifteen";
			}
			if (n == 16){
				return "sixteen";
			}
			if (n == 17){
				return "seventeen";
			}
			if (n == 18){
				return "eighteen";
			}
			if (n == 19){
				return "nineteen";
			}
		}
		if (n < 10){
			if (n == 1){
				return "one";
			}
			if (n == 2){
				return "two";
			}
			if (n == 3){
				return "three";
			}
			if (n == 4){
				return "four";
			}
			if (n == 5){
				return "five";
			}
			if (n == 6){
				return "six";
			}
			if (n == 7){
				return "seven";
			}
			if (n == 8){
				return "eight";
			}
			if (n == 9){
				return "nine";
			}
		}
		return "";
	}

	public static void main(String[] args){
		
	}
}