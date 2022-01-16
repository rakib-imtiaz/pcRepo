#include <stdio.h>
#include <string.h>
int main(){
    int distance[]={5000,7000,3000,2000,4000};
    char spiderman[30];
    char mj[30];
    printf("enter position of sipderman : ");
    fflush(stdin);
    scanf("%s",&spiderman);
    printf("enter position of mj : ");
    fflush(stdin);
    scanf("%s",&mj);
    int cost=0;
    int spidermanpos,mjpos;
    char paths[5][20] ={"Kamalapur","Mouchak","Rampura","Badda","NSU"};
    for(int i=0;i<5;i++){
        if(strcmp(spiderman,paths[i])==0){
            spidermanpos=i;
            for(int j=0;j<5;j++){
                if(strcmp(mj,paths[j])==0){
                    mjpos=j;

                }
            }
        }

    }

    while (spidermanpos!=mjpos){
        if(spidermanpos>mjpos){
           spidermanpos--;
            cost+=distance[spidermanpos];
        } else if(spidermanpos<mjpos){}
         spidermanpos++;
        cost+=distance[spidermanpos];
    }
    printf("Distance: %d meters\n",cost);
    printf("swing needed: %d",(cost/150));
}
