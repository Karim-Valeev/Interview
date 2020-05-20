
dic = {
    'name' : 'Karim',
    'sername' : 'Valeev',
    'email' : 'karim.valeev.i@gmail.com',
    'git' : 'https://github.com/Karim-Valee',
    'birthday' : '01.01.2001'
}

print("List of commands: name; sername; email; git; birthday; \n")

while(true):
    command = input("Enter command: ").strip().lower()
    if command == "exit":
        print('Bye-bye.')
        return
    print(dic[command],"\n")
