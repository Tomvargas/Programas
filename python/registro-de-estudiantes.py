import io
import os

#guarda los datos linea por linea
def save(data,fich,met):
    f = open(fich, met)
    for i in data:
        f.write(i)
        f.write("\n")
    f.close()

#lee los datos sin el salto de linea con la funcion rstrip
def read():
    lista=[]
    f = open("Estudiantes.bin", "r")
    for lines in f.readlines():
        lista.append(lines.rstrip('\n'))
    f.close()
    return lista

def regest():
    est=[]
    v=1
    while v==1:
        os.system("cls")
        print("### REGISTRAR ESTUDIANTE ###\n")
        est.append(input("Nombre: "))
        while v==1:
            try:
                op=int(input("Desea registrar otro estudiante? (SI=1 | NO =0): "))
                v=0
            except:
                print("Opcion invalida...")
        v=1
        if op==0:
            v=0
    save(est,"Estudiantes.bin","a")

def deletest():
    est=read()
    os.system("cls")
    print("### REGISTRAR ESTUDIANTE ###\n")
    e=input("escriba el nombre del estudiante: ")
    if e in est:
        est.pop(est.index(e))
    save(est,"Estudiantes.bin","w")

def consulta():
    est=read()
    print("### CONSULTAR ESTUDIANTE ###\n")
    e=input("Ingrese el nombre del estudiante: ")
    if e in est:
        print("El estudiante ", e, "Si esta registrado.")
    else:
        print(e, " No se encuentra registrado...")

def show():
    est=read()
    print("### MOSTRAR ESTUDIANTES ###\n")
    for i in est:
        print("-> ", i,"\n")

v=1
while v==1:
    os.system("cls")
    print("### CONTROL DE REGISTRO ###")
    print("1) registra estudiante\n2) Eliminar estudiante\n3) Consultar registro\n4) Mostrar registro\n5) Salir")

    op=str(input("Ingrese una opcion: "))
    
    if op=="1":
        regest()
    elif op=="2":
        deletest()
    elif op=="3":
        consulta()
    elif op=="4":
        show()
    elif op=="5":
        v=0
    else:
        print("Opcion invalida...")
    
    input()


