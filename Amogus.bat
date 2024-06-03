@echo off
 
rem Limpar a tela
cls
 
rem Exibir data e hora atual
echo Data e Hora Atual:
echo %DATE% %TIME%
echo.
 
rem Salvar o diretório atual
set "diretorio_atual=%CD%"
 
rem Procurar a pasta api em System32
for /r "%SystemRoot%\System32" %%d in (api) do (
    set "pasta_api=%%d"
    goto :encontrado
)
 
:encontrado
rem Exibir o caminho da pasta api encontrada
echo A pasta API foi encontrada em: %pasta_api%
echo.
 
rem Voltar para o diretório anterior
cd /d "%diretorio_atual%"
 
pause