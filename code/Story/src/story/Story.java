/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package story;

public abstract class Story {
    protected String storyTitle;
    protected String authorName;
    protected String message;
    protected int numberPages;
    
    protected Story(String st, String an, String m){
        storyTitle = st;
        message = m;
        authorName = an;
    }
    
    protected String getStoryTitle(){
        return storyTitle;
    }
    protected String getAuthorName(){
        return authorName;
    }
    protected String getMessage(){
        return message;
    }
    protected abstract void setNumberPages(int np);
}
