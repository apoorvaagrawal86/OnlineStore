Local$hWnd-WinWait("[Class:#32770]", "", 10)
ControlFocus($hWnd,"",Edit1)
Sleep(2000)
ControlSetText($hWnd,"","Edit1","SomeFile.txt")
Sleep(2000)
ControlClick($hWnd,"","Button1")