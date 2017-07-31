public class greater {

    public static void main(String[] args) {
        int a = 50, b=70, c=65, d=40;
        {
	if (a>b)
            {
                if (a>c)
				{
                    if(a>d)
                    {
			System.out.println("A is Greater: "+a);
                    }
                }
            }
            else
                {
                    if (b>a)
                    {
						if (b>c)
						{
                            if(b>d)
                            {
								System.out.println("B is Greater: "+b);
                            }
						}
                    }
				}
					if (c>a)
					{
						if (c>b)
						{
							if(c>d)
							{
                                System.out.println("C is Greater: "+c);
							}
						}
					}
			else
				{
                    if (d>a)
                    {
                        if (d>b)
                        {
                            if(d>c)
                            {
								System.out.println("D is Greater: "+d);
                            }
						}
                    }
				}			
		}
		
    }
    
}
