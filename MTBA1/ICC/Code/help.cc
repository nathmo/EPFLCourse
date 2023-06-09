#include <vector>
#include <string>
#include <iostream>
using namespace std;

string tri_insertion (string S);
int calcul_du_nbD(string mot);

int main()
{
  string input;
  cin >> input;
  vector<string> dictionnary;
  for (unsigned int i = 0; i<input.length(); i++)
  {
    input = tri_insertion(input);
  }
  cout << input << endl;
  cout << calcul_du_nbD(input) <<endl;

  while(input != ".");
  {
    dictionnary.push_back(input);
    cin >> input;
    string test = *&*&input;
  }
}


string tri_insertion (string S) {
       size_t j;
       char tmp;

        for (size_t pos(0); pos < S.size(); ++pos)
        {
          tmp = S[pos];
          j = pos;
        }
         
        while (j >= 1 and tmp < S[j-1]) {
          S[j] = S[j-1];
          j = j-1;
        }
          
        S[j] = tmp;
        return S;
}

int calcul_du_nbD(string mot)
{
  int nbD = 1;
  for (unsigned int i = 1; i<mot.length(); i++)
  {
    if (mot.at(i) != mot.at(i-1))
    {
      nbD++;
    }
  }
  return nbD;
}
