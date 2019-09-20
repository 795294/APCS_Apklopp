
/**
 * Write a description of class SentenceBuilder here.
 *
 * @author (Peter Klopp)
 * @version (Lab 920)
 */
import java.lang.Math;

public class SentenceBuilder
{

    public SentenceBuilder()
    {
        
    }
    
    private String[] nouns = {"computer", "car", "house", "pencil", "food"};
    private String[] verbs = {"runs", "swims","falls", "thinks", "walks"};
    private String[] adjectives = {"blue", "hot", "sketchy", "chilly", "hungry"};
    private String[] determiners = {"my", "your", "his", "her", "its", "our", "their"};
    private String[] adverbs = {"slowly", "carefully", "daily", "competitively", "recklessly"};
    private String[] prepositions = {"across", "between", "through", "behind", "against"};
    
    public String getRandomNoun(){
        int rand = (int)(Math.random()*nouns.length);
        
        return nouns[rand];
    }
    public String getRandomVerb(){
        int rand = (int)(Math.random()*verbs.length);
        
        return verbs[rand];
    }
    public String getRandomAdjective(){
        int rand = (int)(Math.random()*adjectives.length);
        
        return adjectives[rand];
    }
    public String getRandomAdverb(){
        int rand = (int)(Math.random()*adverbs.length);
        
        return adverbs[rand];
    }
    public String getRandomDeterminer(){
        int rand = (int)(Math.random()*determiners.length);
        
        return determiners[rand];
    }
    public String getRandomPreposition(){
        int rand = (int)(Math.random()*prepositions.length);
        
        return prepositions[rand];
    }
    
    
    public String getNounPhrase(){
        return getRandomDeterminer() + " " + getRandomAdjective() + " " + getRandomNoun() + " ";
    }
    public String getPrepositionalPhrase(){
        return getRandomPreposition() + " " + getRandomDeterminer() + " " + getRandomAdjective() + " " + getRandomNoun() + " ";
    }
    public String getVerbPhrase(){
        return getRandomAdverb() + " " + getRandomVerb() + " ";
    }
    
    public String getSentence(){
        return getNounPhrase() + getVerbPhrase() + getPrepositionalPhrase();
    }


}
