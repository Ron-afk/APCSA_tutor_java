import java.util.ArrayList;

public class RandomStringChooser {
    private ArrayList<String> wordList;

    public RandomStringChooser(String[] wordList){
        String[] wordList1 = wordList;
        this.wordList = new ArrayList<>();
        for(String s : wordList){
            this.wordList.add(s);
        }
    }

    public String getNext() {
        if(this.wordList.size() == 0) {
            return "None";
        }
        double r = Math.random();
        int rand = (int) (r * wordList.size());
        String s = wordList.get(rand);
        wordList.remove(rand);
        return s;

    }
}
