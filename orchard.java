import java.util.Scanner;
public class orchard
{
public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);

    String Ashok = sc.nextLine();
    String Anand = sc.nextLine();

    char ashok[] = Ashok.toCharArray();
    char anand[] = Anand.toCharArray();

    int combine_ashok=combination(ashok,ashok.length);
    int combine_anand=combination(anand,anand.length);
    
    if(combine_ashok==0 && combine_anand==0)
        System.out.print("Invalid input");
    if(combine_ashok>combine_anand)
        System.out.print("Ashok");
    else if(combine_anand > combine_ashok)
        System.out.print("Anand");
    else 
        System.out.print("Draw");
}

static int combination(char arr[],int n)
{
    int count=0;
    String str="";
    for(int i=0;i<n;i++)
    {
        str=""+arr[i];
        for(int j=i+1;j<n;j++)
        {
            str+=arr[j];
            if(str.charAt(0)!=arr[j])
            {
                for(int k=j+1;k<n;k++)
                {
                    if(str.charAt(1)!=arr[k])
                        count++;
                }
            }
            str=""+arr[i];
        }
    }
    return count;
}
}
