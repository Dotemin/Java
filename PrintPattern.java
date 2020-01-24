public class PrintPattern {

        public static void main(String [] args )
        {
            for(int i=0;i<5;i++)
            { for(int j=0;j<5;j++)
            {
                if(j>i) break;
                System.out.print("# ");
            }
                System.out.println();
            }
        }

}
