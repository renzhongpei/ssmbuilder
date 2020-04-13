package com.rzp.controller;

import com.rzp.pojo.Books;
import com.rzp.pojo.SysInfo;
import com.rzp.service.BookService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    //Controller调Sercice层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部books并且返回到books展示页面
    @RequestMapping("/allBook")
    public String listBooks(Model model){
        List<Books> booksList = bookService.queryAllBook();
        model.addAttribute("list",booksList);
        return "allBook";
    }

    //跳转到增加书籍界面
    @RequestMapping("/toAddBook")
    public String toAddPaper(){
        return "addBook";
    }

    //添加书籍请求
    @RequestMapping("/AddingBook")
    public String addBook(Books books){
        System.out.println("addBook="+books);
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }

    //跳转到修改书籍界面
    @RequestMapping("/toUpdateBook")
    public String toUpdatePaper(int id,Model model){
        Books books = bookService.queryBookById(id);
        model.addAttribute("Qbooks",books);
        return "updateBook";
    }

    //修改书籍请求
    @RequestMapping("/updatingBook")
    public String updateBook(Books books){
        System.out.println("UpdatingBook="+books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    //删除书籍
    @RequestMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable("id") int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    //搜索书籍
    @RequestMapping("/searchBook")
    public String searchBook(SysInfo sysInfo,Model model){
        if (sysInfo.getInfoStr1()!=null&&!"".equals(sysInfo.getInfoStr1())){
            List<Books> booksList = bookService.searchBook(sysInfo.getInfoStr1());
            model.addAttribute("list",booksList);
        }else {
            model.addAttribute("msg","请输入要查询的数据");
        }
        return "allBook";
    }
}
