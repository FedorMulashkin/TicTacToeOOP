package TicTacToeOOP;

public class Field3x3 extends Field implements Game {
    int dim = 3;
    int[] points = new int[dim * dim];

    @Override
    public void MakeMove() {
    }

    @Override
    public boolean GameContinue() {
        return super.GameContinue();
    }
}
