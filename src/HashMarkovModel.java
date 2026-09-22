import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMarkovModel extends BaseMarkovModel {

    private HashMap<List<String>, List<String>> myMap;

    public HashMarkovModel(int size) {
        super(size);
        myMap = new HashMap<>();
    }

    public HashMarkovModel() {
        this(3);
    }

    @Override
    public void processTraining() {
        myMap.clear();

        for (int i = 0; i < myWordSequence.size() - myModelSize; i++){
            List<String> context = myWordSequence.subList(i, i+myModelSize);
            String next = myWordSequence.get(i+myModelSize);

            if (!myMap.containsKey(context)) {
                myMap.put(context, new ArrayList<>());
            }
            myMap.get(context).add(next);
        }
    }

    @Override
    protected List<String> getFollows(List<String> context) {
        if (myMap.containsKey(context)) {
            return myMap.get(context);
        }
        return new ArrayList<>();
    }
}