#include <iostream>
using namespace std;
void avance(int* ptr);

int main()
{
  int *p1;
  p1 = nullptr;
  delete(p1);
  cout << " fin " << endl;
  return 0;
}
