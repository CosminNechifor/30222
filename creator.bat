@ECHO OFF
IF "%~1"=="" GOTO invalidUsage
IF "%~2"=="" GOTO invalidUsage

SET fileName=%cd%\%1
SET destinationFolder=%cd%\%2

IF EXIST %fileName% (
		ECHO [INFO] Found source file "%fileName%"
	IF EXIST %destinationFolder% (
		ECHO [INFO] Found destination folder "%destinationFolder%"
	) ELSE (
		ECHO [INFO] Destination folder "%destinationFolder%" not found
		MKDIR %destinationFolder%
		ECHO [INFO] Destination folder "%destinationFolder%" successfully created
	)

	FOR /F "eol=; tokens=* delims= " %%i IN (%fileName%) DO (
		ECHO [INFO] Creating folder with name "%%i"
		MKDIR "%destinationFolder%\%%i"
		COPY %cd%\.gitignore "%destinationFolder%\%%i"
	)

) ELSE (
	ECHO [ERROR] Source file "%fileName%" does not exist
	GOTO end
)

GOTO end

:invalidUsage
ECHO [ERROR] Usage creator ^<sourceFile^> ^<destinationFolder^>
GOTO end

:end