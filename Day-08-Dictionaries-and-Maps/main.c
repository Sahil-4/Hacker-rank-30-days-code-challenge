
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int arr_length;
    scanf("%d", &arr_length);

    unsigned int numbers[arr_length];
    char names[arr_length][20];

    char name[10];
    int number[8];

    for (int i = 0; i < arr_length; i++)
    {
        /* code */
        scanf("%s", &name);
        scanf("%d", &number);
    }

    return 0;
}
