package com.gtx.indihome.controller;

import com.gtx.indihome.entity.Pic;
import com.gtx.indihome.repository.PicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PicController {

    @Autowired
    private PicRepository picRepository;

    @RequestMapping(value = "/pic", name = "pic")
    public ModelAndView indexPic() {
        ModelAndView view = new ModelAndView("pic/index");
        List<Pic> picList = picRepository.findAll();
        view.addObject("page_title", "PIC");
        view.addObject("pics", picList);;
        return view;
    }
}
