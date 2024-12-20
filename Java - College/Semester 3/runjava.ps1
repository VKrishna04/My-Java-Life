# Get the current directory
$dir = Get-Location
$name = Get-FileName

# Check if Main.class exists
if (Test-Path "$dir\Main.class") {
  # If Main.class exists, execute the Java program with the Main class
  java Main
} else {
  # If Main.class does not exist, compile and run the Java file
  javac $dir\$name.java
  java $dir\$name
}