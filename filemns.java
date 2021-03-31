package br.com.sample.api.v1;
 
import br.com.sample.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
 
@RestController
@AllArgsConstructor
@RequestMapping("v1/books")
public class BookRestService {
 
    private final BookService bookService;
 
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public BookResource getById(@PathVariable Integer id) {
        throw new NotImplementedException();
    }
 
    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping(method = RequestMethod.POST)
    public BookResource save(@RequestBody BookResource bookResource) {
        throw new NotImplementedException();
    }
 
}