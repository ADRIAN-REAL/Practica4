public class matriz {
    int [][]longitud;
    public matriz()
    {
        longitud = new int[5][15];
    }
    public void ejecutar()
    {
        for(int i = 0; i < longitud.length; i++)
        {
            for(int j = 0; j < longitud[i].length; j++)
            {
                if(i == 0 || i == longitud.length - 1)
                {
                    longitud[i][j] = 1;
                }
                else
                {
                    if(j == 0 || j == longitud[i].length - 1)
                    {
                        longitud[i][j] = 1;
                    }
                    else
                    {
                        longitud[i][j] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < longitud.length; i++)
        {
            for (int j = 0; j < longitud[i].length; j++)
            {
                System.out.print(longitud[i][j] + " ");
            }
            System.out.println();
        }
    }
}
