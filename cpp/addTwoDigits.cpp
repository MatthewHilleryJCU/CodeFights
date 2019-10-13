#include <iostream>

int addTwoDigits(int n) {
    int k = n % 10;
    int x = (n-k)/10;
    std::cout << x+k;

    return 0;
}

int main()
{
    addTwoDigits(50);
    return 0;
}
