#include <InetConstants.au3>
#include <MsgBoxConstants.au3>
#include <WinAPIFiles.au3>

; InetGet downloads a file in the background.
; The AutoIt script checks in a loop for the download to complete.

Example()

Func Example()
        ; Save the downloaded file to the temporary folder.
        Local $sFilePath = $cmdLine[1]

        ; Download the file in the background with the selected option of 'force a reload from the remote site.'
        Local $hDownload = InetGet($cmdLine[2], $sFilePath, $INET_FORCERELOAD)
	
EndFunc   ;==>Example
