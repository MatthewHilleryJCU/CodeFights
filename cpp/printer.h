#include <iostream>
using namespace std;

template <typename T>
void printer(T t) 
{ 
    cout << t << endl;
}

template <typename T, typename ...U>
void printer(T t, U ...u)
{
  cout << t;
  printer(u...);
}