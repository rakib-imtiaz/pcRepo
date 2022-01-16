#include <stdio.h>
#include <stdlib.h>

struct teacherCredentials
{
    int facultyID;
    int facultyPass;


};
struct studentCredentials
{
    int std_Id;
    int std_Pass;


};
struct teacher
{
    char facultyName[50];
    char facultyInitial[10];
    struct teacherCredentials teacherCred;


} teacherinfo;

struct Exam_Marks
{
    int quiz[3];
    int mid[3];
    int assignment;
    int finalExam;
    int attendence;

};
struct courseInfo
{

    char course_Name[100];
    int credit_Number;
    struct Exam_Marks performance;
};


struct student
{

    char std_Name[50];
    char std_email[50];
    int std_id;
    int std_conatact_Number;
    double cgpa; //this field will be calculated by the student course performance

    struct courseInfo course;
    struct studentCredentials std_cred;


};



void loginPortalMenu();
void studentMenu();
void teacherMenu();

int main()
{




    int options;

    do
    {

        loginPortalMenu();
        scanf("%d",&options);

        if(options==1)
        {
            studentMenu();
        }
        else if(options==2)
        {
            teacherMenu();
        }


    }
    while(options!=5);




    return 0;
}

void studentMenu()
{

    int id,password;
    printf("Enter student ID: \n ");
    scanf("%d",&id);
    printf("Enter password: ");
    scanf("%d",&password);





}

void teacherPortal()
{

    printf("1.View Data \n");
    printf("2.Delete Data\n");
    printf("3.Update Data\n");
    printf("4.Log out");


}
void studentPortal()
{

    printf("1. Add Data \n");
    printf("2. Update Data\n");
    printf("3.Change password\n");
    printf("4.Log out");


}


void teacherMenu()
{
    int id,password;
    printf("Enter teacher ID: \n ");
    scanf("%d",&id);
    printf("Enter password: ");
    scanf("%d",&password);



}

void loginPortalMenu()
{
    printf("1. Log in as Teacher\n");
    printf("2. Log in as Student");
    printf("\n\nEnter option : \n\n ");

}





double getGradePoint(int marks)
{


    double gradepoint=0;

    if(marks>=93)
    {

        gradepoint=4.0;
    }
    else if(marks>=90 && marks<=92)
    {
        gradepoint=3.7;
    }
    else if(marks>=87 && marks<=89)
    {
        gradepoint=3.3;
    }
    else if(marks>=83 && marks<=86)
    {
        gradepoint=3.0;
    }
    else if(marks>=80 && marks<=82)
    {
        gradepoint=2.7;
    }
    else if(marks>=77 && marks<=79)
    {
        gradepoint=2.3;
    }
    else if(marks>=73 && marks<=76)
    {
        gradepoint=2.0;
    }
    else if(marks>=70 && marks<=72)
    {
        gradepoint=1.7;
    }
    else if(marks>=67 && marks<=69)
    {
        gradepoint=1.3;
    }
    else if(marks>=60 && marks<=66)
    {
        gradepoint=1.0;
    }
    else if(marks<60)
    {
        gradepoint=0.0;
    }

    return gradepoint;

}

double getCgpa(int totalGradePoint,int numberOfCourse)
{



    double cgpa=totalGradePoint/numberOfCourse;
    return cgpa;

}



int calcMarks(int quiz1,int quiz2,int quiz3,int mid1,int mid2,int finalexam,int assignemnt,int attendance)
{


    int totalquiz=(quiz1+quiz2+quiz3)/3;
    int totalmid=(mid1+mid2)/2;

    int marks=totalquiz+totalmid+finalexam+assignemnt+attendance;


    return marks;


}




const char* getGrade(int marks)
{
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
