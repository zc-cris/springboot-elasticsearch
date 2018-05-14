package com.cris.springboot;

import com.cris.springboot.bean.Ariticle;
import com.cris.springboot.bean.Book;
import com.cris.springboot.repository.BookRepository;
import io.searchbox.client.JestClient;
import io.searchbox.core.DocumentResult;
import io.searchbox.core.Index;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootElasticsearchApplicationTests {

    @Autowired
    JestClient jestClient;

    @Autowired
    BookRepository bookRepository;

    @Test
    public void test03(){
        Book book = new Book();
        book.setId(1);
        book.setName("神魔");
        book.setAuthor("血红");
//        System.out.println(bookRepository);
        bookRepository.index(book);
    }


    @Test
    public void contextLoads() {

        Ariticle ariticle = new Ariticle();
        ariticle.setId(1);
        ariticle.setAuthor("张大帅");
        ariticle.setTitle("屌丝程序员");
        ariticle.setContent("逆袭白富美，走上人生巅峰~");

        //构建索引
        Index i = new Index.Builder(ariticle).index("cris").type("articles").build();

        try {
            // 执行
            jestClient.execute(i);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // 测试搜索
    @Test
    public void test() {
        // 查询表达式
        String string = "{\n" +
                "    \"query\" : {\n" +
                "        \"match\" : {\n" +
                "            \"content\" : \"白富美\"\n" +
                "        }\n" +
                "    }\n" +
                "}";

        // 构建搜索功能
        Search build = new Search.Builder(string).addIndex("cris").addType("articles").build();
        try {
            // 执行搜索功能
            SearchResult execute = jestClient.execute(build);
            System.out.println(execute.getJsonString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

