
#include <stdio.h>
#include <stdlib.h>

int main(int argc, char **argv)
{
	int   a = 3;
	float f = 3.14;

	int* p = malloc(10*sizeof(int));
	char str[100];
	free(p);

	return 0;
}

