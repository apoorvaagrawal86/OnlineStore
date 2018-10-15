WinWait("[CLASS:32770]","",10)
ControlFocus("FileUpload","","Edit1")
Sleep(2000)
ControlSetText("FileUpload","","Edit1","Lyrics.txt")
Sleep(2000)
ControlClick("FileUpload","","Button1");
