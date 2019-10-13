#include <iostream>


int initials()
{
    std::string first_initial = "M";
    std::string second_initial = "H";

 
    std::cout << "M       M      H       H\n";
    std::cout << "M M   M M      H       H\n";
    std::cout << "M   M   M      H       H\n";
    std::cout << "M       M      H H H H H\n";
    std::cout << "M       M      H       H\n";
    std::cout << "M       M      H       H\n";
    std::cout << "M       M      H       H\n";

    return 0;
}

int main()
{
   initials();
    return 0;
}