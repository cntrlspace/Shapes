
Section 0: Folder Contents
Section 1: How to Compile the Program
Section 2: Generate Javadocs

******************************************************************

		SECTION 0: FOLDER CONTENTS

******************************************************************

HW1 (folder):
	README.txt
	Point2D.java
	Rectangle.java
	Shape.java
	Triangle.java

******************************************************************

		SECTION 1: HOW TO COMPILE PROGRAM

******************************************************************

Note:When instructed to type something in don't include quotation marks.

FOR MAC USERS:
	1. Locate Pathname for program -- Right-click on the Shape.java file. Select Get Info. The Pathname is under General > Where. Right-click on the location of the program. Select Copy as Pathname.
	For example, my Pathname is "/Users/nacho/Downloads/HW1".
	**If you do not see Where under the General tab you will need to expand the General tab by clicking on the arrow that is located next to General.**

	2. Open Terminal -- Click on the magnifying glass on the top right corner of the screen. Type "Terminal" into the search bar. Click on the Terminal application to open it.

	3.Move to the Shape.java directory in Terminal -- In the Terminal, type "cd" followed by a space. Right-click on the area after the space and select Paste. Press Enter.
	Example: "cd /Users/nacho/Downloads/HW1"

	4. Compile all .java files -- In the Terminal, type in "javac *.java". Press Enter.

	5. Run the program -- A program can be run by typing in "java (program_name)" in the command line. (program _name) should be replaced with the actual file name of the program
	Example: "java Main"



WINDOWS:
	1.Locate path for program -- Right-click on the Shape.java file. Click Properties. The path is under General > Location. Find the Path next to "Location". To copy the path, double-click it to highlight it with the mouse, and then right-click and select Copy. To paste the path once it has been copied, right-click and select Paste.

	2.Open Git Bash -- Open the Start menu by clicking on the Windows icon on the bottom left of the screen. Type in "Git Bash Desktop App" into the search bar. Click on the icon to open it.

	3.Move to the Shape.java directory in Git Bash -- In Git Bash, type "cd" followed by a space. Right-click on the area after the space and select Paste. Press Enter.
	Example "cd /Users/nacho/Downloads/HW1"

	4.Compile all .java files -- In Git Bash, type in "javac *.java". Press Enter.

	5.Run the program -- A program can be run by typing in "java (program_name)" in the command line. (program _name) should be replaced with the actual file name of the program
	Example: "java Main"

******************************************************************

		SECTION 2: Generate Javadocs

******************************************************************
Note:When instructed to type something in don't include the outside quotation marks.

Follow Steps 1 thru 4 in "SECTION 1: HOW TO COMPILE PROGRAM"

	1. Set up custom tags -- In the Terminal or Git Bash, type in "javadoc -tag custom.require:cm:"Precondition:"  -tag custom.ensure:cm:"Postcondition:" -Xdoclint:none  *.java". Press Enter.

	2. Numerous files should have been generated into the HW1 folder with the file extension .html You can access the Javadocs for each class by double clicking your desired file that ends with .html
	Example: I would like to access the Javadoc for the Shape.java class so then I would open up the Shape.html file





























