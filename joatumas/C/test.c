#include <stdlib.h>
#include <stdio.h>

#include "pflib.h"

int factors[MAX_FACTORS];

int equal_vectors(int *vect1, int *vect2){
	int i = 0;
	while(vect1[i] == vect2[i]){
		if(vect1[i] == 0){
			return(0);
		}else{
			i++;
		}
	}
	//Found difference
	return(1);
}

int test2(){
	int res[MAX_FACTORS] = {2,1,0};
	prime_factors(2, factors);
	return(equal_vectors(res, factors));
}


int test1(){
	int res[MAX_FACTORS] = {1,0};
	prime_factors(1, factors);
	return(equal_vectors(res, factors));
}

int test10(){
	int res[MAX_FACTORS] = {2,5,1,0};
	prime_factors(10, factors);
	return(equal_vectors(res, factors));
}

int main(){
	if(test1()){
		fprintf(stderr, "Error en el test 1\n");
		exit(1);
	}
	if(test2()){
		fprintf(stderr, "Error en el test 2\n");
		exit(1);
	}
	if(test10()){
		fprintf(stderr, "Error en el test 10\n");
		exit(1);
	}
	fprintf(stdout, "Tests passed\n");
	exit(0);
}
