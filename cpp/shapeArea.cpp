#include "printer.h"

int shapeArea(int n) {
     return 2 * n * (n-1) + 1;
}

int main()
{
   std::cout << shapeArea(3);
   return 0;
}