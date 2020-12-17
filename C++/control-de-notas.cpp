/*-----------------------------------------------------------------------------*
	== ESPECIFICACIONES ==

	** CONTROL DE NOTAS **
	-> Ingresar las notas del estudiante.
	-> Obtener el promedio y mostrar mensaje de estado del estudiante.
	-> Mostrar el mejor estudiante y el peor de la clase.
*-----------------------------------------------------------------------------*/
#include <iostream>
#include <conio.h>
using namespace std;

/*-----------------------------------------------------------------------------*
	=== variables globales ===
*-----------------------------------------------------------------------------*/
int num_est;
string nombre[45];
int p1[45][5], ex1[45][5], p2[45][5], ex2[45][5]; //notas de la matriz
float promedio[45][5];//promedio de la matriz

/*-----------------------------------------------------------------------------*

	### FUNCIONES ###

*-----------------------------------------------------------------------------*/

/*-----------------------------------------------------------------------------*
	=== FUNCION MENU PRINCIPAL ===
*-----------------------------------------------------------------------------*/
void menu()
{
	system("cls");//LIMPIAR PANTALLA

	cout<<"\t***** CONTROL DE NOTAS *****"<<endl;
	cout<<"1) Ingresar estudiante."<<endl;
	cout<<"2) Promedio de los estudiantes."<<endl;
	cout<<"3) Promedio general del curso."<<endl;
	cout<<"4) Mejor y peor estudiante."<<endl;
	cout<<"5) Salir."<<endl;
	cout<<" -> INGRESE UNA OPCION: ";
}

/*-----------------------------------------------------------------------------*
	=== FUNCION INGRESAR ESTUDIANTES ===
*-----------------------------------------------------------------------------*/
void ingresar()
{
	int numest, i;

	estudiantes:  //etiqueta identificadora para "goto"
	system("cls");

	cout<<endl<<"-> Cuantos estudiantes desea ingresar? ";
	cin>>numest;

		if(numest>45)
		{
			cout<<"no puede haber mas de 45 estudiantes. vuelva a intentar."<<endl;
			system("pause");

			goto estudiantes;//ir a la etiqueta "estudiantes"
		}
		else
		{
			num_est=numest;
			for(i=1; i<=numest; i++)
			{
				system("cls");
					cout<<"\t\t*** ESTUDIANTE "<<i<<" ***"<<endl;
					cout<<"-> nombre del estudiante: ";
					cin>>nombre[i];
					cout<<"-> nota academica del primer parcial: ";
					cin>>p1[i][1];
					cout<<"-> nota del examen del primer parcial: ";
					cin>>ex1[i][2];
					cout<<"-> nota academica del segundo parcial: ";
					cin>>p2[i][3];
					cout<<"-> nota del examen del segundo parcial: ";
					cin>>ex2[i][4];

					promedio[i][5]=(((p1[i][1]+ex1[i][2])/2) + ((p2[i][3]+ex2[i][4])/2))/2;
					system("pause");
			}
		}
}

/*-----------------------------------------------------------------------------*
	=== FUNCION PRROMEDIO DE ESTUDIANTES ===
*-----------------------------------------------------------------------------*/
void promest()
{
	int op2, i;
	prom:

	system("cls");
	cout<<"*** promedio de los estudiantes ***"<<endl;
	for(i=1; i<=num_est; i++)
	{
		cout<<"-> "<<i<<") "<<nombre[i]<<endl;
	}

	cout<<"-> Ingresar el numero de estudiante o ingrese 0 para ir al menu principal."<<endl;
	cin>>op2;

	if(op2>num_est)
	{
		cout<<" -- Ingrese un numero correcto --"<<endl;
		system("pause");
		goto prom;
	}

	if(op2==0)
	{
		goto exit;
	}

	cout<<"\t*************************************"<<endl;
	cout<<"\t-> Nombre: "<<nombre[op2]<<endl;
	cout<<"\t-> Nota academica parcial 1: "<<p1[op2][1]<<endl;
	cout<<"\t-> Nota del examen parcial 1: "<<ex1[op2][2]<<endl;
	cout<<"\t-> Nota academica del parcial 2: "<<p2[op2][3]<<endl;
	cout<<"\t-> Nota del examen parcial 2: "<<ex2[op2][4]<<endl;
	cout<<"\t-> Nota del promedio total: "<<promedio[op2][5]<<endl;

	if(promedio[op2][5]>=7)
	{
		cout<<"\t-> El estudiante aprobo."<<endl;
	}

	if(promedio[op2][5]>=5 && promedio[op2][5]<7)
	{
		cout<<"\t-> El estudiante va a mejoramiento."<<endl;
	}

	if(promedio[op2][5]<5)
	{
		cout<<"\t-> el estudiante reprobo."<<endl;
	}
	cout<<"\t*************************************"<<endl;

	system("pause");
	goto prom;
	exit:
	system("pause");
}

/*-----------------------------------------------------------------------------*
	=== FUNCION PROMEDIO TOTAL ===
*-----------------------------------------------------------------------------*/
void promediot()
{
	int i;
	float promd=0;

	cout<<"**** PROMEDIO TOTAL DEL CURSO ****"<<endl;

	for(i=1; i<=num_est; i++)
	{
		promd=promd+promedio[i][5];
	}
	promd=promd/num_est;
	cout<<"\t-- "<<promd<<" --"<<endl;
	system("pause");
}

/*-----------------------------------------------------------------------------*
	=== FUNCION MEJOR Y PEOR ESTUDIANTE ===
*-----------------------------------------------------------------------------*/
void est()
{
	float cont1, cont2;
	int aux1=1, aux2=1, i;

	cont1=promedio[1][5];
	cont2=promedio[1][5];

	for(i=1; i<=num_est; i++)
	{
		if(promedio[i][5]>cont1)
		{
			cont1=promedio[i][5];
			aux1=i;
		}
        
        if(promedio[i][5]<cont2)
		{
			cont2=promedio[i][5];
			aux2=i;
		}
    }
    
	if(cont1==cont2)
	{
		cout<<"\t-> NO  HAY MEJOR NI PEOR ESTUDIANTE, TODOS TIENEN UN PROMEDIO DE "<<cont1<<endl;
	}
	else
	{
		cout<<"\t\t*** MEJOR ESTUDIANTE ***"<<endl;
		cout<<"\t-> El mejor estudiante es: "<<nombre[aux1]<<" con un promedio de "<<cont1<<endl;

		cout<<"\t\t*** PEOR ESTUDIANTE ***"<<endl;
		cout<<"\t-> El peor estudiante es: "<<nombre[aux2]<<" con un promedio de "<<cont2<<endl;
	}
	system("pause");
}

/*-----------------------------------------------------------------------------*

	### FUNCION PRINCIPAL ###

*-----------------------------------------------------------------------------*/
main()
{
	system("color 0A");
	int op;
	menu:
	menu();
	cin>>op;

	if(op>5)
	{
		cout<<"\t-> Opcion incorrecta, vuelva a intentar."<<endl;
		system("pause");
		goto menu;
	}

	switch(op)
	{
		case 1:
			ingresar();
		break;

		case 2:
			promest();
		break;

		case 3:
			promediot();
		break;

		case 4:
			est();
		break;

		case 5:
		goto ext;
	}

	goto menu;
	ext:		//etiqueta para salir del programa
	system("pause");
}
