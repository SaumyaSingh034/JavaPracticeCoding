class JaggedArrayDemo2
{
public static void main(String[] args)
{
 int student[][] = new int[4][];
 student[0]= new int[4];
 student[1] = new int[3];
 student[2] = new int[2];
 student[3] = new int[3];
 System.out.println("Row count "+student.length);
 System.out.println("Third row size "+student[3].length);
 //1st row
 student[0][0] = 44;
 student[0][1] = 89;
 student[0][2] =90;
 //student[2][2] = 34;
 //2nd row
 student[1][0]=23;
 //3rd row
 student[2][0] = 87;
 student[2][1] = 45;
 
 //4th row
 student[3][0] = 56;
 student[3][1] = 34;
 student[3][2] = 34;
 // System.out.println("student[3][1] marks" +student[3][1] );
 for(int i=0;i<student.length;i++)
 {
   for(int j=0;j<student[i].length;j++)
   {
    System.out.print(student[i][j]+"\t");
	}
	System.out.println();
	}
	}
	}
 