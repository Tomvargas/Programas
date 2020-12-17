#Software para gestion
#@author Tomas Vargas

import os

print('## Facturacion ##\n====================\n')
name=input('Nombre: ')
Ci=input('CI: ')
fecha=input('Fecha: ')
print('====================')
print('## Compra ##')
prod=[]
op='y'
while(op=='y'):
    print('====================')
    p=[]
    p.append(input('Id del producto: '))
    p.append(input('Nombre de producto: '))
    p.append(input('Cantidad del producto: '))
    p.append(input('Precio unitario: '))
    prod.append(p)
    op=input('Desea agregar otro producto a la fctura? (y/n): ').lower()
    
opf=input('¿Desea imprimir la factura? (y/n): ')
os.system("cls")
print('====================\n## FACTURA ##\n====================\n')
print('Nombre: ', name, '\nCI: ', Ci, '\nFecha: ', fecha, '\n')
sum=0
for i in prod:
    print('\n====================')
    print('Id: ', i[0], '\nNombre de producto: ', i[1], '\nCantidad: ', i[2], '\nPrecio unitario: ', i[3])
    sum+=float(i[3])*float(i[2])
print('\n====================')
print('>> Total a pagar: ', sum)
