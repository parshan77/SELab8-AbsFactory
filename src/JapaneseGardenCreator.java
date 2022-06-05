public class JapaneseGardenCreator implements AbstractGardenCreator{
    @Override
    public JapaneseTree createTree() {
        return new JapaneseTree(200);
    }

    @Override
    public JapaneseFlower createFlower() {
        return new JapaneseFlower("Japan");
    }
}
