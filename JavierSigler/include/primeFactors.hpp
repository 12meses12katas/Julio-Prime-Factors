#ifndef PRIMEFACTORS_H
#define PRIMEFACTORS_H


#include <list>

template < bool isPrimeFactor, unsigned int Number, unsigned int Candidate>
struct nextPrimeFactor
{
    static const unsigned int Result = nextPrimeFactor<Number%(Candidate+1)==0, Number, Candidate+1>::Result;
};

template <unsigned int Number, unsigned int Candidate>
struct nextPrimeFactor<true, Number, Candidate>
{
    static const unsigned int Result = Candidate;
};

template <bool isPrimeFactor, unsigned int Candidate>
struct nextPrimeFactor<isPrimeFactor, 1, Candidate>
{
    static const unsigned int Result = 1;
};

template <unsigned int Number>
struct firstPrimeNumber
{
    static const unsigned int Result = nextPrimeFactor<Number%2==0, Number, 2>::Result;
};


struct primeFactors
{
    static std::list<int> generate(int Number)
    {
        std::list<int> primeFactorsList;
        for(unsigned int candidate = 2; Number > 1; ++candidate)
            for(; Number % candidate == 0; Number /= candidate)
                primeFactorsList.push_back(candidate);

        return primeFactorsList;
    }
};

#endif // PRIMEFACTORS_H
