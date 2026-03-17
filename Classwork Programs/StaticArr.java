class StaticArr
{
  public static void main(String args[])  //in static we are not taking input from user
  {

    int ages[]={18,19,20,19,24,26,21,23};
    System.out.println("Age of first student " +ages[0]);
    for(int i=0;i<ages.length;i++)
    { 
        System.out.println("Age of student"+(i+1)+" "+ages[i]);
    }
   

  }
}