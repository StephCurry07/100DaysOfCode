#include <iostream>
using namespace std;

int paths(int m,int n) {
    // Base condition.
    if(m == 1 || n == 1) {             
        return 1;
    }

    // Recursive call.
    return paths(m - 1, n) + paths(m, n - 1);  

}
 
int main()
{
    int m=6;
    int n=4;
    cout<<"Number of paths is: "<<paths(m,n);
}