#include "pflib.h"

#define MAX_PRIME_LIST 20

int prime_list[MAX_PRIME_LIST] = {2, 3, 5, 7, 11, 13, 17, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73};

void prime_factors(int number, int *res){
	int i = 0, res_i = 0;
	while(i<MAX_PRIME_LIST && prime_list[i]<=number){
		if(number % prime_list[i]){
			i++;
		}else{
			//we have to anote that number
			res[res_i] = prime_list[i];
			res_i++;
			//reduce original number:
			while((number % prime_list[i]) == 0){
				number = number/prime_list[i];
			}
		}
	}
	res[res_i] = 1;
	res[res_i + 1] = 0;
}
