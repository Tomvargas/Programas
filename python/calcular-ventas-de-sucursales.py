#Software para el area cientifica
#@author Tomas Vargas

ciudades = int(input("-> En cuantas ciudades hay sucursales?: "))
venta_total = 0
for i in range(0, ciudades):
	print("\t-<<<CIUDAD ", i+1, ">>>-")
	t = int(input("-> cuantas tiendas hay en esta ciudad?: "))
	venta_ciudad = 0

	for j in range(0, t):
		print("\n", "\t-<<TIENDA ", j+1, ">>-")
		n = int(input("-> cuantos empleados hay en la tienda?: "))
		venta_local = 0

		for k in range(0, n):
			print("\n", "\t-<EMPLEADO ", k+1, ">-")
			venta = int(input("-> ingrese el monto de ventas realizadas: "))
			venta_local += venta

		print("\n", "\t-> ventas realizadas en la tienda ",
		      j+1, ": $", "{0:.2f}".format(venta_local))

		venta_ciudad += venta_local

	print("\n", "\t\t-> ventas realizadas en la ciudad ",
	      i+1, ": $", "{0:.2f}".format(venta_ciudad))

	venta_total += venta_ciudad

print("\n", "\t-> ventas totales: $", "{0:.2f}".format(venta_total), "\n")
input()
