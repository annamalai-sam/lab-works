package SampleProgram;

interface test2{
    void sample ();
    int main ();
}

interface test3 extends test2 {
    void samp();
    int add();

}
class sample2 implements test3 {


    @Override
    public void sample() {

    }

    @Override
    public int main() {
        return 0;
    }

    @Override
    public void samp() {

    }

    @Override
    public int add() {
        return 0;
    }
}
