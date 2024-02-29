import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Buna ziua! Va rog sa alegeti o problema:");
		int problema=scanner.nextInt();
		if((problema<1)||(problema>20))
		{
			System.out.println("Problema nu a fost gasita.");
		}
		switch(problema)
		{
			case 1:
			{
				int nr=scanner.nextInt();
				if((nr<1)&&(nr>10))
				{
					System.out.println("Invalid");
				}
				else
				{
					if(nr>=5)
					{
						System.out.println("Admis");
					}
					else
					{
						System.out.println("Respins");
					}
				}
				break;
			}
			case 2:
			{
				int nr=scanner.nextInt();
				if((nr>=1)&&(nr<=5))
				{
					switch(nr)
					{
						case 1:System.out.println("UNU");break;
						case 2:System.out.println("DOI");break;
						case 3:System.out.println("TREI");break;
						case 4:System.out.println("PATRU");break;
						case 5:System.out.println("CINCI");break;
					}
				}
				break;
			}
			case 3:
			{
				int nr1=scanner.nextInt();
				int nr2=scanner.nextInt();
				if((nr1%2==0)&&(nr2%2==0))
				{
					System.out.println((nr1+nr2)/2);
				}
				else
				{
					if(nr1%2==nr2%2)
					{
						System.out.println(nr1*nr2);
					}
					else
					{
						System.out.println(nr1+nr2);
					}
				}
				break;
			}
			case 4:
			{
				int nr1=scanner.nextInt();
				int nr2=scanner.nextInt();
				int nr3=scanner.nextInt();
				int min=nr1;
				if(nr2<min)
					min=nr2;
				if(nr3<min)
					min=nr3;
				System.out.println(min);
				break;
			}
			case 5:
			{
				int n=scanner.nextInt();
				int sum=0;
				for(int i=2;i<=(n-1)*2;i=i+2)
				{
					sum=sum+i;//lista de nr pare incepe cu 0,dar nu are rost adaugarea lui in suma
				}
				System.out.println(sum);//ex: pentru n=6, sum=0+2+4+6+8+10=>sum=30
				break;
			}
			case 6:
			{
				int n=scanner.nextInt();
				int sum=0;
				for(int i=1;i<n*2;i=i+2)
				{
					sum=sum+i;
				}
				System.out.println(sum);
				break;
			}
			case 7:
			{
				int n=scanner.nextInt();
				int sum=0;
				for(int i=1;i<=n;i++)
				{
					sum=sum+scanner.nextInt();
				}
				System.out.println(sum/n);
				break;
			}
			case 8:
			{
				int n=scanner.nextInt();
				int factorial=1;
				for(int i=2;i<=n;i++)
				{
					factorial=factorial*i;
				}
				System.out.println(factorial);
				break;
			}
			case 9:
			{
				int n=scanner.nextInt();
				if(n==2)
				{
					System.out.println("Numarul dat este prim.");
				}
				else
				{
					if(n%2==0)
					{
						System.out.println("Numarul dat nu este prim.");
					}
					else
					{
						boolean ok=false;
						for(int i=3;i*i<=n;i=i+2)
						{
							if(n%i==0)
							{
								ok=true;
								break;
							}
						}
						if(ok)
							System.out.println("Numarul dat nu este prim");
						else
							System.out.println("Numarul dat este prim.");
					}
				}
				break;
			}
			case 10:
			{
				boolean negasit=true;
				int n=1001;
				while(negasit)
				{
					boolean prim=true;
					for(int i=3;i*i<=n;i=i+2)
					{
						if(n%i==0)
						{
							prim=false;
							break;
						}
					}
					if(prim)
					{
						negasit=false;
					}
					else
					{
						n=n+2;
					}
				}
				System.out.println(n);//1009
				break;
			}
			case 11:
			{
				int n=scanner.nextInt();
				for(int i=1;i<=n;i++)
				{
					if(n%i==0)
					{
						System.out.println(i);
					}
				}
				break;
			}
			case 12:
			{
				int n=scanner.nextInt();
				if((n%2==0)&&(n!=0))
				{
					System.out.println(2);
				}
				for(int i=3;i<=n;i=i+2)
				{
					if(n%i==0)
					{
						boolean prim=true;
						for(int j=3;j*j<=i;j=i+2)
						{
							if(i%j==0)
							{
								prim=false;
								break;
							}
						}
						if(prim)
						{
							System.out.println(i);
						}
					}
				}
				break;
			}
			case 13:
			{
				for(int i=17;i<=1000;i=i+17)
				{
					if((1000-i)%19==0)
					{
						System.out.println(i+" "+(1000-i));
					}
				}
				break;
			}
			case 14:
			{
				for(int i=17;i<=1000;i=i+17)
				{
					if(((1000-i)%19==0)||((1000-i)%7==0))
					{
						System.out.println(i+" "+(1000-i));
					}
				}
				for(int i=13;i<=1000;i=i+13)
				{
					if(((1000-i)%19==0)||((1000-i)%7==0))
					{
						System.out.println(i+" "+(1000-i));
					}
				}
				break;
			}
			case 15:
			{
				for(int a=0;a<=9;a++)
				{
					for(int b=0;b<=9;b++)
					{
						if((3+a+2+b)==9)
						{
							System.out.println(3000+a*100+20+b);
						}
					}
				}
				break;
			}
			case 16:
			{
				int n=scanner.nextInt();
				while(n!=0)
				{
					System.out.println(n%10);
					n=n/10;
				}
				break;
			}
			case 17:
			{
				int n=scanner.nextInt();
				int max=n%10;
				n=n/10;
				while(n!=0)
				{
					if(n%10>max)
						max=n%10;
					n=n/10;
				}
				System.out.println(max);
				break;
			}
			case 18:
			{
				int n=scanner.nextInt();
				int min=n%10;
				n=n/10;
				while(n!=0)
				{
					if(n%10<min)
						min=n%10;
					n=n/10;
				}
				System.out.println(min);
				break;
			}
			case 19:
			{
				int n=scanner.nextInt();
				int inv=0;
				while(n!=0)
				{
					inv=inv*10+n%10;
					n=n/10;
				}
				System.out.println(inv);
				break;
			}
			case 20:
			{
				int nr=scanner.nextInt();
				int n=nr;
				int inv=0;
				while(n!=0)
				{
					inv=inv*10+n%10;
					n=n/10;
				}
				if(inv==nr)
				{
					System.out.println("Numarul dat e palindrom.");
				}
				else
				{
					System.out.println("Numarul dat nu e palindrom.");
				}
				break;
			}
		}
		scanner.close();
	}
}

