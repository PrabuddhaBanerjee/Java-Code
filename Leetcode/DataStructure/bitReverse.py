#   00000010100101000001111010011100
#   00111001011110000010100101000000
#
#
def reverseBits(self, n):
    while(n>0):
        dig = n%10
        print(dig, end='')
        n = n//10

main():
    reverseBits()
