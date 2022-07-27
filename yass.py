
matriz=[]
matriz1=[]


for i in range (0,9,1):
    for j in range(0,9,1):
        matriz1.append("")
    matriz.append(matriz1)
    matriz1=[]

for i in range (0,9,1):
    for j in range(0,9,1):
        matriz[i][j]="-"

i=4
for j in range(0,9,1):
    matriz[i][j]="o"

j=4

for i in range (0,9,1):
    matriz[i][j]="o"

for i in matriz:
    print(i)