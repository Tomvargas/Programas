#Software para el area cientifica
#@author Tomas Vargas

def especialista():
    print('Indique si está indicado realizar AMO')
    op = input('\t1) si\n\t2) no\n> ingrese una opcion: ')
    if int(op) == 1:
        bl = input('¿Existe precencia de blastos? (y/n)')
        if bl.lower() == 'y':
            print('Su paciente tiene leucemia aguda.')
        elif bl.lower() == 'n':
            print('Su paciente no padece de leucemia aguda.\nPorfavor investigar si puede ser: \n - Anemia aplastica\n - Neoplasia\n - Infeciones\n - Hemofagositosis\n - Enfermedad por atesoramiento\n - Drogas\n>> Gracias por realizar su consulta de diagnostico.')

    elif int(op) == 2:
        print('Su paciente no padece de leucemia aguda.\nPorfavor investigar si puede ser:\n- infeccion\n- Anemias hemoliticas\n- Altercion inmunologica\n- Neoplasias\n>> Gracias por realizar su consulta de diagnostico.')
    else:
        print('Debe ingresar una opción establecida.')


print('** DIAGNOSTICO TEMPRANO U OPORTUNO DE LEUCEMIA AGUDA **')
print('Seleccione las opciones que se ajusten a la situcion de su paciente.')
print('====================================================================')
print('\nSintoma principal:')
print('\n\t1) Palidez\n\t2) Fiebre\n\t3) Dolor oseo\n\t4) Dolor general\n\t5) Ninguna')
op = input('> Ingrese una opcion: ')
if int(op)==5:
    print('\tSu paciente Solo padece ese sintoma o debe diagnosticarlo de otra posible enfermedad.')
elif int(op)<1 or int(op)>5:
    print('\tPor favor, ingrese solo una de las opciones planteadas.')
else:
    print('Porfavor, hacer una exploracion fisica del paciente e indique si existe alguno de estos signos: ')
    print('\n\t1) Adenomegalias\n\t2) Heptomegalia\n\t3) Esplenomegalia\n\t4) Rastros de sangrado\n\t5) Lesiones infiltrtivas\n\t6) Ninguna')
    op = input('> Ingrese una opcion: ')
    if int(op) == 6:
        print('\tSu paciente Solo padece ese sintoma o debe diagnosticarlo de otra posible enfermedad.')
    elif int(op) < 1 or int(op) > 6:
        print('\tPor favor, ingrese solo una de las opciones planteadas.')
    else:
        print('Relice una biometria hematica e indique si el resultado es normal o no...')
        print('\n\t1) Normal\n\t2) Fuera de lo comun')
        op = input('> Ingrese una opcion: ')
        if int(op)==1:
            print('## PROCEDIMIENTO ##\n- Descartar patologias mas frecuentes de a cuerdo al grupo etareo.\n- Realizar los estudios confirmtorios apropiados\n- Aplicar tratamiento durante 15 dias')
            tr=input('Pasado los 15 dias, ¿hay mejoras en el paciente? (y/n): ')
            if tr.lower()=='y':
                print('Su paciente se ha recuperado, puede dar el alta.')
            elif tr.lower()=='n':
                print('El paciente se transfiere al especialista...')
                especialista()
            else:
                print('Debe ingresar una opción establecida.')
        elif int(op)==2:
            print('El paciente se transfiere al especialista...')
            especialista()
        else:
            print('Debe ingresar una opción establecida.')

input()