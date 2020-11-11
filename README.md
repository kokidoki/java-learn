# java-learn

[Java 11 java.base](https://docs.oracle.com/en/java/javase/11/docs/api/java.base/module-summary.html)

Edit `.bashrc` file; add following
```
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-15.0.1.jdk/Contents/Home
export PATH=$JAVA_HOME/bin:$PATH
```

Verify Java
```
Last login: Wed Nov 11 17:01:06 on ttys001
ZEMIANs-iMac:~ kenny$ echo $JAVA_HOME
/Library/Java/JavaVirtualMachines/jdk-15.0.1.jdk/Contents/Home
ZEMIANs-iMac:~ kenny$ echo $PATH
/Library/Java/JavaVirtualMachines/jdk-15.0.1.jdk/Contents/Home/bin:/Applications/Sublime Text.app/Contents/SharedSupport/bin:/usr/local/bin:/usr/bin:/bin:/usr/sbin:/sbin
ZEMIANs-iMac:~ kenny$ which java
/Library/Java/JavaVirtualMachines/jdk-15.0.1.jdk/Contents/Home/bin/java
ZEMIANs-iMac:~ kenny$ java -version
java version "15.0.1" 2020-10-20
Java(TM) SE Runtime Environment (build 15.0.1+9-18)
Java HotSpot(TM) 64-Bit Server VM (build 15.0.1+9-18, mixed mode, sharing)
ZEMIANs-iMac:~ kenny$ which javac
/Library/Java/JavaVirtualMachines/jdk-15.0.1.jdk/Contents/Home/bin/javac
ZEMIANs-iMac:~ kenny$
```


