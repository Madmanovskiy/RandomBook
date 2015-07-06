package RandomBookProject.model;



public class RandomGenerator {
    public int getRandomNumberFromList(BookList list) {
        return (int) (Math.random() * list.sizeBookList() + 1);
    }
}
