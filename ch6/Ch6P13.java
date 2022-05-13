import java.util.*;
interface Matrix
{
	final static int M=3,N=3;
        public void readMatrix();
	public void addMatrix();
        public void mulMatrix();
        public void transposeMatrix();
	public void displayMatrix();
}
class Calculate implements Matrix
{
	private int m,n,i,j,p,k,temp;
        private int a[][]=new int[M][N];
        private int b[][]=new int[M][N];
        private int c[][]=new int[M][N];
        private int d[][]=new int[M][N];
        private int e[][]=new int[M][N];
        private int sum[][]=new int[M][N];
	public void readMatrix()
	{
		Scanner sc=new Scanner(System.in);
                System.out.println("Matrix A:");
                for(i=0;i<=M-1;i++)
                {
                    for(j=0;j<=N-1;j++)
                    {
                       System.out.println("Enter a value:");
                       a[i][j]=sc.nextInt();
                    }
                }
                System.out.println("Matrix B:");
                for(i=0;i<=M-1;i++)
                {
                    for(j=0;j<=N-1;j++)
                    {
                       System.out.println("Enter a value:");
                       b[i][j]=sc.nextInt();
                    }
                }
	}
	public void displayMatrix()
	{
           System.out.println("Matrix A:");
           for(i=0;i<=M-1;i++)
           {
               for(j=0;j<=N-1;j++)
               {
                  System.out.print(a[i][j]+"\t");
               }
               System.out.println();
           }
           System.out.println("Matrix B:");
           for(i=0;i<=M-1;i++)
           {
               for(j=0;j<=N-1;j++)
               {
                  System.out.print(b[i][j]+"\t");
               }
               System.out.println();
           }    	
	}
        public void addMatrix()
        {
            for(i=0;i<=M-1;i++)
            {
                for(j=0;j<=N-1;j++)
                {
                    sum[i][j]=a[i][j]+b[i][j];
                }
             }
             System.out.println("Addition Matrix:");
             for(i=0;i<=M-1;i++)
             {
                 for(j=0;j<=N-1;j++)
                 {
                      System.out.print(sum[i][j]+"\t");
                 }
                 System.out.println();
             }
        }
        public void mulMatrix()
        {
             int i,j,k;
	     for(i=0;i<=M-1;i++)
             {
                for(j=0;j<=M-1;j++)
                {
                   c[i][j]=0;
                   for(k=0;k<=M-1;k++)
                   {
                        c[i][j]+=a[i][k]*b[k][j];
                   }
               } 
            }
            System.out.println("Product Matrix:");
            for(i=0;i<=M-1;i++)
            {
                 for(j=0;j<=N-1;j++)
                 {
                    System.out.print(c[i][j]+"\t");
                 }
                 System.out.println();
           }
        }
        public void transposeMatrix()
        {
             for(i=0;i<=M-1;i++)
             {
                 for(j=0;j<=N-1;j++)
                 {
                    d[j][i]=a[i][j];
                    e[j][i]=b[i][j];
                 }
             }
             System.out.println("Transpose Matrix A:");
             for(i=0;i<=N-1;i++)
             {
                for(j=0;j<=M-1;j++)
                {
                   System.out.print(d[i][j]+"\t");
                }
                System.out.println();
             }
             System.out.println("Transpose Matrix B:");
             for(i=0;i<=N-1;i++)
             {
                for(j=0;j<=M-1;j++)
                {
                   System.out.print(e[i][j]+"\t");
                }
                System.out.println();
             }
       }
}
class Ch6P13
{
    	public static void main(String args[])
    	{
		Calculate s=new Calculate();
		s.readMatrix();
		s.displayMatrix();
                s.addMatrix(); 
                s.transposeMatrix();
                s.mulMatrix();
	}
}