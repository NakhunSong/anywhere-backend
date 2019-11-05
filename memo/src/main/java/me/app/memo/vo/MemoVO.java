package me.app.memo.vo;

public class MemoVO {
	private int memoId;
	private String title;
	private String content;
	
	public int getMemoId() {
		return memoId;
	}
	public void setMemoId(int memoId) {
		this.memoId = memoId;
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
	
	@Override
	public String toString() {
		return "MemoVO [memoId=" + memoId + ", title=" + title + ", content=" + content + "]";
	}
	
}
