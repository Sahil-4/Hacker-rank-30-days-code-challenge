
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int test_cases;
    char str[10000];
    scanf("%d\n", &test_cases);

    for (int i = 0; i < test_cases; i++)
    {
        // get string input
        scanf("%s", &str);

        for (int i = 0; i < strlen(str); i += 2)
        {
            printf("%c", str[i]);
        }

        printf(" ");

        for (int i = 1; i < strlen(str); i += 2)
        {
            printf("%c", str[i]);
        }
        printf("\n");
    }

    return 0;
}

// gcc Day-6-Lets-Review/main.c -o main ./Day-6-Lets-Review/main
// if ($?) { gcc main.c -o main } ; if ($?) { .\main }
