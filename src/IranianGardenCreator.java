public class IranianGardenCreator implements AbstractGardenCreator{
    @Override
    public Chenar createTree() {
        return new Chenar(100);
    }

    @Override
    public Khatmi createFlower() {
        return new Khatmi("Iran");
    }
}
