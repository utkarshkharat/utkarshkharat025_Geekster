package Day3;

public class Program1
{
    public static void main(String[] arg)
    {

        boolean ans = 40>=2*45 || 30>=2*10;
        System.out.println(ans);

        ans= 40>3 && 20>3;
        System.out.println(ans);

        ans= 50>7 && 30>=40;
        System.out.println(ans);

        ans= 50<25 || 30>2;
        System.out.println(ans);

        ans= 70<=75 || 40<=2;
        System.out.println(ans);

        ans = !( 45==35);
        System.out.println(ans);

        ans= (20<32 && 2!=30) && (35>=20 || 35!=25);
        System.out.println(ans);

        ans= !(20>=30);
        System.out.println(ans);

        ans= !(30>40);
        System.out.println(ans);

        ans = !(40==2*20) && 75==15*5;
        System.out.println(ans);

        ans = !(40>=40) || (50>=2*25);
        System.out.println(ans);

        ans = !(10*5==50) || (2*3==7 || 9==28/3);
        System.out.println(ans);

        ans = (20*5==100 || 10!=10) && (30*2==60 || 50<40);
        System.out.println(ans);

        ans = ( !(90>=40) && !(80>36) );
        System.out.println(ans);

        ans = ( (50>=20) || (90>2*45) && ( 30!=2*15));
        System.out.println(ans);
    }
}
