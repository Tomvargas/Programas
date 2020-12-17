"""
ingresar un numero y determinar si es primo o no, el programa termina cuando no
se desee ingresar mas, se debe mostrar cuantos numeros primos fueron ingresados
y la suma de los numeros primos
"""
opcion=1
contador=0
sumat=0
numtot=1

def primos(n):
	a=0 #----------------------auxiliar que ayuda a determinar cuantas veces es divisible un numero
	for i in range(1,n+1):
		if(n % i==0): #--------condicion para saber si un numero es divisible mas de 2 veces
	 		a=a+1
	if(a!=2): #----------------si el numero fue divisible mas de dos veces no puede ser primo
		print("No es primo")
		return False #--------------------------devuelve un valor falso
	else: #----------------------quiere decir que si un numero es divisible unicamente para 2 numeros, es primo
		print("Si es primo")
		return True #--------------------------devuelve un valor verdadero

while opcion!=0: #-------------------el bucle se repetira hasta que apachurremos la opcion NO (0)
	n=int(input("Ingrese el numero: "))
	if primos(n)==True: #------Esta condicion nos permite evaluar la funcion y si nos devuelve un TRUE se ejecutara el codigo
		contador+=1
		sumat=sumat+n
	opcion=int(input("Desea ingresar un nuevo valor? (SI=1 / NO=0): "))
	if opcion==1:
		numtot+=1

print("El total de numeros ingresados es:  ",numtot)
print ("En total hay ", contador, " numeros primos")
print("La suma total de los numeros primos es : ", sumat)
input()
