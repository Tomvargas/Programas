#Software de sistema
#Lenguaje python
#author Tomas vargas

#sistema para ver la hora y la fecha actual

from datetime import date
from datetime import datetime

print("## SOFTWARE DE SISTEMA ##")

td = date.today()
now = datetime.today()
name=input("Hola, ingresa tu nombre para brindarte los datos de fecha y hora de tu sistema:")
print("Hola ", name, " aqui esta la hora y fecha de tu sistema.")
print("Hora {}:{}".format(now.hour, now.minute))
print("Fecha {}/{}/{}".format(now.day, now.month, now.year))
print(">> La fecha y hora actual se obtuvo del sistema por medio de las librerias importadas al inicio del código fuente.")

input()

