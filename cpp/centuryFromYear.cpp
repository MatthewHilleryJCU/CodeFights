#include "printer.h"

int centuryFromYear(int year) {
    return (year-1)/100 + 1;
}

int main()
{
   printer(centuryFromYear(1905));
   return 0;
}