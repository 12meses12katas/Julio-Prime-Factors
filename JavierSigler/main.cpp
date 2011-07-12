#include <iostream>

#include "include/primeFactors.hpp"

using namespace std;

int main()
{

    cout << "Using execution time" << endl;
    for(unsigned int number = 2; number < 25; ++number)
    {
        cout << "Number: " << number << " ";
        const std::list<int> listOfNumbers = primeFactors::generate(number);
        for(std::list<int>::const_iterator it = listOfNumbers.begin(); it != listOfNumbers.end(); ++it)
            cout << *it << "*";
        cout << endl;
    }

    cout << "Using compilation time. First Primer Number" << endl;
    cout << "Number: 2 = " << firstPrimeNumber<2>::Result << endl;
    cout << "Number: 3 = " << firstPrimeNumber<3>::Result << endl;
    cout << "Number: 4 = " << firstPrimeNumber<4>::Result << endl;
    cout << "Number: 5 = " << firstPrimeNumber<5>::Result << endl;
    cout << "Number: 6 = " << firstPrimeNumber<6>::Result << endl;
    cout << "Number: 7 = " << firstPrimeNumber<7>::Result << endl;
    cout << "Number: 8 = " << firstPrimeNumber<8>::Result << endl;
    cout << "Number: 9 = " << firstPrimeNumber<9>::Result << endl;
    cout << "Number: 1234123413241 = " << firstPrimeNumber<1234123413241>::Result << endl;

    cout << "Using compilation time. Two First Primer Numbers" << endl;
    cout << "Number: 2 = " << firstPrimeNumber<2>::Result << "*" << firstPrimeNumber<2/firstPrimeNumber<2>::Result>::Result << endl;
    cout << "Number: 3 = " << firstPrimeNumber<3>::Result << "*" << firstPrimeNumber<3/firstPrimeNumber<3>::Result>::Result << endl;
    cout << "Number: 4 = " << firstPrimeNumber<4>::Result << "*" << firstPrimeNumber<4/firstPrimeNumber<4>::Result>::Result << endl;
    cout << "Number: 5 = " << firstPrimeNumber<5>::Result << "*" << firstPrimeNumber<5/firstPrimeNumber<5>::Result>::Result << endl;
    cout << "Number: 6 = " << firstPrimeNumber<6>::Result << "*" << firstPrimeNumber<6/firstPrimeNumber<6>::Result>::Result << endl;
    cout << "Number: 7 = " << firstPrimeNumber<7>::Result << "*" << firstPrimeNumber<7/firstPrimeNumber<7>::Result>::Result << endl;
    cout << "Number: 8 = " << firstPrimeNumber<8>::Result << "*" << firstPrimeNumber<8/firstPrimeNumber<8>::Result>::Result << endl;
    cout << "Number: 9 = " << firstPrimeNumber<9>::Result << "*" << firstPrimeNumber<9/firstPrimeNumber<9>::Result>::Result << endl;
    cout << "Number: 1234123413241 = " << firstPrimeNumber<1234123413241>::Result << "*" << firstPrimeNumber<1234123413241/firstPrimeNumber<1234123413241>::Result>::Result << endl;

    return 0;
}
