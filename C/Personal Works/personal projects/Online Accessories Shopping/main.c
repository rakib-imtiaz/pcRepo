#include<stdio.h>
#include<string.h>

void admin_portal();
void admin_login();
void change_password();
void user_panel();
void add_data();
void file_maker();




int main()

{

    file_maker();
    //display_product();
    admin_login();



}


void file_maker()
{
    FILE *file;
    file=fopen("products.txt","r");


    if(file==NULL)
    {
        fclose(file);
        file=fopen("products.txt","w");
        fprintf(file,"Intel 10th GEN core i5-10600\nAMD RYZEN 5 3600X\nAMD Ryzen 5 3400G\nWestern Digital 1Tb Desktop HDD\nToshiba 1TB SATA Desktop HDD\nSamsung 2TB HDD (Desktop)\nAsrock B450-HDV\nAsrock B450 Steal Legend Gaming Motherboard\nGigabyte A520M DS3H Ultra Durable Motherboard\nCorsair Vengeance LPX 16GB DDR4 DRAM 3200MHz\nTeam Dark 8GB DDR4 3200Mhz\nG.Skill Trident Z RGB 8GB DDR4 3200MHz\nAntec Gamer Gold Series 650 WATT\nCooler Master MWE 550W V2\nThermaltake Smart BX1 550W 80 Plus\nNvdia GeForce GTX 1050 EXOC white\nMSI Radeon RX 5500 XT Mech 4GB OC\nGigabyte GeForce GTX 1650 D6 OC 4GB\nRazer Book 13 core i7 11th Gen 13.4inch touch\nHp pavilion Gaming i5 10th Gen 1650ti 4gb\nXiaomi redmi book air 13 core i5 10th Gen\n");
        fclose(file);

    }




}


void display_product()
{
    system("cls");
    FILE *file_of_question;
    char ques[150];

    file_of_question=fopen("products.txt","r");

    while(fgets(ques,70,file_of_question)!=NULL)
    {
           printf("%s",ques);
    }
    fclose(file_of_question);


}


void add_data()
{
    system("cls");
    char product[150];
    gets(stdin);
    printf("Enter the product Details : \n");
    gets(product);

    printf("Are you sure You want to add? ");
    printf("\n1.Yes\n2.No\n");
    int option;
    scanf("%d",&option);
    if(option==1)
    {
        FILE *file;
        file=fopen("products.txt","a");
        fprintf(file,"\n%s",product);

    }
    else{

        system("cls");
        add_data();
    }
    exit(1);




}





void admin_portal()
{
    int pass,inputed_pass,imported_pass;
    FILE *file;
    file=fopen("password.txt","r");

    if(file==NULL)
    {
        printf("password does not exist!\ncreate a new one!\n");
         file=fopen("password.txt","w");
         scanf("%d",&pass);
         fprintf(file,"%d",pass);
         printf("password successfully created!\n");
         fclose(file);
    }

    else
    {
        printf("please enter your password:\n");
        scanf("%d",&inputed_pass);
        fscanf(file,"%d",&imported_pass);

        if(inputed_pass==imported_pass)
        {
            system("cls");
         printf("\n\n\n\n\n\n\t\t\t\t\t\tLogged in successfully\n");
            system("color 10");
            sleep(1);
            system("color 2F");
            sleep(1);
            system("color 60");
            sleep(1);
            system("color 3F");
            sleep(1);
            system("color F1");
            system("cls");
        printf("1.Add Data\n");
        printf("2.Dislay Data\n");
        printf("3.Logout\n");
        printf("4.Exit\n");


        int option;
        scanf("%d",&option);

        switch(option)
        {
            case 1:{

                system("cls");

                add_data();


            break;
            }

            case 2:{
                system("cls");

                display_product();
            break;
            }
            case 3:
                {
                    system("cls");
                    admin_login();
            break;
            }
            case 4:{

            exit(1);
            break;
            }
        }
        }
        else{

            printf("Incorrect Password\n");
            printf("try again\n");
            admin_portal();
        }


}
}



void admin_login()
{

            printf("1.Admin Log in\n");
            printf("2.User panel\n");
           printf("3.Change password\n");
           printf("4.exit\n");
           int option;
           scanf("%d",&option);
           switch(option)
           {
               case 1:{

                   admin_portal();

               break;
               }

               case 2:{

                   user_panel();

               break;
               }
               case 3:{

                   change_password();

               break;
               }
               case 4:{

                   exit(1);
               break;
               }
           }


}



