package com.example.exam2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * example2に対するリクエストのコントローラーです。
 *
 * @author HyungCheol Kim
 */
@org.springframework.web.bind.annotation.RestController
public class Exam2RestController {
    @Value("${example2.return-value}")
    private String value;

    /**
     * {@code /secret}ディレクトリに対する処理を行います。
     * 戻り値はresources/application.ymlのexample2.return-valueに設定されている値を返します。
     *
     * @param session セッション情報
     * @return 文字列
     */
    @RequestMapping("/private")
    public String secret(HttpSession session) {
        return value;
    }
}