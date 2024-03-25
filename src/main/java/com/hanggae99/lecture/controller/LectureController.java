package com.hanggae99.lecture.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lectrue")
public class LectureController {

    @GetMapping("/apply")
    public String specialLecture() {
        return "특강 신청받습니다.";
    }

    @GetMapping("/{id}")
//    public int point(@PathVariable int id) {
//    public int point(@PathVariable(required = true) int id) {
    public int point(@PathVariable ("id") int id) {
        return id;
    }

}
