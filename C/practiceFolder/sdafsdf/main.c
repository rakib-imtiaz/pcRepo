#include <stdio.h>

const char* getGrade(int marks);
double getGradePoint(int marks);
struct basic_information
{
    char name[100];
    int id ;
    char email[100];
    int PhoneNumber[100];
    char Address [100];
    char Data_of_Birth[100];


};

struct education_information
{
    char institution[100];
    int year_of_exam;
    float grade;


};



struct semester
{

    char semester_Name[100];
    int numberOFcourse;

};



struct exam
{
    int quiz[3];
    int mid[3];
    int assignment;
    int final_exam;


};

struct course
{

    char course_Name[100];
    int credit_Number;
    struct exam exams;
};


struct nSU_information
{
    char department[100];
    int number_of_Semester_Completed;
    float previous_CGPA;
    struct course currentcourse[6];



};



struct student_information
{
    struct basic_information info;
    struct education_information ssc;
    struct education_information hsc;
    struct nSU_information ni;
    struct semester currentsemester;

} information[100];



int main()
{

    // struct student_information information[10];


    FILE *gradefile,*cgpaFile,*infofile;

    gradefile=fopen("Student_grade.txt","w");
    cgpaFile=fopen("Student_cgpa.txt","w");
    infofile=fopen("student_info.txt","w");



    printf("\nHow many students you want to add? : \n");
    int stdNo=1;

    for(int i=0; i<stdNo; i++)
    {


        printf("Enter information  of student no: %d \n",i+1
              );
        printf("Name : ");
        gets(information[i].info.name);
        fprintf(infofile,"%s ",information[i].info.name);

        printf("ID : ");
        scanf("%d",&information[i].info.id);
        fprintf(infofile,"%d ",information[i].info.id);
        printf("Email : ");
        scanf("%s",information[i].info.email);
        fprintf(infofile,"%s ",information[i].info.email);

        printf("Address : ");
        scanf("%s",information[i].info.Address);
        fprintf(infofile,"%s ",information[i].info.Address);

        printf("Date of birth : ");
        scanf("%s",information[i].info.Data_of_Birth);
        fprintf(infofile,"%s ",information[i].info.Data_of_Birth);

        printf("phone number : ");
        scanf("%d",&information[i].info.PhoneNumber);
        fprintf(infofile,"%d ",information[i].info.PhoneNumber);

        printf("--------------------------------------------\n\n");
        printf("Enter ssc or equivalent details   :\n\n\n");
        printf("Enter Instution: ");
        gets(stdin);
        gets(information[i].hsc.institution);
        fprintf(infofile,"%s ",information[i].ssc.institution);

        printf("Enter Grade(GPA): ");
        scanf("%f",&information[i].ssc.grade);
        gets(stdin);

        fprintf(infofile,"%f ",information[i].ssc.grade);
        //printf("%f",information[i].ssc.grade);

        printf("Enter year of Exam: ");
        scanf("%d",&information[i].ssc.year_of_exam);
        gets(stdin);
        fprintf(infofile,"%d ",information[i].ssc.year_of_exam);
        printf("--------------------------------------------\n\n\n");

        printf("Enter HSC or equivalent details   :\n\n\n");
        printf("Enter Instution: ");
        gets(information[i].hsc.institution);
        //  gets(information[i].hsc.institution);
        fprintf(infofile,"%s ",information[i].hsc.institution);

        printf("Enter Grade(GPA): ");
        scanf("%f",&information[i].hsc.grade);
        gets(stdin);

        fprintf(infofile,"%f ",information[i].hsc.grade);
        //  printf("%f",information[i].hsc.grade);
        gets(stdin);

        printf("Enter year of Exam: ");
        scanf("%d",&information[i].hsc.year_of_exam);
        gets(stdin);

        fprintf(infofile,"%d \n",information[i].hsc.year_of_exam);

        printf("\n--------------------------------------------\n\n\n");
        printf("NSU information: \n\n");
        printf("Enter Department name: ");
        scanf("%s",information[i].ni.department);
        gets(stdin);
        printf("Enter Number of semester completed  :" );
        scanf("%d",&information[i].ni.number_of_Semester_Completed);
        printf("Enter Completed CGPA :");
        scanf("%f",&information[i].ni.previous_CGPA);


        //fprintf(infofile,"%s ")

        printf("Enter your current semester name:  ");
        scanf("%s",information[i].currentsemester.semester_Name);

        printf("How many courses u took?\n \n");
        scanf("%d",&information[i].currentsemester.numberOFcourse);

        int n=information[i].currentsemester.numberOFcourse;



        double sumOFGradePoint=0;
        for(int j=0; j<n; j++)
        {

            fprintf(cgpaFile,"%s ",information[i].info.name);
            fprintf(gradefile,"%s ",information[stdNo].info.name);


            fprintf(cgpaFile,"%d ",information[j].info.id);
            fprintf(gradefile,"%d ",information[j].info.id);

            printf("Course no: %d\n",i+1);
            printf("Enter course name: ");
            scanf("%s",information[j].ni.currentcourse[j].course_Name);
            fprintf(cgpaFile,"%s ",information[j].ni.currentcourse[j].course_Name);
            fprintf(gradefile,"%s ",information[j].ni.currentcourse[j].course_Name);



            printf("Enter credit number:");
            scanf("%d",&information[j].ni.currentcourse[j].credit_Number);
            printf("Enter faculty name: ");
            scanf("%s",information[j].ni.currentcourse[j].Faculty_Name);
            printf("\n\n\nExam info :\n");
            printf("quiz 1: ");
            scanf("%d",&information[j].ni.currentcourse[j].exams.quiz[0]);
            printf("quiz 2: ");
            scanf("%d",&information[j].ni.currentcourse[j].exams.quiz[1]);
            printf("quiz 3: ");
            scanf("%d",&information[j].ni.currentcourse[j].exams.quiz[2]);
            printf("\n\n");
            printf("Midterm 1: ");
            scanf("%d",&information[j].ni.currentcourse[j].exams.mid[0]);
            printf("Midterm 2: ");
            scanf("%d",&information[j].ni.currentcourse[j].exams.mid[1]);

            printf("\n\n");
            printf("Assignemnt: ");
            scanf("%d",&information[j].ni.currentcourse[j].exams.assignment);
            printf("\n\n");

            printf("Final :");
            scanf("%d",&information[j].ni.currentcourse[j].exams.final_exam);
            printf("\n\n");

            int totalmarks=calcMarks(information[j].ni.currentcourse[j].exams.quiz[0]+information[j].ni.currentcourse[j].exams.quiz[1],information[j].ni.currentcourse[j].exams.quiz[2]+information[j].ni.currentcourse[j].exams.mid[0]+information[j].ni.currentcourse[j].exams.mid[1]+information[j].ni.currentcourse[j].exams.final_exam+information[j].ni.currentcourse[j].exams.assignment);

            fprintf(gradefile,"%s \n",getGrade(totalmarks));
            fprintf(cgpaFile,"%.lf \n",getGradePoint(totalmarks));




            printf("\n\n");





        }




    }
    fclose(infofile);

    fclose(gradefile);
    fclose(cgpaFile);


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



int calcMarks(int quiz1,int quiz2,int quiz3,int mid1,int mid2,int finalexam,int assignemnt)
{


    int totalquiz=(quiz1+quiz2+quiz3)/3;
    int totalmid=(mid1+mid2)/2;

    int marks=totalquiz+totalmid+finalexam+assignemnt;


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
