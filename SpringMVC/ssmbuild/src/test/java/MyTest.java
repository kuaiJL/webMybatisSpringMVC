import com.kuai.dao.BookMapper;
import com.kuai.pojo.Books;
import com.kuai.service.BookService;
import com.kuai.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

public class MyTest {
    public static void main(String[] args) throws IOException {
        BookService bookService = new BookServiceImpl();
        List<Books> list =bookService.queryAllBook();
        System.out.println(list);

    }
}

