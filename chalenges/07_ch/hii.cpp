#include<iostream>
using namespace std;


int sahil(int num1, int num2){
    return num1*num2;
}

int kumar(int num1, int num2){
    return num1+num2;
}

int main(){
    int num1 , num2;
    cout << "enter the num";
    cin >> num1,num2;
   
    cout << kumar(num1, num2)  << " is " << endl;
    cout << "result is: " << sahil(num1, num2);

return 0;
}