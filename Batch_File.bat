set ProjectLocation=C:\Users\Girish\eclipse-workspace\DOCNU
cd %ProjectLocation%
set classpath=%ProjectLocation%\bin;%ProjectLocation%\lib*
java org.testng.TestNG %ProjectLocation%\TestNG.xml
pause