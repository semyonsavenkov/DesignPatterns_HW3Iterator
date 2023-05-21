import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private List<Integer> numberList;

    public Randoms (Integer min, Integer max) {
        random = new Random();
        numberList = new ArrayList<>();
        for (int i = 1; i<=30; i++) {
            this.addRandomNumber(min, max);
        }
    }

    public Randoms addRandomNumber (int min, int max) {
        numberList.add(random.nextInt(min, max));
        return this;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {

            int next = 0;

            @Override
            public boolean hasNext() {
                if (next < numberList.size())
                {
                    return true;
                }
                else {
                    return false;
                }
            }

            @Override
            public Integer next() {
                if (next < numberList.size())
                {
                    Integer result = numberList.get(next);
                    next++;
                    return result;
                }
                return null;
            }
        };
    }

}
