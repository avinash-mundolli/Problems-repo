def vowel_consonants(n):
    vowels=""
    const=""
    i=0
    while i<len(n):
        ch=n[i]
        
        if ch.isalpha():
            if ch.lower() in "aeiou":
                vowels=vowels+ch+" "
            else:
                const=const+ch+" "
        i+=1
    print("vowels ",vowels)
    print("consonents ",const)

name=input("Enter the name: ")
vowel_consonants(name)