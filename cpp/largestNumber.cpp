#include <iostream>

int largestNumber(int n) {
    std::string nine = "9";
    std::string final;
    int nines = 9;
    int k = nines*n ;

    for (size_t i = 1; i < n; i++)
    {
        final.append(nine);
    }

    std::string::size_type sz;
    return std::stoi (final,&sz);
    return 0;
}

int main()
{
    largestNumber(5);
    return 0;
}