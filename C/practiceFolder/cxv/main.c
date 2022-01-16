#include <stdio.h>

int main()
{

    int alpha,omega,r;

    printf("Enter alpha: ");
    scanf("%d",&alpha);
    printf("Enter omega: ");
    scanf("%d",&omega);
    printf("Enter r: ");
    scanf("%d",&r);


    double a=alpha*r-pow(omega,2)*r;

    printf("a: %.2lf",a);


    double m,v,c;
    printf("Enter m: ");
    scanf("%lf",&m);
    printf("Enter v: ");
    scanf("%lf",&v);
    printf("Enter c: ");
    scanf("%lf",&c);


    double momentum=(m*v)/(sqrt(1-(pow(v,2)/pow(c,2))));

    printf("Momentum: %.2lf",momentum);


    double energy,mass,height,accelaration,velocity;

    printf("Enter mass: ");
    scanf("%lf",&mass);

    printf("Enter height: ");
    scanf("%lf",&height);

    printf("Enter accelaration: ");
    scanf("%lf",&accelaration);

    printf("Enter velocity: ");
    scanf("%lf",&velocity);

    energy=mass*(height*accelaration+(pow(velocity,2)/2));


    printf("Energy : %.2lf",energy);

    return 0;
}

double diagonal(double l,double w,double h);


double diagonal(double l,double w,double h)
{

    double diag=sqrt(pow(l,2)+pow(w,2),pow(h,2));

    return diag;


}
