#include <stdio.h>

    FILE *pointerGrade;
    FILE *pointerCGPA;
    FILE *pointerFile;


struct basic_information
{
    char name[100];
    int ID ;
    char email[100];
    int cellNumber[100];
    char Address [100];
    char dob[100];


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
    int QUIZ[3];
    int MID[3];
    int assignment;
    int final_exam;


};

struct course
{

    char course_Name[100];
    char Faculty_Name[100];
    int Credit;
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

 double cgpa=0;


    pointerGrade=fopen("Student_grade.txt","w");
    pointerCGPA=fopen("Student_cgpa.txt","w");
    pointerFile=fopen("student_info.txt","w");


    int numberOfStudents;

    printf("\Number of students  :\n");
    scanf("%d",&numberOfStudents);
    gets(stdin);

    for(int i=0; i<numberOfStudents; i++)
    {


        printf("Enter information  of student no: %d \n",i+1
              );
        printf("Students  Name:");
        gets(information[i].info.name);
        fprintf(pointerFile,"%s ",information[i].info.name);

        printf("ID  :");
        scanf("%d",&information[i].info.ID);
        fprintf(pointerFile,"%d ",information[i].info.ID);
        printf("Students Email :");
        scanf("%s",information[i].info.email);
        fprintf(pointerFile,"%s ",information[i].info.email);

        printf("Students Address : ");
        scanf("%s",information[i].info.Address);
        fprintf(pointerFile,"%s ",information[i].info.Address);

        printf("DOB : ");
        scanf("%s",information[i].info.dob);
        fprintf(pointerFile,"%s ",information[i].info.dob);

        printf("Cell Number  :");
        scanf("%d",&information[i].info.cellNumber);
        fprintf(pointerFile,"%d ",information[i].info.cellNumber);
        system("cls");

        printf("\n\nEnter ssc or equivalent details   :\n\n\n");
        printf("Instution Name:");
        gets(stdin);
        gets(information[i].hsc.institution);
        fprintf(pointerFile,"%s ",information[i].ssc.institution);

        printf("Grade(GPA): ");
        scanf("%f",&information[i].ssc.grade);
        gets(stdin);

        fprintf(pointerFile,"%f ",information[i].ssc.grade);

        printf("Year of Exam: ");
        scanf("%d",&information[i].ssc.year_of_exam);
        gets(stdin);
        fprintf(pointerFile,"%d ",information[i].ssc.year_of_exam);

        system("cls");
        printf("\n\nEnter HSC or equivalent details   :\n\n\n");
        printf("Enter Instution: ");
        gets(information[i].hsc.institution);
        fprintf(pointerFile,"%s ",information[i].hsc.institution);

        printf("Enter Grade(GPA): ");
        scanf("%f",&information[i].hsc.grade);
        gets(stdin);

        fprintf(pointerFile,"%f ",information[i].hsc.grade);
        gets(stdin);

        printf("Enter year of Exam:");
        scanf("%d",&information[i].hsc.year_of_exam);
        gets(stdin);

        fprintf(pointerFile,"%d \n",information[i].hsc.year_of_exam);

        printf("University Info                     : \n\n");
        printf("Enter Department name               : ");
        scanf("%s",information[i].ni.department);
        gets(stdin);
        printf("Semester Completed (Enter the number only):" );
        scanf("%d",&information[i].ni.number_of_Semester_Completed);
        printf("Enter Completed CGPA                      :");
        scanf("%f",&information[i].ni.previous_CGPA);

        printf("Current semester name                     :  ");
        scanf("%s",information[i].currentsemester.semester_Name);

        printf("Number of courses you took this semester  : ");
        scanf("%d",&information[i].currentsemester.numberOFcourse);

        int n=information[i].currentsemester.numberOFcourse;



        double sumOFGradePoint=0;
        for(int j=0; j<n; j++)
        {

            fprintf(pointerCGPA,"%s ",information[i].info.name);
            fprintf(pointerGrade,"%s ",information[numberOfStudents].info.name);
            fprintf(pointerCGPA,"%d ",information[j].info.ID);
            fprintf(pointerGrade,"%d ",information[j].info.ID);

            printf("Course no         : %d\n",i+1);
            printf("Enter course name : ");
            scanf("%s",information[j].ni.currentcourse[j].course_Name);
            fprintf(pointerCGPA,"%s ",information[j].ni.currentcourse[j].course_Name);
            fprintf(pointerGrade,"%s ",information[j].ni.currentcourse[j].course_Name);



            printf("Credit :");
            scanf("%d",&information[j].ni.currentcourse[j].Credit);
            printf("Faculty Initial ");
            scanf("%s",information[j].ni.currentcourse[j].Faculty_Name);

            printf("\n\nQUIZ 1: ");
            scanf("%d",&information[j].ni.currentcourse[j].exams.QUIZ[0]);
            printf("QUIZ 2: ");
            scanf("%d",&information[j].ni.currentcourse[j].exams.QUIZ[1]);
            printf("QUIZ 3: ");
            scanf("%d",&information[j].ni.currentcourse[j].exams.QUIZ[2]);
            printf("\n\n");
            printf("MIDterm 1: ");
            scanf("%d",&information[j].ni.currentcourse[j].exams.MID[0]);
            printf("MIDterm 2: ");
            scanf("%d",&information[j].ni.currentcourse[j].exams.MID[1]);
            printf("Assignemnt: ");
            scanf("%d",&information[j].ni.currentcourse[j].exams.assignment);

            printf("Final :");
            scanf("%d",&information[j].ni.currentcourse[j].exams.final_exam);
            printf("\n\n");






    int totalQUIZ=(information[j].ni.currentcourse[j].exams.QUIZ[0]+information[j].ni.currentcourse[j].exams.QUIZ[1]+information[j].ni.currentcourse[j].exams.QUIZ[2])/3;
    int totalMID=(information[j].ni.currentcourse[j].exams.MID[0]+information[j].ni.currentcourse[j].exams.MID[1])/2;

    int point=totalQUIZ+totalMID+information[j].ni.currentcourse[j].exams.final_exam+information[j].ni.currentcourse[j].exams.assignment;



        char grade[3];

    if(point>=93)
    {


    strcpy(grade,"A");
            strcpy(grade,"A");
    }
    else if(point>=90 && point<=92)
    {
            strcpy(grade,"A-");
    }
    else if(point>=87 && point<=89)
    {
            strcpy(grade,"B+");
    }
    else if(point>=83 && point<=86)
    {
            strcpy(grade,"B");
    }
    else if(point>=80 && point<=82)
    {
            strcpy(grade,"B-");
    }
    else if(point>=77 && point<=79)
    {
            strcpy(grade,"C+");
    }
    else if(point>=73 && point<=76)
    {
            strcpy(grade,"C");
    }
    else if(point>=70 && point<=72)
    {
            strcpy(grade,"C-");
    }
    else if(point>=67 && point<=69)
    {
            strcpy(grade,"D+");
    }
    else if(point>=60 && point<=66)
    {
            strcpy(grade,"D");
    }
    else if(point<60)
    {
            strcpy(grade,"F");
    }
    fprintf(pointerGrade,"%s \n",grade);


    if(point>=93)
    {

        cgpa=4.0;
    }
    else if(point>=90 && point<=92)
    {
        cgpa=3.7;
    }
    else if(point>=87 && point<=89)
    {
        cgpa=3.3;
    }
    else if(point>=83 && point<=86)
    {
        cgpa=3.0;
    }
    else if(point>=80 && point<=82)
    {
        cgpa=2.7;
    }
    else if(point>=77 && point<=79)
    {
        cgpa=2.3;
    }
    else if(point>=73 && point<=76)
    {
        cgpa=2.0;
    }
    else if(point>=70 && point<=72)
    {
        cgpa=1.7;
    }
    else if(point>=67 && point<=69)
    {
        cgpa=1.3;
    }
    else if(point>=60 && point<=66)
    {
        cgpa=1.0;
    }
    else if(point<60)
    {
        cgpa=0.0;
    }


            fprintf(pointerCGPA,"%.lf \n",cgpa);




            printf("\n\n");





        }




    }
    fclose(pointerFile);
    fclose(pointerGrade);
    fclose(pointerCGPA);







}
