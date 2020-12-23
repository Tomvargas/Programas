import io
import os

def save(data):
    f = open("libros.txt", "a")
    for i in data:
        for j in i:
            f.write(str(j))
            f.write(' ')
        f.write("\n")
    f.close()

def read():
    lista=[]
    f = open("libros.txt", "r")
    for lines in f.readlines():
        line=lines.rstrip('\n')
        aux=list(line.split(" "))
        aux.pop(-1)
        lista.append(aux)
    f.close()
    return lista

def onlyn(var):
    return var.isdigit()

def newbook():
    books=[]
    v=1
    while v==1:
        os.system("cls")
        print("### REGISTRO DE LIBROS ###\n")
        aux=[]

        while v==1:
            cod=str(input("Ingrese el codigo: "))

            if onlyn(cod)==True:
                v=0
            else:
                print("Codigo invalido...\n")
        v=1

        titulo=input("Ingrese el titulo: ")

        print("\n<< UBICACION >>")
        while v==1:
            est=str(input("Numero de estante: "))
            if onlyn(est)==True:
                v=0
            else:
                print("Entrada invalida...\n")
        v=1

        while v==1:
            fil=str(input("Numero de fila: "))
            if onlyn(fil)==True:
                v=0
            else:
                print("Entrada invalida...\n")
        v=1

        while v==1:
            col=str(input("Numero de columna: "))
            if onlyn(col)==True:
                v=0
            else:
                print("Entrada invalida...\n")
        v=1
        aux.append(cod)
        aux.append(titulo)
        aux.append(est)
        aux.append(fil)
        aux.append(col)

        books.append(aux)

        op=str(input("Desea ingresar otro libro? (SI=1 | NO=0): "))
        if op=="0":
            v=0
        
    save(books)

def consulta():
    books=read()
    print("### CONSULTAR LIBRO ###")
    v=1
    while v==1:
        cod=str(input("Ingrese el codigo: "))
        if onlyn(cod)==True:
                v=0
        else:
                print("Codigo invalido...\n")

    for book in books:
        if cod in book:
            print("======================")
            print("Codigo: ",book[0])
            print("Titulo: ",book[1])
            print("    << UBICACION >>")
            print("Estante: ",book[2])
            print("Fila: ",book[3])
            print("Columna: ",book[4])
            print("======================")
            find=1
        else:
            find=0
    if find==0:
        print("El libro no esta registrado en la biblioteca...")


v=1
while v==1:
    os.system("cls")
    print("### LIBRERIA ###")
    print("1) Agregar libro\n2) Consultar libro\n3) Salir")
    op=str(input("Ingrese una opcion: "))
    if op=="1":
        newbook()
    elif op=="2":
        consulta()
    elif op=="3":
        v=0
    else:
        print("Opcion invalida...")
    input()
