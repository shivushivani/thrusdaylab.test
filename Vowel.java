public class Vowel {
public static int countVowels(char[] CharArr) {
int count=0;
for(char ch : CharArr) {
if(ch == 'a'||ch == 'e'||ch == 'I'||ch == 'o'||ch == 'u') {
count=count+1;
}
try {
if(ch=='x') {
System.out.println("Checked Exception");
}
}
catch(Exception e) {
System.out.println(e);
}
}
return count;
}
public static void main(String[] args) {
char[] str= {'s','u','y','a','s'};
System.out.println("Vowels present in array: "+countVowels(str));
}
}