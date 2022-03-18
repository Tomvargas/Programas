#LEER EL PRIMER PRINT, SON LAS INTRUCCIONES PARA QUE EL USUARIO PUEDA INGRESAR LA FUNCIÓN EN EL FORMATO CORRECTO
#@author Tomas Vargas

import diff from sympy

print('## operadores ##\n1) Exponente **\n2) Multiplicacion *\n3) Suma +\n4) Resta -\n## Recomendaciones ##\n- para una expresion utilizar la forma base a*X**b+X-c')

# py -m pip install sympy
import diff from sympy

n=input('ingrese el numero de derivadas que desea operar: ')

f=input('Ingrese una función f(x): ')

print('Derivada: ', diff(f,'x',n)) 

#Llama la función diff de la librería sympy que calcula automáticamente la función dada
