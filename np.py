import numpy as np
figuras=np.full((9,9),"-")
figuras[4]="o"
figuras[:,4]="o"
patron=figuras.tolist()

for d in range (9):
    for f in range (9):
        print(patron[d][f], end='  ')
    print()