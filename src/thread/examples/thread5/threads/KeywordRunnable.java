package thread.examples.thread5.threads;

import thread.examples.thread5.io.SearchKeywordReader;

import java.io.IOException;

public class KeywordRunnable implements Runnable{
    @Override
    public void run() {
        try (SearchKeywordReader searchKeywordReader = new SearchKeywordReader()){
            // System.out.print("Keyword: "+ scanner.nextLine());
            System.out.print("Keyword: "+searchKeywordReader.readSearchKeyword());
        }catch (IOException ioException){
            System.err.println(ioException.getMessage());
        }

    }
}
