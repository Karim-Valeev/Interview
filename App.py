
dic = {
    'name' : 'Karim',
    'sername' : 'Valeev',
    'email' : 'karim.valeev.i@gmail.com',
    'git' : 'https://github.com/Karim-Valee',
    'birthday' : '01.01.2001'
}

print("List of commands: name; sername; email; git; birthday; \n")

while(True):
    command = input("Enter command: ").strip().lower()
    if command == "exit":
        print('Bye-bye.')
        break
    if command not in dic:
        print("Unknown command...\n")
    else:
        print(">> ",dic[command],"\n")
