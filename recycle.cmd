@echo off
pushd %JETTY_HOME%
java -DSTOP.PORT=8089 -DSTOP.KEY=stop_jetty -jar start.jar --stop
popd
call mvn -DskipTests prepare-package war:exploded
pushd %JETTY_HOME%
start "JETTY" java -DSTOP.PORT=8089 -DSTOP.KEY=stop_jetty -Xdebug -agentlib:jdwp=transport=dt_socket,address=9999,server=y,suspend=n -jar start.jar
popd
