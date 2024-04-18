package org.example;
import java.io.FileWriter;
public class Writer {
    public void Test() throws Exception{
        FileWriter nFile = new FileWriter("C:\\Users\\admin\\IdeaProjects\\praktica\\src\\main\\java\\org\\example\\Poem.txt");
        nFile.write("J’ai possede maitresse honnete,\nJe la servais comme il lui faut,\nMais je n’ai point tourne de tete, —\nJe n’ai jamais vise haut.");
        nFile.close();
    }
}
