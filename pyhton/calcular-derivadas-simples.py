#Software para la ingeniería
#@author Tomas Vargas

from sympy import *

print('## operadores ##\n1) Exponente **\n2) Multiplicacion *\n3) Suma +\n4) Resta -\n## Recomendaciones ##\n1) para una expresion utilizar la forma base a*X**b+X-c')

n=input('ingrese el numero de derivada que desea operar: ')

f=input('Ingrese una función f(x): ')

print('Derivada: ', diff(f,'x',n))

