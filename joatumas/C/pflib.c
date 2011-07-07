#include "pflib.h"

int prime_list[20] = {2, 3, 5, 7, 11, 13, 17, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73};

void prime_factors(int number, int *res){
	if(number == 1){
		res[0] = 1;
		res[1] = 0;
	}
}
