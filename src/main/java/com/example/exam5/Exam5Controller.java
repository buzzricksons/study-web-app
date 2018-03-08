package com.example.exam5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/time")
@Controller
public class Exam5Controller {
    /**
     * {@code /get_dummy_json_data}リクエストに対する処理を行います。
     *
     * @return テンプレート名
     */
    @GetMapping("/top")
    public String top() {
        return "yoda";
    }
}
