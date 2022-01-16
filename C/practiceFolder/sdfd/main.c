#include <stdio.h>


int ageArray[] = {55, 50, 45, 40, 35, 30, 25};
int displayWoMenData(int ageArray[],int numberOfWomen[]);
int displayMenData(int ageArray[],int numberOfMen[]);

int main()
{
    int numberOFCandidates = 0;
    int  numberOfVaccines = 0;
    int limit = 0;

    printf("How many candidates: ");
    scanf("%d", &numberOFCandidates);
    printf("How many vaccines: ");
    scanf("%d", &numberOfVaccines);
    printf("Vaccine limit to age group: ");
    scanf("%d", &limit);


    int numOFWomen = numberOFCandidates / 3;
    int numOfmen = numberOFCandidates - numOFWomen;


    int ageOfMan[numOfmen];
    int numberOfMen[7]= {0};

    int ageOfWomen[numOFWomen];
    int numberOfWomen[7]= {0};


    int i=0;
    while (i < numOfmen)
    {
        if (numberOfMen[i % 7] < limit)
        {
            if (i % 7==0)

                ageOfMan[i] = ageArray[0];

            else if (i % 7==1)
                ageOfMan[i] = ageArray[1];

            else if (i % 7==2)
                ageOfMan[i] = ageArray[2];

            else if (i % 7==3)
                ageOfMan[i] = ageArray[3];

            else if (i % 7==4)
                ageOfMan[i] = ageArray[4];

            else if (i % 7==5)
                ageOfMan[i] = ageArray[5];

            else if (i % 7==5)
            {
                ageOfMan[i] = ageArray[6];
            }


            numberOfMen[i % 7]++;
        }
        i++;
    }
    printf("Total men :  %d\n",numOfmen);

    printf("Age set for men:\n");

    i=0;
    while ( i < numOFWomen)
    {
        if (numberOfWomen[i % 7] < limit)
        {
            if (i % 7==0)

                ageOfWomen[i] = ageArray[0];

            else if (i % 7==1)
                ageOfWomen[i] = ageArray[1];

            else if (i % 7==2)
                ageOfWomen[i] = ageArray[2];

            else if (i % 7==3)
                ageOfWomen[i] = ageArray[3];

            else if (i % 7==4)
                ageOfWomen[i] = ageArray[4];

            else if (i % 7==5)
                ageOfWomen[i] = ageArray[5];

            else if (i % 7==5)
            {
                ageOfWomen[i] = ageArray[6];
            }


            numberOfWomen[i % 7]++;
        }
        i++;
    }
    printf("Total women :  %d\n",numOFWomen);

    printf("Age set for women:\n");

    printf("Vaccines allocated for men: %d\n", numberOfVaccines/2);
    printf("Vaccines allocated for women: %d\n", numberOfVaccines/2);




    printf("Vaccines given to men:\n");
    int sumMen=displayMenData(ageArray,numberOfMen);
    printf("Vaccines given to women:\n");
    int sumWomen=displayWoMenData(ageArray,numberOfWomen);



    int given=sumMen+sumWomen;

    printf("Total vaccines given :  %d\n",given);
    printf("Total vaccines not given :  %d",numberOfVaccines-given);

    return 0;
}


int displayMenData(int ageArray[],int numberOfMen[])
{
    numberOfMen[6]=0;
    int sumMen=0;

    for (int i = 0; i < 7; i++)
    {
        printf("age %d = %d\n", ageArray[i], numberOfMen[i]);
        sumMen=sumMen+numberOfMen[i];

    }

    return sumMen;

}
int displayWoMenData(int ageArray[],int numberOfWomen[])
{
    int sum=0;

    for (int i = 0; i < 7; i++)
    {
        printf("age %d = %d\n", ageArray[i], numberOfWomen[i]);
        sum=sum+numberOfWomen[i];

    }

    return sum;

}
