//palindrom using recursion
class RecursionPalindrome{
	static boolean is Palindrome(String s,int start,int end){
if(start>=end){
return true;
}
if(s.chatAt(start)!=s.charAt(end)){
return false;
}
return is Palindrome(s,start+1,end-1);
	}
public static void main(String[] args){
String s="madam";
if(is Palindrome(s,0,s.length(l-1))){
System.out.println(s+"is Palindrome");
}else{
System.out.println(s+"is not Palindrome");
}
}
}	