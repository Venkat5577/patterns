package patterns;

public class Pattern1 {

	public static void main(String[] args) {
		String s="BreakingBad";
		int n=-1;
		String s1="",s2="";
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z') {
				n=i;
				break;
			}
		}
		if(n!=-1) {
			s1=s.substring(0, n);
			s2=s.substring(n);
		}	
		int len=Math.max(s1.length(),s2.length());
		String r1="";
		String r2="";
		for(int i=1;i<=len;i++) {
			String res="";
			if(i<=s1.length()) {
			r1=s1.substring(0,i);
			}
			if(i<=s2.length()) {
				r2=s2.substring(0,i);
			}
			res=r1+r2;
			System.out.println(res.toUpperCase());
		}
		
	}

}
