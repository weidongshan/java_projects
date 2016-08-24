
#include <stdio.h>

struct person {
	char *name;
	void (*printName)(struct person *per);
};

void printName(struct person *per)
{
	printf("guangdong %s\n", per->name);
}

int main(void)
{
	struct person p1 = {"zhangsan", printName};
	struct person p2 = {"lisi", printName};

	//printf("%s\n", p1.name);
	//printf("%s\n", p2.name);
	p1.printName(&p1);
	p2.printName(&p2);

	return 0;
}