void change_password()
{

    int imported_pass,prev_pass,new_pass1,new_pass;
    FILE*file=fopen("password.txt","r");



        printf("enter your old password:\n");
        scanf("%d",&prev_pass);

        fscanf(file,"%d",&imported_pass);
        if(prev_pass==imported_pass)
        {
            printf("enter your new password:\n");
            scanf("%d",&new_pass);
            printf("Retype the password again:\n");
            scanf("%d",&new_pass1);
            if(new_pass==new_pass1)
            {
               file=fopen("password.txt","w");
               fprintf(file,"%d",new_pass);
               printf("your password has sucessfully changed!\n");
               fclose(file);
            }
            else
            {
                printf("password does not matched!\n");
            }
        }
         else
         {
           printf("your old password is incorrect!\n");
         }
}

void user_panel()
{
    system("cls");
    system("color F1");
static int totalCost;
 int i,j,choice,c=1,a[21],cost[21];
 for(i=0;i<21;i++)
 a[i]=0;

 char str[100];

 char items[21][100]={
 "Intel 10th GEN core i5-10600                 ",
 "AMD RYZEN 5 3600X                            ",
 "AMD Ryzen 5 3400G                            ",
 "Western Digital 1Tb Desktop HDD              ",
 "Toshiba 1TB SATA Desktop HDD                 ",
 "Samsung 2TB HDD (Desktop)                    ",
 "Asrock B450-HDV                              ",
 "Asrock B450 Steal Legend Gaming Motherboard  ",
 "Gigabyte A520M DS3H Ultra Durable Motherboard",
 "Corsair Vengeance LPX 16GB DDR4 DRAM 3200MHz ",
 "Team Dark 8GB DDR4 3200Mhz                   ",
 "G.Skill Trident Z RGB 8GB DDR4 3200MHz       ",
 "Antec Gamer Gold Series 650 WATT             ",
 "Cooler Master MWE 550W V2                    ",
 "Thermaltake Smart BX1 550W 80 Plus           ",
 "\nvdia GeForce GTX 1050 EXOC white            ",
 "MSI Radeon RX 5500 XT Mech 4GB OC            ",
 "Gigabyte GeForce GTX 1650 D6 OC 4GB          ",
 "Razer Book 13 core i7 11th Gen 13.4inch touch",
 "Hp pavilion Gaming i5 10th Gen 1650ti 4gb    ",
 "Xiaomi redmi book air 13 core i5 10th Gen    "
 };
printf("\nttt     **********************************************\n");
 printf("ttt      **                    AA                    **                    \n");
 printf("ttt       **                 AA  AA                   **                   \n");
 printf("ttt        **               AA    AA       ___________ **         __/__       \n");
 printf("ttt         **             AA      AA      | WELCOME |  **            /    \n");
 printf("ttt          **           AAAAAAAAAAAA     |   TO    |   **       /_  _      \n");
 printf("ttt           **         AA          AA    <---------<    **        /       \n");
 printf("ttt            **       AA            AA                   **              \n");
 printf("ttt             **     AA              ARG                  **             \n");
 printf("ttt              **                      TTTTTTTTTTTT        **            \n");
 printf("ttt               **                          TT              **           \n");
 printf("ttt    __/__       **      ____________       TT               **          \n");
 printf("ttt        /        **     |ARG ~ TECH|       TT                **         \n");
 printf("ttt    /_  _         **                       TT                 **        \n");
 printf("ttt      /            **                      TECH                **       \n");
 printf("ttt                    **                                          **      \n");
 printf("ttt                     **********************************************      n\n");
 printf("========================================================================================================================================== nn\n");
 printf("Please Enter Your Name: n\n");
 gets(str);
 printf("\ntHello %s, Welcome to ARG-Tech.",str);
 do{
  //C is 1 by default
  if(c==1){
  printf("\nnCategorynntCOMPONENT +\n\n\t\t\t\1 - PROCESSOR\n\t\t\t\2 - HARD DISKn\t\t\t3 - MOTHERBOARD\n\t\t\t4 - RAM\n\t\t\t\5 - POWER SUPPLYnttt6 - GRAPHICS CARDnntLAPTOP +nttt7 - RAZERnttt8 - Hpnttt9 - XiaominnAny other number to exit.\n");
  scanf("%d",&choice);
  switch(choice)
  {
   case 1:
   {
    int processor;
    printf("\nEnternn1 - Intel 10th GEN core i5-10600 - BDT.23500n2 - AMD RYZEN 5 3600X - BDT.19500n3 - AMD Ryzen 5 3400G - BDT.13500nnAny other number to exit.n\n");
    scanf("%d",&processor);
    cost[0]=23500;
    cost[1]=19500;
    cost[2]=13500;
    switch(processor)
    {
     case 1:
     {
      int num;
      printf("\nYou chose Intel 10th GEN core i5-10600 with BDT.23500.Are you sure to buy.If 'Yes' Enter 1, else any number\n");
      scanf("%d",&num);
      if(num==1)
      {
       a[0]++;
       totalCost+=23500;
      }
      printf("\nYour Cost in Cart is: %d/=\n",totalCost);
      break;
     }
     case 2:
     {
      int num;
      printf("\nYou chose AMD RYZEN 5 3600X with BDT.19500. Are you sure to buy.If 'Yes' Enter 1 else any number\n");
      scanf("%d",&num);
      if(num==1)
      {
       a[1]++;
       totalCost+=19500;
      }
      printf("\nYour Cost in Cart is: %d/=\n",totalCost);
      break;
     }
     case 3:
     {
      int num;
      printf("\nYou chose AMD Ryzen 5 3400G with BDT.13500.Are you sure to buy.If 'Yes' Enter 1 else any number\n");
      scanf("%d",&num);
      if(num==1)
      {
       a[2]++;
       totalCost+=13500;
      }
      printf("\nYour Cost in Cart is: %d/=\n",totalCost);
      break;
     }
     default:{
      printf("Exit from Processor Section\n");
      break;
     }
    }
    break;
   }
   case 2:
   {
    int Harddisk;
    printf("\nEntern1 - Western Digital 1Tb Desktop HDD - BDT 6500n2 - Toshiba 1TB SATA Desktop HDD - BDT. 7200n3 - Samsung 2TB HDD - BDT. 9000nAny other number to exit\n");
    scanf("%d",&Harddisk);
    cost[3]=6500;
    cost[4]=7200;
    cost[5]=9000;
    switch(Harddisk)
    {
     case 1:
     {
      int num;
      printf("\nYou chose Western Digital 1Tb Desktop HDD - BDT 6500.Are you sure to buy.If 'Yes' Enter 1 else any number\n");
      scanf("%d",&num);
      if(num==1)
      {
       a[3]++;
       totalCost+=6500;
      }
      printf("\nYour Cost in Cart is: %d\n",totalCost);
      break;
     }
     case 2:
     {
      int num;
      printf("\nYou chose Toshiba 1TB SATA Desktop HDD BDT. 7200.Are you sure to buy.If 'Yes' Enter 1 else any number\n");
      scanf("%d",&num);
      if(num==1)
      {
       a[4]++;
       totalCost+=9000;
      }
      printf("\nYour Cost in Cart is: %d\n",totalCost);
      break;
     }
     case 3:
     {
      int num;
      printf("\nYou chose Samsung 2TB HDD (Desktop) BDT. 9000.Are you sure to buy.If 'Yes' Enter 1 else any number\n");
      scanf("%d",&num);
      if(num==1)
      {
       a[5]++;
       totalCost+=9000;
      }
      printf("\nYour Cost in Cart is: %d\n",totalCost);
      break;
     }
     default:{
      printf("Exit from Harddisk Drive Section\n");
      break;
     }
    }
    break;
   }
   case 3:
   {
    int Motherboard;
    printf("\nEntern1 - Asrock B450-HDV BDT.15500\n2 - Asrock B450 Steal Legend Gaming Motherboard BDT.22800n3 - Gigabyte A520M DS3H Ultra Durable Motherboard BDT.24000nAny other number to exit\n");
    scanf("%d",&Motherboard);
    cost[6]=15500;
    cost[7]=22800;
    cost[8]=24000;
    switch(Motherboard)
    {
     case 1:
     {
      int num;
      printf("\nYou chose Asrock B450-HDV BDT.15500 .Are you sure to buy.If 'Yes' Enter 1 else any number\\n");
      scanf("%d",&num);
      if(num==1)
      {
       a[6]++;
       totalCost+=15500;
      }
      printf("\nYour Cost in Cart is: %d\n",totalCost);
      break;
     }
     case 2:
     {
      int num;
      printf("\nYou chose Asrock B450 Steal Legend Gaming Motherboard - BDT. 22800 .Are you sure to buy.If 'Yes' Enter 1 else any number\n");
      scanf("%d",&num);
      if(num==1)
      {
       a[7]++;
       totalCost+=22800;
      }
      printf("\nYour Cost in Cart is: %d\n",totalCost);
      break;
     }
     case 3:
     {
      int num;
      printf("\nYou chose to buy Gigabyte A520M DS3H Ultra Durable Motherboard - BDT. 24000 .Are you sure to buy.If 'Yes' Enter 1 else any number\n");
      scanf("%d",&num);
      if(num==1)
      {
       a[8]++;
       totalCost+=24000;
      }
      printf("\nYour Cost in Cart is: %d\n",totalCost);
      break;
     }
     default:{
      printf("Exit from Motherboard Section\\n");
      break;
     }
    }
    break;
   }

   case 4:
       {

       int RAM;
    printf("\nEntern1 - Corsair Vengeance LPX 16GB DDR4 DRAM 3200MHz BDT. 5800n2 - Team Dark 8GB DDR4 3200Mhz BDT. 4100n3 - G.Skill Trident Z RGB 8GB DDR4 3200MHz BDT. 4700nAny other number to exit\n");
    scanf("%d",&RAM);
    cost[9]=5800;
    cost[10]=4100;
    cost[11]=4700;
    switch(RAM)
    {
     case 1:
     {
      int num;
      printf("\nYou chose  Corsair Vengeance LPX 16GB DDR4 DRAM 3200MHz BDT. 5800 .Are you sure to buy.If 'Yes' Enter 1 else any number\n");
      scanf("%d",&num);
      if(num==1)
      {
       a[9]++;
       totalCost+=5800;
      }
      printf("\nYour Cost in Cart is: %d\n",totalCost);
      break;
     }
     case 2:
     {
      int num;
      printf("\nYou chose Team Dark 8GB DDR4 3200Mhz BDT. 4100 .Are you sure to buy.If 'Yes' Enter 1 else any number\n");
      scanf("%d",&num);
      if(num==1)
      {
       a[10]++;
       totalCost+=4100;
      }
      printf("\nYour Cost in Cart is: %d\n",totalCost);
      break;
     }
     case 3:
     {
      int num;
      printf("\nYou chose to buy  G.Skill Trident Z RGB 8GB DDR4 3200MHz BDT. 4700 .Are you sure to buy.If 'Yes' Enter 1 else any number\n");
      scanf("%d",&num);
      if(num==1)
      {
       a[11]++;
       totalCost+=4700;
      }
      printf("\nYour Cost in Cart is: %d\n",totalCost);
      break;
     }
     default:{
      printf("Exit from RAM Section\n");
      break;
     }
    }
    break;


       }
// start of a section
     case 5:{

                int POWERSUPPLY;
    printf("\nEntern1 - Antec Gamer Gold Series 650 WATT BDT. 9700n2 - Cooler Master MWE 550W V2 BDT. 7200n3 - Thermaltake Smart BX1 550W 80 Plus RGB BDT. 5000nAny other number to exit\n");
    scanf("%d",&POWERSUPPLY);
    cost[12]=9700;
    cost[13]=7200;
    cost[14]=5000;
    switch(POWERSUPPLY)
    {
     case 1:
     {
      int num;
      printf("\nYou chose Antec Gamer Gold Series 650 WATT     BDT. 9700 .Are you sure to buy.If 'Yes' Enter 1 else any number\n");
      scanf("%d",&num);
      if(num==1)
      {
       a[12]++;
       totalCost+=9700;
      }
      printf("\nYour Cost in Cart is: %d\n",totalCost);
      break;
     }
     case 2:
     {
      int num;
      printf("\nYou chose Cooler Master MWE 550W V2 BDT. 7200 .Are you sure to buy.If 'Yes' Enter 1 else any number\n");
      scanf("%d",&num);
      if(num==1)
      {
       a[13]++;
       totalCost+=7200;
      }
      printf("\nYour Cost in Cart is: %d\n",totalCost);
      break;
     }
     case 3:
     {
      int num;
      printf("\nYou chose to buy Thermaltake Smart BX1 550W 80 Plus RGB      BDT. 5000 .Are you sure to buy.If 'Yes' Enter 1 else any number\n");
      scanf("%d",&num);
      if(num==1)
      {
       a[14]++;
       totalCost+=5000;
      }
      printf("\nYour Cost in Cart is: %d\n",totalCost);
      break;
     }
     default:{
      printf("Exit from Power Supply Section.\n");
      break;
     }
    }
    break;
     }

     // end of a section
    case 6:{

                  int GRAPHICSCARD;
    printf("\nEntern1 - Nvdia GeForce GTX 1050 EXOC white 4GB BDT. 16500n2 - MSI Radeon RX 5500 XT Mech 4GB OC BDT. 19300n3 - Gigabyte GeForce GTX 1650 D6 OC 4GB BDT. 16200nAny other number to exit\n");
    scanf("%d",&GRAPHICSCARD);
    cost[15]=16500;
    cost[16]=19300;
    cost[17]=16200;
    switch(GRAPHICSCARD)
    {
     case 1:
     {
      int num;
      printf("\nYou chose Nvdia GeForce GTX 1050 EXOC white 4GB       BDT. 16500 .Are you sure to buy.If 'Yes' Enter 1 else any number\n");
      scanf("%d",&num);
      if(num==1)
      {
       a[15]++;
       totalCost+=16500;
      }
      printf("\nYour Cost in Cart is %d\n",totalCost);
      break;
     }
     case 2:
     {
      int num;
      printf("\nYou chose MSI Radeon RX 5500 XT Mech 4GB OC       BDT. 19300 .Are you sure to buy.If 'Yes' Enter 1 else any number\n");
      scanf("%d",&num);
      if(num==1)
      {
       a[16]++;
       totalCost+=19300;
      }
      printf("\nYour Cost in Cart is %d\n",totalCost);
      break;
     }
     case 3:
     {
      int num;
      printf("\nYou chose to buy Gigabyte GeForce GTX 1650 D6 OC 4GB      BDT. 16200 .Are you sure to buy.If 'Yes' Enter 1 else any number\n");
      scanf("%d",&num);
      if(num==1)
      {
       a[17]++;
       totalCost+=16200;
      }
      printf("\nYour Cost in Cart is %d\n",totalCost);
      break;
     }
     default:{
      printf("Exit from Graphics Card Section\n");
      break;
     }
    }
    break;
          }
case 7:{

                int LAPTOP;
    printf("\nEntern1 - Razer Book 13 core i7 11th Gen 13.4inch touch	BDT. 175000nnAny other number to exit\n");
    scanf("%d",&LAPTOP);
    cost[18]=175000;
    switch(LAPTOP)
    {
     case 1:
     {
      int num;
      printf("\nYou chose to buy Razer Book 13 core i7 11th Gen 13.4inch touch	BDT. 175000 .Are you sure to buy.If 'Yes' Enter 1 else any number\n");
      scanf("%d",&num);
      if(num==1)
      {
       a[18]++;
       totalCost+=175000;
      }
      printf("\nYour Cost in Cart is: %d\n",totalCost);
      break;
     }
     default:{
      printf("Exit from  Laptop Section.\n");
      break;
     }
    }
    break;
     }

     case 8:{

                int LAPTOP;
    printf("\nEntern1 - Hp pavilion Gaming core i4 10th Gen 1650ti 4gb 	BDT. 100800nnAny other number to exit\n");
    scanf("%d",&LAPTOP);
    cost[18]=100800;
    switch(LAPTOP)
    {
     case 1:
     {
      int num;
      printf("\nYou chose to buy Hp pavilion Gaming core i4 10th Gen 1650ti 4gb 	BDT. 100800 .Are you sure to buy.If 'Yes' Enter 1 else any number\n");
      scanf("%d",&num);
      if(num==1)
      {
       a[19]++;
       totalCost+=100800;
      }
      printf("\nYour Cost in Cart is: %d\n",totalCost);
      break;
     }
     default:{
      printf("Exit from  Laptop Section.\n");
      break;
     }
    }
    break;
     }

 case 9:{

                int LAPTOP;
    printf("\nEntern1 - Xiaomi redmi book air 13 core i5 10th Gen	BDT. 68000nnAny other number to exit\n");
    scanf("%d",&LAPTOP);
    cost[20]=68000;
    switch(LAPTOP)
    {
     case 1:
     {
      int num;
      printf("\nYou chose to buy Hp pavilion Gaming core i4 10th Gen 1650ti 4gb 	BDT. 100800 .Are you sure to buy.If 'Yes' Enter 1 else any number\n");
      scanf("%d",&num);
      if(num==1)
      {
       a[20]++;
       totalCost+=68000;
      }
      printf("\nYour Cost in Cart is: %d\n",totalCost);
      break;
     }
     default:{
      printf("Exit from  Laptop Section.\n");
      break;
     }
    }
    break;
     }
   default:
   {
    printf("Enter Valid Categories Choice\n");
    break;
   }
  }
  printf("%s's cart\n",str);
  //aline maintain
  printf("IdtttttItemsttttt     QuantitytttCostn\n");
  for(i=0;i<21;i++)
  {
   if(a[i]!=0)
   {
    printf("%dttt%sttt%dttt%dn\n",i,items[i],a[i],(cost[i]*a[i]));
   }
  }
  printf("__________________________________________________________________________________________________________________________\n");
  printf("Total Costtttttttttttt     %d/= BDT.\n",totalCost);
  printf("\nIf you wish to buy anything more Entern1 to Add Itemn2 to Delete Itemsn3 to Change Quantity n4 payment methodnAny other number to Exit\n");
  scanf("%d",&c);
 }
  if(c==2)
  {
   int id;
   printf("\nEnter id to delete item\n");
   scanf("%d",&id);
   if(id<21&&id>0){
   totalCost=totalCost-(cost[id]*a[id]);
   a[id]=0;
   }
   else{
    printf("\nEnter Valid id\n");
   }
       printf("Revised Items \n");
    printf("IdtttttItemsttttt     QuantitytttCost\n");
            for(i=0;i<21;i++)
      {
     if(a[i]!=0)
      {
    printf("%dttt%sttt%dttt%d\n",i,items[i],a[i],(cost[i]*a[i]));
      }
     }
         printf("_______________________________________________________________________________________________________________________\n");
        printf("Total Costtttttttttttt     %d/= BDT\n",totalCost);
        printf("If you wish to buy anything more Entern1 to Add Itemn2 to Delete Itemsn3 to Change Quantity n4 Payment methodnAny other number to Exit\n");
     scanf("%d",&c);
  }
  if(c==3)

  {
   int id,quantity;
   printf("Enter id to Change quantity of an item\n");
   scanf("%d",&id);
   printf("Enter quantity to be changed of an item\n");
   scanf("%d",&quantity);
   if(id<21&&id>0){
    if(quantity>0 && a[id]>0){
        if(quantity<a[id])
     {
      int dec=a[id]-quantity;
      a[id]=quantity;
       totalCost=totalCost-(cost[id]*dec);
     }
     if(quantity>a[id])
     {
      int inc=quantity-a[id];
      a[id]=quantity;
       totalCost=totalCost+(cost[id]*inc);
     }
     if(quantity==a[id])
     {
      a[id]=quantity;
       totalCost=totalCost+0;
     }

    }
    else{
       printf("Item has no Quantity.Please Try again\n");
    }
     }
     else{
    printf("Enter Valid id\n");
   }
       printf("Revised Items \n");
  printf("IdtttttItemsttttt    QuantitytttCost\n");
            for(i=0;i<21;i++)
      {
     if(a[i]!=0)
      {
    printf("%dttt%sttt%dttt%d\n",i,items[i],a[i],(cost[i]*a[i]));
      }
     }
         printf("_______________________________________________________________________________________________________________________\n");
        printf("Total Costtttttttttttt     %d /= BDT.\n",totalCost);
        printf("\nIf you wish to buy anything more, Entern1 to Add Itemn2 to Delete Itemsn3 to Change Quantityn4 payment method nnAny other number to Exit\n");
     scanf("%d",&c);
  }
  if(c==4)
  {
                   int phoneNumber;
                   int pincode;
                   int input;
                   int abc;


      printf("\npayment methodn\n");
      printf("1 bkashn2 CODn\n");
      scanf("%d",&input);


    switch(input){
         case 1:
           printf("\nEnter Your Number: ");
                scanf("%d",&phoneNumber);
           printf("\nEnter Password: ");
                     scanf("%d",&pincode);
                     printf("\nYour Payment is Successful!");


         case 2:
                   printf("\nnEnter Your Phone Number: ");
                     scanf("%s",&phoneNumber);

                            printf("\nEnter Address: ");
                     scanf("%s",&abc);
                     printf("\nORDER CONFIRMED !\n");
              default:
               break;



      }

  }






 }
 while(c==1 || c==2 ||c==3);
 printf("\nYour Final Cost is: %d/= BDT.\n",totalCost);
 printf("\nThanks %s for Choosing ARG-Tech and Visit us again.\n",str);



}


