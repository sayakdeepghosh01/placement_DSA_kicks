def combination(arr, n):
    
    count = 0
    for i in range(n):
        s = str(arr[i])
        for j in range(i + 1, n):
            s += str(arr[j])
            if s[0] != arr[j]:
                for k in range(j + 1, n):
                    if s[1] != arr[k]:
                        count += 1
            s = str(arr[i])
    return count

if name == "main":
    ashok = input()
    anand = input()
    as_arr = list(ashok)
    an_arr = list(anand)

    count_ash = combination(as_arr, len(as_arr))
    count_ana = combination(an_arr, len(an_arr))

    if count_ash == 0 and count_ana == 0:
        print("Invalid input")
    elif count_ash > count_ana:
        print("Ashok")
    elif count_ana > count_ash:
        print("Anand")
    else:
        print("Draw")