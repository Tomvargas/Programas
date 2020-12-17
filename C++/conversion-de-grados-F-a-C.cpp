#include <iostream>
#include <conio.h>

using namespace std;

main(){
	int F,C;
	
	cout<<"\t### CONVERSION DE GRADOS F A C ###"<<endl;
	cout<<"=============================================="<<endl;
	
	cout<<"> Ingrese el dato en grados F: ";
	cin>>F;
	
	//formula
	C=(F-32)/1.800;
	
	cout<<">> Resultado: "<<F<<" grados F equivalen a "<<C<<" grados C";
	
	getch();
	
}

