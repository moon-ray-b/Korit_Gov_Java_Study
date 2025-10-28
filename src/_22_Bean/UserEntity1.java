package _22_Bean;

import java.time.LocalDateTime;

/*
 * 게시물 엔티티
 * 게시물 아이디
 * 게시물 제목
 * 게시물 내용
 * 작성자 아이디
 * 작정자 닉네임
 * 생성시각
 * 수정시각
 *
 * */
public class UserEntity1 {
    private String userId;
    private String title;
    private String story;
    private String lie;
    private String userId2;
    private String nic;
    private LocalDateTime createDt;
    private LocalDateTime updateDt;
    private int statusCode;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getLie() {
        return lie;
    }

    public void setLie(String lie) {
        this.lie = lie;
    }

    public String getUserId2() {
        return userId2;
    }

    public void setUserId2(String userId2) {
        this.userId2 = userId2;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public LocalDateTime getCreateDt() {
        return createDt;
    }

    public void setCreateDt(LocalDateTime createDt) {
        this.createDt = createDt;
    }

    public LocalDateTime getUpdateDt() {
        return updateDt;
    }

    public void setUpdateDt(LocalDateTime updateDt) {
        this.updateDt = updateDt;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        return "UerEntity(userId=" + userId + ", title=" + title +", story =" + story + ", lie=" + lie + ",userId2=" + userId2 + ",nic= " + nic +")";
    }
}
