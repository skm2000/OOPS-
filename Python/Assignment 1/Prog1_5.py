

def matrixMultiplication(mat1, mat2):

    row1 = len(mat1)
    col1 = len(mat1[0])

    row2 = len(mat2)
    col2 = len(mat2[0])

    if col1 != row2:
        print("matrix multiplication cannot be performed")
    elif row1 == 0 or col1 == 0 or row2 == 0 or col2 == 0 :
        print("bad input! Multiplication cannot be performed")
    else:
        
        #initializing the result matrix
        result = [[0 for i in range(col2)] for j in range(row1)]

        for i in range(row1):
            for j in range(col2):
                for k in range(row2):
                    result[i][j] += mat1[i][k] * mat2[k][j]

        for row in result:
            print(row)


if __name__ == "__main__":

    mat1 = [
        [1,2,3],
        [4,5,6],
        [7,8,9]
    ]

    mat2 = [
        [1,2],
        [3,4],
        [5,6]
    ]

    matrixMultiplication(mat1, mat2)