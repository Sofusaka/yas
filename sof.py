import msvcrt

print("============Figuras en Python============")
print("")
max = 9
fig = []
fig1=[]

for a in range (9):
    for l in range(0,9,1):
        fig1.append("")
    fig.append(fig1)
    fig1=[]
 
for a in range(9) :
        for l in range(9) :
            fig[a][l] = '-'

for a in range(9):
    fig[a][4]='o'

for a in range (9):
    fig[4][a]='o'

for a in range (9):
    for l in range (9):
        print(fig[l][a], end='  ')
    print()


msvcrt.getch()