package hello.hellospring.domain;

public class Member {

    private Long id; // 고객의 ID가 아닌 시스템 관리용 ID
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
