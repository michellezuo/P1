import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Michelle Zuo
 * @version 0.9 , needs to be updated
 */


public class SimpleMarkovModel extends BaseMarkovModel  {

    public SimpleMarkovModel(int size){
        super(size);
    }

    @Override
    protected List<String> getFollows(List<String> context) {
        List<String> f = new ArrayList<>();
        for (int i = 0; i< myWordSequence.size() - myModelSize; i++){
            List<String> c = myWordSequence.subList(i, i + myModelSize);
            if (c.equals(context)){
                f.add(myWordSequence.get(i+myModelSize));
            }
        }
        return f;

    }

    public SimpleMarkovModel(){
        this(3);
    }

    public static void main(String[] args) throws IOException {
        SimpleMarkovModel mm = new SimpleMarkovModel(2);
        String dirName = "data/shakespeare";

        int size = 500;
        mm.trainDirectory(dirName);
        System.out.printf("seq size: %d\n",mm.getSequence().size());
        String text = mm.generate(size);

        System.out.printf("size of generated text = %d\n",text.length());
        System.out.printf("# different contexts possible = %d\n",mm.differentContexts());
    }
}
