#include <iostream>
#include <stdio.h>
#include <string>

using namespace std;

int printlist(int n, int lista[100]){
    for(int i=0; i<n; i++){  
        cout<<"POSICION  |  NUMERO"<<endl;      
        cout<<"   "<<i<<"\t       "<<lista[i]<<endl;
    }
}

void printmenu(){
    cout<<"== MENU DE OPCIONES =="<<endl;
    cout<<"1) Insertar otro numero al final de la lista."<<endl;
    cout<<"2) Insertar otro numero al inicio de la lista."<<endl;
    cout<<"3) Eliminar un numero dada una posición especifica."<<endl;
    cout<<"4) Buscar un numero."<<endl;
    cout<<"5) Mostrar todas los numeros ingresados."<<endl;
    cout<<"6) Salir."<<endl;
}

int validsize(int n){
    int r;
    if (n>99){
        cout<<"La lista esta llena, no puede ingresar mas numeros..."<<endl;
        r=0;
    }
    else{
        r=1;
    }
    return r;
}

int main(){
    int lista[100];
    int n, valid=1;
    cout<<"## INGRESAR DATOS EN LA LISTA ##"<<endl;
    while(valid==1){
        cout<<"Indique cuantos numeros va a ingresar: "; cin>>n;
        if(n>100){
            cout<<"No puede ingresar más de 100 numeros..."<<endl;           
        }else{
            valid=0;
            for (int i=0; i<n;i++){
                cout<<i+1<<") Ingrese un numero: "; cin>>lista[i];
            }
            printlist(n,lista);

            int op;
            valid=0;            
            do {
                system("cls");                
                printmenu();
                cout<<"Ingrese el numero de una opcion: ";
                cin>>op;
                switch(op){
                    case 1:
                        if (validsize(n)==1){
                            n+=1;
                            cout<<"Ingrese el numero: ";
                            cin>>lista[n-1];                            
                        }
                                                
                    break;

                    case 2:
                        if(validsize(n)==1){
                            int newnum;
                            n+=1;
                            cout<<"Ingrese el numero: "; cin>>newnum;
                            for (int i=n-1; i>=0; i--){
                                lista[i]=lista[i-1];
                            }
                            lista[0]=newnum;
                        }
                        
                    break;

                    case 3:
                        int pos;
                        do{
                            cout<<"Ingrese la posicion del numero que desea eliminar: ";
                            cin>>pos;
                            if(pos>(n-1)||pos<0)
                                cout<<">>Ingrese una posicion valida!!!"<<endl;
                        }while(pos>(n-1)||pos<0);

                        for(int i=pos;i<n;i++)
                        {
                            lista[i]=lista[i+1];
                        }
                        n--;                        
                    break;

                    case 4:
                        int pos1;
                        cout<<"Ingrese la posición del numero que desea buscar: "; cin>>pos1;
                        if (pos1>n-1 || pos1<0){
                            cout<<"La posicion ingresada no existe...";
                            system("pause");
                        }else{
                            cout<<"Posición  |  Numero"<<endl;
                            cout<<"   "<<pos1<<"         "<<lista[pos1]<<endl;
                            system("pause");
                        }
                        
                    break;

                    case 5:
                        printlist(n,lista);
                        system("pause");
                    break;

                    case 6:
                        return 0;
                    break;

                    default:
                        cout<<"La opción ingresada no es correcta, por favor intente de nuevo..."<<endl;
                    break;
                } 

            }while(valid==0);
            
            //printlist(n,lista);
        }
    }

    

    return 0;
}