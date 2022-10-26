print("Ingrese un número entero: ")
x= int(input())
print("Ingrese otro número entero: ")
y= int(input())
print("Ingrese un número decimal: ")
n= float(input())
print("Ingrese otro número decimal: ")
m= float(input())

sumaEnteros= x+y
restaEnteros=x-y
multiplicacionEnteros= x*y
divisionEnteros=x/y
residuoEnteros= x%y
print(" La suma de los enteros es: "+str(sumaEnteros))
print("La resta de los enteros es: "+str(restaEnteros))
print("La multiplicación de los enteros es: "+str(multiplicacionEnteros))
print("La divisón entre los enteros es: "+str(divisionEnteros))
print("El residuo de la divisón es: "+str(residuoEnteros))
sumaDecimales= n+m
restaDecimales=n-m
multiplicacionDecimales=n*m
divisionDecimales=n/m
residuoDecimales= n%m
print("La suma de los decimales es: "+str(sumaDecimales))
print("La resta de los decimales es: "+str(restaDecimales))
print("La multiplicación de los decimales es: "+str(multiplicacionDecimales))
print("La divisón de los decimales es: "+str(divisionDecimales))
print("El residuo de los decimales es: "+str(residuoDecimales))

productoTotal=x*y*n*m
print("El producto total es: "+str(productoTotal))