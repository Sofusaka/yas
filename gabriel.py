patron=[]

for i in range(9):
    col=[]
    for j in range(9):
        if j ==4 or i==4:
            col.append('o'
            )

        else:
            col.append("-")

    patron.append(col)

for i in range(9):
    print("")
    for j in range(9):
        print(patron[i][j], end="  ")


