package ClassDemo;

public class ZigZagStudents {

    //Fields
    String name;
    int phase;
    int codeMasterPoints;

    static int numberOfDNAPairs = 23;  //ha Static akkor itt kell az erteket megadni. ez a classra vonatkozik

    //Constructors
    public ZigZagStudents(String studentName) {     //ha studentName akkor nem kell this.  , ha ugyanaz a nev a String utan akkor this.
        name = studentName;
    }

    public ZigZagStudents(String studentName, int phase, int codeMasterPoints) {
        //this(studentName);  utalok a felette levo parancsbol, ebben az esetben a name = studentName; felesleges 2 sorral lejjebb;

        name = studentName;
        this.phase = phase;
        this.codeMasterPoints = codeMasterPoints;
    }

    //Functions
    public String introduce() {
        return "Hi. My name is " + name + ", I am in " + phase + " phase and I have " + codeMasterPoints + " points";
    }

    public void askQuestions() {
        codeMasterPoints += 30;
    }

    public void watchVideos(int numberOfVideos, boolean isBanaVideo) {
        int extra = isBanaVideo ? 2 : 4;
        codeMasterPoints += (numberOfVideos * 20) + extra;
    }
}

