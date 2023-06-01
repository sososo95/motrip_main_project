package com.bit.motrip.common;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CommitMaker {
    public static void gitCommitMSGBuilder(String committer,String typeofCommit,String commitTitle,String commitComment,String changedFiles){
        //Fields

        //make current time
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm");
        String stringDate = currentDateTime.format(formatter);

        //make commit msg
        String commitHeader = committer+"/"+typeofCommit+" "+stringDate+" "+commitTitle;
        String commitBody = commitComment;
        String commitFooter = changedFiles;
        System.out.println(commitHeader);
        System.out.println();
        System.out.println(commitBody);
        System.out.println();
        System.out.println(commitFooter);
    }

    public static void main(String[] args) {
        //                        0         1      2     3      4      5
        String[] committers = {"alex6", "angie", "psw","sean","song","sso"};
        //                        0         1          2            3                4                5
        String[] commitType = {"Create", "Update", "Delete", "Create&Update", "Update&Delete", "Create&Delete"};
        //커밋 소제목
        String commitTitle = "메모 공유기능 추가. 못한부분 바디에 적음";
        //수정내역
        String commitBody = "공유자목록보기, 공유해제(메모주인) 구현." +
                "공유해제(메모공유자), 메모 공유할 때 ajax로 유저검색 구현 필요";
        //수정파일
        String changedFiles = "(memoRestController, footer.jsp)";
        gitCommitMSGBuilder(committers[0],commitType[1],commitTitle,commitBody,changedFiles);
    }
}
