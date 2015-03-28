# Jalico [![Build Status](https://travis-ci.org/nativelibs4java/jalico.svg?branch=master)](https://travis-ci.org/nativelibs4java/jalico)

Listenable Collections for Java!

This was freshly-split from `ochafik-util` package in [nativelibs4java/JNAerator](http://github.com/nativelibs4java/JNAerator), and merged with code.google.com/p/jalico project from 2008.

TODO
* I need help to add tests ([here's a sample](./src/test/java/com/nativelibs4java/jalico/ListenableCollectionsTest.java)), since I'm not really using this project anymore (it's still used at the fringe in JNAerator).
* Needs doc here
* Needs to add test coverage
* Needs a release when test coverage is good (Note: most of current code is released in the [ochafik-util 0.12](http://search.maven.org/#artifactdetails%7Ccom.nativelibs4java%7Cochafik-util%7C0.12%7Cjar) artefact, under package `com.ochafik.util.listenable`.

```
  <repositories>
    <repository>
      <id>sonatype</id>
      <name>Sonatype OSS Snapshots Repository</name>
      <url>http://oss.sonatype.org/content/groups/public</url>
    </repository>
  </repositories>

  <dependencies>
    <dependency>
      <groupId>com.nativelibs4java</groupId>
      <artifactId>jalico</artifactId>
      <version>0.12-SNAPSHOT</version>
    </dependency>
  </dependencies>
```

# Former doc

## What is it ?

Generics-enabled Listenable Collections for Java. 

Interfaces and standard containers wrappers that provide addition, removal and update events support for *maps*, *sets*, *lists* and *collections* in general (comes with *Swing [http://jalico.googlecode.com/svn/trunk/javadoc/com/ochafik/util/listenable/ListenableTableModel.html table] and [http://jalico.googlecode.com/svn/trunk/javadoc/com/ochafik/util/listenable/ListenableListModel.html list] models* and *[http://jalico.googlecode.com/svn/trunk/javadoc/com/ochafik/util/listenable/ZeroConfListenableMap.html ZeroConf example]*).

## What is it meant for ?

This library frees the programmer off the tedious task of creating specialized listenable containers and event listeners for his / her projects.

## How stable is it ?

*I have been using most classes of this project for quite a while now* in a few projects and I would consider DefaultListenableCollections, DefaultListenableMap and DefaultListenableList, along with the swing list model to be relatively bug-free.

## How do I use it ?

First, checkout the code (from SVN only right now, snapshots are coming soon).
Then look at the [http://jalico.googlecode.com/svn/trunk/javadoc/index.html Javadoc], and at the example classes (such as [http://jalico.googlecode.com/svn/trunk/javadoc/com/ochafik/util/listenable/ZeroConfListenableMap.html ZeroConfListenableMap]), and try adapt them to your use cases.

## What is on the roadmap ?

- ability to listen to remote listenable lists / collections / sets. Elements will be serialized in XML. Combined with the JmDNS example, this could make it a lot easier to code simple peer-to-peer software with Jalico.

## Can I contribute ?

Sure ! 
It's bad press to say that, but I'm convinced there are lots of bugs to iron out of this tiny library.
Use it, write tests, documentation, help debug it, any help will be highly appreciated. 
Proposals for classes renaming and design changes are also highly welcome.
