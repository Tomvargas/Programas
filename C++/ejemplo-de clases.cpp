#include<iostream>

using namespace std;

class Person{
    public:
        string name;
        string dir;
        string prof;
};

main(){
    system("color 0b");
    Person obj; //objeto
    int op;
    cp:
        system("cls");
        cout<<endl<<"\tIngresa un nuevo nombre: "; cin>>obj.name;
        cout<<"\tIngresa la direccion de "<<obj.name<<": "; cin>>obj.dir;
        cout<<"\tIngresar la profecion de "<<obj.name<<": "; cin>>obj.prof;
        cout<<endl<<"\t"; system("pause");
        system("cls");
        cout<<"\n================================================"<<endl;
        cout<<"\t\tMOSTRAR PERSONA"<<endl;
        cout<<"\tNombre: "<<obj.name<<endl;
        cout<<"\tDireccion: "<<obj.dir<<endl;
        cout<<"\tprofecion: "<<obj.prof<<endl;
        cout<<"\n================================================"<<endl;
        cout<<"\t\tDesea ingresar otra persona? (si=1/no=0) "; cin>>op;
    if (op==1)
        goto cp;
    
    system("pause");
}