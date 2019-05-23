package ua.com.fan.taskone.second;

public class WrapRecursion {
	private boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			return true;
		return false;
	}

	private boolean isCon(char ch) {
		ch = Character.toLowerCase(ch);
		if (ch == 'b' || ch == 'c' || ch == 'd' || ch == 'f' || ch == 'g' || ch == 'h' || ch == 'j' || ch == 'k'
				|| ch == 'l' || ch == 'm' || ch == 'n' || ch == 'p' || ch == 'q' || ch == 'r' || ch == 's' || ch == 't'
				|| ch == 'v' || ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z')
			return true;
		return false;
	}

	public String vowelsWrapper(String str) {
		if (str.length() < 2)
			return str;
		return str.charAt(0)
				+ (isVowel(str.charAt(0)) && isVowel(str.charAt(1)) || isVowel(str.charAt(0)) && isCon(str.charAt(1))
						|| isCon(str.charAt(0)) && isVowel(str.charAt(1)) ? "*" : "")
				+ vowelsWrapper(str.substring(1));
	}

//	// можно сделать без проверки на согласные буквы,
//	// но не будет учтен пробел (при вводе ГРУППЫ слов не будет выполняться условие)
//	public String vowelsWrapper(String str) {
//		if (str.length() < 2)
//			return str;
//		return str.charAt(0)
//				+ (isVowel(str.charAt(0)) && isVowel(str.charAt(1))
//						|| isVowel(str.charAt(0)) && !(isVowel(str.charAt(1)))
//						|| !(isVowel(str.charAt(0))) && isVowel(str.charAt(1)) ? "*" : "")
//				+ vowelsWrapper(str.substring(1));
//	}
}
