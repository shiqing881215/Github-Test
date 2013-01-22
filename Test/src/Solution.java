import java.util.HashSet;
import java.util.Set;


public class Solution {
	public boolean isSelfWrapNumber(int num) {
		String numStr = num + "";
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i<numStr.length(); i++) {
			if (numStr.charAt(i) == '0') return false;
			if (set.contains(Integer.parseInt(numStr.charAt(i)+""))) {
				return false;
			} else {
				set.add(Integer.parseInt(numStr.charAt(i)+""));
			}
		}
		
		int index = 0;
		int length = numStr.length();
		while (length > 0) {
			if (set.contains(Integer.parseInt(numStr.charAt(index) + ""))) {
				set.remove(Integer.parseInt(numStr.charAt(index) + ""));
				index = (index+Integer.parseInt(numStr.charAt(index) + "")) % (numStr.length());
			} else {
				return false;
			}
			length--;
		}
		
		if (index == 0 && set.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int leastSelfWrapNumber(int num) {
		int tmp = num;
		while(true) {
			if (isSelfWrapNumber(tmp)) {
				return tmp;
			}
			tmp++;
		}
	}
	
	
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.leastSelfWrapNumber(2317));
	}
}
