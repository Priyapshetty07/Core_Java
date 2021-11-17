package com.xworkz.objectmethods.equality;

public class NewsPaper {

	private String name;
	private String language;
	private int since;

	public NewsPaper() {
		System.out.println("invoked no args const in NewsPaper");
	}

	// language===since->equals(string to int)
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals from NewsPaper");

		if (obj != null) {
			System.out.println("ref is not null");
			if (obj instanceof NewsPaper)

			{
				System.out.println("ref is NewsPaper");
				NewsPaper casted = (NewsPaper) obj;
				String castedNewsPaperLanguage = casted.getLanguage();
				int castedNewsPaperSince = casted.getSince();
				if (this.language.equals(castedNewsPaperLanguage) && this.since == castedNewsPaperSince) {
					System.out.println("language and since is matching");
					return true;
				} else {
					System.err.println("language or since is not matching");
				}

			} else {
				System.err.println("i cannot compare, ref is not a NewsPaper");
			}
		} else {
			System.err.println("ref is null pass proper ref");
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getSince() {
		return since;
	}

	public void setSince(int since) {
		this.since = since;
	}

}
