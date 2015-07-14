package com.hackathon.lighthouse.documents;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "items")
public class TechItem {

	private ObjectId _id;

	private String name;
	private String description;
	private String imageUrl;

	public TechItem(String name, String description, String imageUrl) {
		super();
		this.name = name;
		this.description = description;
		this.imageUrl = imageUrl;
	}

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	@Override
	public String toString() {
		return "TechItem [_id=" + _id + ", name=" + name + ", description=" + description + ", imageUrl=" + imageUrl
				+ "]";
	}
}
