package guru.springframework.controllers.v1;

import guru.springframework.api.v1.model.CategoryListDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/categories")
public class CategoryController {

    private final CategorySer categoryController;

    public CategoryController(CategoryController categoryController) {
        this.categoryController = categoryController;
    }

    public ResponseEntity<CategoryListDTO> getallCategories{
        new CategoryListDTO(cate)
    }
}
