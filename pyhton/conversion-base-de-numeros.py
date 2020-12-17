print("## CONVERSION DE NUMEROS ##","\n")
print("1) CONVERSION DE NUMERO EN BASE 10 A DISTINTAS BASES (2, 8, 16)")
print("2) CONVERSION DE NUMEROS EN BASES DISTINTAS A NUMERO EN BASE 10")
op=int(input("-> INGRESE UNA OPCION: "))

if op==1:
	num=int(input("INGRESE EL NUMERO EN BASE DIEZ: "))
	bas=int(input("INGRESE LA BASE A LA CUAL SE VA A CONVERTIR: "))
	c=[]
	if bas==16:
		val=""
		while num!=0:
			x='0123456789ABCDEF'
			c=num%bas
			c1=x[c]
			val=str(c1)+val
			num=int(num//bas)
		print(val)
	elif bas==2 or bas==8:
		while num>0:
			c.insert(0, num%bas)
			num=num//bas
			val=''.join(str(i) for i in c)
		print(val)
	else:
		input("SOLO SE PUEDE INGRESAR BASES DE 2, 8 O 16...")

elif op==2:
	bas=int(input("INDIQUE LA BASE DEL NUMERO QUE SE VA A INGRESAR: "))
	if bas==2:
		num=input("INGRESE EL NUMERO: ")
		val=int(str(num),2)
		print(val)
	elif bas==8:
		num=input("INGRESE EL NUMERO: ")
		val=""
		while num!=0:
			x='0123456789ABCDEF'
			c=num%bas
			c1=x[c]
			val=str(c1)+val
			num=int(num//bas)
		print(val)
	elif bas==16:
		num=input("INGRESE EL NUMERO: ")
		val=int(num, 16)
		print(val)
	else:
		input("!! LA BASE QUE INGRESO NO ESTA DISPONIBLE !!...")
else:
	input("!! LA OPCION QUE INGRESO ES INCORRECTA !!...")

input()
