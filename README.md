# eclipse-pmd
The eclipse-pmd plug-in integrates the well-known source code analyzer PMD into the Eclipse IDE.

Everytime you save your work, eclipse-pmd scans your source code and looks for potential problems like possible bugs and suboptimal, duplicate, dead or overly complicated code.

Where possible, eclipse-pmd offers quick fixes that automatically fix the problems. These quick fixes can be used to fix a single problem or all occurrences in your entire code base.

## How to get started
Please follow the instructions on [how to get started with eclipse-pmd](http://acanda.github.io/eclipse-pmd/getting-started.html) on the website.

## How to build and install eclipse-pmd
Building eclipse-pmd is fairly easy. Please note, however, that building eclipse-pmd is not required if you are only interested in using it, since there is a pre-built version available in the Eclipse Marketplace.

### Requirements
You need the following tools:

* JDK 8
* Maven 3
* Git

### Build instructions
The first thing you need to do is to check out the source code.

```
git clone https://github.com/acanda/eclipse-pmd.git
cd eclipse-pmd
```

Once you have the source code you can build it with Maven.

```
cd ch.acanda.eclipse.pmd
mvn clean verify
```

This will compile, test and build a local repository for eclipse-pmd.
If the build was successful you will find the repository in `ch.acanda.eclipse.pmd.repository/target/repository`.

### Installation
Once you have built the repository you can install eclipse-pmd by adding a new repository to Eclipse: 

* from within Eclipse select `Help` > `Install New Software...`
* click the button `Add...` of the `Install` dialog
* click the button `Local...` of the `Add Repository` dialog 
* select the folder `ch.acanda.eclipse.pmd.repository/target/repository`
* click the button `OK` of the `Add Repository` dialog
* select `Eclipse PMD Plug-in` and proceed with the installation

From now on you can simply update Eclipse with `Help` > `Check for Updates` after you rebuilt eclipse-pmd.

### Testing against different Eclipse releases
Building eclipse-pmd with `mvn clean verify` compiles and tests it against the oldest supported release of Eclipse which is Eclipse 3.7 Indigo. To ensure eclipse-pmd also works with newer releases the Eclipse release can be set with the parameter `eclipse-release`.

Compile an test against Eclipse Juno: ```mvn clean verify -Declipse-release=juno```

Compile an test against Eclipse Kepler: ```mvn clean verify -Declipse-release=kepler```

Compile an test against Eclipse Luna: ```mvn clean verify -Declipse-release=luna```

Compile an test against Eclipse Mars: ```mvn clean verify -Declipse-release=mars```

Compile an test against Eclipse Neon: ```mvn clean verify -Declipse-release=neon```

Regardless of the chosen release, the built plug-in will always be the same as the one built without the parameter. So there isn't any advantage in building the plug-in yourself if you are using a newer Eclipse release.