## Node

### To check node version in your device

```ps
node -v
```

### To check npm version in your device

```ps
npm -v 
```

### To project in your current folder with your current credentials

```ps
npm init 
```

### To project in your current folder without your current credentials

```ps
npm init -y 
```

### "npm install" this command read package.json file and install package from it or package-lock.json file not present in your current folder it create new package-lock.json to your current folder

```ps
npm install 
```

### "npm update" this command read package.json file and update package(minor and patch updates) from it or package-lock.json file not present in your current folder it create new package-lock.json to your current folder

```ps
npm update 
```

### To list all package which is installed in the current folder

```ps
npm list
```

### install package inside a current folder

```ps
npm install mysql
```

> ! Note  
 here in the above command mysql is a package name and if you need to install other packages Ex:-mathjs etc.. replace that package name here

### To install package with major versions control

```ps
npm install mysql@2
```

### To install package with minor and patch versions control

```ps
npm install mysql@~2.2.2
```

### To install or update existing package to latest version

```ps
npm install mysql@latest
```

### install package inside globally

```ps
npm install -g mysql
```

### To list all package which is installed globally

```ps
npm list -g
```