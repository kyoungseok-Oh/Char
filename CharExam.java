public class CharExam {
    public static void main(String[] args) {
        //Q. '1'+'2'+'3'+'4'+'5'=15이 나오도록 프로그램밍 하시오.
        char a= '1';
        char b= '2';
        char c= '3';
        char d= '4';
        char e= '5';
        int sum = (a-48)+(b-48)+(c-48)+(d-48)+(e-48);
        System.out.println("sum = " + sum);
        /*답지
        int sum=0;
        sum=sum+('1'-'0'); // '1'->49-'0'(48)=1
        sum=sum+('2'-'0');
        sum=sum+('3'-'0');
        sum=sum+('4'-'0');
        sum=sum+('5'-'0');
        System.out.println("sum = " + sum);//15*/
    }
}
