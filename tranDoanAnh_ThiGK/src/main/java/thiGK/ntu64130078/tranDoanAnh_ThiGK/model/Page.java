package thiGK.ntu64130078.tranDoanAnh_ThiGK.model;

public class Page {
	
	private Long id;
    private String pageName;
    private String keyword;
    private String content;
    private Long parentPageId;

    public Page(Long id, String pageName, String keyword, String content, Long parentPageId) {
        this.id = id;
        this.pageName = pageName;
        this.keyword = keyword;
        this.content = content;
        this.parentPageId = parentPageId;
    }

    // Getters
    public Long getId() { return id; }
    public String getPageName() { return pageName; }
    public String getKeyword() { return keyword; }
    public String getContent() { return content; }
    public Long getParentPageId() { return parentPageId; }
	
}
