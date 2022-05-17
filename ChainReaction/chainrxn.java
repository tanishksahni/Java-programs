import java.util.Scanner;
class chainrxn
{
    int size;
    chainrxn(int length)
    {
        size = length;

    } 
    void display(String arr[][], int number[][]){
        for(int i=0; i<size; i++)
        {
            for(int j=0; j<size; j++)
            {
                System.out.print(" " +number[i][j] + arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    void setvalue(String arr[][],String val,int x,int y)
    {
        arr[x][y]= val;


    }


    boolean see(String arr[][])
    {
        int cr=0;
        int cg=0;
        for(int i=0; i<size; i++)
        {
            for(int j=0; j<size; j++)
            {
                if(arr[i][j].equals("R"))
                {
                    cr++;
                }
                else if(arr[i][j].equals("R"))
                {
                    cg++;
                }
                else{
                }
            }
        }
        if(cg == (size*size) || cr == (size*size))
        {
            return true;
        }
        else
        {
            return false;
        }
            
    }



    //mid segment
    void midburst(){

    }
    //side
    void sideburst(){

    }
    //for corners
    void cornerburst(){

    }
    
   
   
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        //gamespace development 
        System.out.println("Enter the size of the matrix");
        int n=sc.nextInt();
        chainrxn cx= new chainrxn(n);
        String gamespace[][]=new String[n][n];
        int num[][]=new int[n][n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                gamespace[i][j]="*";
                num[i][j]=0;
            }
        }
        System.out.println("Yoqur Gamespace is Developed");
        cx.display(gamespace, num);
        System.out.println();

        //player color selection
        System.out.println("Player 1 make your selection (R or G)");
        String p1=sc.next();
        String p2;

        if(p1.equals("R"))
        {
            System.out.println("Player 2 gets \nG");
            p2="G";
        } 
        else
        {
            System.out.println("Player 2 gets \nR");
            p2="R";
        }

        boolean c= cx.see(gamespace);
        System.out.println(c);
        System.out.println(cx.size);
        

        while(c == false)
        {
            System.out.println("Player 1 enter the values");
            int x =sc.nextInt();
            int y =sc.nextInt();
            cx.setvalue(gamespace,p1,x,y);
            System.out.println("Player 2 enter the values");
            int p =sc.nextInt();
            int q =sc.nextInt();
            cx.setvalue(gamespace,p2,p,q);
            c= cx.see(gamespace);
            cx.display(gamespace, num);
        }
        if(c == true){
            System.exit(0);
        }
        
        
            







        
    }
     
}