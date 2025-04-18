package ThiGK.ntu64130078.TranDoanAnh_ThiGK_1.model;

public class Page {
	private Long id;
    private String pageName;
    private String keyword;
    private String content;
    private Long parentPageId;

    public Page(Long id, String pageName, String keyword, String content, Long parentPageId) {
        this.setId(id);
        this.setPageName(pageName);
        this.setKeyword(keyword);
        this.setContent(content);
        this.setParentPageId(parentPageId);
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getParentPageId() {
		return parentPageId;
	}

	public void setParentPageId(Long parentPageId) {
		this.parentPageId = parentPageId;
	}
}
