#include "printer.h"

int add(int param1, int param2) {
    return param1 + param2;
}

int main()
{
   printer(add(1, 2));
   return 0;
}