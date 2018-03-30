package hello;

public class WebResponse {
    private final String groupBy;
    private final String count;
    private final String source = "CPM";

    public WebResponse(String groupBy, String count) {
        this.groupBy = groupBy;
        this.count = count;
    }

	public String getGroupBy() {
		return groupBy;
	}

	public String getCount() {
		return count;
	}

	public String getSource() {
		return source;
	}
    
    

}
