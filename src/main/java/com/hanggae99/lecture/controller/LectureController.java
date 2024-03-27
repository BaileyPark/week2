package com.hanggae99.lecture.controller;

import com.hanggae99.lecture.service.LectureService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LectureController {

    LectureService lectureService = new LectureService();

    @RequestMapping("/lectrue")
    String specialLecture() {
        return "특강 신청받습니다.";
    }

    @GetMapping("/apply/{id}")
    int apply(@PathVariable("id") int id) {
        return lectureService.return_data(id);
//        System.out.println(id);
    }

}
