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


int test1(){
	int res[MAX_FACTORS] = {1,0};
	prime_factors(1, factors);
	return(equal_vectors(res, factors));
}

int main(){
	if(test1()){
		fprintf(stderr, "Error en el test 1\n");
		exit(1);
	}
	fprintf(stdout, "Tests passed\n");
	exit(0);
}
