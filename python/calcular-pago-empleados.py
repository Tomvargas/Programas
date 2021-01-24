import io #importar la librería para trabajar con ficheros
import os #Módulo os para acceder funcionalidades del sistema operativo

#--------------------------------------------------------------------------- esta función guarda los datos linea por linea
def save(data):
    f = open("Vendedores.bin", "a")
    for i in data:
        f.write(i)
        f.write("\n")
    f.close()

#---------------------------------------------------------------------------lee los datos del fichero
def read():
    lista=[]
    f = open("Vendedores.bin", "r") # abre el archivo
    for lines in f.readlines(): #sentencia para recorrer las lineas del archivo 
        lista.append(lines.rstrip('\n')) # agrega al final de una lista el valor de la linea del fichero sin el salto de linea con la funcion rstrip
    f.close() # cerrar el archivo
    
    #regresa la lista de valores obtenidos del fichero
    return lista

#-------------------------------------------------------------------------- valida que el dato contenga solamente digitos
def onlyn(var):
    return var.isdigit()

#-------------------------------------------------------------------------- registra los vendedores y los guarda en el fichero
def R_vend():
    v=1
    data=[]
    
    while(v==1):
        os.system("cls")
        
        while(v==1):
            cod=input("Codigo de vendedor: ")
            if onlyn(cod)==True:
                data.append(cod)
                v=0
            else:
                print("El codigo solo debe contener numeros.\n")
        
        data.append(input("Nombre del vendedor: "))

        v=1
        while(v==1):
            lvl=input("Nivel de vendedor (1 - 2 - 3): ")
            if onlyn(lvl)==True:
                if int(lvl) > 0 and int(lvl) < 4:
                    data.append(lvl)
                    v=0
                else:
                    print("El nivel del vendedor solo puede ser entre 1 y 3.")
            else:
                print("El nivel debe ser un dato numerico (1 - 2 - 3).\n")
        
        v=1
        while(v==1):        
            try:
                data.append(str(float(input("Monto vendido: "))))
                v=0
            except:
                print("Entrada incorrecta...")
        
        v=1
        while(v==1):
            op=input("Desea ingresar otro vendedor? (1=si | 0=no): ")
            if onlyn(op)==True:
                v=0
            else:
                print("Opcion Erronea.\n")

        save(data) #guarda el vendedor

        v=1
        if op == "0":
            v=0

#------------------------------------------------------------------------------ devuelve el sueldo segun un parámetro recivido
def sueldo(s):
    if s == 1:
        S=400.0
    elif s == 2:
        S=500.0
    elif s==3:
        S=600.0
    else:
        S=0
    return S

#------------------------------------------------------------------------------- devuelve un valor booleano false o true si el empleado merece un bono
def bono(valu):
    data=read()
    mon=[]  
    for i in range(3,len(data),4):
        mon.append(float(data[i]))
    nmax=max(mon)
    if valu == nmax:
        return True
    else:
        return False

#------------------------------------------------------------------------------ Lee los registros y calcula el pago corespondiente a cada vendedor
def pago():
    data=read()
    pagos=[]
    for i in range(0,len(data),4):
        print("\n")
        print("===============================")
        print("Codigo: ", data[i])
        print("Nombre: ", data[i+1])
        print("Nivel: ", data[i+2])
        print("Monto vendido: ", data[i+3])
        s=sueldo(int(data[i+2]))
        ad=(float(data[i+3])*5)/100
        if bono(float(data[i+3]))==True:
            s+=100
        pag=s+ad
        print("Por pagar: ", pag)
        pagos.append(pag)
        print("===============================")
        print("\n")

    tot=0
    for i in pagos:
        tot+=i
    
    print("Total por pagar: $", tot)
    print("===============================")

#------------------------------------------------------------------------------------ bloque de código principal
v=1
while(v==1):
    os.system("cls")
    print("\t### EMPRESA ANONIMUS ###")
    print("1) Registrar vendedores.\n2) Monto de pago.\n3) Salir.")
    v=1
    while(v==1):
        try:
            op=int(input("Ingrese una opcion: "))
            v=0
        except:
            print("Entrada invalida.")
    
    v=1
    if op==1:
        R_vend()
    elif op==2:
        pago()
        input()
    elif op==3:
        v=0
        input("bye...")
    else:
        input("Opcion incorrecta, intente de nuevo.")
       