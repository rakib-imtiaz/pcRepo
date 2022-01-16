#include <stdio.h>
#include <stdlib.h>



const char* getGrade(int marks) {
  char *grade;

  if(marks>=93)
  {

  grade="A";
  }
  else if(marks>=90 && marks<=92)
  {
  grade="A-";
  }
  else if(marks>=87 && marks<=89)
  {
  grade="B+";
  }
  else if(marks>=83 && marks<=86)
  {
  grade="B";
  }
  else if(marks>=80 && marks<=82)
  {
  grade="B-";
  }
  else if(marks>=77 && marks<=79)
  {
  grade="C+";
  }
  else if(marks>=73 && marks<=76)
  {
  grade="C";
  }
  else if(marks>=70 && marks<=72)
  {
  grade="C-";
  }
  else if(marks>=67 && marks<=69)
  {
  grade="D+";
  }
  else if(marks>=60 && marks<=66)
  {
  grade="D";
  }
  else if(marks<60)
  {
  grade="F";
  }







  return grade;
}

int main()
{

printf("%s",getGrade(86));
    return 0;
}
