package comp249_section_d;

public class MainClass {

    public static void main(String[] args) { // Static context

        I1 obj = new I1() {

            @Override
            public int f() {
                return 0;
            }
        };

    }

}



}


interface I1 {

    public int f();
}
