package ThiGK.ntu64130078.TranDoanAnh_ThiGK_1.model;

public class Post {
	private Long id;
    private String title;
    private String content;
    private Long categoryId;

    public Post(Long id, String title, String content, Long categoryId) {
        this.setId(id);
        this.setTitle(title);
        this.setContent(content);
        this.setCategoryId(categoryId);
    }

    // Getter & Setter
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
}
