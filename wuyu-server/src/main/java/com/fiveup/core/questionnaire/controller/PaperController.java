package com.fiveup.core.questionnaire.controller;


import com.fiveup.core.questionnaire.service.PaperService;
import com.fiveup.core.questionnaire.vo.PaperVO;
import com.fiveup.core.questionnaire.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/paper")
public class PaperController {
    @Autowired
    PaperService paperService;

    @PostMapping("/addPaper")
    public ResponseVO addPaper(@RequestBody PaperVO paperVO){
        return paperService.addPaper(paperVO);
    }

    @PostMapping("/updatePaper")
    public ResponseVO updatePaper(@RequestBody PaperVO paperVO){
        return paperService.updatePaper(paperVO);
    }

    @GetMapping("/{paperId}/deletePaper")
    public ResponseVO invalidatePaper(@PathVariable Integer paperId){
        return paperService.deletePaper(paperId);
    }

    @GetMapping("/{userId}/getUserPapers")
    public ResponseVO getUserPapers(@PathVariable Integer userId){
        return paperService.getUserPapers(userId);
    }

    @GetMapping("/{paperId}/checkPaper")
    public ResponseVO checkPaper(@PathVariable Integer paperId){
        return paperService.checkPaper(paperId);
    }

    @GetMapping("/{paperId}/reviewPaper")
    public ResponseVO reviewPaper(@PathVariable Integer paperId){
        return paperService.reviewPaper(paperId);
    }


}
