#include "difference_of_squares.h"

unsigned int square_of_sum(unsigned int n){
    
    unsigned long long sum = (n * (n + 1)) / 2;
    return sum * sum;
}

unsigned int sum_of_squares(unsigned int n){
    unsigned long long sum = (n * (n + 1) * (2 * n + 1)) / 6;
    return sum;
}

unsigned int difference_of_squares(unsigned int n){
    unsigned int result = square_of_sum(n)-sum_of_squares(n);
    return result;
}