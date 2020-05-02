package mathematics;

public class QuadraticEquation {
    private static int[] splittingTheMiddleTerm(int a, int b, int c){
        int [] splittedTerms = new int[2];
        int product = a*c;
        int temp1 = b;
        int temp2 = 0;
        while(temp1*temp2 != product){
            if(temp1<0){
                temp1++;
                temp2--;
            }else{
                temp1--;
                temp2++;
            }

        }
        splittedTerms[0] = temp1;
        splittedTerms[1]= temp2;
        return splittedTerms;
    }
    private static int getHighestCommonFactor(int a, int b){
        if(a<0) a = a + (-2)*a;
        if(b<0) b = b + (-2)*b;
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a == b)
            return a;
        if (a > b)
            return getHighestCommonFactor(a-b, b);
        return getHighestCommonFactor(a, b-a);
    }
    private static double[] rootsOfQuadraticEquation(int a, int b1, int b2, int c){
        double []roots = new double[2];
        int commonFactor1 = getHighestCommonFactor(a,b1);//3
        int commonFactor2 = getHighestCommonFactor(b2, c);//4
        if(a<0) commonFactor1=-commonFactor1;
        if(b2<0) commonFactor2= -commonFactor2;
        int t1 = a/commonFactor1;//1
        int t2 = b1/commonFactor1;//7
        roots[0] = (double)(-t2)/(double)(t1);
        roots[1] = (double)(-commonFactor2)/(double)(commonFactor1);
        return roots;
    }
    public static void main(String[] args){
        int a = 1;
        int b = 10;
        int c = 16;
        int discriminant = b*b - 4*a*c;
        if(discriminant<0){
            System.out.println("Real roots don't exist!");
        }
        else {
            int[] re = splittingTheMiddleTerm(a,b,c);
            int b1 = re[0];
            int b2 = re[1];
            double roots[] = rootsOfQuadraticEquation(a,b1,b2,c);
            System.out.println("Roots of the equation are: ");
            for(double i:roots){
                System.out.print(i+ " ");
            }
        }

    }
}
