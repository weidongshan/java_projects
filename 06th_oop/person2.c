
#include <stdio.h>

struct person {
	char *name;
};

int main(void)
{
	struct person p1 = {"zhangsan"};
	struct person p2 = {"lisi"};

	printf("%s\n", p1.name);
	printf("%s\n", p2.name);

	return 0;
}

